package com.example.cdm;

import java.io.IOException;
import cdm.event.common.*;
import cdm.base.staticdata.party.*;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Step 1: Minimal Trade
 * 
 * This creates the most basic trade structure with:
 * - Two parties (Bank A and Goldman Sachs)
 * - Trade date
 * - Trade identifier
 * - Counterparty roles
 * 
 * NO product yet - just the trade shell
 */
public class MinimalTrade {
    
    private final ObjectMapper objectMapper;
    
    public MinimalTrade() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void main(String[] args) {
        try {
            MinimalTrade example = new MinimalTrade();
            Trade trade = example.buildMinimalTrade();
            
            System.out.println("=====================================");
            System.out.println("STEP 1: MINIMAL TRADE STRUCTURE");
            System.out.println("=====================================");
            System.out.println();
            System.out.println("What we're building:");
            System.out.println("• Two parties: Bank A and Goldman Sachs");
            System.out.println("• Trade date: September 10, 2025");
            System.out.println("• Trade ID: SWAP-001");
            System.out.println("• Counterparty roles: PARTY_1 and PARTY_2");
            System.out.println("• NO product yet - just the trade shell");
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

    /**
     * Build the most basic trade structure
     */
    public Trade buildMinimalTrade() {
        
        // Step 1a: Create parties
        Party bankA = Party.builder()
            .setNameValue("Bank A")
            .build();

        Party goldmanSachs = Party.builder()
            .setNameValue("Goldman Sachs International")
            .build();

        // Step 1b: Create counterparty roles (linking to specific parties)
        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankA) // Link to Bank A party object
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(goldmanSachs) // Link to Goldman Sachs party object
            .build();

        // Step 1c: Create the trade
        return Trade.builder()
            .setTradeDateValue(Date.of(2025, 9, 10))
            .addTradeIdentifier(TradeIdentifier.builder().build()) // Empty identifier for now
            .addParty(bankA)
            .addParty(goldmanSachs)
            .addCounterparty(cp1)
            .addCounterparty(cp2)
            // NO .setProduct() yet - we'll add that in the next step
            .build();
    }

    public String toJson(Object cdmObject) throws IOException {
        return objectMapper.writeValueAsString(cdmObject);
    }
}