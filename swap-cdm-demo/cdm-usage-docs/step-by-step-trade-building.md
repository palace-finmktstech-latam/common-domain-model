# Step-by-Step CDM Trade Building: Lessons Learned

## Overview

This document captures the practical lessons learned while building a cross-currency interest rate swap step-by-step using CDM 6.0.0. Each step represents a working, compilable example that progressively adds complexity.

## Key Discovery: Incremental Approach Works

Instead of trying to build a complete swap all at once (which led to compilation errors), building incrementally allows us to:
- **Validate each piece** of the CDM API as we go
- **Understand the object hierarchy** through working examples  
- **Learn correct method names** and patterns
- **See JSON output** at each stage to understand the structure

---

## Step 1: Minimal Trade Structure ✅

**File:** `MinimalTrade.java`

### What We Built
- Basic `Trade` object with parties and dates
- Proper party-counterparty linkage
- Empty product (null)

### Key Learnings

#### 1. Parties vs Counterparties (Critical CDM Concept)
**Problem:** Initial confusion about why we need both parties AND counterparties.

**Solution:** 
- **`Party`** = WHO are the entities? (like a contact book)
- **`Counterparty`** = HOW do those entities participate in THIS trade?

```java
// Entities that exist
Party bankA = Party.builder()
    .setNameValue("Bank A")
    .build();

// How Bank A participates in THIS trade
Counterparty cp1 = Counterparty.builder()
    .setRole(CounterpartyRoleEnum.PARTY_1)
    .setPartyReferenceValue(bankA)  // Links to the entity
    .build();
```

#### 2. Reference Pattern
**Critical:** Counterparties must reference parties via `.setPartyReferenceValue(partyObject)`, not global keys.

**Wrong:**
```java
.setPartyReferenceValue(bankA.getMeta().getGlobalKey()) // String - FAILS
```

**Right:**
```java
.setPartyReferenceValue(bankA) // Party object - WORKS
```

#### 3. JSON Structure Understanding
The resulting JSON shows the proper linkage:
```json
"counterparty": [{
  "role": "PARTY_1",
  "partyReference": {
    "value": {
      "name": { "value": "Bank A" }
    },
    "type": "cdm.base.staticdata.party.metafields.ReferenceWithMetaParty"
  }
}]
```

### Working Code Pattern
```java
Trade.builder()
    .setTradeDateValue(Date.of(2025, 9, 10))
    .addTradeIdentifier(TradeIdentifier.builder().build())
    .addParty(bankA)
    .addParty(goldmanSachs)
    .addCounterparty(cp1) // Properly linked to bankA
    .addCounterparty(cp2) // Properly linked to goldmanSachs
    // No .setProduct() yet
    .build();
```

---

## Step 2: Add Basic Product Structure ✅

**File:** `TradeWithFixedLeg.java`

### What We Built
- `NonTransferableProduct` container
- `EconomicTerms` with one `Payout`
- `InterestRatePayout` with `PayerReceiver` roles
- NO rate specification yet (null)

### Key Learnings

#### 1. Product Type Selection
**Question:** Why `NonTransferableProduct`?

**Answer:** CDM has two main product types:
- **`NonTransferableProduct`** - For derivatives that CANNOT be sold/transferred
  - Interest Rate Swaps ✅
  - FX Forwards/Swaps
  - Most OTC derivatives
  
- **`TransferableProduct`** - For instruments that CAN be traded
  - Bonds, Equities, ETFs

#### 2. CDM Object Hierarchy
```
Trade
└── Product (NonTransferableProduct)
    └── EconomicTerms
        └── Payout[] (array - can have multiple legs)
            └── InterestRatePayout
                └── PayerReceiver (who pays/receives)
```

#### 3. Payout Array Concept
**Why an array?** Complex products have multiple cash flow streams:
```java
payout: [
  { interestRatePayout: fixedLeg },   // Bank A pays 5% CLP
  { interestRatePayout: floatingLeg }, // Bank A receives SOFR+100bps USD  
  { cashflowPayout: upfrontFee },     // Optional: upfront payment
  { optionPayout: cancellationOption } // Optional: embedded option
]
```

