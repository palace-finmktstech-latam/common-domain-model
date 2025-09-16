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
 * Step 5: Cross-Currency Features - Add FX fixing and principal exchanges
 * Following AmortizingXCcySwap pattern for FX and settlement features
 */
public class Step5SwapBuilder {

    private final ObjectMapper objectMapper;

    public Step5SwapBuilder() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Build TradeState with cross-currency features (FX fixing, principal exchanges)
     */
    public TradeState buildCrossCurrencySwap(SwapParameters parameters) {

        // Step 1: Create parties (same as Step 4)
        BusinessUnit buTest = BusinessUnit.builder()
            .setName("Generic Swap Builder")
            .build();

        Party bankA = Party.builder()
            .setNameValue(parameters.getHeader().getParty1().getPartyName())
            .addBusinessUnit(buTest)
            .build();

        Party bankB = Party.builder()
            .setNameValue(parameters.getHeader().getParty2().getPartyName())
            .build();

        // Step 2: Create counterparties
        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankA)
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(bankB)
            .build();

        // Step 3: Create enhanced product with cross-currency features
        NonTransferableProduct product = createCrossCurrencyProduct(parameters);

        // Step 4: Create Trade
        Trade trade = Trade.builder()
            .setTradeDateValue(convertToDate(parameters.getHeader().getTradeDate().getDate()))
            .addParty(bankA)
            .addParty(bankB)
            .addCounterparty(cp1)
            .addCounterparty(cp2)
            .setProduct(product)
            .build();

