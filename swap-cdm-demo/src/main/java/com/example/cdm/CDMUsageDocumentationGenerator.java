package com.example.cdm;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import cdm.event.common.*;
import cdm.product.template.*;
import cdm.product.asset.*;
import cdm.base.staticdata.party.*;
import cdm.base.datetime.*;
import cdm.base.math.*;
import cdm.product.common.schedule.*;
import cdm.product.common.settlement.*;
import cdm.observable.asset.*;
import cdm.base.staticdata.identifier.*;
import cdm.base.staticdata.asset.common.*;
import com.rosetta.model.lib.records.Date;

/**
 * Generates practical, usage-focused CDM documentation with working examples
 */
public class CDMUsageDocumentationGenerator {
    
    public static void main(String[] args) {
        try {
            CDMUsageDocumentationGenerator generator = new CDMUsageDocumentationGenerator();
            generator.generateAllDocumentation();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void generateAllDocumentation() throws IOException {
        Path docsPath = Paths.get("cdm-usage-docs");
        Files.createDirectories(docsPath);
        
        // Generate main guide
        generateMainGuide(docsPath);
        
        // Generate specific component guides
        generateTradeGuide(docsPath);
        generateProductGuide(docsPath);
        generatePartyGuide(docsPath);
        generateScheduleGuide(docsPath);
        generatePricingGuide(docsPath);
        generateBuilderPatternGuide(docsPath);
        generateSwapExampleGuide(docsPath);
        
        System.out.println("Usage documentation generated in: " + docsPath);
    }
    
    private void generateMainGuide(Path docsPath) throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# CDM 6.0.0 Practical Usage Guide\n\n");
        md.append("## Overview\n\n");
        md.append("This guide provides practical, hands-on documentation for using the FINOS Common Domain Model (CDM) 6.0.0 in Java.\n\n");
        
        md.append("## Quick Start\n\n");
        md.append("### Key Concepts\n\n");
        md.append("1. **Builder Pattern**: All CDM objects use the builder pattern for construction\n");
        md.append("2. **Immutability**: Once built, CDM objects are immutable\n");
        md.append("3. **Validation**: CDM provides built-in validation rules\n");
        md.append("4. **Metadata**: Rich metadata support for audit and lineage\n\n");
        
        md.append("### Core Components\n\n");
        md.append("| Component | Purpose | Key Classes |\n");
        md.append("|-----------|---------|-------------|\n");
        md.append("| **Trade** | Represents a financial trade | `Trade`, `TradeState`, `ExecutionDetails` |\n");
        md.append("| **Product** | Defines financial products | `Product`, `InterestRatePayout`, `FixedRateSpecification` |\n");
        md.append("| **Party** | Counterparty information | `Party`, `PartyRole`, `Counterparty` |\n");
        md.append("| **Schedule** | Payment and calculation schedules | `CalculationPeriodDates`, `PaymentDates` |\n");
        md.append("| **Observable** | Market data and rates | `Observable`, `FloatingRateOption` |\n\n");
        
        md.append("## Component Guides\n\n");
        md.append("- [Trade Construction Guide](trade-guide.md)\n");
        md.append("- [Product Modeling Guide](product-guide.md)\n");
        md.append("- [Party Management Guide](party-guide.md)\n");
        md.append("- [Schedule Configuration Guide](schedule-guide.md)\n");
        md.append("- [Pricing and Observables Guide](pricing-guide.md)\n");
        md.append("- [Builder Pattern Guide](builder-pattern-guide.md)\n");
        md.append("- [Complete Swap Example](swap-example-guide.md)\n\n");
        
        md.append("## Basic Example\n\n");
        md.append("```java\n");
        md.append("// Create a simple trade\n");
        md.append("Trade trade = Trade.builder()\n");
        md.append("    .setTradeDateValue(Date.of(2025, 9, 10))\n");
        md.append("    .addTradeIdentifier(TradeIdentifier.builder()\n");
        md.append("        .addAssignedIdentifier(AssignedIdentifier.builder()\n");
        md.append("            .setIdentifierValue(\"DEAL-7554\")\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        Files.writeString(docsPath.resolve("README.md"), md.toString());
    }
    
    private void generateTradeGuide(Path docsPath) throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# Trade Construction Guide\n\n");
        md.append("## Overview\n\n");
        md.append("The `Trade` class is the central object for representing financial trades in CDM.\n\n");
        
        md.append("## Trade Structure\n\n");
        md.append("```\n");
        md.append("Trade\n");
        md.append("├── TradeDate\n");
        md.append("├── TradeIdentifier[]\n");
        md.append("├── Party[]\n");
        md.append("├── Counterparty[]\n");
        md.append("├── TradableProduct\n");
        md.append("│   ├── Product\n");
        md.append("│   └── TradeLot[]\n");
        md.append("├── ExecutionDetails\n");
        md.append("└── ContractDetails\n");
        md.append("```\n\n");
        
        md.append("## Building a Trade\n\n");
        md.append("### Step 1: Basic Trade Information\n\n");
        md.append("```java\n");
        md.append("Trade.TradeBuilder tradeBuilder = Trade.builder();\n\n");
        md.append("// Set trade date\n");
        md.append("tradeBuilder.setTradeDateValue(Date.of(2025, 9, 10));\n\n");
        md.append("// Add trade identifier\n");
        md.append("TradeIdentifier tradeId = TradeIdentifier.builder()\n");
        md.append("    .addAssignedIdentifier(AssignedIdentifier.builder()\n");
        md.append("        .setIdentifierValue(\"7554\")\n");
        md.append("        .setVersion(1)\n");
        md.append("        .build())\n");
        md.append("    .setIdentifierType(TradeIdentifierTypeEnum.UNIQUE_TRANSACTION_IDENTIFIER)\n");
        md.append("    .build();\n");
        md.append("tradeBuilder.addTradeIdentifier(tradeId);\n");
        md.append("```\n\n");
        
        md.append("### Step 2: Add Parties\n\n");
        md.append("```java\n");
        md.append("// Create parties\n");
        md.append("Party party1 = Party.builder()\n");
        md.append("    .setPartyIdValue(\"LEI:969500MGHJHVT9Q8X221\") // Example LEI\n");
        md.append("    .setNameValue(\"Bank ABC\")\n");
        md.append("    .build();\n\n");
        md.append("Party party2 = Party.builder()\n");
        md.append("    .setPartyIdValue(\"LEI:969500MGHJHVT9Q8X222\")\n");
        md.append("    .setNameValue(\"SCOTIABANK CHILE\")\n");
        md.append("    .build();\n\n");
        md.append("tradeBuilder.addParty(party1).addParty(party2);\n");
        md.append("```\n\n");
        
        md.append("### Step 3: Define Counterparties\n\n");
        md.append("```java\n");
        md.append("// Define counterparty roles\n");
        md.append("Counterparty cp1 = Counterparty.builder()\n");
        md.append("    .setRole(CounterpartyRoleEnum.PARTY_1)\n");
        md.append("    .setPartyReferenceValue(party1.getMeta().getGlobalKey())\n");
        md.append("    .build();\n\n");
        md.append("Counterparty cp2 = Counterparty.builder()\n");
        md.append("    .setRole(CounterpartyRoleEnum.PARTY_2)\n");
        md.append("    .setPartyReferenceValue(party2.getMeta().getGlobalKey())\n");
        md.append("    .build();\n\n");
        md.append("tradeBuilder.addCounterparty(cp1).addCounterparty(cp2);\n");
        md.append("```\n\n");
        
        md.append("### Step 4: Attach Product\n\n");
        md.append("```java\n");
        md.append("// Create product (see Product Guide for details)\n");
        md.append("Product product = createProduct(); // Your product creation logic\n\n");
        md.append("TradableProduct tradableProduct = TradableProduct.builder()\n");
        md.append("    .setProduct(product)\n");
        md.append("    .build();\n\n");
        md.append("tradeBuilder.setTradableProduct(tradableProduct);\n");
        md.append("```\n\n");
        
        md.append("### Step 5: Build the Trade\n\n");
        md.append("```java\n");
        md.append("Trade trade = tradeBuilder.build();\n");
        md.append("```\n\n");
        
        md.append("## TradeState\n\n");
        md.append("TradeState wraps a Trade with lifecycle information:\n\n");
        md.append("```java\n");
        md.append("TradeState tradeState = TradeState.builder()\n");
        md.append("    .setTrade(trade)\n");
        md.append("    .setState(State.builder()\n");
        md.append("        .setPositionState(PositionStatusEnum.EXECUTED)\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Common Patterns\n\n");
        md.append("### Adding Multiple Identifiers\n\n");
        md.append("```java\n");
        md.append("tradeBuilder\n");
        md.append("    .addTradeIdentifier(TradeIdentifier.builder()\n");
        md.append("        .setIdentifierType(TradeIdentifierTypeEnum.UNIQUE_TRANSACTION_IDENTIFIER)\n");
        md.append("        .addAssignedIdentifier(assignedId1)\n");
        md.append("        .build())\n");
        md.append("    .addTradeIdentifier(TradeIdentifier.builder()\n");
        md.append("        .setIdentifierType(TradeIdentifierTypeEnum.UNIQUE_SWAP_IDENTIFIER)\n");
        md.append("        .addAssignedIdentifier(assignedId2)\n");
        md.append("        .build());\n");
        md.append("```\n\n");
        
        md.append("### Setting Execution Details\n\n");
        md.append("```java\n");
        md.append("ExecutionDetails executionDetails = ExecutionDetails.builder()\n");
        md.append("    .setExecutionType(ExecutionTypeEnum.ELECTRONIC)\n");
        md.append("    .setExecutionVenue(LegalEntity.builder()\n");
        md.append("        .setNameValue(\"Bloomberg SEF\")\n");
        md.append("        .build())\n");
        md.append("    .build();\n\n");
        md.append("tradeBuilder.setExecutionDetails(executionDetails);\n");
        md.append("```\n\n");
        
        Files.writeString(docsPath.resolve("trade-guide.md"), md.toString());
    }
    
    private void generateProductGuide(Path docsPath) throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# Product Modeling Guide\n\n");
        md.append("## Overview\n\n");
        md.append("Products in CDM represent the economic terms of financial instruments.\n\n");
        
        md.append("## Product Hierarchy\n\n");
        md.append("```\n");
        md.append("Product\n");
        md.append("├── ContractualProduct\n");
        md.append("│   └── EconomicTerms\n");
        md.append("│       ├── Payout\n");
        md.append("│       │   ├── InterestRatePayout[]\n");
        md.append("│       │   ├── CreditDefaultPayout\n");
        md.append("│       │   └── EquityPayout\n");
        md.append("│       └── Collateral\n");
        md.append("└── Index\n");
        md.append("```\n\n");
        
        md.append("## Interest Rate Swap Product\n\n");
        md.append("### Creating the Product Container\n\n");
        md.append("```java\n");
        md.append("Product product = Product.builder()\n");
        md.append("    .setContractualProduct(ContractualProduct.builder()\n");
        md.append("        .setEconomicTerms(EconomicTerms.builder()\n");
        md.append("            .setPayout(Payout.builder()\n");
        md.append("                .addInterestRatePayout(fixedLeg)\n");
        md.append("                .addInterestRatePayout(floatingLeg)\n");
        md.append("                .build())\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("### Fixed Rate Leg\n\n");
        md.append("```java\n");
        md.append("InterestRatePayout fixedLeg = InterestRatePayout.builder()\n");
        md.append("    .setPayerReceiver(PayerReceiver.builder()\n");
        md.append("        .setPayer(CounterpartyRoleEnum.PARTY_1)\n");
        md.append("        .setReceiver(CounterpartyRoleEnum.PARTY_2)\n");
        md.append("        .build())\n");
        md.append("    .setRateSpecification(RateSpecification.builder()\n");
        md.append("        .setFixedRate(FixedRateSpecification.builder()\n");
        md.append("            .setRateSchedule(RateSchedule.builder()\n");
        md.append("                .setPriceValue(BigDecimal.valueOf(0.04715)) // 4.715%\n");
        md.append("                .build())\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .setDayCountFraction(DayCountFractionEnum.ACT_360)\n");
        md.append("    .setCalculationPeriodDates(calculationDates)\n");
        md.append("    .setPaymentDates(paymentDates)\n");
        md.append("    .setPriceQuantity(PriceQuantity.builder()\n");
        md.append("        .addQuantityValue(NonNegativeQuantitySchedule.builder()\n");
        md.append("            .setValue(BigDecimal.valueOf(300000000000.00)) // 300B CLP\n");
        md.append("            .setUnit(UnitType.builder()\n");
        md.append("                .setCurrencyValue(\"CLP\")\n");
        md.append("                .build())\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("### Floating Rate Leg\n\n");
        md.append("```java\n");
        md.append("InterestRatePayout floatingLeg = InterestRatePayout.builder()\n");
        md.append("    .setPayerReceiver(PayerReceiver.builder()\n");
        md.append("        .setPayer(CounterpartyRoleEnum.PARTY_2)\n");
        md.append("        .setReceiver(CounterpartyRoleEnum.PARTY_1)\n");
        md.append("        .build())\n");
        md.append("    .setRateSpecification(RateSpecification.builder()\n");
        md.append("        .setFloatingRate(FloatingRateSpecification.builder()\n");
        md.append("            .setRateOption(FloatingRateOption.builder()\n");
        md.append("                .setFloatingRateIndexValue(FloatingRateIndexEnum.CLP_TNA) // Chilean overnight\n");
        md.append("                .setIndexTenor(Period.builder()\n");
        md.append("                    .setPeriodMultiplier(1)\n");
        md.append("                    .setPeriod(PeriodEnum.D) // Daily\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .setDayCountFraction(DayCountFractionEnum.ACT_360)\n");
        md.append("    .setCalculationPeriodDates(calculationDates)\n");
        md.append("    .setPaymentDates(paymentDates)\n");
        md.append("    .setPriceQuantity(priceQuantity) // Same notional\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Other Product Types\n\n");
        md.append("### FX Forward\n\n");
        md.append("```java\n");
        md.append("Product fxProduct = Product.builder()\n");
        md.append("    .setContractualProduct(ContractualProduct.builder()\n");
        md.append("        .setEconomicTerms(EconomicTerms.builder()\n");
        md.append("            .setPayout(Payout.builder()\n");
        md.append("                .setForwardPayout(ForwardPayout.builder()\n");
        md.append("                    .setUnderlier(Product.builder()\n");
        md.append("                        .setForeignExchange(ForeignExchange.builder()\n");
        md.append("                            .setQuotedCurrencyPair(QuotedCurrencyPair.builder()\n");
        md.append("                                .setCurrency1Value(\"USD\")\n");
        md.append("                                .setCurrency2Value(\"CLP\")\n");
        md.append("                                .setQuoteBasis(QuoteBasisEnum.CURRENCY2_PER_CURRENCY1)\n");
        md.append("                                .build())\n");
        md.append("                            .build())\n");
        md.append("                        .build())\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        Files.writeString(docsPath.resolve("product-guide.md"), md.toString());
    }
    
    private void generatePartyGuide(Path docsPath) throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# Party Management Guide\n\n");
        md.append("## Overview\n\n");
        md.append("Parties represent entities involved in trades (counterparties, brokers, clearing houses, etc.).\n\n");
        
        md.append("## Party Structure\n\n");
        md.append("```\n");
        md.append("Party\n");
        md.append("├── PartyId[] (identifiers)\n");
        md.append("├── Name\n");
        md.append("├── Person[] (contacts)\n");
        md.append("├── Account[]\n");
        md.append("└── PartyRole[]\n");
        md.append("```\n\n");
        
        md.append("## Creating Parties\n\n");
        md.append("### Basic Party\n\n");
        md.append("```java\n");
        md.append("Party party = Party.builder()\n");
        md.append("    .setPartyIdValue(\"LEI:97018000197018000\") // LEI format\n");
        md.append("    .setNameValue(\"SCOTIABANK CHILE\")\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("### Party with Multiple Identifiers\n\n");
        md.append("```java\n");
        md.append("Party party = Party.builder()\n");
        md.append("    .addPartyId(PartyIdentifier.builder()\n");
        md.append("        .setIdentifierType(PartyIdentifierTypeEnum.LEI)\n");
        md.append("        .setIdentifierValue(\"97018000197018000\")\n");
        md.append("        .build())\n");
        md.append("    .addPartyId(PartyIdentifier.builder()\n");
        md.append("        .setIdentifierType(PartyIdentifierTypeEnum.ACCOUNT_NUMBER)\n");
        md.append("        .setIdentifierValue(\"ACC-12345\")\n");
        md.append("        .build())\n");
        md.append("    .setNameValue(\"SCOTIABANK CHILE\")\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("### Party with Contact Information\n\n");
        md.append("```java\n");
        md.append("Party party = Party.builder()\n");
        md.append("    .setPartyIdValue(\"LEI:97018000197018000\")\n");
        md.append("    .setNameValue(\"SCOTIABANK CHILE\")\n");
        md.append("    .addPerson(NaturalPerson.builder()\n");
        md.append("        .setFirstName(\"John\")\n");
        md.append("        .setSurname(\"Doe\")\n");
        md.append("        .addContactInformation(ContactInformation.builder()\n");
        md.append("            .addTelephoneNumber(TelephoneNumber.builder()\n");
        md.append("                .setNumber(\"+56 2 1234 5678\")\n");
        md.append("                .setTelephoneNumberType(TelephoneTypeEnum.WORK)\n");
        md.append("                .build())\n");
        md.append("            .addEmail(\"john.doe@scotiabank.cl\")\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Party Roles\n\n");
        md.append("### Common Roles\n\n");
        md.append("```java\n");
        md.append("// Counterparty role\n");
        md.append("Counterparty counterparty = Counterparty.builder()\n");
        md.append("    .setRole(CounterpartyRoleEnum.PARTY_1)\n");
        md.append("    .setPartyReferenceValue(party.getMeta().getGlobalKey())\n");
        md.append("    .build();\n\n");
        
        md.append("// Broker role\n");
        md.append("PartyRole brokerRole = PartyRole.builder()\n");
        md.append("    .setRole(PartyRoleEnum.ARRANGING_BROKER)\n");
        md.append("    .setPartyReferenceValue(brokerParty.getMeta().getGlobalKey())\n");
        md.append("    .build();\n\n");
        
        md.append("// Clearing member\n");
        md.append("PartyRole clearingRole = PartyRole.builder()\n");
        md.append("    .setRole(PartyRoleEnum.CLEARING_FIRM)\n");
        md.append("    .setPartyReferenceValue(clearingParty.getMeta().getGlobalKey())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Accounts\n\n");
        md.append("### Linking Accounts to Parties\n\n");
        md.append("```java\n");
        md.append("Account account = Account.builder()\n");
        md.append("    .setAccountNumber(FieldWithMetaString.builder()\n");
        md.append("        .setValue(\"ACC-7554\")\n");
        md.append("        .build())\n");
        md.append("    .setAccountName(FieldWithMetaString.builder()\n");
        md.append("        .setValue(\"Trading Account\")\n");
        md.append("        .build())\n");
        md.append("    .setAccountType(AccountTypeEnum.AGGREGATE_CLIENT)\n");
        md.append("    .setPartyReferenceValue(party.getMeta().getGlobalKey())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        Files.writeString(docsPath.resolve("party-guide.md"), md.toString());
    }
    
    private void generateScheduleGuide(Path docsPath) throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# Schedule Configuration Guide\n\n");
        md.append("## Overview\n\n");
        md.append("Schedules define calculation periods, payment dates, and resets for financial products.\n\n");
        
        md.append("## Key Schedule Components\n\n");
        md.append("- **CalculationPeriodDates**: When interest accrues\n");
        md.append("- **PaymentDates**: When payments are made\n");
        md.append("- **ResetDates**: When floating rates reset\n");
        md.append("- **StubPeriod**: Handling of partial periods\n\n");
        
        md.append("## Calculation Period Dates\n\n");
        md.append("```java\n");
        md.append("CalculationPeriodDates calculationDates = CalculationPeriodDates.builder()\n");
        md.append("    .setEffectiveDate(AdjustableOrRelativeDate.builder()\n");
        md.append("        .setAdjustableDate(AdjustableDate.builder()\n");
        md.append("            .setUnadjustedDate(Date.of(2025, 9, 12))\n");
        md.append("            .setDateAdjustments(BusinessDayAdjustments.builder()\n");
        md.append("                .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)\n");
        md.append("                .addBusinessCenters(BusinessCenters.builder()\n");
        md.append("                    .addBusinessCenterValue(BusinessCenterEnum.CLSA) // Santiago\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .setTerminationDate(AdjustableOrRelativeDate.builder()\n");
        md.append("        .setAdjustableDate(AdjustableDate.builder()\n");
        md.append("            .setUnadjustedDate(Date.of(2026, 1, 5))\n");
        md.append("            .setDateAdjustments(businessDayAdjustments)\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()\n");
        md.append("        .setPeriodMultiplier(3)\n");
        md.append("        .setPeriod(PeriodExtendedEnum.M) // 3 months\n");
        md.append("        .setRollConvention(RollConventionEnum._5) // 5th of month\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Payment Dates\n\n");
        md.append("```java\n");
        md.append("PaymentDates paymentDates = PaymentDates.builder()\n");
        md.append("    .setPaymentFrequency(Frequency.builder()\n");
        md.append("        .setPeriodMultiplier(3)\n");
        md.append("        .setPeriod(PeriodExtendedEnum.M)\n");
        md.append("        .build())\n");
        md.append("    .setPayRelativeTo(PayRelativeToEnum.CALCULATION_PERIOD_END_DATE)\n");
        md.append("    .setPaymentDaysOffset(Offset.builder()\n");
        md.append("        .setPeriodMultiplier(2)\n");
        md.append("        .setDayType(DayTypeEnum.BUSINESS)\n");
        md.append("        .build())\n");
        md.append("    .setPaymentDatesAdjustments(BusinessDayAdjustments.builder()\n");
        md.append("        .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)\n");
        md.append("        .addBusinessCenters(businessCenters)\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Reset Dates (for Floating Rates)\n\n");
        md.append("```java\n");
        md.append("ResetDates resetDates = ResetDates.builder()\n");
        md.append("    .setResetRelativeTo(ResetRelativeToEnum.CALCULATION_PERIOD_START_DATE)\n");
        md.append("    .setFixingDates(RelativeDateOffset.builder()\n");
        md.append("        .setPeriodMultiplier(-2) // 2 days before\n");
        md.append("        .setDayType(DayTypeEnum.BUSINESS)\n");
        md.append("        .setBusinessDayConvention(BusinessDayConventionEnum.NONE)\n");
        md.append("        .addBusinessCenters(businessCenters)\n");
        md.append("        .build())\n");
        md.append("    .setResetFrequency(ResetFrequency.builder()\n");
        md.append("        .setPeriodMultiplier(1)\n");
        md.append("        .setPeriod(PeriodExtendedEnum.D) // Daily reset\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Stub Periods\n\n");
        md.append("### Front Stub\n\n");
        md.append("```java\n");
        md.append("StubPeriod frontStub = StubPeriod.builder()\n");
        md.append("    .setStubPeriodType(StubPeriodTypeEnum.SHORT_INITIAL)\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("### Back Stub\n\n");
        md.append("```java\n");
        md.append("StubPeriod backStub = StubPeriod.builder()\n");
        md.append("    .setStubPeriodType(StubPeriodTypeEnum.SHORT_FINAL)\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Business Day Conventions\n\n");
        md.append("| Convention | Description |\n");
        md.append("|------------|-------------|\n");
        md.append("| FOLLOWING | Move to next business day |\n");
        md.append("| MODFOLLOWING | Next business day unless different month |\n");
        md.append("| PRECEDING | Move to previous business day |\n");
        md.append("| MODPRECEDING | Previous business day unless different month |\n");
        md.append("| NONE | No adjustment |\n\n");
        
        Files.writeString(docsPath.resolve("schedule-guide.md"), md.toString());
    }
    
    private void generatePricingGuide(Path docsPath) throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# Pricing and Observables Guide\n\n");
        md.append("## Overview\n\n");
        md.append("CDM supports various pricing mechanisms and market observables.\n\n");
        
        md.append("## Fixed Rate Specification\n\n");
        md.append("```java\n");
        md.append("FixedRateSpecification fixedRate = FixedRateSpecification.builder()\n");
        md.append("    .setRateSchedule(RateSchedule.builder()\n");
        md.append("        .setPriceValue(BigDecimal.valueOf(0.04715)) // 4.715%\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Floating Rate Specification\n\n");
        md.append("### Basic Floating Rate\n\n");
        md.append("```java\n");
        md.append("FloatingRateSpecification floatingRate = FloatingRateSpecification.builder()\n");
        md.append("    .setRateOption(FloatingRateOption.builder()\n");
        md.append("        .setFloatingRateIndexValue(FloatingRateIndexEnum.USD_SOFR)\n");
        md.append("        .setIndexTenor(Period.builder()\n");
        md.append("            .setPeriodMultiplier(1)\n");
        md.append("            .setPeriod(PeriodEnum.D)\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("### Floating Rate with Spread\n\n");
        md.append("```java\n");
        md.append("FloatingRateSpecification floatingWithSpread = FloatingRateSpecification.builder()\n");
        md.append("    .setRateOption(floatingRateOption)\n");
        md.append("    .setSpreadSchedule(SpreadSchedule.builder()\n");
        md.append("        .addInitialValue(BigDecimal.valueOf(0.0025)) // 25 bps\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Observable Assets\n\n");
        md.append("### Interest Rate Index\n\n");
        md.append("```java\n");
        md.append("Observable observable = Observable.builder()\n");
        md.append("    .setRateOption(FloatingRateOption.builder()\n");
        md.append("        .setFloatingRateIndexValue(FloatingRateIndexEnum.CLP_TNA) // Chilean overnight\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("### FX Rate\n\n");
        md.append("```java\n");
        md.append("Observable fxObservable = Observable.builder()\n");
        md.append("    .setCurrencyPair(QuotedCurrencyPair.builder()\n");
        md.append("        .setCurrency1Value(\"USD\")\n");
        md.append("        .setCurrency2Value(\"CLP\")\n");
        md.append("        .setQuoteBasis(QuoteBasisEnum.CURRENCY2_PER_CURRENCY1)\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Price and Quantity\n\n");
        md.append("```java\n");
        md.append("PriceQuantity priceQuantity = PriceQuantity.builder()\n");
        md.append("    .addQuantityValue(NonNegativeQuantitySchedule.builder()\n");
        md.append("        .setValue(BigDecimal.valueOf(300000000000.00)) // Notional\n");
        md.append("        .setUnit(UnitType.builder()\n");
        md.append("            .setCurrencyValue(\"CLP\")\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .addPriceValue(PriceSchedule.builder()\n");
        md.append("        .setValue(BigDecimal.valueOf(850.50)) // FX rate\n");
        md.append("        .setUnit(UnitType.builder()\n");
        md.append("            .setCurrencyValue(\"CLP\")\n");
        md.append("            .setPerUnitOf(UnitType.builder()\n");
        md.append("                .setCurrencyValue(\"USD\")\n");
        md.append("                .build())\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        Files.writeString(docsPath.resolve("pricing-guide.md"), md.toString());
    }
    
    private void generateBuilderPatternGuide(Path docsPath) throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# Builder Pattern Guide\n\n");
        md.append("## Overview\n\n");
        md.append("All CDM objects use the Builder pattern for construction, ensuring immutability and validation.\n\n");
        
        md.append("## Basic Builder Usage\n\n");
        md.append("```java\n");
        md.append("// 1. Get a builder\n");
        md.append("Trade.TradeBuilder builder = Trade.builder();\n\n");
        md.append("// 2. Set properties\n");
        md.append("builder.setTradeDateValue(Date.of(2025, 9, 10));\n\n");
        md.append("// 3. Build the immutable object\n");
        md.append("Trade trade = builder.build();\n");
        md.append("```\n\n");
        
        md.append("## Method Chaining\n\n");
        md.append("```java\n");
        md.append("Trade trade = Trade.builder()\n");
        md.append("    .setTradeDateValue(Date.of(2025, 9, 10))\n");
        md.append("    .addTradeIdentifier(tradeId)\n");
        md.append("    .addParty(party1)\n");
        md.append("    .addParty(party2)\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Common Builder Methods\n\n");
        md.append("### Setting Single Values\n\n");
        md.append("```java\n");
        md.append("builder.setFieldName(value);\n");
        md.append("```\n\n");
        
        md.append("### Adding to Lists\n\n");
        md.append("```java\n");
        md.append("builder.addFieldName(value);  // Add one item\n");
        md.append("builder.addAllFieldName(list); // Add multiple items\n");
        md.append("```\n\n");
        
        md.append("### Setting Lists\n\n");
        md.append("```java\n");
        md.append("builder.setFieldName(Arrays.asList(item1, item2));\n");
        md.append("```\n\n");
        
        md.append("## Nested Builders\n\n");
        md.append("```java\n");
        md.append("Trade trade = Trade.builder()\n");
        md.append("    .setTradableProduct(TradableProduct.builder()\n");
        md.append("        .setProduct(Product.builder()\n");
        md.append("            .setContractualProduct(ContractualProduct.builder()\n");
        md.append("                .setEconomicTerms(EconomicTerms.builder()\n");
        md.append("                    .setPayout(Payout.builder()\n");
        md.append("                        .addInterestRatePayout(interestPayout)\n");
        md.append("                        .build())\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .build())\n");
        md.append("        .build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Builder Reuse\n\n");
        md.append("```java\n");
        md.append("// Create a template builder\n");
        md.append("BusinessDayAdjustments.BusinessDayAdjustmentsBuilder adjBuilder = \n");
        md.append("    BusinessDayAdjustments.builder()\n");
        md.append("        .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)\n");
        md.append("        .addBusinessCenters(businessCenters);\n\n");
        md.append("// Reuse for multiple dates\n");
        md.append("AdjustableDate date1 = AdjustableDate.builder()\n");
        md.append("    .setUnadjustedDate(Date.of(2025, 9, 12))\n");
        md.append("    .setDateAdjustments(adjBuilder.build())\n");
        md.append("    .build();\n\n");
        md.append("AdjustableDate date2 = AdjustableDate.builder()\n");
        md.append("    .setUnadjustedDate(Date.of(2026, 1, 5))\n");
        md.append("    .setDateAdjustments(adjBuilder.build())\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Modifying Existing Objects\n\n");
        md.append("```java\n");
        md.append("// Objects are immutable, so use toBuilder()\n");
        md.append("Trade originalTrade = /* ... */;\n\n");
        md.append("Trade modifiedTrade = originalTrade.toBuilder()\n");
        md.append("    .setTradeDateValue(Date.of(2025, 9, 11)) // Change date\n");
        md.append("    .addTradeIdentifier(newIdentifier) // Add identifier\n");
        md.append("    .build();\n");
        md.append("```\n\n");
        
        md.append("## Validation\n\n");
        md.append("```java\n");
        md.append("try {\n");
        md.append("    Trade trade = builder.build();\n");
        md.append("    // Object is valid\n");
        md.append("} catch (Exception e) {\n");
        md.append("    // Validation failed\n");
        md.append("    System.err.println(\"Invalid trade: \" + e.getMessage());\n");
        md.append("}\n");
        md.append("```\n\n");
        
        Files.writeString(docsPath.resolve("builder-pattern-guide.md"), md.toString());
    }
    
    private void generateSwapExampleGuide(Path docsPath) throws IOException {
        StringBuilder md = new StringBuilder();
        
        md.append("# Complete Swap Example\n\n");
        md.append("## Chilean Peso OIS Implementation\n\n");
        md.append("This example shows a complete implementation of a Chilean Peso Overnight Index Swap.\n\n");
        
        md.append("### Trade Details\n");
        md.append("- **Notional**: CLP 300,000,000,000\n");
        md.append("- **Fixed Rate**: 4.715%\n");
        md.append("- **Floating Index**: ICPCLP (Chilean overnight)\n");
        md.append("- **Start**: September 12, 2025\n");
        md.append("- **End**: January 5, 2026\n\n");
        
        md.append("### Complete Code\n\n");
        md.append("```java\n");
        md.append("public class ChileanOISExample {\n\n");
        md.append("    public TradeState buildChileanOIS() {\n");
        md.append("        // 1. Create parties\n");
        md.append("        Party bankParty = Party.builder()\n");
        md.append("            .setPartyIdValue(\"LEI:969500MGHJHVT9Q8X221\")\n");
        md.append("            .setNameValue(\"Our Bank\")\n");
        md.append("            .build();\n\n");
        md.append("        Party scotiabank = Party.builder()\n");
        md.append("            .setPartyIdValue(\"LEI:97018000197018000\")\n");
        md.append("            .setNameValue(\"SCOTIABANK CHILE\")\n");
        md.append("            .build();\n\n");
        md.append("        // 2. Define counterparties\n");
        md.append("        Counterparty cp1 = Counterparty.builder()\n");
        md.append("            .setRole(CounterpartyRoleEnum.PARTY_1)\n");
        md.append("            .setPartyReferenceValue(bankParty.getMeta().getGlobalKey())\n");
        md.append("            .build();\n\n");
        md.append("        Counterparty cp2 = Counterparty.builder()\n");
        md.append("            .setRole(CounterpartyRoleEnum.PARTY_2)\n");
        md.append("            .setPartyReferenceValue(scotiabank.getMeta().getGlobalKey())\n");
        md.append("            .build();\n\n");
        md.append("        // 3. Business day adjustments\n");
        md.append("        BusinessDayAdjustments bdAdjustments = BusinessDayAdjustments.builder()\n");
        md.append("            .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)\n");
        md.append("            .addBusinessCenters(BusinessCenters.builder()\n");
        md.append("                .addBusinessCenterValue(BusinessCenterEnum.CLSA) // Santiago\n");
        md.append("                .build())\n");
        md.append("            .build();\n\n");
        md.append("        // 4. Calculation period dates\n");
        md.append("        CalculationPeriodDates calcDates = CalculationPeriodDates.builder()\n");
        md.append("            .setEffectiveDate(AdjustableOrRelativeDate.builder()\n");
        md.append("                .setAdjustableDate(AdjustableDate.builder()\n");
        md.append("                    .setUnadjustedDate(Date.of(2025, 9, 12))\n");
        md.append("                    .setDateAdjustments(bdAdjustments)\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .setTerminationDate(AdjustableOrRelativeDate.builder()\n");
        md.append("                .setAdjustableDate(AdjustableDate.builder()\n");
        md.append("                    .setUnadjustedDate(Date.of(2026, 1, 5))\n");
        md.append("                    .setDateAdjustments(bdAdjustments)\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .build();\n\n");
        md.append("        // 5. Payment dates (bullet at maturity)\n");
        md.append("        PaymentDates paymentDates = PaymentDates.builder()\n");
        md.append("            .setPaymentFrequency(Frequency.builder()\n");
        md.append("                .setPeriodMultiplier(1)\n");
        md.append("                .setPeriod(PeriodExtendedEnum.T) // Term\n");
        md.append("                .build())\n");
        md.append("            .build();\n\n");
        md.append("        // 6. Notional\n");
        md.append("        PriceQuantity priceQuantity = PriceQuantity.builder()\n");
        md.append("            .addQuantityValue(NonNegativeQuantitySchedule.builder()\n");
        md.append("                .setValue(BigDecimal.valueOf(300000000000.00))\n");
        md.append("                .setUnit(UnitType.builder()\n");
        md.append("                    .setCurrencyValue(\"CLP\")\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .build();\n\n");
        md.append("        // 7. Fixed leg (Bank receives)\n");
        md.append("        InterestRatePayout fixedLeg = InterestRatePayout.builder()\n");
        md.append("            .setPayerReceiver(PayerReceiver.builder()\n");
        md.append("                .setPayer(CounterpartyRoleEnum.PARTY_2) // Scotiabank pays\n");
        md.append("                .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank receives\n");
        md.append("                .build())\n");
        md.append("            .setRateSpecification(RateSpecification.builder()\n");
        md.append("                .setFixedRate(FixedRateSpecification.builder()\n");
        md.append("                    .setRateSchedule(RateSchedule.builder()\n");
        md.append("                        .setPriceValue(BigDecimal.valueOf(0.04715))\n");
        md.append("                        .build())\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .setDayCountFraction(DayCountFractionEnum.ACT_360)\n");
        md.append("            .setCalculationPeriodDates(calcDates)\n");
        md.append("            .setPaymentDates(paymentDates)\n");
        md.append("            .setPriceQuantity(priceQuantity)\n");
        md.append("            .build();\n\n");
        md.append("        // 8. Floating leg (Bank pays)\n");
        md.append("        InterestRatePayout floatingLeg = InterestRatePayout.builder()\n");
        md.append("            .setPayerReceiver(PayerReceiver.builder()\n");
        md.append("                .setPayer(CounterpartyRoleEnum.PARTY_1) // Bank pays\n");
        md.append("                .setReceiver(CounterpartyRoleEnum.PARTY_2) // Scotiabank receives\n");
        md.append("                .build())\n");
        md.append("            .setRateSpecification(RateSpecification.builder()\n");
        md.append("                .setFloatingRate(FloatingRateSpecification.builder()\n");
        md.append("                    .setRateOption(FloatingRateOption.builder()\n");
        md.append("                        .setFloatingRateIndexValue(FloatingRateIndexEnum.CLP_TNA)\n");
        md.append("                        .setIndexTenor(Period.builder()\n");
        md.append("                            .setPeriodMultiplier(1)\n");
        md.append("                            .setPeriod(PeriodEnum.D)\n");
        md.append("                            .build())\n");
        md.append("                        .build())\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .setDayCountFraction(DayCountFractionEnum.ACT_360)\n");
        md.append("            .setCalculationPeriodDates(calcDates)\n");
        md.append("            .setPaymentDates(paymentDates)\n");
        md.append("            .setPriceQuantity(priceQuantity)\n");
        md.append("            .setCompoundingMethod(CompoundingMethodEnum.STRAIGHT) // Daily compounding\n");
        md.append("            .build();\n\n");
        md.append("        // 9. Create product\n");
        md.append("        Product product = Product.builder()\n");
        md.append("            .setContractualProduct(ContractualProduct.builder()\n");
        md.append("                .setEconomicTerms(EconomicTerms.builder()\n");
        md.append("                    .setPayout(Payout.builder()\n");
        md.append("                        .addInterestRatePayout(fixedLeg)\n");
        md.append("                        .addInterestRatePayout(floatingLeg)\n");
        md.append("                        .build())\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .build();\n\n");
        md.append("        // 10. Create trade\n");
        md.append("        Trade trade = Trade.builder()\n");
        md.append("            .setTradeDateValue(Date.of(2025, 9, 10))\n");
        md.append("            .addTradeIdentifier(TradeIdentifier.builder()\n");
        md.append("                .addAssignedIdentifier(AssignedIdentifier.builder()\n");
        md.append("                    .setIdentifierValue(\"7554\")\n");
        md.append("                    .build())\n");
        md.append("                .build())\n");
        md.append("            .addParty(bankParty)\n");
        md.append("            .addParty(scotiabank)\n");
        md.append("            .addCounterparty(cp1)\n");
        md.append("            .addCounterparty(cp2)\n");
        md.append("            .setTradableProduct(TradableProduct.builder()\n");
        md.append("                .setProduct(product)\n");
        md.append("                .build())\n");
        md.append("            .build();\n\n");
        md.append("        // 11. Wrap in TradeState\n");
        md.append("        return TradeState.builder()\n");
        md.append("            .setTrade(trade)\n");
        md.append("            .build();\n");
        md.append("    }\n");
        md.append("}\n");
        md.append("```\n\n");
        
        Files.writeString(docsPath.resolve("swap-example-guide.md"), md.toString());
    }
}