#### 4. PayerReceiver Direction
**Critical for swaps:** Each leg has different payment direction
```java
// Fixed leg: Bank A pays
PayerReceiver.builder()
    .setPayer(CounterpartyRoleEnum.PARTY_1)    // Bank A
    .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs
    .build()

// Floating leg: Bank A receives (will need separate payout)
PayerReceiver.builder()
    .setPayer(CounterpartyRoleEnum.PARTY_2)    // Goldman Sachs
    .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank A
    .build()
```

### Working Code Pattern
```java
NonTransferableProduct.builder()
    .setEconomicTerms(EconomicTerms.builder()
        .addPayout(Payout.builder()
            .setInterestRatePayout(InterestRatePayout.builder()
                .setPayerReceiver(PayerReceiver.builder()
                    .setPayer(CounterpartyRoleEnum.PARTY_1)
                    .setReceiver(CounterpartyRoleEnum.PARTY_2)
                    .build())
                // No rate specification yet
                .build())
            .build())
        .build())
    .build();
```

---

## Step 3: Add Rate Specification Structure ✅

**File:** `TradeWithFixedRate.java`

### What We Built
- `RateSpecification` with `FixedRateSpecification`
- Proper CDM choice field pattern
- Empty `FixedRateSpecification` (no rate value yet)

### Key Learnings

#### 1. CDM API Method Discovery Process
**Problem:** Documentation showed `setPriceValue(BigDecimal)` but API expected `PriceSchedule`
**Problem:** Tried `setFixedRate()` but method doesn't exist

**Solution Process:**
1. Check what methods actually exist on `RateSpecificationBuilder`
2. Found `setFixedRateSpecification(FixedRateSpecification)` ✅
3. Build incrementally - empty `FixedRateSpecification` first

#### 2. Choice/Union Field Pattern
**Discovery:** `RateSpecification` is a choice field with three options:
```java
RateSpecification = {
  fixedRateSpecification: ...,    // Only one of these
  floatingRateSpecification: ..., // can be populated
  inflationRateSpecification: ... // at a time
}
```

**JSON Output Pattern:**
```json
"rateSpecification": {
  "fixedRateSpecification": {
    "rateSchedule": null,
    "type": "cdm.product.asset.FixedRateSpecification"
  },
  "floatingRateSpecification": null,  // Choice - null when not selected
  "inflationRateSpecification": null, // Choice - null when not selected
  "type": "cdm.product.asset.RateSpecification"
}
```

#### 3. Progressive Building Strategy (Proven Successful)
**Phase 1:** Empty structure (Step 3 initial)
```java
FixedRateSpecification fixedRateSpec = FixedRateSpecification.builder()
    .build(); // Compiles with null rate schedule
```

**Phase 2:** Add rate value (Step 3 enhanced)
```java
PriceSchedule priceSchedule = PriceSchedule.builder()
    .setValue(BigDecimal.valueOf(0.05))
    .build();

FixedRateSpecification fixedRateSpec = FixedRateSpecification.builder()
    .setRateSchedule(RateSchedule.builder()
        .setPriceValue(priceSchedule)
        .build())
    .build();
```

**Phase 3:** Add conventions (Step 3 complete)
```java
InterestRatePayout.builder()
    .setRateSpecification(rateSpec)
    .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
    .build();
```

### Working Code Pattern
```java
InterestRatePayout.builder()
    .setPayerReceiver(PayerReceiver.builder()
        .setPayer(CounterpartyRoleEnum.PARTY_1)
        .setReceiver(CounterpartyRoleEnum.PARTY_2)
        .build())
    .setRateSpecification(RateSpecification.builder()
        .setFixedRateSpecification(FixedRateSpecification.builder()
            // Empty for now - will add RateSchedule next
            .build())
        .build())
    .build();
```

---

## Step 4: Complete Fixed Rate with Day Count and Notional (COMPLETED ✅)

**File:** `TradeWithFixedRate.java` (enhanced)

### What We Built
- 5% fixed rate using nested CDM objects
- Proper `PriceSchedule` → `RateSchedule` → `FixedRateSpecification` pattern
- Day count fraction (ACT/360) on `InterestRatePayout`
- **Notional amount** (CLP 950 billion) using `ResolvablePriceQuantity`
- Complete fixed leg with all essential components

