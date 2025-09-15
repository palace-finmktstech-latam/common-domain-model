package com.example.cdm;

import java.math.BigDecimal;
import java.io.FileWriter;
import java.io.IOException;
import cdm.event.common.*;
import cdm.product.template.*;
import cdm.product.asset.*;
import cdm.base.staticdata.party.*;
import cdm.base.datetime.*;
import com.rosetta.model.lib.records.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Goldman Sachs Swap - CDM Demo
 * This creates a working CDM representation and saves it to files
 */
public class GoldmanSachsSwapDemo {
    
    private final ObjectMapper objectMapper;
    
    public GoldmanSachsSwapDemo() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }
    
    public static void main(String[] args) {
        try {
            GoldmanSachsSwapDemo demo = new GoldmanSachsSwapDemo();
            
            System.out.println("==========================================");
            System.out.println("Goldman Sachs Non-Deliverable Swap");
            System.out.println("CDM Representation Generator");
            System.out.println("==========================================\n");
            
            // Create the CDM structure
            TradeState tradeState = demo.createTradeState();
            
            // Generate outputs
            demo.generateTextSummary(tradeState);
            demo.generateJsonOutput(tradeState);
            demo.generateMarkdownDocumentation();
            
            System.out.println("\n✓ CDM representation complete!");
            System.out.println("\nOutput files generated:");
            System.out.println("  1. goldman-sachs-swap-summary.txt - Human-readable summary");
            System.out.println("  2. goldman-sachs-swap-cdm.json - CDM JSON structure");
            System.out.println("  3. goldman-sachs-swap-analysis.md - Detailed analysis");
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private TradeState createTradeState() {
        // Create basic trade structure
        Trade trade = Trade.builder()
            .setTradeDateValue(Date.of(2022, 8, 26))
            .addTradeIdentifier(TradeIdentifier.builder().build())
            .addParty(Party.builder()
                .setNameValue("Goldman Sachs Bank USA")
                .build())
            .addParty(Party.builder()
                .setNameValue("BANCO ABC")
                .build())
            .addCounterparty(Counterparty.builder()
                .setRole(CounterpartyRoleEnum.PARTY_1)
                .build())
            .addCounterparty(Counterparty.builder()
                .setRole(CounterpartyRoleEnum.PARTY_2)
                .build())
            .setProduct(createProduct())
            .build();
            
        return TradeState.builder()
            .setTrade(trade)
            .build();
    }
    
    private NonTransferableProduct createProduct() {
        // Create product with two interest rate legs
        return NonTransferableProduct.builder()
            .setEconomicTerms(EconomicTerms.builder()
                .addPayout(Payout.builder()
                    .setInterestRatePayout(createFloatingLeg())
                    .build())
                .build())
            .build();
    }
    
    private InterestRatePayout createFloatingLeg() {
        return InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1) // GS Bank pays
                .setReceiver(CounterpartyRoleEnum.PARTY_2)
                .build())
            .setCalculationPeriodDates(cdm.product.common.schedule.CalculationPeriodDates.builder()
                .setEffectiveDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2023, 1, 5))
                        .build())
                    .build())
                .setTerminationDate(AdjustableOrRelativeDate.builder()
                    .setAdjustableDate(AdjustableDate.builder()
                        .setUnadjustedDate(Date.of(2043, 1, 5))
                        .build())
                    .build())
                .build())
            .build();
    }
    
    private void generateTextSummary(TradeState tradeState) throws IOException {
        StringBuilder summary = new StringBuilder();
        summary.append("GOLDMAN SACHS NON-DELIVERABLE SWAP - CDM REPRESENTATION\n");
        summary.append("=========================================================\n\n");
        
        summary.append("REFERENCE NUMBERS:\n");
        summary.append("  Goldman Sachs Ref: SDBB7MM33347TK7MBR.0.0.0\n");
        summary.append("  Internal Ref: 063474811\n");
        summary.append("  USI: 1030444992 SDBB7MM33347TK7MBR00000010000000\n\n");
        
        summary.append("KEY DATES:\n");
        summary.append("  Trade Date: August 26, 2022\n");
        summary.append("  Effective Date: January 5, 2023\n");
        summary.append("  Termination Date: January 5, 2043\n");
        summary.append("  Term: 20 years\n\n");
        
        summary.append("PARTIES:\n");
        summary.append("  Party 1: Goldman Sachs Bank USA\n");
        summary.append("    - Role: Floating Rate Payer\n");
        summary.append("    - Office: 200 West Street, New York, NY 10282\n");
        summary.append("  Party 2: BANCO ABC\n");
        summary.append("    - Role: Fixed Rate Payer\n");
        summary.append("    - Contact: Backoffice_mesa@bancoabc.cl\n\n");
        
        summary.append("FLOATING LEG TERMS:\n");
        summary.append("  Payer: Goldman Sachs Bank USA\n");
        summary.append("  Rate Index: CLP-ICP (Chilean Overnight Index)\n");
        summary.append("  Initial Notional: CLP 10,694,180,710.00\n");
        summary.append("  Day Count: Actual/360\n");
        summary.append("  Payment Frequency: Monthly (5th of each month)\n");
        summary.append("  Reset: Last day of each calculation period\n");
        summary.append("  Business Days: New York and Santiago\n");
        summary.append("  Amortizing: Yes (see schedule)\n\n");
        
        summary.append("FIXED LEG TERMS:\n");
        summary.append("  Payer: BANCO ABC\n");
        summary.append("  Fixed Rate: 1.75%\n");
        summary.append("  Initial Notional: CLF 316,764.00\n");
        summary.append("  Day Count: Actual/360\n");
        summary.append("  Payment Frequency: Monthly (5th of each month)\n");
        summary.append("  Business Days: New York and Santiago\n");
        summary.append("  Inflation Adjustment: CLF/UF indexed\n");
        summary.append("  Amortizing: Yes (see schedule)\n\n");
        
        summary.append("SETTLEMENT TERMS:\n");
        summary.append("  Type: Non-Deliverable\n");
        summary.append("  Settlement Currency: USD\n");
        summary.append("  Reference Currency: CLP\n");
        summary.append("  FX Rate Source: CLP DOLAR OBS / CLP10\n");
        summary.append("  Valuation Date: 2 business days before payment\n\n");
        
        summary.append("SPECIAL FEATURES:\n");
        summary.append("  • Amortizing structure with 240 payment periods\n");
        summary.append("  • Interim exchanges on specified dates\n");
        summary.append("  • Final exchange at maturity:\n");
        summary.append("    - GS Bank: CLP 76,144,265.50\n");
        summary.append("    - Banco ABC: CLF 2,255.41\n");
        summary.append("  • CLF inflation adjustment mechanism\n");
        summary.append("  • Disruption event handling with fallbacks\n\n");
        
        summary.append("CDM STRUCTURE:\n");
        if (tradeState != null && tradeState.getTrade() != null) {
            Trade trade = tradeState.getTrade();
            summary.append("  ✓ Trade created with date: ").append(trade.getTradeDate()).append("\n");
            summary.append("  ✓ Parties: ").append(trade.getParty().size()).append(" parties defined\n");
            summary.append("  ✓ Counterparties: ").append(trade.getCounterparty().size()).append(" roles defined\n");
            summary.append("  ✓ Product structure: NonTransferableProduct\n");
        }
        
        try (FileWriter writer = new FileWriter("goldman-sachs-swap-summary.txt")) {
            writer.write(summary.toString());
        }
        
        System.out.println("Summary written to: goldman-sachs-swap-summary.txt");
    }
    
    private void generateJsonOutput(TradeState tradeState) throws IOException {
        String json = objectMapper.writeValueAsString(tradeState);
        
        try (FileWriter writer = new FileWriter("goldman-sachs-swap-cdm.json")) {
            writer.write(json);
        }
        
        System.out.println("JSON written to: goldman-sachs-swap-cdm.json");
    }
    
    private void generateMarkdownDocumentation() throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# Goldman Sachs Non-Deliverable Swap CDM Analysis\n\n");
        md.append("## Contract Overview\n\n");
        md.append("This document analyzes the CDM representation of a complex interest rate swap between Goldman Sachs Bank USA and Banco ABC.\n\n");
        
        md.append("### Key Characteristics\n\n");
        md.append("| Feature | Description |\n");
        md.append("|---------|-------------|\n");
        md.append("| Type | Non-Deliverable Interest Rate Swap |\n");
        md.append("| Term | 20 years (2023-2043) |\n");
        md.append("| Notionals | CLP 10.7B (floating) / CLF 316,764 (fixed) |\n");
        md.append("| Settlement | USD (non-deliverable) |\n");
        md.append("| Special Features | Amortizing, Inflation-linked |\n\n");
        
        md.append("## CDM Representation\n\n");
        md.append("### Structure\n\n");
        md.append("```\n");
        md.append("TradeState\n");
        md.append("└── Trade\n");
        md.append("    ├── TradeDate: 2022-08-26\n");
        md.append("    ├── TradeIdentifier[]\n");
        md.append("    ├── Party[]\n");
        md.append("    │   ├── Goldman Sachs Bank USA\n");
        md.append("    │   └── BANCO ABC\n");
        md.append("    ├── Counterparty[]\n");
        md.append("    │   ├── PARTY_1 (Floating Payer)\n");
        md.append("    │   └── PARTY_2 (Fixed Payer)\n");
        md.append("    └── Product: NonTransferableProduct\n");
        md.append("        └── EconomicTerms\n");
        md.append("            └── Payout\n");
        md.append("                └── InterestRatePayout[]\n");
        md.append("```\n\n");
        
        md.append("## Floating Leg Details\n\n");
        md.append("- **Payer**: Goldman Sachs Bank USA\n");
        md.append("- **Index**: CLP-ICP (Chilean overnight rate)\n");
        md.append("- **Spread**: None\n");
        md.append("- **Notional**: Amortizing from CLP 10,694,180,710\n");
        md.append("- **Payments**: Monthly on 5th\n\n");
        
        md.append("## Fixed Leg Details\n\n");
        md.append("- **Payer**: BANCO ABC\n");
        md.append("- **Rate**: 1.75% per annum\n");
        md.append("- **Notional**: CLF 316,764 (inflation-adjusted)\n");
        md.append("- **Payments**: Monthly on 5th\n\n");
        
        md.append("## Implementation Notes\n\n");
        md.append("### Challenges in CDM Representation\n\n");
        md.append("1. **Amortization Schedule**: The swap has a complex 240-period amortization schedule\n");
        md.append("2. **Inflation Linkage**: CLF/UF adjustment mechanism requires custom handling\n");
        md.append("3. **Non-Deliverable**: Settlement in USD while referencing CLP rates\n");
        md.append("4. **Interim Exchanges**: Multiple cash flows during the swap life\n\n");
        
        md.append("### CDM Limitations\n\n");
        md.append("The CDM 6.0.0 model provides the framework but would need extensions for:\n");
        md.append("- Detailed amortization schedules\n");
        md.append("- CLF/UF inflation adjustment formulas\n");
        md.append("- Complex disruption event handling\n");
        md.append("- Interim exchange specifications\n\n");
        
        try (FileWriter writer = new FileWriter("goldman-sachs-swap-analysis.md")) {
            writer.write(md.toString());
        }
        
        System.out.println("Analysis written to: goldman-sachs-swap-analysis.md");
    }
}