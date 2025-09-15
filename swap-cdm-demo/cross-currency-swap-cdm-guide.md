# Cross-Currency Interest Rate Swap in CDM: A Comprehensive Guide

## Table of Contents
1. [Introduction](#introduction)
2. [Swap Overview](#swap-overview)
3. [CDM Architecture Fundamentals](#cdm-architecture-fundamentals)
4. [Step-by-Step CDM Implementation](#step-by-step-cdm-implementation)
5. [Advanced CDM Concepts](#advanced-cdm-concepts)
6. [Complete Code Implementation](#complete-code-implementation)
7. [Key Takeaways](#key-takeaways)

## Introduction

This guide demonstrates how to model a complex cross-currency interest rate swap using the FINOS Common Domain Model (CDM) 6.0.0. Through this detailed example, you'll learn fundamental CDM concepts, design patterns, and best practices for representing sophisticated financial derivatives.

### What You'll Learn
- **CDM Object Hierarchy**: How trades, products, and payouts are structured
- **Builder Pattern Usage**: Creating immutable, validated CDM objects
- **Cross-Currency Modeling**: Handling multiple currencies and FX fixings
- **Schedule Configuration**: Setting up calculation periods and payment dates
- **Rate Specifications**: Modeling both fixed and floating rate structures
- **Business Day Conventions**: Implementing calendar adjustments across jurisdictions

## Swap Overview

### Transaction Details
We're modeling a cross-currency interest rate swap with the following characteristics:

**Parties:**
- **Bank A** (you): The primary counterparty
- **Goldman Sachs**: The second counterparty

**Fixed Rate Leg (Bank A Pays):**
- **Currency**: Chilean Peso (CLP)
- **Notional**: CLP 950,000,000,000 (equivalent to USD 10,000,000)
- **Rate**: 5.00% per annum fixed
- **Payment Frequency**: Semi-annual (every 6 months)
- **Day Count**: ACT/360

**Floating Rate Leg (Bank A Receives):**
- **Currency**: US Dollar (USD) 
- **Notional**: USD 10,000,000
- **Rate**: USD SOFR Compound + 100 basis points (1.00%)
- **Payment Frequency**: Semi-annual (every 6 months)
- **Day Count**: ACT/360
- **Compounding**: Daily (straight method)

**Cross-Currency Mechanics:**
- **FX Fixing**: Dólar Observado published by Banco Central de Chile (BCCh)
- **Fixing Timing**: T-1 (one business day before payment)
- **Settlement Currency**: USD (net settlement of both legs)

**Calendar and Conventions:**
- **Cashflow Calendar**: New York + Santiago (NY-SCL)
- **Payment Calendar**: New York + Santiago (NY-SCL)
- **Business Day Convention**: Modified Following for both legs

## CDM Architecture Fundamentals

### Hierarchical Structure
CDM uses a hierarchical approach where complex financial instruments are built from simpler components:

```
Trade
├── TradeIdentifier[]
├── Party[]
├── Counterparty[]
└── TradableProduct
    └── Product
        └── ContractualProduct
            └── EconomicTerms
                └── Payout
                    ├── InterestRatePayout[] (Fixed & Floating legs)
                    ├── CashflowPayout[] (Optional - for notional exchanges)
                    └── FxPayout[] (Optional - for FX components)
```

### Core Design Principles

**1. Immutability**
All CDM objects are immutable once built. This ensures data integrity and thread safety:
```java
Trade trade = Trade.builder().build(); // Cannot be modified after creation
Trade modified = trade.toBuilder().setNewField(value).build(); // Must create new instance
```

**2. Builder Pattern**
Every CDM class uses the builder pattern for construction, enabling:
- Method chaining for readability
- Validation during build process  
- Optional parameter handling
- Nested object creation

**3. Strong Typing**
CDM uses enums and typed fields to prevent invalid data:
```java
.setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING) // Type-safe
.setCurrencyValue("USD") // Validated currency code
.setRole(CounterpartyRoleEnum.PARTY_1) // Controlled vocabulary
```

**4. Metadata and References**
CDM automatically generates metadata for object relationships and audit trails:
```java
String globalKey = party.getMeta().getGlobalKey(); // Unique identifier
.setPartyReferenceValue(globalKey) // Reference to party object
```

## Step-by-Step CDM Implementation

### Step 1: Define Parties and Counterparty Roles

Parties represent the legal entities involved in the trade. In CDM, each party needs:
- **Unique Identifier**: Typically a Legal Entity Identifier (LEI)
- **Name**: Human-readable name
- **Role**: How they participate in the transaction

```java
// Create Bank A (the primary institution)
Party bankA = Party.builder()
    .setPartyIdValue("LEI:BANKA123456789012") // LEI format identifier
    .setNameValue("Bank A")
    .build();

// Create Goldman Sachs counterparty
Party goldmanSachs = Party.builder()
    .setPartyIdValue("LEI:784F5XWPLTWKTBV55W24") // Actual Goldman Sachs LEI
    .setNameValue("Goldman Sachs International")
    .build();
```

**CDM Concepts Explained:**
- `setPartyIdValue()`: Simplified method for single identifier
- `setNameValue()`: Simplified method for party name
- **LEI Format**: Legal Entity Identifiers are 20-character codes for financial entities

**Counterparty Roles:**
Define how each party participates in the trade:

```java
// Bank A as Party 1
Counterparty cp1 = Counterparty.builder()
    .setRole(CounterpartyRoleEnum.PARTY_1) // Primary designation
    .setPartyReferenceValue(bankA.getMeta().getGlobalKey()) // Links to party object
    .build();

// Goldman Sachs as Party 2  
Counterparty cp2 = Counterparty.builder()
    .setRole(CounterpartyRoleEnum.PARTY_2) // Secondary designation
    .setPartyReferenceValue(goldmanSachs.getMeta().getGlobalKey()) // Links to party object
    .build();
```

**CDM Concepts Explained:**
- `CounterpartyRoleEnum`: Standardized roles (PARTY_1, PARTY_2)
- `getMeta().getGlobalKey()`: Unique identifier automatically generated by CDM
- **Reference Pattern**: Instead of embedding objects, CDM uses references to maintain data integrity

### Step 2: Business Day Adjustments and Calendar Configuration

Cross-jurisdictional trades require careful handling of business day conventions:

```java
// Define business centers for NY-SCL calendar
BusinessCenters nySclCenters = BusinessCenters.builder()
    .addBusinessCenterValue(BusinessCenterEnum.NYFD) // New York Federal Reserve
    .addBusinessCenterValue(BusinessCenterEnum.CLSA) // Santiago, Chile
    .build();

// Modified Following convention for both legs
BusinessDayAdjustments modFollowingAdjustments = BusinessDayAdjustments.builder()
    .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
    .addBusinessCenters(nySclCenters)
    .build();
```

**CDM Concepts Explained:**
- `BusinessCenterEnum`: Predefined business centers with standard codes
- `MODFOLLOWING`: If date falls on non-business day, move to next business day unless it crosses month boundary
- **Multiple Centers**: Date must be business day in ALL specified centers
- **Reusability**: Same adjustment object used across multiple date specifications

**Business Day Convention Types:**
- `FOLLOWING`: Always move to next business day
- `MODFOLLOWING`: Next business day, but stay in same month
- `PRECEDING`: Move to previous business day  
- `MODPRECEDING`: Previous business day, but stay in same month

### Step 3: Schedule Configuration - Calculation and Payment Dates

Schedules define when interest accrues and when payments are made:

```java
// Calculation period dates - when interest accrues (6-monthly)
CalculationPeriodDates calculationDates = CalculationPeriodDates.builder()
    .setEffectiveDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2025, 9, 12)) // Trade start date
            .setDateAdjustments(modFollowingAdjustments) // Apply business day rules
            .build())
        .build())
    .setTerminationDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2030, 9, 12)) // Trade end date (5 years)
            .setDateAdjustments(modFollowingAdjustments) // Apply business day rules
            .build())
        .build())
    .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()
        .setPeriodMultiplier(6) // Every 6...
        .setPeriod(PeriodExtendedEnum.M) // ...months
        .setRollConvention(RollConventionEnum._12) // On the 12th of each period month
        .build())
    .setCalculationPeriodDatesAdjustments(modFollowingAdjustments) // Adjust period boundaries
    .build();
```

**CDM Concepts Explained:**
- `AdjustableDate`: Combines unadjusted date with business day adjustment rules
- `CalculationPeriodFrequency`: Defines how often interest calculation periods occur
- `RollConvention`: Which day of month to use for period boundaries
- **Period Generation**: CDM automatically generates all intermediate periods

**Payment Date Configuration:**
```java
// Payment dates - when actual payments are made
PaymentDates paymentDates = PaymentDates.builder()
    .setPaymentFrequency(Frequency.builder()
        .setPeriodMultiplier(6) // Every 6...  
        .setPeriod(PeriodExtendedEnum.M) // ...months
        .build())
    .setPayRelativeTo(PayRelativeToEnum.CALCULATION_PERIOD_END_DATE) // Pay at end of each calc period
    .setPaymentDaysOffset(Offset.builder()
        .setPeriodMultiplier(2) // 2 days...
        .setDayType(DayTypeEnum.BUSINESS) // ...business days after
        .build())
    .setPaymentDatesAdjustments(modFollowingAdjustments) // Apply business day rules to payments
    .build();
```

**CDM Concepts Explained:**
- `PayRelativeToEnum`: Defines anchor point for payment timing
- `Offset`: Specifies delay between calculation period end and payment
- `DayTypeEnum.BUSINESS`: Counts only business days (not calendar days)

### Step 4: Notional Amount Specifications

Cross-currency swaps involve different notional amounts in different currencies:

```java
// Chilean Peso notional for fixed leg
PriceQuantity clpNotional = PriceQuantity.builder()
    .addQuantityValue(NonNegativeQuantitySchedule.builder()
        .setValue(BigDecimal.valueOf(950000000000.00)) // CLP 950 billion
        .setUnit(UnitType.builder()
            .setCurrencyValue("CLP") // Chilean Peso denomination
            .build())
        .build())
    .build();

// US Dollar notional for floating leg  
PriceQuantity usdNotional = PriceQuantity.builder()
    .addQuantityValue(NonNegativeQuantitySchedule.builder()
        .setValue(BigDecimal.valueOf(10000000.00)) // USD 10 million
        .setUnit(UnitType.builder()
            .setCurrencyValue("USD") // US Dollar denomination
            .build())
        .build())
    .build();
```

**CDM Concepts Explained:**
- `PriceQuantity`: Container for both pricing and quantity information
- `NonNegativeQuantitySchedule`: Ensures notional cannot be negative
- `UnitType`: Specifies the unit of measurement (currency in this case)
- **BigDecimal**: Used for precise financial calculations (avoids floating-point errors)

### Step 5: Fixed Rate Leg Implementation

The fixed rate leg represents Bank A's obligation to pay 5% on the CLP notional:

```java
// Fixed rate payout - Bank A pays 5% on CLP notional
InterestRatePayout fixedLeg = InterestRatePayout.builder()
    .setPayerReceiver(PayerReceiver.builder()
        .setPayer(CounterpartyRoleEnum.PARTY_1) // Bank A pays
        .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs receives
        .build())
    .setRateSpecification(RateSpecification.builder()
        .setFixedRate(FixedRateSpecification.builder()
            .setRateSchedule(RateSchedule.builder()
                .setPriceValue(BigDecimal.valueOf(0.05)) // 5% = 0.05 decimal
                .build())
            .build())
        .build())
    .setDayCountFraction(DayCountFractionEnum.ACT_360) // Actual days / 360
    .setCalculationPeriodDates(calculationDates) // Use shared schedule
    .setPaymentDates(paymentDates) // Use shared payment schedule
    .setPriceQuantity(clpNotional) // CLP 950B notional
    .setSettlementCurrency("USD") // Net settlement in USD
    .build();
```

**CDM Concepts Explained:**
- `PayerReceiver`: Clearly defines who pays and who receives
- `RateSpecification`: Abstract container for either fixed or floating rates
- `FixedRateSpecification`: Concrete implementation for fixed rates
- `RateSchedule`: Allows for rate steps over time (single value here)
- `DayCountFractionEnum.ACT_360`: Actual days in period divided by 360
- `setSettlementCurrency()`: Enables net settlement in different currency

**Day Count Conventions:**
- `ACT_360`: Actual days / 360 (common for money markets)
- `ACT_365`: Actual days / 365 (common for bonds)
- `_30_360`: 30 days per month, 360 per year (common for corporates)

### Step 6: Floating Rate Leg Implementation

The floating rate leg represents Bank A's right to receive USD SOFR + 100bps:

```java
// Reset dates configuration for SOFR fixing (T-1)
ResetDates sofrReset = ResetDates.builder()
    .setResetRelativeTo(ResetRelativeToEnum.CALCULATION_PERIOD_START_DATE) // Reset at period start
    .setFixingDates(RelativeDateOffset.builder()
        .setPeriodMultiplier(-1) // 1 day before...
        .setDayType(DayTypeEnum.BUSINESS) // ...business day
        .setBusinessDayConvention(BusinessDayConventionEnum.PRECEDING) // Move backward if holiday
        .addBusinessCenters(BusinessCenters.builder()
            .addBusinessCenterValue(BusinessCenterEnum.USNY) // US calendar for SOFR
            .build())
        .build())
    .build();

// Floating rate payout - Bank A receives SOFR + 100bps on USD notional
InterestRatePayout floatingLeg = InterestRatePayout.builder()
    .setPayerReceiver(PayerReceiver.builder()
        .setPayer(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs pays
        .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank A receives
        .build())
    .setRateSpecification(RateSpecification.builder()
        .setFloatingRate(FloatingRateSpecification.builder()
            .setRateOption(FloatingRateOption.builder()
                .setFloatingRateIndexValue(FloatingRateIndexEnum.USD_SOFR_COMPOUND) // SOFR with compounding
                .setIndexTenor(Period.builder()
                    .setPeriodMultiplier(1) // 1...
                    .setPeriod(PeriodEnum.D) // ...day (daily compounding)
                    .build())
                .build())
            .setSpreadSchedule(SpreadSchedule.builder()
                .addInitialValue(BigDecimal.valueOf(0.01)) // 100 basis points = 0.01
                .build())
            .build())
        .build())
    .setDayCountFraction(DayCountFractionEnum.ACT_360) // Consistent with fixed leg
    .setCalculationPeriodDates(calculationDates) // Use shared schedule
    .setPaymentDates(paymentDates) // Use shared payment schedule
    .setPriceQuantity(usdNotional) // USD 10M notional
    .setResetDates(sofrReset) // T-1 fixing schedule
    .setCompoundingMethod(CompoundingMethodEnum.STRAIGHT) // Daily compounding method
    .setSettlementCurrency("USD") // Net settlement in USD
    .build();
```

**CDM Concepts Explained:**
- `ResetDates`: Defines when floating rates are observed/fixed
- `FloatingRateOption`: Specifies the benchmark rate (SOFR) and its characteristics
- `USD_SOFR_COMPOUND`: CDM's built-in SOFR compounding methodology
- `SpreadSchedule`: Additional margin over the floating rate
- `CompoundingMethodEnum.STRAIGHT`: Standard daily compounding formula
- **T-1 Fixing**: Rate is observed one business day before calculation period

**SOFR Compounding:**
SOFR (Secured Overnight Financing Rate) compounds daily. The `STRAIGHT` method applies the standard formula:
```
Compounded Rate = ∏(1 + SOFR_i * days_i/360) - 1
```

### Step 7: FX Observable for Currency Conversion

Cross-currency swaps need FX rates for converting between currencies:

```java
// FX observable for Dólar Observado (BCCh published rate)
Observable dolarObservado = Observable.builder()
    .setCurrencyPair(QuotedCurrencyPair.builder()
        .setCurrency1Value("USD") // Base currency
        .setCurrency2Value("CLP") // Quote currency  
        .setQuoteBasis(QuoteBasisEnum.CURRENCY2_PER_CURRENCY1) // CLP per 1 USD
        .build())
    // Note: BCCh Dólar Observado would need custom observable definition
    // as it's not a standard CDM floating rate index
    .build();
```

**CDM Concepts Explained:**
- `QuotedCurrencyPair`: Standard FX pair representation
- `CURRENCY2_PER_CURRENCY1`: Quote convention (how many CLP per 1 USD)
- **Custom Observables**: Non-standard rates require additional configuration

**FX Quote Conventions:**
- `CURRENCY1_PER_CURRENCY2`: USD/CLP = 0.00118 (dollars per peso)
- `CURRENCY2_PER_CURRENCY1`: USD/CLP = 850 (pesos per dollar) ← Our case

### Step 8: Product Assembly

Combine the payouts into a complete financial product:

```java
// Create the cross-currency interest rate swap product
Product crossCurrencySwap = Product.builder()
    .setContractualProduct(ContractualProduct.builder()
        .setEconomicTerms(EconomicTerms.builder()
            .setPayout(Payout.builder()
                .addInterestRatePayout(fixedLeg) // CLP fixed rate leg
                .addInterestRatePayout(floatingLeg) // USD floating rate leg
                .build())
            .build())
        .build())
    .build();
```

**CDM Concepts Explained:**
- `ContractualProduct`: Distinguishes from other product types (e.g., Index, Security)
- `EconomicTerms`: Container for all financial terms and conditions
- `Payout`: Collection of all cash flows (interest, principal, dividends, etc.)
- **Multiple Payouts**: Each leg is a separate `InterestRatePayout`

**Product Hierarchy:**
```
Product
└── ContractualProduct (vs Index, Security)
    └── EconomicTerms
        └── Payout
            ├── InterestRatePayout[] (our swap legs)
            ├── CashflowPayout[] (for notional exchanges)
            ├── EquityPayout[] (for equity derivatives)
            └── CreditDefaultPayout[] (for credit derivatives)
```

### Step 9: Trade Creation and Final Assembly

Wrap the product in a complete trade structure:

```java
// Create the complete trade
Trade crossCurrencySwapTrade = Trade.builder()
    .setTradeDateValue(Date.of(2025, 9, 10)) // When trade was executed
    .addTradeIdentifier(TradeIdentifier.builder()
        .addAssignedIdentifier(AssignedIdentifier.builder()
            .setIdentifierValue("XCCY-SWAP-001") // Unique trade ID
            .build())
        .build())
    .addParty(bankA) // Add both parties
    .addParty(goldmanSachs)
    .addCounterparty(cp1) // Add counterparty roles
    .addCounterparty(cp2)
    .setTradableProduct(TradableProduct.builder()
        .setProduct(crossCurrencySwap) // Attach the product
        .build())
    .build();

// Wrap in TradeState for lifecycle management
TradeState tradeState = TradeState.builder()
    .setTrade(crossCurrencySwapTrade)
    .setState(State.builder()
        .setPositionState(PositionStatusEnum.EXECUTED) // Trade status
        .build())
    .build();
```

**CDM Concepts Explained:**
- `TradeIdentifier`: Container for multiple ID types (UTI, USI, internal IDs)
- `TradableProduct`: Separates product definition from trade-specific details
- `TradeState`: Adds lifecycle information to the trade
- `PositionStatusEnum`: Tracks trade status (EXECUTED, SETTLED, CANCELLED, etc.)

## Advanced CDM Concepts

### 1. Reference Architecture

CDM uses a reference-based architecture to maintain data consistency:

```java
// Instead of duplicating party information
.setPartyReferenceValue(bankA.getMeta().getGlobalKey()) // Reference by key

// CDM automatically maintains the relationship
Party retrievedParty = /* CDM lookup by global key */;
```

**Benefits:**
- **Data Integrity**: Single source of truth for each entity
- **Memory Efficiency**: No object duplication
- **Consistency**: Changes propagate automatically

### 2. Metadata and Audit Trail

Every CDM object includes rich metadata:

```java
RosettaModelObject obj = trade; // Any CDM object
RosettaMetaData meta = obj.getMeta();

String globalKey = meta.getGlobalKey(); // Unique identifier
String location = meta.getLocation(); // Object path
List<Key> externalKeys = meta.getExternalKey(); // External system IDs
```

**Use Cases:**
- **Audit Trails**: Track object creation and modification
- **Data Lineage**: Understand data flow through systems
- **External Integration**: Map to other system identifiers

### 3. Validation Framework

CDM includes comprehensive validation:

```java
try {
    Trade trade = builder.build(); // Validation occurs here
    // Trade is guaranteed valid
} catch (Exception e) {
    // Validation failed - object not created
    System.err.println("Validation error: " + e.getMessage());
}
```

**Validation Types:**
- **Structural**: Required fields, data types
- **Business Rules**: Cross-field validations
- **Regulatory**: Compliance with market standards

### 4. Extensibility

CDM supports extensions for custom requirements:

```java
// Custom attributes via metadata
Trade tradeWithCustomData = trade.toBuilder()
    .setMeta(trade.getMeta().toBuilder()
        .addExternalKey(Key.builder()
            .setKeyValue("INTERNAL-123")
            .setScope("InternalSystem")
            .build())
        .build())
    .build();
```

## Complete Code Implementation

Here's the complete implementation as a single Java class:

```java
package com.example.cdm;

import cdm.base.datetime.*;
import cdm.base.staticdata.party.*;
import cdm.event.common.*;
import cdm.product.asset.*;
import cdm.product.common.schedule.*;
import cdm.product.common.settlement.*;
import cdm.product.template.*;
import cdm.observable.asset.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CrossCurrencySwapExample {

    public TradeState buildCrossCurrencySwap() {
        
        // === STEP 1: PARTIES ===
        Party bankA = Party.builder()
            .setPartyIdValue("LEI:BANKA123456789012")
            .setNameValue("Bank A")
            .build();

        Party goldmanSachs = Party.builder()
            .setPartyIdValue("LEI:784F5XWPLTWKTBV55W24")
            .setNameValue("Goldman Sachs International")
            .build();

        Counterparty cp1 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_1)
            .setPartyReferenceValue(bankA.getMeta().getGlobalKey())
            .build();

        Counterparty cp2 = Counterparty.builder()
            .setRole(CounterpartyRoleEnum.PARTY_2)
            .setPartyReferenceValue(goldmanSachs.getMeta().getGlobalKey())
            .build();

        // === STEP 2: BUSINESS DAY ADJUSTMENTS ===
        BusinessCenters nySclCenters = BusinessCenters.builder()
            .addBusinessCenterValue(BusinessCenterEnum.NYFD)
            .addBusinessCenterValue(BusinessCenterEnum.CLSA)
            .build();

        BusinessDayAdjustments modFollowingAdjustments = BusinessDayAdjustments.builder()
            .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
            .addBusinessCenters(nySclCenters)
            .build();

        // === STEP 3: SCHEDULES ===
        CalculationPeriodDates calculationDates = CalculationPeriodDates.builder()
            .setEffectiveDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(Date.of(2025, 9, 12))
                    .setDateAdjustments(modFollowingAdjustments)
                    .build())
                .build())
            .setTerminationDate(AdjustableOrRelativeDate.builder()
                .setAdjustableDate(AdjustableDate.builder()
                    .setUnadjustedDate(Date.of(2030, 9, 12))
                    .setDateAdjustments(modFollowingAdjustments)
                    .build())
                .build())
            .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()
                .setPeriodMultiplier(6)
                .setPeriod(PeriodExtendedEnum.M)
                .setRollConvention(RollConventionEnum._12)
                .build())
            .setCalculationPeriodDatesAdjustments(modFollowingAdjustments)
            .build();

        PaymentDates paymentDates = PaymentDates.builder()
            .setPaymentFrequency(Frequency.builder()
                .setPeriodMultiplier(6)
                .setPeriod(PeriodExtendedEnum.M)
                .build())
            .setPayRelativeTo(PayRelativeToEnum.CALCULATION_PERIOD_END_DATE)
            .setPaymentDaysOffset(Offset.builder()
                .setPeriodMultiplier(2)
                .setDayType(DayTypeEnum.BUSINESS)
                .build())
            .setPaymentDatesAdjustments(modFollowingAdjustments)
            .build();

        // === STEP 4: NOTIONALS ===
        PriceQuantity clpNotional = PriceQuantity.builder()
            .addQuantityValue(NonNegativeQuantitySchedule.builder()
                .setValue(BigDecimal.valueOf(950000000000.00))
                .setUnit(UnitType.builder()
                    .setCurrencyValue("CLP")
                    .build())
                .build())
            .build();

        PriceQuantity usdNotional = PriceQuantity.builder()
            .addQuantityValue(NonNegativeQuantitySchedule.builder()
                .setValue(BigDecimal.valueOf(10000000.00))
                .setUnit(UnitType.builder()
                    .setCurrencyValue("USD")
                    .build())
                .build())
            .build();

        // === STEP 5: FIXED RATE LEG ===
        InterestRatePayout fixedLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_1)
                .setReceiver(CounterpartyRoleEnum.PARTY_2)
                .build())
            .setRateSpecification(RateSpecification.builder()
                .setFixedRate(FixedRateSpecification.builder()
                    .setRateSchedule(RateSchedule.builder()
                        .setPriceValue(BigDecimal.valueOf(0.05))
                        .build())
                    .build())
                .build())
            .setDayCountFraction(DayCountFractionEnum.ACT_360)
            .setCalculationPeriodDates(calculationDates)
            .setPaymentDates(paymentDates)
            .setPriceQuantity(clpNotional)
            .setSettlementCurrency("USD")
            .build();

        // === STEP 6: FLOATING RATE LEG ===
        ResetDates sofrReset = ResetDates.builder()
            .setResetRelativeTo(ResetRelativeToEnum.CALCULATION_PERIOD_START_DATE)
            .setFixingDates(RelativeDateOffset.builder()
                .setPeriodMultiplier(-1)
                .setDayType(DayTypeEnum.BUSINESS)
                .setBusinessDayConvention(BusinessDayConventionEnum.PRECEDING)
                .addBusinessCenters(BusinessCenters.builder()
                    .addBusinessCenterValue(BusinessCenterEnum.USNY)
                    .build())
                .build())
            .build();

        InterestRatePayout floatingLeg = InterestRatePayout.builder()
            .setPayerReceiver(PayerReceiver.builder()
                .setPayer(CounterpartyRoleEnum.PARTY_2)
                .setReceiver(CounterpartyRoleEnum.PARTY_1)
                .build())
            .setRateSpecification(RateSpecification.builder()
                .setFloatingRate(FloatingRateSpecification.builder()
                    .setRateOption(FloatingRateOption.builder()
                        .setFloatingRateIndexValue(FloatingRateIndexEnum.USD_SOFR_COMPOUND)
                        .setIndexTenor(Period.builder()
                            .setPeriodMultiplier(1)
                            .setPeriod(PeriodEnum.D)
                            .build())
                        .build())
                    .setSpreadSchedule(SpreadSchedule.builder()
                        .addInitialValue(BigDecimal.valueOf(0.01))
                        .build())
                    .build())
                .build())
            .setDayCountFraction(DayCountFractionEnum.ACT_360)
            .setCalculationPeriodDates(calculationDates)
            .setPaymentDates(paymentDates)
            .setPriceQuantity(usdNotional)
            .setResetDates(sofrReset)
            .setCompoundingMethod(CompoundingMethodEnum.STRAIGHT)
            .setSettlementCurrency("USD")
            .build();

        // === STEP 7: FX OBSERVABLE ===
        Observable dolarObservado = Observable.builder()
            .setCurrencyPair(QuotedCurrencyPair.builder()
                .setCurrency1Value("USD")
                .setCurrency2Value("CLP")
                .setQuoteBasis(QuoteBasisEnum.CURRENCY2_PER_CURRENCY1)
                .build())
            .build();

        // === STEP 8: PRODUCT ASSEMBLY ===
        Product crossCurrencySwap = Product.builder()
            .setContractualProduct(ContractualProduct.builder()
                .setEconomicTerms(EconomicTerms.builder()
                    .setPayout(Payout.builder()
                        .addInterestRatePayout(fixedLeg)
                        .addInterestRatePayout(floatingLeg)
                        .build())
                    .build())
                .build())
            .build();

        // === STEP 9: TRADE CREATION ===
        Trade crossCurrencySwapTrade = Trade.builder()
            .setTradeDateValue(Date.of(2025, 9, 10))
            .addTradeIdentifier(TradeIdentifier.builder()
                .addAssignedIdentifier(AssignedIdentifier.builder()
                    .setIdentifierValue("XCCY-SWAP-001")
                    .build())
                .build())
            .addParty(bankA)
            .addParty(goldmanSachs)
            .addCounterparty(cp1)
            .addCounterparty(cp2)
            .setTradableProduct(TradableProduct.builder()
                .setProduct(crossCurrencySwap)
                .build())
            .build();

        // === FINAL ASSEMBLY ===
        return TradeState.builder()
            .setTrade(crossCurrencySwapTrade)
            .setState(State.builder()
                .setPositionState(PositionStatusEnum.EXECUTED)
                .build())
            .build();
    }
}
```

## Key Takeaways

### 1. CDM Design Philosophy
- **Comprehensive**: Covers entire trade lifecycle from inception to settlement
- **Standardized**: Common vocabulary across institutions and jurisdictions
- **Extensible**: Support for custom requirements while maintaining interoperability
- **Immutable**: Thread-safe, audit-friendly object model

### 2. Implementation Best Practices
- **Builder Pattern**: Always use builders for object creation
- **Validation**: Let CDM validate during build() - don't bypass
- **References**: Use global keys for object relationships
- **Reusability**: Share common objects (schedules, adjustments) across payouts

### 3. Cross-Currency Considerations
- **Multiple Notionals**: Each leg has its own notional in its own currency
- **Settlement Currency**: Specify common currency for net settlement
- **FX Observables**: Define how currencies convert (may need custom implementation)
- **Calendar Coordination**: Use union of business centers for multi-jurisdictional trades

### 4. Real-World Applications
- **Trade Capture**: Direct input from trading systems
- **Risk Management**: Standardized format for position aggregation
- **Regulatory Reporting**: Compliant with global reporting standards
- **Lifecycle Events**: Foundation for amendments, terminations, and settlements

This comprehensive example demonstrates how CDM's structured approach enables precise representation of complex financial instruments while maintaining clarity and standardization across the industry.