### Key Learnings

#### 1. CDM Nested Object Pattern for Rates
**Discovery:** Rates require a specific nesting hierarchy:
```java
BigDecimal (0.05) → PriceSchedule → RateSchedule → FixedRateSpecification
```

**Working Pattern:**
```java
PriceSchedule priceSchedule = PriceSchedule.builder()
    .setValue(BigDecimal.valueOf(0.05)) // 5% as decimal
    .build();

FixedRateSpecification fixedRateSpec = FixedRateSpecification.builder()
    .setRateSchedule(RateSchedule.builder()
        .setPriceValue(priceSchedule) // Pass PriceSchedule object
        .build())
    .build();
```

#### 2. Unit Specification for Interest Rates
**Question:** Why no unit specification for 0.05?
**Answer:** CDM convention - for interest rates in `InterestRatePayout`, the unit is **implied by context**. 0.05 = 5% annual rate.

#### 3. Day Count Fraction Placement
**Wrong Location:** `FixedRateSpecification` doesn't have day count
**Right Location:** `InterestRatePayout` contains calculation conventions

```java
InterestRatePayout.builder()
    .setRateSpecification(rateSpec)
    .setDayCountFractionValue(DayCountFractionEnum.ACT_360) // ✅ Here!
    .build();
```

#### 4. CDM Method Naming Pattern
**Discovery:** Methods with 'Value' suffix for direct enums/primitives:
- `.setFieldName()` - expects wrapped object (FieldWithMeta*)
- `.setFieldNameValue()` - expects direct value/enum

#### 5. Business Day Adjustments Location
**Important Discovery:** Business day adjustments are NOT set directly on `InterestRatePayout` like day count fraction. Instead:
- **Calculation period adjustments:** Part of `CalculationPeriodDates` object
- **Payment date adjustments:** Part of `PaymentDates` object
- **Reason:** Adjustments are schedule-specific, not payout-specific

This will be implemented in Step 5 when we add full schedule structures.

#### 6. Notional Amount Pattern Discovery
**Challenge:** `InterestRatePayout.setPriceQuantity()` expects `ResolvablePriceQuantity`, not `PriceQuantity`

**Solution Process:**
1. Initially tried `PriceQuantity.builder()` - compilation error
2. Tried casting `PriceQuantity` to `ResolvablePriceQuantity` - type mismatch
3. Discovered `ResolvablePriceQuantity` has its own builder

**Working Pattern:**
```java
// Create the quantity schedule first
NonNegativeQuantitySchedule notionalSchedule = NonNegativeQuantitySchedule.builder()
    .setValue(BigDecimal.valueOf(950000000000.00)) // 950B CLP
    .setUnit(UnitType.builder()
        .setCurrencyValue("CLP")
        .build())
    .build();

// Wrap in ResolvablePriceQuantity
ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
    .setQuantityScheduleValue(notionalSchedule) // ✅ Correct method
    .build();

// Use in InterestRatePayout
InterestRatePayout.builder()
    .setPriceQuantity(clpNotional) // ✅ Now accepts the type
    .build();
```

### JSON Validation
```json
"rateSchedule" : {
  "price" : {
    "value" : {
      "value" : 0.05,  // ✅ 5% rate successfully added
      "unit" : null,   // ✅ Normal for interest rates
    }
  }
},
"priceQuantity" : {
  "quantitySchedule" : {
    "value" : {
      "value" : 9.5E+11,  // ✅ CLP 950 billion in scientific notation
      "currency" : {
        "value" : "CLP"   // ✅ Chilean Peso currency
      }
    }
  }
},
"dayCountFraction" : {
  "value" : "ACT_360",  // ✅ Day count properly specified
}
```

## Step 5: Next Steps (Planned)

### Add Floating Rate Leg
- Second `InterestRatePayout` with opposite `PayerReceiver`
- `FloatingRateSpecification` with SOFR + spread
- Understand floating rate index patterns

### Add Cross-Currency Elements
- Different currencies on each leg
- Settlement currency specification
- FX observable for conversion

