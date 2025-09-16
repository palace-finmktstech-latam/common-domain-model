package com.example.cdm.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cdm.event.common.TradeState;

import java.io.File;
import java.io.FileWriter;

/**
 * Test Step 4: Multi-Leg Swap Builder - Process ALL legs from JSON
 */
public class Step4Test {

    public static void main(String[] args) {
        try {
            System.out.println("=== Testing Step 4: Multi-Leg Swap Builder ===");

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            Step4SwapBuilder builder = new Step4SwapBuilder();

            // Test with IRS - Should show BOTH fixed AND floating legs
            System.out.println("\nStep 4 - Interest Rate Swap (Should show 2 legs):");
            File irsFile = new File("json-inputs/sample-irs-input.json");
            SwapParameters irsParams = mapper.readValue(irsFile, SwapParameters.class);

            System.out.println("✓ Input parsed: " + irsParams.getHeader().getTradeId());
            System.out.println("  Expected legs: " + irsParams.getLegs().size());

            // Show what we're processing
            for (int i = 0; i < irsParams.getLegs().size(); i++) {
                LegParameters leg = irsParams.getLegs().get(i);
                System.out.println("  Leg " + (i+1) + ": " + leg.getRateType() +
                                 " (" + leg.getNotionalAmount() + " " + leg.getNotionalCurrency() + ")");
                System.out.println("    " + leg.getPayerPartyReference() + " → " + leg.getReceiverPartyReference());
                System.out.println("    Payment Freq: " + leg.getPaymentFrequency() +
                                 ", Day Count: " + leg.getDayCountFraction());
            }

            System.out.println("\nBuilding multi-leg CDM trade...");
            TradeState irsTradeState = builder.buildMultiLegSwap(irsParams);
            System.out.println("✓ Multi-leg IRS TradeState created");

            String irsJson = builder.buildTradeAsJson(irsParams);
            try (FileWriter writer = new FileWriter("json-outputs/Step4-IRS-MultiLeg.json")) {
                writer.write(irsJson);
            }
            System.out.println("✓ Multi-leg IRS JSON written to json-outputs/Step4-IRS-MultiLeg.json");

            // Test with Cross-Currency Swap - Should show BOTH USD AND EUR legs
            System.out.println("\nStep 4 - Cross-Currency Swap (Should show 2 legs):");
            File xccyFile = new File("json-inputs/sample-xccy-swap-input.json");
            SwapParameters xccyParams = mapper.readValue(xccyFile, SwapParameters.class);

            System.out.println("✓ Input parsed: " + xccyParams.getHeader().getTradeId());
            System.out.println("  Expected legs: " + xccyParams.getLegs().size());

            for (int i = 0; i < xccyParams.getLegs().size(); i++) {
                LegParameters leg = xccyParams.getLegs().get(i);
                System.out.println("  Leg " + (i+1) + ": " + leg.getRateType() +
                                 " (" + leg.getNotionalAmount() + " " + leg.getNotionalCurrency() + ")");
                if ("FLOATING".equals(leg.getRateType())) {
                    System.out.println("    Index: " + leg.getFloatingRateIndex() +
                                     ", Spread: " + (leg.getSpread().doubleValue() * 100) + "%");
                }
                if (leg.getFxFixing() != null) {
                    System.out.println("    FX Fixing: " + leg.getFxFixing().getFxFixingReference());
                }
            }

            TradeState xccyTradeState = builder.buildMultiLegSwap(xccyParams);
            String xccyJson = builder.buildTradeAsJson(xccyParams);

            try (FileWriter writer = new FileWriter("json-outputs/Step4-XCcy-MultiLeg.json")) {
                writer.write(xccyJson);
            }
            System.out.println("✓ Multi-leg Cross-Currency JSON written to json-outputs/Step4-XCcy-MultiLeg.json");

            System.out.println("\n=== Step 4 Complete! Multi-leg swap processing working. ===");
            System.out.println("Check the JSON outputs - they should now contain MULTIPLE payout sections!");
            System.out.println("Next: Verify all legs are properly represented in the CDM output.");

        } catch (Exception e) {
            System.err.println("Error in Step 4: " + e.getMessage());
            e.printStackTrace();
        }
    }
}