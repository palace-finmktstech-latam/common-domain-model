package com.example.cdm.builder;

import java.io.IOException;
import java.math.BigDecimal;
import cdm.event.common.*;
import cdm.base.staticdata.party.*;
import cdm.product.template.*;
import cdm.product.asset.*;
import cdm.base.datetime.daycount.DayCountFractionEnum;
import cdm.product.common.schedule.*;
import cdm.observable.asset.*;
import cdm.base.staticdata.asset.rates.FloatingRateIndexEnum;
import cdm.base.datetime.*;
import cdm.base.datetime.AdjustableOrAdjustedOrRelativeDate;
import cdm.base.datetime.RollConventionEnum;
import cdm.product.common.schedule.ResetFrequency;
import cdm.product.common.schedule.ResetDates;
import cdm.product.common.schedule.ResetRelativeToEnum;
import cdm.base.datetime.Offset;
import cdm.base.datetime.DayTypeEnum;
import cdm.base.staticdata.party.FieldWithMetaBusinessCentersBuilder;
import cdm.product.common.settlement.*;
import cdm.base.math.NonNegativeQuantitySchedule;
import cdm.base.math.UnitType;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Generic Swap Builder - Comprehensive CDM swap builder supporting:
 * - Interest Rate Swaps (IRS)
 * - Cross-Currency Swaps (XCcy)
 * - Multi-leg processing
 * - Principal exchanges
 * - FX fixing
 * - Business day conventions
 * - Payment schedules
 *
 * Combines all features from Steps 1-5 into a production-ready builder.
 */
public class GenericSwapBuilder {

    private final ObjectMapper objectMapper;

    public GenericSwapBuilder() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Build complete swap trade from JSON parameters
     * Automatically detects swap type and applies appropriate features
     */
    public TradeState buildSwap(SwapParameters parameters) {
        validateParameters(parameters);

        // Create parties
        Party bankA = createParty(parameters.getHeader().getParty1(), true);
        Party bankB = createParty(parameters.getHeader().getParty2(), false);

        // Create counterparties
        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankA)
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(bankB)
            .build();

        // Create product with all features
        NonTransferableProduct product = createComprehensiveProduct(parameters);

        // Create trade
        Trade trade = Trade.builder()
            .setTradeDateValue(convertToDate(parameters.getHeader().getTradeDate().getDate()))
            .addParty(bankA)
            .addParty(bankB)
            .addCounterparty(cp1)
            .addCounterparty(cp2)
            .setProduct(product)
            .build();