---

## Key CDM Development Principles Learned

### 1. Incremental Building Strategy
✅ **Do:** Build working structure first, add details later
❌ **Don't:** Try to build everything at once

### 2. API Discovery Process
✅ **Do:** Check documentation for available methods
✅ **Do:** Try empty objects first to test structure  
❌ **Don't:** Assume method names from other examples

### 3. Understanding CDM Patterns
- **Choice Fields:** Only one option populated, others null
- **Reference Pattern:** Use object references, not global keys
- **Builder Pattern:** Method chaining with validation
- **Array Fields:** Support multiple items (payouts, parties, etc.)

### 4. JSON as Learning Tool
- **Complete Schema:** All fields shown (even null ones)
- **Type Information:** Every object has CDM class type
- **Structure Validation:** See hierarchy and relationships
- **Progress Tracking:** Compare JSON between steps

### 5. Working Code Repository
Each step maintains working, compilable code that:
- ✅ Compiles successfully
- ✅ Produces valid JSON output
- ✅ Demonstrates specific CDM concepts
- ✅ Can be extended in next step

---

## Troubleshooting Patterns

### Common Compilation Errors and Solutions (Updated)

#### 1. Method Not Found
```
cannot find symbol: method setFixedRate()
```
**Solution:** Check documentation for exact method names
- `setFixedRate()` → `setFixedRateSpecification()`

#### 2. Wrong Parameter Type for Rate Value
```
setPriceValue(PriceSchedule) not applicable for (BigDecimal)
```
**Solution:** Create nested object structure
```java
PriceSchedule ps = PriceSchedule.builder()
    .setValue(BigDecimal.valueOf(0.05))
    .build();
RateSchedule.builder().setPriceValue(ps)
```

#### 3. Day Count Fraction Method Error
```
setDayCountFraction(DayCountFractionEnum) not applicable
```
**Solution:** Use 'Value' suffix method
```java
.setDayCountFractionValue(DayCountFractionEnum.ACT_360) // ✅
```

#### 4. Wrong Location for Day Count
```
setDayCountFraction undefined for FixedRateSpecification
```
**Solution:** Move to InterestRatePayout level
```java
InterestRatePayout.builder()
    .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
```

#### 5. Notional Amount Type Errors
```
setPriceQuantity(ResolvablePriceQuantity) not applicable for (PriceQuantity)
```
**Solution:** Use ResolvablePriceQuantity builder directly
```java
ResolvablePriceQuantity.builder()
    .setQuantityScheduleValue(notionalSchedule)
    .build(); // ✅ Correct type
```

```
Type mismatch: cannot convert PriceQuantity to ResolvablePriceQuantity
```
**Solution:** Don't try to cast - they're separate types
```java
// Wrong:
ResolvablePriceQuantity rpq = (ResolvablePriceQuantity) PriceQuantity.builder()...

// Right:
ResolvablePriceQuantity rpq = ResolvablePriceQuantity.builder()...
``` 

#### 2. Wrong Parameter Type
```
method setPriceValue(PriceSchedule) not applicable for arguments (BigDecimal)
```
**Solution:** Build required object type first
- Create `PriceSchedule` containing the `BigDecimal`
- Use progressive building approach

#### 3. Reference Issues
```
method setPartyReferenceValue(Party) not applicable for arguments (String)
```
**Solution:** Use object references, not keys
- Pass `partyObject`, not `partyObject.getMeta().getGlobalKey()`

### JSON Validation Checks

#### 1. Null vs Missing Fields
- **Null:** Field exists but not populated (normal for CDM)
- **Missing:** Field not in JSON at all (potential issue)

#### 2. Type Field Validation
Every CDM object should have:
```json
"type": "cdm.package.ClassName"
```

#### 3. Reference Structure
Proper party references show:
```json
"partyReference": {
  "value": { /* party object */ },
  "type": "cdm.base.staticdata.party.metafields.ReferenceWithMetaParty"
}
```

This step-by-step approach has proven much more effective than trying to build complete CDM objects from scratch.

## Step 5: Cross-Currency Elements ✅

