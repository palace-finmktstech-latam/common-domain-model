package com.example.cdm.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cdm.event.common.TradeState;

import java.io.File;
import java.io.FileWriter;

/**
 * Custom test for BC-sample-irs-input.json
 */
public class CustomJsonTest {

    public static void main(String[] args) {
        if (args.length > 0) {
            testJsonFile(args[0]);
        } else {
            // Default to BC-sample-irs-input.json
            testJsonFile("json-inputs/BC-sample-irs-input.json");
        }
    }

    private static void testJsonFile(String jsonFilePath) {
        try {
            System.out.println("=== Testing Custom JSON Input ===");
            System.out.println("Input file: " + jsonFilePath);
            System.out.println();

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            GenericSwapBuilder builder = new GenericSwapBuilder();

            // Read the JSON file
            File jsonFile = new File(jsonFilePath);
            if (!jsonFile.exists()) {
                System.err.println("ERROR: File not found: " + jsonFilePath);
                return;
            }

            SwapParameters params = mapper.readValue(jsonFile, SwapParameters.class);

            System.out.println("✓ Input parsed: " + params.getHeader().getTradeId());
            System.out.println("  Type: " + builder.getSwapTypeDescription(params));
            System.out.println();

            // Show business centers being used
            System.out.println("Business Centers Configuration:");
            System.out.println("  Trade Date: " + params.getHeader().getTradeDate().getBusinessCenters());
            System.out.println("  Effective Date: " + params.getHeader().getEffectiveDate().getBusinessCenters());
            System.out.println("  Termination Date: " + params.getHeader().getTerminationDate().getBusinessCenters());
            System.out.println();

            // Show leg details
            System.out.println("Leg Details:");
            for (int i = 0; i < params.getLegs().size(); i++) {
                LegParameters leg = params.getLegs().get(i);
                System.out.println("  Leg " + (i+1) + " (" + leg.getLegId() + "):");
                System.out.println("    Type: " + leg.getRateType());
                System.out.println("    Notional: " + leg.getNotionalAmount() + " " + leg.getNotionalCurrency());

                if (leg.getPaymentBusinessCenters() != null) {
                    System.out.println("    Payment Business Centers: " + leg.getPaymentBusinessCenters());
                }
                if (leg.getResetBusinessCenters() != null) {
                    System.out.println("    Reset Business Centers: " + leg.getResetBusinessCenters());
                }
                if (leg.getResetDateOffset() != null) {
                    System.out.println("    Reset Date Offset: " + leg.getResetDateOffset() + " days");
                }

                System.out.println("    Payment Freq: " + leg.getPaymentFrequency());
                System.out.println("    Day Count: " + leg.getDayCountFraction());
            }
            System.out.println();

            // Build the trade
            System.out.println("Building CDM trade...");
            TradeState tradeState = builder.buildSwap(params);
            System.out.println("✓ TradeState created successfully");

            // Generate JSON output
            String cdmJson = builder.buildTradeAsJson(params);

            // Create output filename based on input
            String outputFileName = jsonFilePath.replace("json-inputs/", "json-outputs/")
                                                .replace(".json", "-CDM-Output.json");

            try (FileWriter writer = new FileWriter(outputFileName)) {
                writer.write(cdmJson);
            }
            System.out.println("✓ CDM output written to " + outputFileName);
            System.out.println();
            System.out.println("=== Test Complete ===");

        } catch (Exception e) {
            System.err.println("Error processing JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}