package com.example.cdm.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cdm.event.common.TradeState;

import java.io.File;
import java.io.FileWriter;

/**
 * Test the minimal swap builder - Step 1
 */
public class MinimalTest {

    public static void main(String[] args) {
        try {
            System.out.println("=== Testing Minimal Swap Builder - Step 1 ===");

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            MinimalSwapBuilder builder = new MinimalSwapBuilder();

            // Test with IRS input
            System.out.println("Reading IRS JSON...");
            File irsFile = new File("json-inputs/sample-irs-input.json");
            SwapParameters irsParams = mapper.readValue(irsFile, SwapParameters.class);
            System.out.println("✓ JSON parsed successfully");
            System.out.println("  Trade ID: " + irsParams.getHeader().getTradeId());
            System.out.println("  Party 1: " + irsParams.getHeader().getParty1().getPartyName());
            System.out.println("  Party 2: " + irsParams.getHeader().getParty2().getPartyName());

            System.out.println("\nBuilding minimal CDM trade...");
            TradeState tradeState = builder.buildMinimalTrade(irsParams);
            System.out.println("✓ CDM Trade created successfully");

            System.out.println("\nGenerating JSON output...");
            String json = builder.buildTradeAsJson(irsParams);

            try (FileWriter writer = new FileWriter("json-outputs/Minimal-Trade-Output.json")) {
                writer.write(json);
            }
            System.out.println("✓ JSON written to json-outputs/Minimal-Trade-Output.json");

            System.out.println("\n=== Step 1 Complete! Basic trade structure working. ===");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}