### What We Added
1. **Business Centers**: USNY (New York) + CLSA (Santiago)
2. **Business Day Adjustments**: Modified Following convention
3. **Calculation Period Dates**: 
   - Effective: Sep 15, 2025
   - Termination: Sep 15, 2030
   - Semi-annual frequency (6M)
   - Roll on 15th of month

### Key Learnings
- **PeriodExtendedEnum vs PeriodEnum**: Use `PeriodExtendedEnum.M` for calculation frequencies, not `PeriodEnum.M`
- **Settlement Currency**: `setSettlementCurrency()` method not available in CDM 6.0.0
- **Observable API**: `setCurrencyPair()` method not found on Observable builder
- **Business Day Adjustments**: Go on schedule objects (CalculationPeriodDates), not directly on InterestRatePayout

### JSON Impact
- File size: 15KB → 25KB (+10KB for schedules)
- Major additions: `calculationPeriodDates` object with full schedule structure
- Both legs now have identical scheduling (common in cross-currency swaps)

### Compilation Fixes
```java
// Wrong: PeriodEnum for frequency
.setPeriod(PeriodEnum.M) // ❌ Type mismatch

// Correct: PeriodExtendedEnum for frequency
.setPeriod(PeriodExtendedEnum.M) // ✅ Works
```

### Working Code Pattern
```java
CalculationPeriodDates calculationPeriodDates = CalculationPeriodDates.builder()
    .setEffectiveDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2025, 9, 15))
            .setDateAdjustments(businessDayAdjustments)
            .build())
        .build())
    .setTerminationDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2030, 9, 15))
            .setDateAdjustments(businessDayAdjustments)
            .build())
        .build())
    .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()
        .setPeriodMultiplier(6)
        .setPeriod(PeriodExtendedEnum.M) // ✅ PeriodExtendedEnum
        .setRollConvention(RollConventionEnum._15)
        .build())
    .setCalculationPeriodDatesAdjustments(businessDayAdjustments)
    .build();
```

## Step 6: Payment Dates ✅

**File:** `CrossCurrencySwapWithPayments.java`

### What We Built
- `PaymentDates` object with T+2 settlement
- Semi-annual payment frequency matching calculation periods
- Payment business day adjustments (Modified Following, NY + Santiago)
- Proper payment offset using business days

### Key Learnings

#### 1. PaymentDates Structure
**Discovery:** Payment dates control when cash actually flows, separate from calculation periods
```java
PaymentDates paymentDates = PaymentDates.builder()
    .setPaymentFrequency(Frequency.builder()
        .setPeriodMultiplier(6) // Semi-annual
        .setPeriod(PeriodExtendedEnum.M)
        .build())
    .setPayRelativeTo(PayRelativeToEnum.CALCULATION_PERIOD_END_DATE)
    .setPaymentDaysOffset(Offset.builder()
        .setPeriodMultiplier(2) // T+2
        .setDayType(DayTypeEnum.BUSINESS)
        .build())
    .setPaymentDatesAdjustments(businessDayAdjustments)
    .build();
```

#### 2. Payment vs Calculation Dates
**Critical Distinction:**
- **Calculation Period Dates**: When interest accrues (Sep 15 and Mar 15)
- **Payment Dates**: When money moves (T+2 after period end)
- **Business Day Adjustments**: Apply to both independently

#### 3. Settlement Currency Discovery
**Finding:** Settlement currency IS available at leg level via `SettlementTerms`:
```java
// Each payout can have its own settlement terms
InterestRatePayout.builder()
    .setSettlementTerms(SettlementTerms.builder()
        .setSettlementCurrencyValue("USD") // Net settlement in USD
        .build())
    .build();
```

**For Cross-Currency Swaps with Net Settlement:**
- Both legs can specify USD as settlement currency
- FX observable converts CLP amounts to USD
- Net payment in single currency

