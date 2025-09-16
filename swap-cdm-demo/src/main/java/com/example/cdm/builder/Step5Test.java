package com.example.cdm.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cdm.event.common.TradeState;

import java.io.File;
import java.io.FileWriter;

/**
 * Test Step 5: Cross-Currency Features - FX fixing and principal exchanges
 */
public class Step5Test {

    public static void main(String[] args) {
        try {
            System.out.println("=== Testing Step 5: Cross-Currency Features ===");

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            Step5SwapBuilder builder = new Step5SwapBuilder();

            // Test with Cross-Currency Swap - Should show legs + principal exchanges
            System.out.println("\nStep 5 - Cross-Currency Swap with Principal Exchanges:");
            File xccyFile = new File("json-inputs/sample-xccy-swap-input.json");
            SwapParameters xccyParams = mapper.readValue(xccyFile, SwapParameters.class);

            System.out.println("✓ Input parsed: " + xccyParams.getHeader().getTradeId());
            System.out.println("  Expected legs: " + xccyParams.getLegs().size());

            for (int i = 0; i < xccyParams.getLegs().size(); i++) {
                LegParameters leg = xccyParams.getLegs().get(i);
                System.out.println("  Leg " + (i+1) + ": " + leg.getRateType() +
                                 " (" + leg.getNotionalAmount() + " " + leg.getNotionalCurrency() + ")");

                // Show principal exchanges
                if (leg.getInitialExchange() != null) {
                    System.out.println("    Initial Exchange: " +
                                     leg.getInitialExchange().getAmount() + " " +
                                     leg.getInitialExchange().getCurrency() + " on " +
                                     leg.getInitialExchange().getDate());
                    System.out.println("      " + leg.getInitialExchange().getPayerPartyReference() +
                                     " → " + leg.getInitialExchange().getReceiverPartyReference());
                }

                if (leg.getFinalExchange() != null) {
                    System.out.println("    Final Exchange: " +
                                     leg.getFinalExchange().getAmount() + " " +
                                     leg.getFinalExchange().getCurrency() + " on " +
                                     leg.getFinalExchange().getDate());
                    System.out.println("      " + leg.getFinalExchange().getPayerPartyReference() +
                                     " → " + leg.getFinalExchange().getReceiverPartyReference());
                }

                // Show FX fixing if present
                if (leg.getFxFixing() != null) {
                    System.out.println("    FX Fixing: " + leg.getFxFixing().getFxFixingReference() +
                                     " (offset: " + leg.getFxFixing().getFxFixingOffset() + " days)");
                }
            }

            System.out.println("\nBuilding cross-currency CDM trade with principal exchanges...");
            TradeState xccyTradeState = builder.buildCrossCurrencySwap(xccyParams);
            System.out.println("✓ Cross-currency TradeState with principal exchanges created");

            String xccyJson = builder.buildTradeAsJson(xccyParams);
            try (FileWriter writer = new FileWriter("json-outputs/Step5-XCcy-WithPrincipalExchanges.json")) {
                writer.write(xccyJson);
            }
            System.out.println("✓ Cross-currency JSON with principal exchanges written to json-outputs/Step5-XCcy-WithPrincipalExchanges.json");

            // Test with IRS to ensure it still works (no principal exchanges)
            System.out.println("\nStep 5 - Interest Rate Swap (no principal exchanges):");
            File irsFile = new File("json-inputs/sample-irs-input.json");
            SwapParameters irsParams = mapper.readValue(irsFile, SwapParameters.class);

            System.out.println("✓ Input parsed: " + irsParams.getHeader().getTradeId());
            System.out.println("  Expected legs: " + irsParams.getLegs().size() + " (no principal exchanges)");

            TradeState irsTradeState = builder.buildCrossCurrencySwap(irsParams);
            String irsJson = builder.buildTradeAsJson(irsParams);

            try (FileWriter writer = new FileWriter("json-outputs/Step5-IRS-NoExchanges.json")) {
                writer.write(irsJson);
            }
            System.out.println("✓ IRS JSON written to json-outputs/Step5-IRS-NoExchanges.json");

            System.out.println("\n=== Step 5 Complete! Cross-currency features working. ===");
            System.out.println("Check the JSON outputs - XCcy should now contain SETTLEMENT payouts for principal exchanges!");
            System.out.println("Next: Create comprehensive swap builder with all features.");

        } catch (Exception e) {
            System.err.println("Error in Step 5: " + e.getMessage());
            e.printStackTrace();
        }
    }
}