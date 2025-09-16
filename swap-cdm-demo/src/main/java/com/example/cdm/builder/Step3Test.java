package com.example.cdm.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cdm.event.common.TradeState;

import java.io.File;
import java.io.FileWriter;

/**
 * Test Step 3: Complete Swap Builder with RateSpecifications and Notionals
 */
public class Step3Test {

    public static void main(String[] args) {
        try {
            System.out.println("=== Testing Step 3: Complete Swap with Rates & Notionals ===");

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            Step3SwapBuilder builder = new Step3SwapBuilder();

            // Test with IRS input
            System.out.println("\nStep 3 - Testing Interest Rate Swap...");
            File irsFile = new File("json-inputs/sample-irs-input.json");
            SwapParameters irsParams = mapper.readValue(irsFile, SwapParameters.class);

            System.out.println("✓ JSON parsed successfully");
            System.out.println("  Trade ID: " + irsParams.getHeader().getTradeId());

            // Display leg details
            for (int i = 0; i < irsParams.getLegs().size(); i++) {
                LegParameters leg = irsParams.getLegs().get(i);
                System.out.println("  Leg " + (i+1) + ":");
                System.out.println("    Type: " + leg.getRateType());
                System.out.println("    Payer: " + leg.getPayerPartyReference() + " → Receiver: " + leg.getReceiverPartyReference());
                System.out.println("    Notional: " + leg.getNotionalAmount() + " " + leg.getNotionalCurrency());
                System.out.println("    Day Count: " + leg.getDayCountFraction());

                if ("FIXED".equals(leg.getRateType())) {
                    System.out.println("    Fixed Rate: " + (leg.getFixedRate().doubleValue() * 100) + "%");
                } else {
                    System.out.println("    Floating Index: " + leg.getFloatingRateIndex());
                    if (leg.getSpread() != null) {
                        System.out.println("    Spread: " + (leg.getSpread().doubleValue() * 100) + "%");
                    }
                }
            }

            System.out.println("\nBuilding complete CDM trade...");
            TradeState tradeState = builder.buildCompleteSwap(irsParams);
            System.out.println("✓ Complete CDM TradeState created with rates and notionals");

            System.out.println("\nGenerating JSON output...");
            String json = builder.buildTradeAsJson(irsParams);

            try (FileWriter writer = new FileWriter("json-outputs/Step3-IRS-Complete.json")) {
                writer.write(json);
            }
            System.out.println("✓ Complete IRS JSON written to json-outputs/Step3-IRS-Complete.json");

            // Test with Cross-Currency Swap
            System.out.println("\nStep 3 - Testing Cross-Currency Swap...");
            File xccyFile = new File("json-inputs/sample-xccy-swap-input.json");
            SwapParameters xccyParams = mapper.readValue(xccyFile, SwapParameters.class);

            System.out.println("✓ Cross-Currency JSON parsed");
            System.out.println("  Legs: " + xccyParams.getLegs().size());
            for (LegParameters leg : xccyParams.getLegs()) {
                System.out.println("    " + leg.getRateType() + " leg: " +
                                 leg.getNotionalAmount() + " " + leg.getNotionalCurrency());
            }

            TradeState xccyTradeState = builder.buildCompleteSwap(xccyParams);
            String xccyJson = builder.buildTradeAsJson(xccyParams);

            try (FileWriter writer = new FileWriter("json-outputs/Step3-XCcy-Complete.json")) {
                writer.write(xccyJson);
            }
            System.out.println("✓ Complete Cross-Currency JSON written to json-outputs/Step3-XCcy-Complete.json");

            System.out.println("\n=== Step 3 Complete! Full swap structure with rates and notionals. ===");
            System.out.println("Next: Add payment schedules, business day conventions, and principal exchanges.");

        } catch (Exception e) {
            System.err.println("Error in Step 3: " + e.getMessage());
            e.printStackTrace();
        }
    }
}