#### 4. FX Observable Pattern (CDM 6.0.0)
**Working Pattern Found:**
```java
// Create currency pair
QuotedCurrencyPair usdClpPair = QuotedCurrencyPair.builder()
    .setCurrency1Value("USD")
    .setCurrency2Value("CLP")
    .setQuoteBasis(QuoteBasisEnum.CURRENCY_2_PER_CURRENCY_1)
    .build();

// Create FX index for Dólar Observado
ForeignExchangeRateIndex fxIndex = ForeignExchangeRateIndex.builder()
    .setNameValue("USD/CLP-BCCh-DolarObservado")
    .setQuotedCurrencyPairValue(usdClpPair)
    .setPrimaryFxSpotRateSource(InformationSource.builder()
        .setSourceProviderValue(InformationProviderEnum.BANCO_CENTRAL_CHILE)
        .build())
    .build();

// Wrap in Observable
Observable fxObservable = Observable.builder()
    .setIndex(Index.builder()
        .setForeignExchangeRateIndex(fxIndex)
        .build())
    .build();
```

**Note:** Integration point for FX Observable with trade remains unclear in CDM 6.0.0

### JSON Validation
```json
"paymentDates": {
  "paymentFrequency": {
    "periodMultiplier": 6,
    "period": "M"
  },
  "payRelativeTo": "CALCULATION_PERIOD_END_DATE",
  "paymentDaysOffset": {
    "periodMultiplier": 2,
    "dayType": "BUSINESS"
  },
  "paymentDatesAdjustments": {
    "businessDayConvention": "MODFOLLOWING",
    "businessCenters": {
      "businessCenter": [
        { "value": "USNY" },
        { "value": "CLSA" }
      ]
    }
  }
}
```

## Step 7: Complete Cross-Currency Swap with FX Linked Notional ✅

**File:** `CompleteXCcySwapWithSettlement.java`

### What We Built
- Settlement currency (USD) on both legs via `SettlementTerms`
- FX linked notional schedule for CLP leg conversion
- FX spot rate source (Banco Central de Chile - Dólar Observado)
- FX fixing dates (T-1 business day)

### Key Learnings

#### 1. FX Observable Integration Point
**Discovery:** FX observables attach to trades via `ResolvablePriceQuantity`:
```java
// The FX conversion happens through QuantityMultiplier
ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
    .setQuantityScheduleValue(clpNotionalSchedule)
    .setQuantityMultiplier(QuantityMultiplier.builder()
        .setFxLinkedNotionalSchedule(fxLinkedSchedule)
        .build())
    .build();
```

#### 2. FX Linked Notional Schedule Pattern
```java
FxLinkedNotionalSchedule fxLinkedSchedule = FxLinkedNotionalSchedule.builder()
    .setVaryingNotionalCurrencyValue("USD") // Target currency
    .setFxSpotRateSource(FxSpotRateSource.builder()
        .setPrimarySource(InformationSource.builder()
            .setSourceProviderValue(InformationProviderEnum.BancoCentralChile)
            .setSourcePageValue("Dólar Observado") // Free text description
            .build())
        .build())
    .setVaryingNotionalFixingDates(RelativeDateOffset.builder()
        .setPeriodMultiplier(-1) // T-1
        .setDayType(DayTypeEnum.BUSINESS)
        .setBusinessDayConvention(BusinessDayConventionEnum.PRECEDING)
        .setBusinessCenters(businessCenters)
        .build())
    .build();
```

#### 3. Complete InformationProviderEnum List
CDM provides 18 information providers (CamelCase format, not underscores):
- `AssocBanksSingapore`
- `BancoCentralChile` ✅ (Used for Dólar Observado)
- `BankOfCanada`
- `BankOfEngland`
- `BankOfJapan`
- `Bloomberg`
- `EuroCentralBank`
- `FederalReserve`
- `FHLBSF` (Federal Home Loan Bank SF)
- `ICESWAP`
- `ISDA`
- `Refinitiv`
- `ReserveBankAustralia`
- `ReserveBankNewZealand`
- `Reuters`
- `SAFEX` (South African Futures Exchange)
- `Telerate`
- `TOKYOSWAP`

#### 4. FX Fixing Date Logic
**T-1 with PRECEDING convention:**
- `setPeriodMultiplier(-1)`: Go back 1 day from payment
- `setDayType(DayTypeEnum.BUSINESS)`: Count business days only
- `BusinessDayConventionEnum.PRECEDING`: If T-1 is a holiday, go to previous business day
- Ensures FX rate is always available before payment

