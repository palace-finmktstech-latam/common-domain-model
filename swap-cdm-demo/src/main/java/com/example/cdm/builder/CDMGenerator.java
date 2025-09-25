package com.example.cdm.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import cdm.event.common.TradeState;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

/**
 * Wrapper class for consistent trades format
 */
class TradesWrapper {
    private List<SwapParameters> trades;

    public List<SwapParameters> getTrades() {
        return trades;
    }

    public void setTrades(List<SwapParameters> trades) {
        this.trades = trades;
    }
}

/**
 * CDM Generator - processes trades from JSON files and generates CDM-compliant output
 * Handles both single and multiple trades per file using consistent trades array format
 */
public class CDMGenerator {

    public static void main(String[] args) {
        try {
            System.out.println("=== CDM Generator - Processing Trade Files ===");
            System.out.println();

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            GenericSwapBuilder builder = new GenericSwapBuilder();

            // Get all JSON files from the json-inputs directory
            File inputDir = new File("json-inputs");
            if (!inputDir.exists() || !inputDir.isDirectory()) {
                System.err.println("Error: json-inputs directory not found");
                return;
            }

            File[] jsonFiles = inputDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".json"));
            if (jsonFiles == null || jsonFiles.length == 0) {
                System.out.println("No JSON files found in json-inputs directory");
                return;
            }

            System.out.println("Found " + jsonFiles.length + " JSON file(s) to process");
            System.out.println();

            for (File jsonFile : jsonFiles) {
                System.out.println("=== Processing: " + jsonFile.getName() + " ===");

                // Parse the trades array
                TradesWrapper wrapper = mapper.readValue(jsonFile, TradesWrapper.class);
                List<SwapParameters> trades = wrapper.getTrades();

                System.out.println("✓ Found " + trades.size() + " trade(s) in file");

                // Process each trade
                for (int i = 0; i < trades.size(); i++) {
                    SwapParameters trade = trades.get(i);

                    if (trades.size() > 1) {
                        System.out.println("\n  --- Trade " + (i+1) + "/" + trades.size() + " ---");
                    }

                    System.out.println("  ✓ Trade ID: " + trade.getHeader().getTradeId());
                    System.out.println("    Type: " + builder.getSwapTypeDescription(trade));

                    // Show basic leg info
                    for (int j = 0; j < trade.getLegs().size(); j++) {
                        LegParameters leg = trade.getLegs().get(j);
                        System.out.println("    Leg " + (j+1) + ": " + leg.getRateType() +
                                         " (" + leg.getNotionalAmount() + " " + leg.getNotionalCurrency() + ")");
                    }

                    // Build and save CDM output
                    TradeState tradeState = builder.buildSwap(trade);
                    String jsonOutput = builder.buildTradeAsJson(trade);

                    // Generate output filename using the specified nomenclature
                    // Format: Output_<tradeId>_<party1Name>_<party2Name>_<ddmmyyyy>_<source>[_<contractName>].json

                    // Extract date from input filename (e.g., "17092025" from "17092025_bancointernacional_trades.json")
                    String inputFileName = jsonFile.getName();
                    String dateFromFilename = inputFileName.split("_")[0]; // Gets "17092025"

                    // Get party names and replace spaces with hyphens
                    String party1Name = trade.getHeader().getParty1().getPartyName().replace(" ", "-");
                    String party2Name = trade.getHeader().getParty2().getPartyName().replace(" ", "-");

                    // Get source (banco or contrato)
                    String source = trade.getHeader().getSource();

                    // Build the output filename
                    String outputFileName;
                    if ("contrato".equals(source) && trade.getHeader().getContractName() != null) {
                        // If source is "contrato" and contractName exists, append contractName
                        outputFileName = String.format("Output_%s_%s_%s_%s_%s_%s.json",
                            trade.getHeader().getTradeId(),
                            party1Name,
                            party2Name,
                            dateFromFilename,
                            source,
                            trade.getHeader().getContractName());
                    } else {
                        // Otherwise just use the source (banco or contrato without contractName)
                        outputFileName = String.format("Output_%s_%s_%s_%s_%s.json",
                            trade.getHeader().getTradeId(),
                            party1Name,
                            party2Name,
                            dateFromFilename,
                            source);
                    }

                    String outputPath = "json-outputs/" + outputFileName;

                    // Ensure output directory exists
                    File outputDir = new File("json-outputs");
                    if (!outputDir.exists()) {
                        outputDir.mkdirs();
                    }

                    // Write the output
                    try (FileWriter writer = new FileWriter(outputPath)) {
                        writer.write(jsonOutput);
                    }

                    System.out.println("    ✓ CDM output: " + outputPath);
                }

                System.out.println();
            }

            System.out.println("=== Summary ===");
            System.out.println("✓ Consistent trades array format works for both single and multiple trades");
            System.out.println("✓ No format detection needed - always parse 'trades' array");
            System.out.println("✓ Clean, simple code that handles any number of trades per file");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}