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
 * Step 2: SwapBuilder with real InterestRatePayout objects
 * Following the exact pattern from GoldmanSachsSwapDemo.java
 */
public class Step2SwapBuilder {

    private final ObjectMapper objectMapper;

    public Step2SwapBuilder() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Build TradeState with real swap legs from SwapParameters
     */
    public TradeState buildSwapWithLegs(SwapParameters parameters) {

        // Step 1: Create parties (same as Step 1)
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

        // Step 2: Create counterparties (same as Step 1)
        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankA)
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(bankB)
            .build();

        // Step 3: Create product with actual swap legs
        NonTransferableProduct product = NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .addPayout(createPayoutFromLegs(parameters))
                .build())
            .build();

        // Step 4: Create Trade (same as Step 1)
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
     * Create Payout with InterestRatePayout objects for each leg
     */
    private Payout createPayoutFromLegs(SwapParameters parameters) {

        Payout.PayoutBuilder payoutBuilder = Payout.builder();

        // Create an InterestRatePayout for each leg
        for (LegParameters leg : parameters.getLegs()) {
            InterestRatePayout irPayout = createInterestRatePayout(leg, parameters);
            payoutBuilder.setInterestRatePayout(irPayout);
            // Note: For now, we're only setting one leg. We'll enhance this for multiple legs later.
            break; // Just do the first leg for Step 2
        }

        return payoutBuilder.build();
    }

    /**
     * Create InterestRatePayout from LegParameters - following GoldmanSachsSwapDemo pattern
     */
    private InterestRatePayout createInterestRatePayout(LegParameters leg, SwapParameters parameters) {

        // Create PayerReceiver
        CounterpartyRoleEnum payer = getCounterpartyRole(leg.getPayerPartyReference(), parameters);
        CounterpartyRoleEnum receiver = getCounterpartyRole(leg.getReceiverPartyReference(), parameters);

        PayerReceiver payerReceiver = PayerReceiver.builder()
            .setPayer(payer)
            .setReceiver(receiver)
            .build();

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

        // Create basic InterestRatePayout
        return InterestRatePayout.builder()
            .setPayerReceiver(payerReceiver)
            .setCalculationPeriodDates(calcDates)
            .build();
    }

    // Helper methods
    private CounterpartyRoleEnum getCounterpartyRole(String partyRef, SwapParameters params) {
        if (partyRef.equals(params.getHeader().getParty1().getPartyId())) {
            return CounterpartyRoleEnum.PARTY_1;
        } else if (partyRef.equals(params.getHeader().getParty2().getPartyId())) {
            return CounterpartyRoleEnum.PARTY_2;
        } else {
            // Fallback - assume it's PARTY_1 if we can't match
            return CounterpartyRoleEnum.PARTY_1;
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
            TradeState tradeState = buildSwapWithLegs(parameters);
            return objectMapper.writeValueAsString(tradeState);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize trade to JSON", e);
        }
    }
}