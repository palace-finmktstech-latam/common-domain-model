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

/**
 * Minimal SwapBuilder - Step 1: Just create a basic trade structure
 * Following the EXACT pattern from GoldmanSachsSwapDemo.java
 */
public class MinimalSwapBuilder {

    private final ObjectMapper objectMapper;

    public MinimalSwapBuilder() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Build a minimal TradeState from SwapParameters - copying GoldmanSachsSwapDemo pattern exactly
     */
    public TradeState buildMinimalTrade(SwapParameters parameters) {

        // Step 1: Create parties exactly like working examples
        BusinessUnit buTest = BusinessUnit.builder()
            .setName("Generic Swap Builder")
            .build();

        Party bankA = Party.builder()
            .setNameValue(parameters.getHeader().getParty1().getPartyName())
            .addBusinessUnit(buTest)
            .build();

        Party goldmanSachs = Party.builder()
            .setNameValue(parameters.getHeader().getParty2().getPartyName())
            .build();

        // Step 2: Create counterparties exactly like working examples
        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankA)
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(goldmanSachs)
            .build();

        // Step 3: Create minimal product - using NonTransferableProduct like working examples
        NonTransferableProduct product = NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .build())
            .build();

        // Step 4: Create Trade exactly like GoldmanSachsSwapDemo
        Trade trade = Trade.builder()
            .setTradeDateValue(convertToDate(parameters.getHeader().getTradeDate().getDate()))
            .addParty(bankA)
            .addParty(goldmanSachs)
            .addCounterparty(cp1)
            .addCounterparty(cp2)
            .setProduct(product)
            .build();

        // Step 6: Return TradeState like working examples
        return TradeState.builder()
            .setTrade(trade)
            .build();
    }

    /**
     * Generate JSON - copying the pattern exactly
     */
    public String buildTradeAsJson(SwapParameters parameters) {
        try {
            TradeState tradeState = buildMinimalTrade(parameters);
            return objectMapper.writeValueAsString(tradeState);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize trade to JSON", e);
        }
    }

    /**
     * Convert LocalDate to CDM Date - exact copy from working examples
     */
    private Date convertToDate(LocalDate localDate) {
        return Date.of(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }
}