        return TradeState.builder()
            .setTrade(trade)
            .build();
    }

    /**
     * Create comprehensive product supporting all swap types
     */
    private NonTransferableProduct createComprehensiveProduct(SwapParameters parameters) {
        EconomicTerms.EconomicTermsBuilder economicTermsBuilder = EconomicTerms.builder();

        // Set trade-level effective and termination dates
        economicTermsBuilder
            .setEffectiveDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(convertToDate(parameters.getHeader().getEffectiveDate().getDate()))
                    .setDateAdjustments(createBusinessDayAdjustments(
                        parameters.getHeader().getEffectiveDate().getBusinessDayConvention(),
                        parameters.getHeader().getEffectiveDate().getBusinessCenters()))
                    .build())
                .build())
            .setTerminationDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(convertToDate(parameters.getHeader().getTerminationDate().getDate()))
                    .setDateAdjustments(createBusinessDayAdjustments(
                        parameters.getHeader().getTerminationDate().getBusinessDayConvention(),
                        parameters.getHeader().getTerminationDate().getBusinessCenters()))
                    .build())
                .build());

        // Process ALL interest rate legs
        for (LegParameters leg : parameters.getLegs()) {
            InterestRatePayout irPayout = createComprehensiveInterestRatePayout(leg, parameters);
            economicTermsBuilder.addPayout(Payout.builder()
                .setInterestRatePayout(irPayout)
                .build());
        }

        // Add principal exchanges for cross-currency swaps
        if (isCrossCurrencySwap(parameters)) {
            addPrincipalExchanges(economicTermsBuilder, parameters);
        }

        return NonTransferableProduct.builder()
            .setEconomicTerms(economicTermsBuilder.build())
            .build();
    }

    /**
     * Create comprehensive InterestRatePayout with all features
     */
    private InterestRatePayout createComprehensiveInterestRatePayout(LegParameters leg, SwapParameters parameters) {
        // Payer/Receiver
        PayerReceiver payerReceiver = PayerReceiver.builder()
            .setPayer(getCounterpartyRole(leg.getPayerPartyReference(), parameters))
            .setReceiver(getCounterpartyRole(leg.getReceiverPartyReference(), parameters))
            .build();

        // Rate specification with FX fixing support
        RateSpecification rateSpec = createAdvancedRateSpecification(leg);

        // Notional with currency support
        ResolvablePriceQuantity priceQuantity = createNotionalSchedule(leg);

        // Enhanced calculation period dates
        CalculationPeriodDates calcDates = createAdvancedCalculationPeriodDates(leg, parameters);

        // Payment dates with business day conventions
        PaymentDates paymentDates = createAdvancedPaymentDates(leg);

        // Reset dates for all floating rates
        ResetDates resetDates = null;
        if ("FLOATING".equals(leg.getRateType())) {
            resetDates = createResetDates(leg);
        }

        InterestRatePayout.InterestRatePayoutBuilder builder = InterestRatePayout.builder()
            .setPayerReceiver(payerReceiver)
            .setRateSpecification(rateSpec)
            .setPriceQuantity(priceQuantity)
            .setDayCountFractionValue(convertDayCountFraction(leg.getDayCountFraction()))
            .setCalculationPeriodDates(calcDates)
            .setPaymentDates(paymentDates);

        // Add reset dates if applicable
        if (resetDates != null) {
            builder.setResetDates(resetDates);
        }

        return builder.build();
    }

    /**
     * Advanced rate specification with FX fixing and spread support
     */
    private RateSpecification createAdvancedRateSpecification(LegParameters leg) {
        if ("FIXED".equals(leg.getRateType())) {
            // Fixed rate specification
            PriceSchedule fixedRateSchedule = PriceSchedule.builder()
                .setValue(leg.getFixedRate())
                .build();

            FixedRateSpecification fixedRateSpec = FixedRateSpecification.builder()
                .setRateSchedule(RateSchedule.builder()
                    .setPriceValue(fixedRateSchedule)
                    .build())
                .build();

            return RateSpecification.builder()
                .setFixedRateSpecification(fixedRateSpec)
                .build();

        } else {
            // Floating rate with advanced features
            FloatingRateSpecification.FloatingRateSpecificationBuilder floatingBuilder =
                FloatingRateSpecification.builder()
                    .setRateOptionValue(InterestRateIndex.builder()
                        .setFloatingRateIndex(FloatingRateIndex.builder()
                            .setFloatingRateIndexValue(convertFloatingRateIndex(leg.getFloatingRateIndex()))
                            .build())
                        .build());

            // Add spread if present
            if (leg.getSpread() != null && leg.getSpread().compareTo(BigDecimal.ZERO) != 0) {
                PriceSchedule spreadSchedule = PriceSchedule.builder()
                    .setValue(leg.getSpread())
                    .build();

                floatingBuilder.setSpreadSchedule(SpreadSchedule.builder()
                    .setPriceValue(spreadSchedule)
                    .build());
            }

            return RateSpecification.builder()
                .setFloatingRateSpecification(floatingBuilder.build())
                .build();
        }
    }

    /**
     * Create ResetDates for floating rate legs with support for:
     * - Reset frequency
     * - Business day conventions for reset dates
     * - Business centers for reset date adjustments
     * - Reset date offset (lookback periods)
     */
    private ResetDates createResetDates(LegParameters leg) {
        // Build reset frequency - use resetFrequency if specified, otherwise default to paymentFrequency
        ResetFrequency resetFreq = ResetFrequency.builder()
            .setPeriodMultiplier(convertPeriodMultiplier(leg.getResetFrequency() != null ?
                leg.getResetFrequency() : leg.getPaymentFrequency()))
            .setPeriod(convertPeriod(leg.getResetFrequency() != null ?
                leg.getResetFrequency() : leg.getPaymentFrequency()))
            .build();

        // Build reset dates with business day adjustments
        ResetDates.ResetDatesBuilder resetDatesBuilder = ResetDates.builder()
            .setResetFrequency(resetFreq)
            .setResetDatesAdjustments(createBusinessDayAdjustments(
                leg.getResetDayConvention() != null ? leg.getResetDayConvention() : leg.getPaymentDayConvention(),
                leg.getResetBusinessCenters() != null ? leg.getResetBusinessCenters() : leg.getPaymentBusinessCenters()));

        // Add reset relative to setting for offset handling
        if (leg.getResetDateOffset() != null && leg.getResetDateOffset() != 0) {
            // For negative offsets (lookback), relative to period start
            // For positive offsets (look-forward), relative to period end
            resetDatesBuilder.setResetRelativeTo(
                leg.getResetDateOffset() < 0 ?
                    ResetRelativeToEnum.CALCULATION_PERIOD_START_DATE :
                    ResetRelativeToEnum.CALCULATION_PERIOD_END_DATE);
        }

        return resetDatesBuilder.build();
    }

    /**
     * Add principal exchanges for cross-currency swaps
     */
    private void addPrincipalExchanges(EconomicTerms.EconomicTermsBuilder economicTermsBuilder,
                                     SwapParameters parameters) {
        for (LegParameters leg : parameters.getLegs()) {
            // Initial exchange
            if (leg.getInitialExchange() != null) {
                SettlementPayout initialExchange = createPrincipalExchangePayout(
                    leg.getInitialExchange(), parameters, "INITIAL");
                economicTermsBuilder.addPayout(Payout.builder()
                    .setSettlementPayout(initialExchange)
                    .build());
            }

            // Final exchange
            if (leg.getFinalExchange() != null) {
                SettlementPayout finalExchange = createPrincipalExchangePayout(
                    leg.getFinalExchange(), parameters, "FINAL");
                economicTermsBuilder.addPayout(Payout.builder()
                    .setSettlementPayout(finalExchange)
                    .build());
            }

            // Intermediate exchanges (if any)
            if (leg.getIntermediateExchanges() != null) {
                for (int i = 0; i < leg.getIntermediateExchanges().size(); i++) {
                    SettlementPayout intermediateExchange = createPrincipalExchangePayout(
                        leg.getIntermediateExchanges().get(i), parameters, "INTERMEDIATE_" + (i + 1));
                    economicTermsBuilder.addPayout(Payout.builder()
                        .setSettlementPayout(intermediateExchange)
                        .build());
                }
            }
        }
    }

    /**
     * Create principal exchange settlement payout
     */
    private SettlementPayout createPrincipalExchangePayout(PrincipalExchange exchange,
                                                          SwapParameters parameters,
                                                          String exchangeType) {
        // Payer/Receiver
        PayerReceiver payerReceiver = PayerReceiver.builder()
            .setPayer(getCounterpartyRole(exchange.getPayerPartyReference(), parameters))
            .setReceiver(getCounterpartyRole(exchange.getReceiverPartyReference(), parameters))
            .build();

        // Settlement amount
        NonNegativeQuantitySchedule settlementAmount = NonNegativeQuantitySchedule.builder()
            .setValue(exchange.getAmount())
            .setUnit(UnitType.builder()
                .setCurrencyValue(exchange.getCurrency())
                .build())
            .build();

        ResolvablePriceQuantity priceQuantity = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(settlementAmount)
            .build();

        return SettlementPayout.builder()
            .setPayerReceiver(payerReceiver)
            .setPriceQuantity(priceQuantity)
            .setSettlementTerms(SettlementTerms.builder()
                .setSettlementDate(SettlementDate.builder()
                    .setAdjustableOrRelativeDate(AdjustableOrAdjustedOrRelativeDate.builder()
                        .setUnadjustedDate(convertToDate(exchange.getDate()))
                        .setDateAdjustments(createBusinessDayAdjustments(
                            exchange.getDayConvention(),
                            exchange.getBusinessCenters()))
                        .build())
                    .build())
                .build())
            .build();
    }

    /**
     * Advanced calculation period dates with full business day support
     */
    private CalculationPeriodDates createAdvancedCalculationPeriodDates(LegParameters leg, SwapParameters parameters) {
        return CalculationPeriodDates.builder()
            .setEffectiveDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(convertToDate(parameters.getHeader().getEffectiveDate().getDate()))
                    .setDateAdjustments(createBusinessDayAdjustments(
                        parameters.getHeader().getEffectiveDate().getBusinessDayConvention(),
                        parameters.getHeader().getEffectiveDate().getBusinessCenters()))
                    .build())
                .build())
            .setTerminationDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(convertToDate(parameters.getHeader().getTerminationDate().getDate()))
                    .setDateAdjustments(createBusinessDayAdjustments(
                        parameters.getHeader().getTerminationDate().getBusinessDayConvention(),
                        parameters.getHeader().getTerminationDate().getBusinessCenters()))
                    .build())
                .build())
            .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()
                .setPeriodMultiplier(convertPeriodMultiplier(leg.getPaymentFrequency()))
                .setPeriod(convertPeriod(leg.getPaymentFrequency()))
                .setRollConvention(convertRollConvention(leg.getRollConvention()))
                .build())
            .setCalculationPeriodDatesAdjustments(createBusinessDayAdjustments(
                leg.getPaymentDayConvention(),
                leg.getPaymentBusinessCenters()))
            .build();
    }

    /**
     * Advanced payment dates with comprehensive business day support
     */
    private PaymentDates createAdvancedPaymentDates(LegParameters leg) {
        return PaymentDates.builder()
            .setPaymentFrequency(Frequency.builder()
                .setPeriodMultiplier(convertPeriodMultiplier(leg.getPaymentFrequency()))
                .setPeriod(convertPeriod(leg.getPaymentFrequency()))
                .build())
            .setPaymentDatesAdjustments(createBusinessDayAdjustments(
                leg.getPaymentDayConvention(),
                leg.getPaymentBusinessCenters()))
            .build();
    }

    /**
     * Enhanced business day adjustments
     */
    private BusinessDayAdjustments createBusinessDayAdjustments(String convention, List<String> centers) {
        if (convention == null || centers == null || centers.isEmpty()) {
            // Default business day adjustments
            return BusinessDayAdjustments.builder()
                .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
                .setBusinessCenters(BusinessCenters.builder()
                    .addBusinessCenterValue(BusinessCenterEnum.USNY)
                    .build())
                .build();
        }

        BusinessDayAdjustments.BusinessDayAdjustmentsBuilder builder = BusinessDayAdjustments.builder()
            .setBusinessDayConvention(convertBusinessDayConvention(convention));

        BusinessCenters.BusinessCentersBuilder centersBuilder = BusinessCenters.builder();
        for (String center : centers) {
            centersBuilder.addBusinessCenterValue(convertSingleBusinessCenter(center));
        }

        return builder
            .setBusinessCenters(centersBuilder.build())
            .build();
    }

    /**
     * Create party (without hardcoded business unit)
     */
    private Party createParty(PartyInfo partyInfo, boolean addBusinessUnit) {
        // Simply create party with name only - no hardcoded business unit
        return Party.builder()
            .setNameValue(partyInfo.getPartyName())
            .build();
    }

    /**
     * Create notional schedule
     */
    private ResolvablePriceQuantity createNotionalSchedule(LegParameters leg) {
        NonNegativeQuantitySchedule notionalSchedule = NonNegativeQuantitySchedule.builder()
            .setValue(leg.getNotionalAmount())
            .setUnit(UnitType.builder()
                .setCurrencyValue(leg.getNotionalCurrency())
                .build())
            .build();

        return ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(notionalSchedule)
            .build();
    }

    // Utility methods
    private void validateParameters(SwapParameters parameters) {
        if (parameters == null) {
            throw new IllegalArgumentException("SwapParameters cannot be null");
        }
        if (parameters.getLegs() == null || parameters.getLegs().isEmpty()) {
            throw new IllegalArgumentException("At least one leg is required");
        }
        if (parameters.getHeader() == null) {
            throw new IllegalArgumentException("Header information is required");
        }
    }

    private boolean isCrossCurrencySwap(SwapParameters parameters) {
        if (parameters.getLegs().size() < 2) return false;

        String firstCurrency = parameters.getLegs().get(0).getNotionalCurrency();
        return parameters.getLegs().stream()
            .anyMatch(leg -> !leg.getNotionalCurrency().equals(firstCurrency));
    }

    private CounterpartyRoleEnum getCounterpartyRole(String partyRef, SwapParameters params) {
        if (partyRef.equals(params.getHeader().getParty1().getPartyId())) {
            return CounterpartyRoleEnum.PARTY_1;
        } else if (partyRef.equals(params.getHeader().getParty2().getPartyId())) {
            return CounterpartyRoleEnum.PARTY_2;
        } else {
            return CounterpartyRoleEnum.PARTY_1; // Default fallback
        }
    }

    // Conversion helper methods
    private DayCountFractionEnum convertDayCountFraction(String dayCount) {
        if (dayCount == null) return DayCountFractionEnum.ACT_360;
        switch (dayCount) {
            case "ACT/360": return DayCountFractionEnum.ACT_360;
            case "30/360": return DayCountFractionEnum._30_360;
            case "ACT/365.FIXED": return DayCountFractionEnum.ACT_365_FIXED;
            case "ACT/365": return DayCountFractionEnum.ACT_365_FIXED;
            default: return DayCountFractionEnum.ACT_360;
        }
    }

    private FloatingRateIndexEnum convertFloatingRateIndex(String index) {
        if (index == null) return FloatingRateIndexEnum.USD_SOFR_COMPOUND;
        switch (index) {
            case "USD-SOFR-COMPOUND": return FloatingRateIndexEnum.USD_SOFR_COMPOUND;
            case "EUR-EURIBOR-6M": return FloatingRateIndexEnum.EUR_EURIBOR;
            case "EUR-EURIBOR-3M": return FloatingRateIndexEnum.EUR_EURIBOR;
            case "GBP-SONIA-COMPOUND": return FloatingRateIndexEnum.GBP_SONIA_COMPOUND;
            default: return FloatingRateIndexEnum.USD_SOFR_COMPOUND;
        }
    }

    private PeriodExtendedEnum convertPeriod(String period) {
        if (period == null) return PeriodExtendedEnum.M;
        switch (period) {
            case "1M": return PeriodExtendedEnum.M;
            case "3M": return PeriodExtendedEnum.M;
            case "6M": return PeriodExtendedEnum.M;
            case "1Y": return PeriodExtendedEnum.Y;
            default: return PeriodExtendedEnum.M;
        }
    }

    private BusinessDayConventionEnum convertBusinessDayConvention(String convention) {
        if (convention == null) return BusinessDayConventionEnum.MODFOLLOWING;
        switch (convention) {
            case "FOLLOWING": return BusinessDayConventionEnum.FOLLOWING;
            case "MODFOLLOWING": return BusinessDayConventionEnum.MODFOLLOWING;
            case "PRECEDING": return BusinessDayConventionEnum.PRECEDING;
            case "MODPRECEDING": return BusinessDayConventionEnum.MODPRECEDING;
            case "NONE": return BusinessDayConventionEnum.NONE;
            default: return BusinessDayConventionEnum.MODFOLLOWING;
        }
    }

    private BusinessCenterEnum convertSingleBusinessCenter(String center) {
        if (center == null) return BusinessCenterEnum.USNY;

        // Convert to uppercase for case-insensitive matching
        String upperCenter = center.toUpperCase();

        switch (upperCenter) {
            case "USNY": return BusinessCenterEnum.USNY;  // New York
            case "GBLO": return BusinessCenterEnum.GBLO;  // London
            case "EUTA": return BusinessCenterEnum.EUTA;  // TARGET (European)
            case "JPTO": return BusinessCenterEnum.JPTO;  // Tokyo
            case "CATO": return BusinessCenterEnum.CATO;  // Toronto
            case "CLSA": return BusinessCenterEnum.CLSA;  // Santiago, Chile
            case "AUSY": return BusinessCenterEnum.AUSY;  // Sydney
            case "HKHK": return BusinessCenterEnum.HKHK;  // Hong Kong
            case "SGSI": return BusinessCenterEnum.SGSI;  // Singapore
            // Note: CHZU, FRPA, DEFF, MXMC, BRSP, KRSE may not exist in this CDM version
            // Add more as needed based on what's available in BusinessCenterEnum
            default:
                System.err.println("WARNING: Unknown business center '" + center + "', defaulting to USNY");
                return BusinessCenterEnum.USNY;
        }
    }

    private int convertPeriodMultiplier(String period) {
        if (period == null) return 6;
        switch (period) {
            case "1M": return 1;
            case "3M": return 3;
            case "6M": return 6;
            case "1Y": return 1;
            default: return 6;
        }
    }

    private Date convertToDate(LocalDate localDate) {
        return Date.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    /**
     * Convert roll convention string to RollConventionEnum
     */
    private RollConventionEnum convertRollConvention(String rollConvention) {
        if (rollConvention == null || rollConvention.trim().isEmpty()) {
            return null; // No roll convention
        }

        String upper = rollConvention.toUpperCase().trim();

        switch (upper) {
            case "NONE":
                return null; // NONE means no roll convention
            case "EOM":
                return RollConventionEnum.EOM; // End of month
            case "IMM":
                return RollConventionEnum.IMM; // International Money Market dates
            case "FRN":
                return RollConventionEnum.FRN; // Floating Rate Note convention
            case "TBILL":
                return RollConventionEnum.TBILL; // Treasury Bill convention

            // Day of month roll conventions (1-30)
            case "1": return RollConventionEnum._1;
            case "2": return RollConventionEnum._2;
            case "3": return RollConventionEnum._3;
            case "4": return RollConventionEnum._4;
            case "5": return RollConventionEnum._5;
            case "6": return RollConventionEnum._6;
            case "7": return RollConventionEnum._7;
            case "8": return RollConventionEnum._8;
            case "9": return RollConventionEnum._9;
            case "10": return RollConventionEnum._10;
            case "11": return RollConventionEnum._11;
            case "12": return RollConventionEnum._12;
            case "13": return RollConventionEnum._13;
            case "14": return RollConventionEnum._14;
            case "15": return RollConventionEnum._15;
            case "16": return RollConventionEnum._16;
            case "17": return RollConventionEnum._17;
            case "18": return RollConventionEnum._18;
            case "19": return RollConventionEnum._19;
            case "20": return RollConventionEnum._20;
            case "21": return RollConventionEnum._21;
            case "22": return RollConventionEnum._22;
            case "23": return RollConventionEnum._23;
            case "24": return RollConventionEnum._24;
            case "25": return RollConventionEnum._25;
            case "26": return RollConventionEnum._26;
            case "27": return RollConventionEnum._27;
            case "28": return RollConventionEnum._28;
            case "29": return RollConventionEnum._29;
            case "30": return RollConventionEnum._30;

            // Day of week conventions
            case "MON": return RollConventionEnum.MON;
            case "TUE": return RollConventionEnum.TUE;
            case "WED": return RollConventionEnum.WED;
            case "THU": return RollConventionEnum.THU;
            case "FRI": return RollConventionEnum.FRI;
            case "SAT": return RollConventionEnum.SAT;
            case "SUN": return RollConventionEnum.SUN;

            default:
                System.err.println("WARNING: Unknown roll convention '" + rollConvention + "', using null");
                return null;
        }
    }

    /**
     * Generate JSON output
     */
    public String buildTradeAsJson(SwapParameters parameters) {
        try {
            TradeState tradeState = buildSwap(parameters);
            return objectMapper.writeValueAsString(tradeState);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize trade to JSON: " + e.getMessage(), e);
        }
    }

    /**
     * Get swap type description for logging/debugging
     */
    public String getSwapTypeDescription(SwapParameters parameters) {
        if (isCrossCurrencySwap(parameters)) {
            return "Cross-Currency Swap (" + parameters.getLegs().size() + " legs, " +
                   parameters.getLegs().stream().map(leg -> leg.getNotionalCurrency()).distinct().count() + " currencies)";
        } else {
            return "Interest Rate Swap (" + parameters.getLegs().size() + " legs, " +
                   parameters.getLegs().get(0).getNotionalCurrency() + ")";
        }
    }
}