        // Step 5: Return TradeState
        return TradeState.builder()
            .setTrade(trade)
            .build();
    }

    /**
     * Create product with cross-currency features - FX fixing and principal exchanges
     */
    private NonTransferableProduct createCrossCurrencyProduct(SwapParameters parameters) {

        EconomicTerms.EconomicTermsBuilder economicTermsBuilder = EconomicTerms.builder();

        // Add ALL interest rate legs
        for (LegParameters leg : parameters.getLegs()) {
            InterestRatePayout irPayout = createEnhancedInterestRatePayout(leg, parameters);
            economicTermsBuilder.addPayout(Payout.builder()
                .setInterestRatePayout(irPayout)
                .build());
        }

        // Add principal exchange payouts for cross-currency swaps
        // Following AmortizingXCcySwap pattern for settlement payouts
        for (LegParameters leg : parameters.getLegs()) {
            // Add initial exchange
            if (leg.getInitialExchange() != null) {
                SettlementPayout initialExchange = createPrincipalExchange(
                    leg.getInitialExchange(), parameters, true);
                economicTermsBuilder.addPayout(Payout.builder()
                    .setSettlementPayout(initialExchange)
                    .build());
            }

            // Add final exchange
            if (leg.getFinalExchange() != null) {
                SettlementPayout finalExchange = createPrincipalExchange(
                    leg.getFinalExchange(), parameters, false);
                economicTermsBuilder.addPayout(Payout.builder()
                    .setSettlementPayout(finalExchange)
                    .build());
            }
        }

        return NonTransferableProduct.builder()
            .setEconomicTerms(economicTermsBuilder.build())
            .build();
    }

    /**
     * Create enhanced InterestRatePayout with FX fixing support
     */
    private InterestRatePayout createEnhancedInterestRatePayout(LegParameters leg, SwapParameters parameters) {

        // Create PayerReceiver
        CounterpartyRoleEnum payer = getCounterpartyRole(leg.getPayerPartyReference(), parameters);
        CounterpartyRoleEnum receiver = getCounterpartyRole(leg.getReceiverPartyReference(), parameters);

        PayerReceiver payerReceiver = PayerReceiver.builder()
            .setPayer(payer)
            .setReceiver(receiver)
            .build();

        // Create enhanced RateSpecification with FX fixing for floating rates
        RateSpecification rateSpec = createRateSpecificationWithFxFixing(leg);

        // Create Notional
        ResolvablePriceQuantity priceQuantity = createNotionalSchedule(leg);

        // Create enhanced CalculationPeriodDates
        CalculationPeriodDates calcDates = createEnhancedCalculationPeriodDates(leg, parameters);

        // Create PaymentDates
        PaymentDates paymentDates = createPaymentDates(leg);

        // Build complete InterestRatePayout
        return InterestRatePayout.builder()
            .setPayerReceiver(payerReceiver)
            .setRateSpecification(rateSpec)
            .setPriceQuantity(priceQuantity)
            .setDayCountFractionValue(convertDayCountFraction(leg.getDayCountFraction()))
            .setCalculationPeriodDates(calcDates)
            .setPaymentDates(paymentDates)
            .build();
    }

    /**
     * Create RateSpecification with FX fixing support for cross-currency floating rates
     */
    private RateSpecification createRateSpecificationWithFxFixing(LegParameters leg) {
        if ("FIXED".equals(leg.getRateType())) {
            // Fixed Rate (same as Step 4)
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
            // Floating Rate with FX fixing support
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

            // TODO: Add FX fixing dates and reset dates for cross-currency legs
            // This would involve ResetDates with fxFixingDate and resetDateOffset
            // Following patterns from AmortizingXCcySwap for FX fixing schedules

            return RateSpecification.builder()
                .setFloatingRateSpecification(floatingBuilder.build())
                .build();
        }
    }

    /**
     * Create SettlementPayout for principal exchanges (initial/final)
     */
    private SettlementPayout createPrincipalExchange(PrincipalExchange exchange,
                                                   SwapParameters parameters,
                                                   boolean isInitial) {

        // Create payer/receiver for principal exchange
        CounterpartyRoleEnum payer = getCounterpartyRole(exchange.getPayerPartyReference(), parameters);
        CounterpartyRoleEnum receiver = getCounterpartyRole(exchange.getReceiverPartyReference(), parameters);

        PayerReceiver payerReceiver = PayerReceiver.builder()
            .setPayer(payer)
            .setReceiver(receiver)
            .build();

        // Create settlement amount
        NonNegativeQuantitySchedule settlementAmount = NonNegativeQuantitySchedule.builder()
            .setValue(exchange.getAmount())
            .setUnit(UnitType.builder()
                .setCurrencyValue(exchange.getCurrency())
                .build())
            .build();

        ResolvablePriceQuantity priceQuantity = ResolvablePriceQuantity.builder()
            .setQuantityScheduleValue(settlementAmount)
            .build();

        // Settlement date is handled directly in the SettlementPayout

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

    // Helper methods from Step 4 (same implementations)
    private CalculationPeriodDates createEnhancedCalculationPeriodDates(LegParameters leg, SwapParameters parameters) {
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
                .build())
            .build();
    }

    private PaymentDates createPaymentDates(LegParameters leg) {
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

    private BusinessDayAdjustments createBusinessDayAdjustments(String convention, List<String> centers) {
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

    // Conversion helper methods (same as Step 4)
    private CounterpartyRoleEnum getCounterpartyRole(String partyRef, SwapParameters params) {
        if (partyRef.equals(params.getHeader().getParty1().getPartyId())) {
            return CounterpartyRoleEnum.PARTY_1;
        } else if (partyRef.equals(params.getHeader().getParty2().getPartyId())) {
            return CounterpartyRoleEnum.PARTY_2;
        } else {
            return CounterpartyRoleEnum.PARTY_1;
        }
    }

    private DayCountFractionEnum convertDayCountFraction(String dayCount) {
        switch (dayCount) {
            case "ACT/360": return DayCountFractionEnum.ACT_360;
            case "30/360": return DayCountFractionEnum._30_360;
            case "ACT/365.FIXED": return DayCountFractionEnum.ACT_365_FIXED;
            default: return DayCountFractionEnum.ACT_360;
        }
    }

    private FloatingRateIndexEnum convertFloatingRateIndex(String index) {
        switch (index) {
            case "USD-SOFR-COMPOUND": return FloatingRateIndexEnum.USD_SOFR_COMPOUND;
            case "EUR-EURIBOR-6M": return FloatingRateIndexEnum.EUR_EURIBOR;
            case "EUR-EURIBOR-3M": return FloatingRateIndexEnum.EUR_EURIBOR;
            default: return FloatingRateIndexEnum.USD_SOFR_COMPOUND;
        }
    }

    private PeriodExtendedEnum convertPeriod(String period) {
        switch (period) {
            case "3M": return PeriodExtendedEnum.M;
            case "6M": return PeriodExtendedEnum.M;
            case "1Y": return PeriodExtendedEnum.Y;
            default: return PeriodExtendedEnum.M;
        }
    }

    private BusinessDayConventionEnum convertBusinessDayConvention(String convention) {
        switch (convention) {
            case "FOLLOWING": return BusinessDayConventionEnum.FOLLOWING;
            case "MODFOLLOWING": return BusinessDayConventionEnum.MODFOLLOWING;
            case "PRECEDING": return BusinessDayConventionEnum.PRECEDING;
            case "NONE": return BusinessDayConventionEnum.NONE;
            default: return BusinessDayConventionEnum.MODFOLLOWING;
        }
    }

    private BusinessCenterEnum convertSingleBusinessCenter(String center) {
        switch (center) {
            case "USNY": return BusinessCenterEnum.USNY;
            case "GBLO": return BusinessCenterEnum.GBLO;
            case "EUTA": return BusinessCenterEnum.EUTA;
            default: return BusinessCenterEnum.USNY;
        }
    }

    private int convertPeriodMultiplier(String period) {
        switch (period) {
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
     * Generate JSON
     */
    public String buildTradeAsJson(SwapParameters parameters) {
        try {
            TradeState tradeState = buildCrossCurrencySwap(parameters);
            return objectMapper.writeValueAsString(tradeState);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize trade to JSON", e);
        }
    }
}