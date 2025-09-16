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
 * Step 3: SwapBuilder with RateSpecifications and Notionals
 * Following the exact pattern from AmortizingXCcySwap.java
 */
public class Step3SwapBuilder {

    private final ObjectMapper objectMapper;

    public Step3SwapBuilder() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Build TradeState with complete InterestRatePayout objects
     */
    public TradeState buildCompleteSwap(SwapParameters parameters) {

        // Step 1: Create parties (same as previous steps)
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

        // Step 3: Create product with complete swap legs including rates and notionals
        NonTransferableProduct product = NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .addPayout(createCompletePayoutFromLegs(parameters))
                .build())
            .build();

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
     * Create Payout with complete InterestRatePayout objects for each leg
     */
    private Payout createCompletePayoutFromLegs(SwapParameters parameters) {

        Payout.PayoutBuilder payoutBuilder = Payout.builder();

        // For Step 3, let's handle both legs properly
        List<InterestRatePayout> irPayouts = new ArrayList<>();
        for (LegParameters leg : parameters.getLegs()) {
            InterestRatePayout irPayout = createCompleteInterestRatePayout(leg, parameters);
            irPayouts.add(irPayout);
        }

        // Add all legs to the payout - using correct pattern from working examples
        for (InterestRatePayout payout : irPayouts) {
            payoutBuilder.setInterestRatePayout(payout);
            // Note: For now we'll just set one. We'll enhance this for multiple legs in Step 4
            break;
        }

        return payoutBuilder.build();
    }

    /**
     * Create complete InterestRatePayout with rates and notionals - following AmortizingXCcySwap pattern
     */
    private InterestRatePayout createCompleteInterestRatePayout(LegParameters leg, SwapParameters parameters) {

        // Create PayerReceiver
        CounterpartyRoleEnum payer = getCounterpartyRole(leg.getPayerPartyReference(), parameters);
        CounterpartyRoleEnum receiver = getCounterpartyRole(leg.getReceiverPartyReference(), parameters);

        PayerReceiver payerReceiver = PayerReceiver.builder()
            .setPayer(payer)
            .setReceiver(receiver)
            .build();

        // Create RateSpecification based on leg type
        RateSpecification rateSpec = createRateSpecification(leg);

        // Create Notional (PriceQuantity)
        ResolvablePriceQuantity priceQuantity = createNotionalSchedule(leg);

        // Create CalculationPeriodDates
        CalculationPeriodDates calcDates = CalculationPeriodDates.builder()
            .setEffectiveDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(convertToDate(parameters.getHeader().getEffectiveDate().getDate()))
                    .build())
                .build())
            .setTerminationDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(convertToDate(parameters.getHeader().getTerminationDate().getDate()))
                    .build())
                .build())
            .build();

        // Create complete InterestRatePayout
        return InterestRatePayout.builder()
            .setPayerReceiver(payerReceiver)
            .setRateSpecification(rateSpec)
            .setPriceQuantity(priceQuantity)
            .setDayCountFractionValue(convertDayCountFraction(leg.getDayCountFraction()))
            .setCalculationPeriodDates(calcDates)
            .build();
    }

    /**
     * Create RateSpecification - following AmortizingXCcySwap pattern exactly
     */
    private RateSpecification createRateSpecification(LegParameters leg) {
        if ("FIXED".equals(leg.getRateType())) {
            // Fixed Rate - following AmortizingXCcySwap pattern
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
            // Floating Rate - following AmortizingXCcySwap pattern
            FloatingRateSpecification floatingRateSpec = FloatingRateSpecification.builder()
                .setRateOptionValue(InterestRateIndex.builder()
                    .setFloatingRateIndex(FloatingRateIndex.builder()
                        .setFloatingRateIndexValue(convertFloatingRateIndex(leg.getFloatingRateIndex()))
                        .build())
                    .build())
                .build();

            return RateSpecification.builder()
                .setFloatingRateSpecification(floatingRateSpec)
                .build();
        }
    }

    /**
     * Create NotionalSchedule - following AmortizingXCcySwap pattern
     */
    private ResolvablePriceQuantity createNotionalSchedule(LegParameters leg) {
        // Create notional schedule following the exact pattern from working examples
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

    // Helper methods
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

    private Date convertToDate(LocalDate localDate) {
        return Date.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }

    /**
     * Generate JSON
     */
    public String buildTradeAsJson(SwapParameters parameters) {
        try {
            TradeState tradeState = buildCompleteSwap(parameters);
            return objectMapper.writeValueAsString(tradeState);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize trade to JSON", e);
        }
    }
}