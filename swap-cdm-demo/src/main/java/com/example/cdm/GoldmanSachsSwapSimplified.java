package com.example.cdm;

import java.math.BigDecimal;
import cdm.event.common.*;
import cdm.product.template.*;
import cdm.product.asset.*;
import cdm.base.staticdata.party.*;
import cdm.base.datetime.*;
import cdm.base.math.*;
import cdm.product.common.schedule.*;
import java.util.Arrays;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Simplified CDM Representation of Goldman Sachs Non-Deliverable Swap
 * This shows the key structure without all the complex details
 */
public class GoldmanSachsSwapSimplified {
    
    private final ObjectMapper objectMapper;
    
    public GoldmanSachsSwapSimplified() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }
    
    public static void main(String[] args) {
        try {
            GoldmanSachsSwapSimplified builder = new GoldmanSachsSwapSimplified();
            
            System.out.println("==========================================");
            System.out.println("Goldman Sachs Non-Deliverable Swap");
            System.out.println("CDM Representation (Simplified)");
            System.out.println("==========================================\n");
            
            builder.displaySwapStructure();
            
            TradeState tradeState = builder.buildSwap();
            
            System.out.println("\nCDM Structure Created!");
            builder.analyzeTradeState(tradeState);
            
            String json = builder.toJson(tradeState);
            System.out.println("\nJSON Representation (partial):");
            System.out.println(json.substring(0, Math.min(json.length(), 1500)));
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void displaySwapStructure() {
        System.out.println("SWAP STRUCTURE FROM CONTRACT:");
        System.out.println("===============================");
        System.out.println();
        System.out.println("PARTIES:");
        System.out.println("  • Goldman Sachs Bank USA (Floating Payer)");
        System.out.println("  • Banco ABC (Fixed Payer)");
        System.out.println();
        System.out.println("TRADE IDENTIFIERS:");
        System.out.println("  • Reference: SDBB7MM33347TK7MBR.0.0.0");
        System.out.println("  • Internal: 063474811");
        System.out.println("  • USI: 1030444992 SDBB7MM33347TK7MBR00000010000000");
        System.out.println();
        System.out.println("KEY DATES:");
        System.out.println("  • Trade Date: August 26, 2022");
        System.out.println("  • Effective Date: January 5, 2023");
        System.out.println("  • Termination Date: January 5, 2043 (20 years)");
        System.out.println();
        System.out.println("FLOATING LEG (Goldman Sachs pays):");
        System.out.println("  • Rate: CLP-ICP (Chilean overnight index)");
        System.out.println("  • Initial Notional: CLP 10,694,180,710");
        System.out.println("  • Day Count: Actual/360");
        System.out.println("  • Payment: Monthly on 5th");
        System.out.println("  • Reset: Last day of each period");
        System.out.println("  • Amortizing structure (see Appendix I)");
        System.out.println();
        System.out.println("FIXED LEG (Banco ABC pays):");
        System.out.println("  • Rate: 1.75%");
        System.out.println("  • Initial Notional: CLF 316,764 (inflation-linked)");
        System.out.println("  • Day Count: Actual/360");
        System.out.println("  • Payment: Monthly on 5th");
        System.out.println("  • CLF adjusted by UF inflation index");
        System.out.println("  • Amortizing structure (see Appendix I)");
        System.out.println();
        System.out.println("SETTLEMENT:");
        System.out.println("  • Type: Non-Deliverable");
        System.out.println("  • Settlement Currency: USD");
        System.out.println("  • Reference Currency: CLP");
        System.out.println("  • FX Rate: CLP DOLAR OBS (CLP10)");
        System.out.println("  • Valuation: 2 business days before payment");
        System.out.println();
        System.out.println("SPECIAL FEATURES:");
        System.out.println("  • Amortizing notionals (both legs)");
        System.out.println("  • Interim exchanges throughout life");
        System.out.println("  • Final exchange at maturity");
        System.out.println("  • Inflation adjustment on fixed leg (CLF/UF)");
        System.out.println("  • Disruption events and fallbacks defined");
    }
    
    public TradeState buildSwap() {
        Trade trade = Trade.builder()
            .setTradeDateValue(Date.of(2022, 8, 26))
            .addTradeIdentifier(TradeIdentifier.builder()
                .build())
            .addParty(Party.builder()
                .setNameValue("Goldman Sachs Bank USA")
                .build())
            .addParty(Party.builder()
                .setNameValue("BANCO ABC")
                .build())
            .addCounterparty(Counterparty.builder()
                .setRole(CounterpartyRoleEnum.PARTY_1)
                .build())
            .addCounterparty(Counterparty.builder()
                .setRole(CounterpartyRoleEnum.PARTY_2)
                .build())
            .setProduct(buildProduct())
            .build();
            
        return TradeState.builder()
            .setTrade(trade)
            .build();
    }
    
    private NonTransferableProduct buildProduct() {
        InterestRatePayout floatingLeg = buildSimpleFloatingLeg();
        InterestRatePayout fixedLeg = buildSimpleFixedLeg();
        
        return NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .addPayout(Payout.builder()
                    .setInterestRatePayout(floatingLeg)
                    .build())
                .build())
            .build();
    }
    
    private InterestRatePayout buildSimpleFloatingLeg() {
        return InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1) // GS pays
                .setReceiver(CounterpartyRoleEnum.PARTY_2)
                .build())
            .setRateSpecification(RateSpecification.builder()
                .build())
            .setCalculationPeriodDates(CalculationPeriodDates.builder()
                .setEffectiveDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2023, 1, 5))
                        .build())
                    .build())
                .setTerminationDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2043, 1, 5))
                        .build())
                    .build())
                .build())
            .build();
    }
    
    private InterestRatePayout buildSimpleFixedLeg() {
        return InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2) // Banco ABC pays
                .setReceiver(CounterpartyRoleEnum.PARTY_1)
                .build())
            .setRateSpecification(RateSpecification.builder()
                .build())
            .setCalculationPeriodDates(CalculationPeriodDates.builder()
                .setEffectiveDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2023, 1, 5))
                        .build())
                    .build())
                .setTerminationDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2043, 1, 5))
                        .build())
                    .build())
                .build())
            .build();
    }
    
    private void analyzeTradeState(TradeState tradeState) {
        System.out.println("\nTRADE ANALYSIS:");
        System.out.println("================");
        
        if (tradeState != null && tradeState.getTrade() != null) {
            Trade trade = tradeState.getTrade();
            
            System.out.println("✓ Trade Date: " + trade.getTradeDate());
            System.out.println("✓ Parties: " + trade.getParty().size() + " parties defined");
            System.out.println("✓ Counterparties: " + trade.getCounterparty().size() + " counterparty roles");
            
            if (trade.getTradeIdentifier() != null && !trade.getTradeIdentifier().isEmpty()) {
                System.out.println("✓ Trade Identifiers: " + trade.getTradeIdentifier().size());
            }
            
            if (trade.getProduct() != null) {
                System.out.println("✓ Product structure created");
                NonTransferableProduct product = (NonTransferableProduct) trade.getProduct();
                if (product.getEconomicTerms() != null && 
                    product.getEconomicTerms().getPayout() != null) {
                    System.out.println("✓ Payout structure defined");
                }
            }
        }
    }
    
    public String toJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}