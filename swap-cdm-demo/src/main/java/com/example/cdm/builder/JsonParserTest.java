package com.example.cdm.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class JsonParserTest {
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            // Test parsing the cross-currency swap JSON
            System.out.println("=== Testing Cross-Currency Swap JSON ===");
            File xccyFile = new File("json-inputs/sample-xccy-swap-input.json");
            SwapParameters xccySwap = mapper.readValue(xccyFile, SwapParameters.class);

            System.out.println("Trade ID: " + xccySwap.getHeader().getTradeId());
            System.out.println("Trade Date: " + xccySwap.getHeader().getTradeDate().getDate().format(DATE_FORMAT));
            System.out.println("Effective Date: " + xccySwap.getHeader().getEffectiveDate().getDate().format(DATE_FORMAT));
            System.out.println("Termination Date: " + xccySwap.getHeader().getTerminationDate().getDate().format(DATE_FORMAT));
            System.out.println("Party 1: " + xccySwap.getHeader().getParty1().getPartyName() +
                              " (" + xccySwap.getHeader().getParty1().getPartyId() + ")");
            System.out.println("Party 2: " + xccySwap.getHeader().getParty2().getPartyName() +
                              " (" + xccySwap.getHeader().getParty2().getPartyId() + ")");

            System.out.println("\nLegs:");
            for (LegParameters leg : xccySwap.getLegs()) {
                System.out.println("  Leg ID: " + leg.getLegId());
                System.out.println("    Payer: " + leg.getPayerPartyReference());
                System.out.println("    Receiver: " + leg.getReceiverPartyReference());
                System.out.println("    Notional: " + leg.getNotionalAmount() + " " + leg.getNotionalCurrency());
                System.out.println("    Rate Type: " + leg.getRateType());
                if ("FIXED".equals(leg.getRateType())) {
                    System.out.println("    Fixed Rate: " + (leg.getFixedRate().doubleValue() * 100) + "%");
                } else {
                    System.out.println("    Floating Index: " + leg.getFloatingRateIndex());
                    System.out.println("    Spread: " + (leg.getSpread().doubleValue() * 100) + "%");
                }
                if (leg.getInitialExchange() != null) {
                    System.out.println("    Initial Exchange: " + leg.getInitialExchange().getAmount() +
                                      " " + leg.getInitialExchange().getCurrency() +
                                      " on " + leg.getInitialExchange().getDate().format(DATE_FORMAT));
                }
                if (leg.getFinalExchange() != null) {
                    System.out.println("    Final Exchange: " + leg.getFinalExchange().getAmount() +
                                      " " + leg.getFinalExchange().getCurrency() +
                                      " on " + leg.getFinalExchange().getDate().format(DATE_FORMAT));
                }
                if (leg.getFxFixing() != null) {
                    System.out.println("    FX Fixing Reference: " + leg.getFxFixing().getFxFixingReference());
                }
            }

            System.out.println("\n=== Testing Interest Rate Swap JSON ===");
            File irsFile = new File("json-inputs/sample-irs-input.json");
            SwapParameters irsSwap = mapper.readValue(irsFile, SwapParameters.class);

            System.out.println("Trade ID: " + irsSwap.getHeader().getTradeId());
            System.out.println("Number of legs: " + irsSwap.getLegs().size());

            for (LegParameters leg : irsSwap.getLegs()) {
                System.out.println("\nLeg: " + leg.getLegId());
                System.out.println("  Rate Type: " + leg.getRateType());
                System.out.println("  Notional: " + leg.getNotionalAmount() + " " + leg.getNotionalCurrency());
                System.out.println("  Payment Frequency: " + leg.getPaymentFrequency());
                System.out.println("  Day Count: " + leg.getDayCountFraction());
            }

            System.out.println("\n=== JSON Parsing Successful! ===");

        } catch (IOException e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}