package com.example.cdm;

import java.io.IOException;
import java.math.BigDecimal;
import cdm.event.common.*;
import cdm.base.staticdata.party.*;
import cdm.product.template.*;
import cdm.product.asset.*;
import cdm.product.common.schedule.*;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Step 2: Add Basic Fixed Rate Payout
 * 
 * Building on Step 1, now adding:
 * - A product (NonTransferableProduct) 
 * - Economic terms
 * - One payout: fixed rate (Bank A pays 5%)
 * - Basic payer/receiver roles
 * 
 * Still keeping it minimal to see what works
 */
public class TradeWithFixedLeg {
    
    private final ObjectMapper objectMapper;
    
    public TradeWithFixedLeg() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            TradeWithFixedLeg example = new TradeWithFixedLeg();
            Trade trade = example.buildTradeWithFixedLeg();
            
            System.out.println("=====================================");
            System.out.println("STEP 2: TRADE WITH FIXED RATE LEG");
            System.out.println("=====================================");
            System.out.println();
            System.out.println("What we're adding:");
            System.out.println("• Product structure (NonTransferableProduct)");
            System.out.println("• Economic terms with one payout");
            System.out.println("• Interest rate payout: Bank A pays, Goldman Sachs receives");
            System.out.println("• Basic payer/receiver relationship (no rate specification yet)");
            System.out.println();
            
            String json = example.toJson(trade);
            System.out.println("JSON Output:");
            System.out.println("=====================================");
            System.out.println(json);
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Trade buildTradeWithFixedLeg() {
        
        // Step 1: Same party setup as before
        Party bankA = Party.builder()
            .setNameValue("Bank A")
            .build();

        Party goldmanSachs = Party.builder()
            .setNameValue("Goldman Sachs International")
            .build();

        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankA)
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(goldmanSachs)
            .build();

        // Step 2: NEW - Create a basic interest rate payout (without rate specification for now)
        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1)    // Bank A pays
                .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs receives
                .build())
            // Skip rate specification for now - just test the basic structure
            .build();

        // Step 2: NEW - Create product with the payout
        NonTransferableProduct product = NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .addPayout(Payout.builder()
                    .setInterestRatePayout(fixedLeg)
                    .build())
                .build())
            .build();

        // Step 2: Create trade with product
        return Trade.builder()
            .setTradeDateValue(Date.of(2025, 9, 10))
            .addTradeIdentifier(TradeIdentifier.builder().build())
            .addParty(bankA)
            .addParty(goldmanSachs)
            .addCounterparty(cp1)
            .addCounterparty(cp2)
            .setProduct(product) // NEW - Now we have a product!
            .build();
    }

    public String toJson(Object cdmObject) throws IOException {
        return objectMapper.writeValueAsString(cdmObject);
    }
}