#### 5. Settlement at Leg Level
```java
// Both legs settle in USD for net settlement
InterestRatePayout.builder()
    .setSettlementTerms(SettlementTerms.builder()
        .setSettlementCurrencyValue("USD")
        .build())
    .build();
```

### JSON Structure Highlights
```json
"quantityMultiplier": {
  "fxLinkedNotionalSchedule": {
    "varyingNotionalCurrency": { "value": "USD" },
    "varyingNotionalFixingDates": {
      "periodMultiplier": -1,
      "dayType": "BUSINESS",
      "businessDayConvention": "PRECEDING"
    },
    "fxSpotRateSource": {
      "primarySource": {
        "sourceProvider": { "value": "BancoCentralChile" },
        "sourcePage": { "value": "Dólar Observado" }
      }
    }
  }
}
```

## Step 7 Updates: Economic Terms Dates & Complete Settlement ✅

### What We Added
1. **Master trade dates** at EconomicTerms level
2. **Complete settlement terms** with proper enum values
3. **CDM enum naming corrections**

#### 1. Master Trade Dates Pattern
**Discovery:** EconomicTerms level needs both effective and termination dates for proper trade structure:
```java
EconomicTerms.builder()
    .setEffectiveDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2025, 9, 15))
            .setDateAdjustments(businessDayAdjustments)
            .build())
        .build())
    .setTerminationDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2030, 9, 15))
            .setDateAdjustments(businessDayAdjustments)
            .build())
        .build())
    .build();
```

**Date Hierarchy Best Practice:**
- **EconomicTerms dates**: Master trade lifecycle (legal, booking, risk)
- **CalculationPeriodDates dates**: Operational cash flow calculations
- **Both should be populated** for complete CDM compliance

#### 2. Complete Settlement Terms Pattern
```java
SettlementTerms settlementTermsUSD = SettlementTerms.builder()
    .setSettlementCurrencyValue("USD")  // Settlement currency
    .setSettlementType(SettlementTypeEnum.CASH)  // Cash vs Physical
    .setTransferSettlementType(TransferSettlementEnum.PAYMENT_VERSUS_PAYMENT)  // PvP
    .build();
```

**Settlement Terms Enums:**
- **SettlementTypeEnum**: `CASH`, `PHYSICAL`, `ELECTION`, `CASH_OR_PHYSICAL`
- **TransferSettlementEnum**: `DELIVERY_VERSUS_DELIVERY`, `DELIVERY_VERSUS_PAYMENT`, `PAYMENT_VERSUS_PAYMENT`, `NOT_CENTRAL_SETTLEMENT`

#### 3. CDM Enum Naming Convention
**Critical Discovery:** CDM enums use **UPPER_SNAKE_CASE**, not CamelCase:

**Working Examples:**
- `InformationProviderEnum.BANCO_CENTRAL_CHILE` ✅
- `SettlementTypeEnum.CASH` ✅
- `TransferSettlementEnum.PAYMENT_VERSUS_PAYMENT` ✅

**Wrong Examples:**
- `InformationProviderEnum.BancoCentralChile` ❌
- `SettlementTypeEnum.Cash` ❌
- `TransferSettlementEnum.PaymentVersusPayment` ❌

#### 4. Why Leg-Level Settlement Makes Sense
**Key Insight:** Settlement terms at payout level enables:
- **Cross-currency flexibility**: Each leg can convert to different settlement currencies
- **Netting capability**: Both legs convert to USD, then net at trade level
- **Risk reduction**: PvP settlement reduces settlement risk

**Updated JSON Structure:**
```json
"settlementTerms": {
  "settlementType": "CASH",
  "transferSettlementType": "PAYMENT_VERSUS_PAYMENT",
  "settlementCurrency": { "value": "USD" }
}
```

## Next Steps

### Step 8: Reset Dates (Floating Leg)
- [ ] Reset frequency and timing
- [ ] Fixing dates relative to period
- [ ] Reset date adjustments

### Step 9: Complete Trade State
- [ ] TradeState wrapper
- [ ] State metadata
- [ ] Trade identifiers with assigned identifiers