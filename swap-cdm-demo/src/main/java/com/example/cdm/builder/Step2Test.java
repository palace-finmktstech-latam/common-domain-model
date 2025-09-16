package com.example.cdm.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cdm.event.common.TradeState;

import java.io.File;
import java.io.FileWriter;

/**
 * Test Step 2: Swap Builder with real InterestRatePayout objects
 */
public class Step2Test {

    public static void main(String[] args) {
        try {
            System.out.println("=== Testing Step 2: Swap Builder with InterestRatePayout ===");

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            Step2SwapBuilder builder = new Step2SwapBuilder();

            // Test with IRS input
            System.out.println("\nStep 2 - Testing Interest Rate Swap...");
            File irsFile = new File("json-inputs/sample-irs-input.json");
            SwapParameters irsParams = mapper.readValue(irsFile, SwapParameters.class);

            System.out.println("✓ JSON parsed successfully");
            System.out.println("  Trade ID: " + irsParams.getHeader().getTradeId());
            System.out.println("  Legs: " + irsParams.getLegs().size());

            for (int i = 0; i < irsParams.getLegs().size(); i++) {
                LegParameters leg = irsParams.getLegs().get(i);
                System.out.println("    Leg " + (i+1) + ": " + leg.getRateType() +
                                 " (" + leg.getPayerPartyReference() + " → " +
                                 leg.getReceiverPartyReference() + ")");
                System.out.println("      Notional: " + leg.getNotionalAmount() + " " +
                                 leg.getNotionalCurrency());
            }

            System.out.println("\nBuilding CDM trade with InterestRatePayout...");
            TradeState tradeState = builder.buildSwapWithLegs(irsParams);
            System.out.println("✓ CDM TradeState created with swap legs");

            System.out.println("\nGenerating JSON output...");
            String json = builder.buildTradeAsJson(irsParams);

            try (FileWriter writer = new FileWriter("json-outputs/Step2-IRS-Output.json")) {
                writer.write(json);
            }
            System.out.println("✓ JSON written to json-outputs/Step2-IRS-Output.json");

            // Also test with Cross-Currency Swap
            System.out.println("\nStep 2 - Testing Cross-Currency Swap...");
            File xccyFile = new File("json-inputs/sample-xccy-swap-input.json");
            SwapParameters xccyParams = mapper.readValue(xccyFile, SwapParameters.class);

            TradeState xccyTradeState = builder.buildSwapWithLegs(xccyParams);
            String xccyJson = builder.buildTradeAsJson(xccyParams);

            try (FileWriter writer = new FileWriter("json-outputs/Step2-XCcy-Output.json")) {
                writer.write(xccyJson);
            }
            System.out.println("✓ Cross-Currency JSON written to json-outputs/Step2-XCcy-Output.json");

            System.out.println("\n=== Step 2 Complete! InterestRatePayout objects working. ===");
            System.out.println("Next: Add rate specifications, notionals, and payment schedules.");

        } catch (Exception e) {
            System.err.println("Error in Step 2: " + e.getMessage());
            e.printStackTrace();
        }
    }
}