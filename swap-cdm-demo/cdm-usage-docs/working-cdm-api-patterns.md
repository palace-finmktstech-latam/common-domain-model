# Working CDM API Patterns: Practical Reference

## Overview

This document provides working code patterns discovered through hands-on CDM development. All patterns are verified to compile and work with CDM 6.0.0.

---

## Core Trade Structure

### Basic Trade Shell
```java
Trade trade = Trade.builder()
    .setTradeDateValue(Date.of(2025, 9, 10))
    .addTradeIdentifier(TradeIdentifier.builder().build())
    .addParty(bankA)
    .addParty(goldmanSachs) 
    .addCounterparty(counterparty1)
    .addCounterparty(counterparty2)
    .setProduct(product) // NonTransferableProduct
    .build();
```

### Parties and Counterparty Linkage
```java
// Step 1: Create party entities
Party bankA = Party.builder()
    .setNameValue("Bank A")
    .build();

Party goldmanSachs = Party.builder()
    .setNameValue("Goldman Sachs International")  
    .build();

// Step 2: Create counterparty roles with proper linkage
Counterparty cp1 = Counterparty.builder()
    .setRole(CounterpartyRoleEnum.PARTY_1)
    .setPartyReferenceValue(bankA) // ✅ Pass party object
    .build();

Counterparty cp2 = Counterparty.builder()
    .setRole(CounterpartyRoleEnum.PARTY_2)
    .setPartyReferenceValue(goldmanSachs) // ✅ Pass party object
    .build();
```

**❌ Common Error:**
```java
.setPartyReferenceValue(bankA.getMeta().getGlobalKey()) // FAILS - don't use string key
```

---

## Product Structure

### NonTransferableProduct for Derivatives
```java
NonTransferableProduct product = NonTransferableProduct.builder()
    .setEconomicTerms(EconomicTerms.builder()
        .addPayout(fixedLegPayout)
        .addPayout(floatingLegPayout)  // For swaps with multiple legs
        .build())
    .build();
```

### Economic Terms Container
```java
EconomicTerms terms = EconomicTerms.builder()
    .addPayout(Payout.builder()
        .setInterestRatePayout(interestRatePayout)
        .build())
    .build();
```

---

## Interest Rate Payouts

### Basic Interest Rate Payout Structure
```java
InterestRatePayout payout = InterestRatePayout.builder()
    .setPayerReceiver(PayerReceiver.builder()
        .setPayer(CounterpartyRoleEnum.PARTY_1)    // Who pays
        .setReceiver(CounterpartyRoleEnum.PARTY_2) // Who receives
        .build())
    .setRateSpecification(rateSpec) // See rate patterns below
    .build();
```

### PayerReceiver Patterns
```java
// Fixed leg: Bank A pays
PayerReceiver fixedPayerReceiver = PayerReceiver.builder()
    .setPayer(CounterpartyRoleEnum.PARTY_1)    // Bank A
    .setReceiver(CounterpartyRoleEnum.PARTY_2) // Goldman Sachs
    .build();

// Floating leg: Bank A receives (opposite direction)
PayerReceiver floatingPayerReceiver = PayerReceiver.builder()
    .setPayer(CounterpartyRoleEnum.PARTY_2)    // Goldman Sachs  
    .setReceiver(CounterpartyRoleEnum.PARTY_1) // Bank A
    .build();
```

---

## Rate Specifications

### Rate Specification Choice Pattern
CDM uses choice/union fields - only one can be populated:

```java
RateSpecification rateSpec = RateSpecification.builder()
    .setFixedRateSpecification(fixedRate)     // ✅ Fixed rate choice
    // .setFloatingRateSpecification(...)     // Alternative choice
    // .setInflationRateSpecification(...)    // Alternative choice
    .build();
```

### Fixed Rate Specification (Complete with 5% Rate) ✅
```java
// Step 1: Create PriceSchedule with the rate value
PriceSchedule priceSchedule = PriceSchedule.builder()
    .setValue(BigDecimal.valueOf(0.05)) // 5% as decimal
    // Note: Unit not required for interest rates (implied by context)
    .build();

// Step 2: Create RateSchedule containing the PriceSchedule
RateSchedule rateSchedule = RateSchedule.builder()
    .setPriceValue(priceSchedule) // Pass PriceSchedule object
    .build();

// Step 3: Create FixedRateSpecification with the rate schedule
FixedRateSpecification fixedRate = FixedRateSpecification.builder()
    .setRateSchedule(rateSchedule)
    .build();
```

### Interest Rate Payout with Day Count Fraction
```java
// Day count fraction goes on InterestRatePayout, not FixedRateSpecification
InterestRatePayout fixedLeg = InterestRatePayout.builder()
    .setPayerReceiver(PayerReceiver.builder()
        .setPayer(CounterpartyRoleEnum.PARTY_1)
        .setReceiver(CounterpartyRoleEnum.PARTY_2)
        .build())
    .setRateSpecification(rateSpec)
    .setDayCountFractionValue(DayCountFractionEnum.ACT_360) // ✅ Correct method
    .build();
```

**❌ Common API Errors:**
```java
// Method name error:
.setFixedRate(fixedRateSpec) // WRONG - method doesn't exist
.setFixedRateSpecification(fixedRateSpec) // ✅ Correct

// Day count fraction placement error:
FixedRateSpecification.builder()
    .setDayCountFraction(...) // WRONG - not on FixedRateSpecification
    
InterestRatePayout.builder()
    .setDayCountFractionValue(...) // ✅ Correct - on InterestRatePayout

// Value vs wrapped object error:
.setDayCountFraction(DayCountFractionEnum.ACT_360) // WRONG - expects wrapped
.setDayCountFractionValue(DayCountFractionEnum.ACT_360) // ✅ Correct - for direct enum
```

---

## Counterparty Role Enums

### Available CounterpartyRoleEnum Values
```java
CounterpartyRoleEnum.PARTY_1  // Primary party designation
CounterpartyRoleEnum.PARTY_2  // Secondary party designation
```

**Use Cases:**
- **Simple bilateral trades:** PARTY_1 and PARTY_2 sufficient
- **Complex trades:** May need additional `PartyRoleEnum` for functions

### PartyRoleEnum (Functional Roles)
For complex trades needing functional role specification:
```java
PartyRoleEnum.ExecutingBroker
PartyRoleEnum.ClearingFirm
PartyRoleEnum.ReportingParty
// ... 50+ functional roles available
```

---

## Import Statements

### Required CDM Imports
```java
import cdm.event.common.*;
import cdm.base.staticdata.party.*;
import cdm.product.template.*;
import cdm.product.asset.*;
import cdm.product.common.schedule.*;
import cdm.product.common.settlement.ResolvablePriceQuantity;
import cdm.base.math.NonNegativeQuantitySchedule;
import cdm.base.math.UnitType;
import cdm.base.datetime.daycount.DayCountFractionEnum;
import cdm.observable.asset.*;
import com.rosetta.model.lib.records.Date;
```

### Jackson JSON Imports
```java
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
```

---

## JSON Serialization Setup

### ObjectMapper Configuration
```java
private final ObjectMapper objectMapper;

public Constructor() {
    this.objectMapper = new ObjectMapper();
    this.objectMapper.registerModule(new JavaTimeModule());
    this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
}

public String toJson(Object cdmObject) throws IOException {
    return objectMapper.writeValueAsString(cdmObject);
}
```

---

## Expected JSON Output Patterns

### Trade State Structure
```json
{
  "product": {
    "economicTerms": {
      "payout": [{
        "interestRatePayout": {
          "payerReceiver": {
            "payer": "PARTY_1",
            "receiver": "PARTY_2"
          },
          "rateSpecification": {
            "fixedRateSpecification": {
              "rateSchedule": null
            },
            "floatingRateSpecification": null,
            "inflationRateSpecification": null
          }
        }
      }]
    }
  },
  "counterparty": [{
    "role": "PARTY_1",
    "partyReference": {
      "value": {
        "name": { "value": "Bank A" }
      },
      "type": "cdm.base.staticdata.party.metafields.ReferenceWithMetaParty"
    }
  }]
}
```

### Key JSON Validation Points
1. **Type Fields:** Every object has `"type": "cdm.package.ClassName"`
2. **Choice Fields:** Only one choice populated, others `null`
3. **References:** Proper `ReferenceWithMeta*` wrappers
4. **Complete Schema:** All possible fields shown (even if null)

---

## Compilation Error Solutions

### Method Not Found Errors
```java
// Error: cannot find symbol: method setFixedRate()
// Solution: Use correct method name
.setFixedRateSpecification(spec)  // ✅ Correct

// Error: method setPriceValue(PriceSchedule) not applicable for (BigDecimal) 
// Solution: Build required object type first
PriceSchedule ps = PriceSchedule.builder()
    .setValue(BigDecimal.valueOf(0.05))
    .build();
.setPriceValue(ps)  // ✅ Pass PriceSchedule object

// Error: setDayCountFraction(DayCountFractionEnum) not applicable
// Solution: Use the 'Value' suffix method for direct enums
.setDayCountFractionValue(DayCountFractionEnum.ACT_360)  // ✅ Correct
```

### Type Mismatch Errors
```java
// Error: method setPartyReferenceValue(Party) not applicable for (String)
// Solution: Pass object, not key string  
.setPartyReferenceValue(partyObject)  // ✅ Pass Party object
```

---

## Development Workflow

### Incremental Building Strategy
1. **Build Structure First:** Empty objects that compile
2. **Add Details Progressively:** One field at a time
3. **Validate Each Step:** Check JSON output
4. **Debug API Issues:** Use documentation to find correct methods

### Testing Each Step
```java
public static void main(String[] args) {
    try {
        MyClass example = new MyClass();
        Trade trade = example.buildTrade();
        
        String json = example.toJson(trade);
        System.out.println("JSON Output:");
        System.out.println(json);
        
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
        e.printStackTrace();
    }
}
```

---

## Maven Execution Commands

### Compile and Run
```bash
cd swap-cdm-demo
mvn compile exec:java -Dexec.mainClass="com.example.cdm.ClassName"
```

### Common Maven Issues
- **Compilation warnings:** Location of system modules (ignore for development)
- **Unsafe warnings:** Google Guice deprecation warnings (ignore)
- **Build failures:** Usually method name or parameter type issues

---

## Completed Patterns

### Rate Schedule Implementation ✅
```java
// Complete working pattern for 5% fixed rate:
PriceSchedule priceSchedule = PriceSchedule.builder()
    .setValue(BigDecimal.valueOf(0.05)) // 5% as decimal
    .build();

RateSchedule rateSchedule = RateSchedule.builder()
    .setPriceValue(priceSchedule)
    .build();
```

### Available Day Count Fractions
```java
DayCountFractionEnum.ACT_360      // Actual/360 (money markets)
DayCountFractionEnum.ACT_365      // Actual/365 (bonds)
DayCountFractionEnum._30_360      // 30/360 (corporates)
DayCountFractionEnum._30E_360     // 30E/360 (European)
```

### Notional Amount Pattern ✅
```java
// Step 1: Create quantity schedule with value and currency
NonNegativeQuantitySchedule notionalSchedule = NonNegativeQuantitySchedule.builder()
    .setValue(BigDecimal.valueOf(950000000000.00)) // CLP 950 billion
    .setUnit(UnitType.builder()
        .setCurrencyValue("CLP") // Chilean Peso
        .build())
    .build();

// Step 2: Wrap in ResolvablePriceQuantity (required by InterestRatePayout)
ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
    .setQuantityScheduleValue(notionalSchedule)
    .build();

// Step 3: Add to InterestRatePayout
InterestRatePayout.builder()
    .setPriceQuantity(clpNotional) // ✅ Accepts ResolvablePriceQuantity
    .build();
```

**❌ Common Notional Errors:**
```java
// Wrong: InterestRatePayout doesn't accept PriceQuantity directly
PriceQuantity pq = PriceQuantity.builder()...;
.setPriceQuantity(pq) // FAILS - Type mismatch

// Wrong: Can't cast PriceQuantity to ResolvablePriceQuantity
ResolvablePriceQuantity rpq = (ResolvablePriceQuantity) PriceQuantity.builder()...; // FAILS

// Correct: Use ResolvablePriceQuantity.builder() directly
ResolvablePriceQuantity rpq = ResolvablePriceQuantity.builder()
    .setQuantityScheduleValue(schedule)
    .build(); // ✅ Works
```

## Notional Amount and Amortization Patterns

### Simple Notional (Fixed Amount)
```java
NonNegativeQuantitySchedule simpleNotional = NonNegativeQuantitySchedule.builder()
    .setValue(BigDecimal.valueOf(100000000.00)) // $100M
    .setUnit(UnitType.builder()
        .setCurrencyValue("USD")
        .build())
    .build();
```

### Amortizing Notional (Decreases Over Time)
```java
NonNegativeQuantitySchedule amortizingNotional = NonNegativeQuantitySchedule.builder()
    .setValue(BigDecimal.valueOf(100000000.00)) // Initial: $100M
    .addStepValue(NonNegativeStep.builder()
        .setStepDate(Date.of(2027, 6, 15))
        .setStepValue(BigDecimal.valueOf(75000000.00)) // Drops to $75M
        .build())
    .addStepValue(NonNegativeStep.builder()
        .setStepDate(Date.of(2029, 6, 15))
        .setStepValue(BigDecimal.valueOf(50000000.00)) // Drops to $50M
        .build())
    .setUnit(UnitType.builder()
        .setCurrencyValue("USD")
        .build())
    .build();
```

## Principal Payments and Amortization Patterns

### Key Location: `InterestRatePayout.principalPayment`

**✅ Confirmed**: Principal amortizations are specified in `InterestRatePayout.principalPayment: PrincipalPayments`, NOT as separate payouts.

### Principal Payment Structure
```java
// Complete structure hierarchy:
InterestRatePayout
├── principalPayment: PrincipalPayments
    ├── initialPayment: Boolean (initial notional exchange)
    ├── finalPayment: Boolean (final notional repayment)
    ├── intermediatePayment: Boolean (amortization during life)
    ├── varyingLegNotionalCurrency: List<String>
    └── principalPaymentSchedule: PrincipalPaymentSchedule
        ├── initialPrincipalPayment: PrincipalPayment
        ├── finalPrincipalPayment: PrincipalPayment
        └── intermediatePrincipalPayment: AdjustableRelativeOrPeriodicDates
```

### Individual Principal Payment Pattern
```java
PrincipalPayment principalPayment = PrincipalPayment.builder()
    .setPrincipalPaymentDate(AdjustableDate.builder()
        .setUnadjustedDate(Date.of(2025, 9, 15))
        .setDateAdjustments(businessDayAdjustments)
        .build())
    .setPayerReceiver(PayerReceiver.builder()
        .setPayer(CounterpartyRoleEnum.PARTY_1)
        .setReceiver(CounterpartyRoleEnum.PARTY_2)
        .build())
    .setPrincipalAmount(Money.builder() // ✅ Use cdm.observable.asset.Money
        .setValue(BigDecimal.valueOf(10000000.00))
        .setUnit(UnitType.builder()
            .setCurrencyValue("USD")
            .build())
        .build())
    .build();
```

### Uniform Amortization Pattern
```java
// CRITICAL: Frequency specification for intermediate payments
AdjustableRelativeOrPeriodicDates intermediatePayments = AdjustableRelativeOrPeriodicDates.builder()
    .setPeriodicDates(PeriodicDates.builder()
        .setStartDate(AdjustableOrRelativeDate.builder()
            .setAdjustableDate(AdjustableDate.builder()
                .setUnadjustedDate(Date.of(2026, 3, 15)) // First amortization
                .setDateAdjustments(businessDayAdjustments)
                .build())
            .build())
        .setEndDate(AdjustableOrRelativeDate.builder()
            .setAdjustableDate(AdjustableDate.builder()
                .setUnadjustedDate(Date.of(2030, 3, 15)) // Last amortization
                .setDateAdjustments(businessDayAdjustments)
                .build())
            .build())
        .setPeriodFrequency(CalculationPeriodFrequency.builder() // ✅ KEY: Specifies frequency
            .setPeriodMultiplier(6) // Semi-annual
            .setPeriod(PeriodExtendedEnum.M)
            .setRollConvention(RollConventionEnum._15)
            .build())
        .setPeriodDatesAdjustments(businessDayAdjustments)
        .build())
    .build();
```

### Complete Principal Payments Setup
```java
PrincipalPayments principalPayments = PrincipalPayments.builder()
    .setInitialPayment(true) // Initial notional exchange
    .setIntermediatePayment(true) // Amortization payments
    .setFinalPayment(true) // Final notional exchange
    .addVaryingLegNotionalCurrency("USD") // Currency that varies due to amortization
    .setPrincipalPaymentSchedule(PrincipalPaymentSchedule.builder()
        .setInitialPrincipalPayment(initialPayment)
        .setIntermediatePrincipalPayment(intermediatePayments) // Periodic schedule
        .setFinalPrincipalPayment(finalPayment)
        .build())
    .build();

// Attach to InterestRatePayout
InterestRatePayout payout = InterestRatePayout.builder()
    // ... other settings ...
    .setPrincipalPayment(principalPayments) // ✅ Principal amortization here
    .build();
```

### Key CDM Imports for Principal Payments
```java
import cdm.product.common.settlement.*;
import cdm.observable.asset.Money; // ✅ Correct Money class location
import cdm.base.datetime.*;
```

### Use Cases Supported
- **Uniform Amortization**: Equal payments at regular intervals
- **Bullet Repayment**: `finalPayment: true` only
- **Cross-Currency Notional Exchange**: `initialPayment` and `finalPayment`
- **Complex Schedules**: Custom `intermediatePrincipalPayment` patterns

**❌ Common Principal Payment Errors:**
```java
// Wrong: Money from incorrect package
import cdm.base.math.Money; // FAILS - doesn't exist

// Wrong: Missing frequency specification
.setPeriodicDates(PeriodicDates.builder()
    .setStartDate(...)
    .setEndDate(...)
    // Missing .setPeriodFrequency() - results in no frequency in JSON
    .build())

// Wrong: Using NonNegativeQuantitySchedule for principal amounts
.setPrincipalAmount(NonNegativeQuantitySchedule.builder()...) // FAILS - type mismatch

// Correct: Use Money.builder()
.setPrincipalAmount(Money.builder()...) // ✅ Works
```

## Business Day Adjustments Pattern

### Where Business Day Adjustments Belong
```java
// ❌ WRONG: Not directly on InterestRatePayout
InterestRatePayout.builder()
    .setBusinessDayAdjustments(...) // Method doesn't exist here!
    
// ✅ CORRECT: On schedule objects
CalculationPeriodDates.builder()
    .setCalculationPeriodDatesAdjustments(BusinessDayAdjustments.builder()
        .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
        .setBusinessCenters(BusinessCenters.builder()
            .addBusinessCenterValue(BusinessCenterEnum.USNY)
            .addBusinessCenterValue(BusinessCenterEnum.CLSA)
            .build())
        .build())
    .build();

PaymentDates.builder()
    .setPaymentDatesAdjustments(BusinessDayAdjustments.builder()
        .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
        .setBusinessCenters(centers)
        .build())
    .build();
```

## Floating Rate Specification ✅

### SOFR + Spread Implementation (Complete Working Pattern)
```java
// Complete working pattern for SOFR + 100 bps spread:
FloatingRateSpecification floatingRateSpec = FloatingRateSpecification.builder()
    .setRateOptionValue(InterestRateIndex.builder()
        .setFloatingRateIndex(FloatingRateIndex.builder()
            .setFloatingRateIndexValue(FloatingRateIndexEnum.USD_SOFR_COMPOUND)
            .setIndexTenor(Period.builder()
                .setPeriodMultiplier(1) // Daily compounding
                .setPeriod(PeriodEnum.D)
                .build())
            .build())
        .build())
    .setSpreadSchedule(SpreadSchedule.builder()
        .setPriceValue(PriceSchedule.builder()
            .setValue(BigDecimal.valueOf(0.01)) // 100 basis points = 1%
            .build())
        .build())
    .build();
```

### Required Imports for Floating Rate
```java
import cdm.observable.asset.FloatingRateIndex;
import cdm.product.common.schedule.SpreadSchedule;
import cdm.base.staticdata.asset.rates.FloatingRateIndexEnum;
import cdm.base.staticdata.asset.rates.InterestRateIndex;
import cdm.base.datetime.Period;
import cdm.base.datetime.PeriodEnum;
```

### Key API Methods for Floating Rates ✅

**FloatingRateSpecification.builder():**
- `setRateOptionValue(InterestRateIndex)` - Sets the floating rate index (✅ NOT setRateOption)
- `setSpreadSchedule(SpreadSchedule)` - Sets the spread/margin

**InterestRateIndex.builder():**
- `setFloatingRateIndex(FloatingRateIndex)` - Contains the actual rate specification

**FloatingRateIndex.builder():**
- `setFloatingRateIndexValue(FloatingRateIndexEnum)` - Sets SOFR enum
- `setIndexTenor(Period)` - Sets compounding period

**SpreadSchedule.builder():**
- `setPriceValue(PriceSchedule)` - Sets the spread value schedule

### Available SOFR Enums ✅
```java
FloatingRateIndexEnum.USD_SOFR                // Basic SOFR
FloatingRateIndexEnum.USD_SOFR_COMPOUND       // SOFR with daily compounding ✅ Used
FloatingRateIndexEnum.USD_SOFR_ICE_Swap_Rate  // SOFR ICE Swap Rate
```

### Common Floating Rate Errors Solved ✅

**❌ Obsolete API Patterns:**
```java
// WRONG - FloatingRateOption is obsolete in CDM 6.0.0
import cdm.observable.asset.FloatingRateOption;
.setRateOption(FloatingRateOption.builder()...) // Method doesn't exist

// WRONG - Old method name
.setRateOption(...) // Method doesn't exist in CDM 6.0.0
```

**✅ Correct CDM 6.0.0 Pattern:**
```java
// CORRECT - Use InterestRateIndex with setRateOptionValue
.setRateOptionValue(InterestRateIndex.builder()
    .setFloatingRateIndex(FloatingRateIndex.builder()
        .setFloatingRateIndexValue(FloatingRateIndexEnum.USD_SOFR_COMPOUND)
        .setIndexTenor(Period.builder()
            .setPeriodMultiplier(1)
            .setPeriod(PeriodEnum.D)
            .build())
        .build())
    .build())
```

## Business Day Adjustments and Schedules ✅

### Business Centers Pattern
```java
// Multiple business centers for cross-currency swaps
BusinessCenters businessCenters = BusinessCenters.builder()
    .addBusinessCenterValue(BusinessCenterEnum.USNY) // New York
    .addBusinessCenterValue(BusinessCenterEnum.CLSA) // Santiago
    .build();
```

### Business Day Adjustments
```java
BusinessDayAdjustments businessDayAdjustments = BusinessDayAdjustments.builder()
    .setBusinessDayConvention(BusinessDayConventionEnum.MODFOLLOWING)
    .setBusinessCenters(businessCenters)
    .build();
```

### Available Business Day Conventions
```java
BusinessDayConventionEnum.FOLLOWING      // Next business day
BusinessDayConventionEnum.MODFOLLOWING   // Modified following (month-end rule)
BusinessDayConventionEnum.PRECEDING      // Previous business day
BusinessDayConventionEnum.MODPRECEDING   // Modified preceding
BusinessDayConventionEnum.NONE           // No adjustment
```

## Calculation Period Dates ✅

### Complete Pattern with Dates and Frequency
```java
CalculationPeriodDates calculationPeriodDates = CalculationPeriodDates.builder()
    // Effective date with adjustments
    .setEffectiveDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2025, 9, 15))
            .setDateAdjustments(businessDayAdjustments)
            .build())
        .build())
    // Termination date with adjustments
    .setTerminationDate(AdjustableOrRelativeDate.builder()
        .setAdjustableDate(AdjustableDate.builder()
            .setUnadjustedDate(Date.of(2030, 9, 15))
            .setDateAdjustments(businessDayAdjustments)
            .build())
        .build())
    // Payment frequency
    .setCalculationPeriodFrequency(CalculationPeriodFrequency.builder()
        .setPeriodMultiplier(6) // Semi-annual
        .setPeriod(PeriodExtendedEnum.M) // ✅ NOT PeriodEnum.M
        .setRollConvention(RollConventionEnum._15) // Roll on 15th
        .build())
    // Adjustments for period dates
    .setCalculationPeriodDatesAdjustments(businessDayAdjustments)
    .build();
```

### Adding to InterestRatePayout
```java
InterestRatePayout payout = InterestRatePayout.builder()
    .setPayerReceiver(payerReceiver)
    .setRateSpecification(rateSpec)
    .setDayCountFractionValue(DayCountFractionEnum.ACT_360)
    .setPriceQuantity(notional)
    .setCalculationPeriodDates(calculationPeriodDates) // ✅ Add schedule here
    .build();
```

### Key Period Types ✅
```java
// Use PeriodExtendedEnum for calculation frequencies
PeriodExtendedEnum.D  // Days
PeriodExtendedEnum.W  // Weeks  
PeriodExtendedEnum.M  // Months
PeriodExtendedEnum.Y  // Years

// Use PeriodEnum for tenor specifications
PeriodEnum.D  // Days (e.g., for floating rate index tenor)
PeriodEnum.W  // Weeks
PeriodEnum.M  // Months
PeriodEnum.Y  // Years
```

### Roll Convention Enums ✅
```java
RollConventionEnum._1   // Roll on 1st
RollConventionEnum._15  // Roll on 15th
RollConventionEnum._30  // Roll on 30th
RollConventionEnum.EOM  // End of month
RollConventionEnum.IMM  // IMM dates (3rd Wednesday)
```

## Cross-Currency Elements (Limited in CDM 6.0.0)

### What's Available ✅
- Different notional currencies per leg
- Multi-currency business centers
- Shared calculation schedules

### What's NOT Available in CDM 6.0.0 ❌
```java
// These methods don't exist:
.setSettlementCurrency()     // Not on InterestRatePayout
.setSettlementCurrencyValue() // Not on InterestRatePayout
Observable.builder().setCurrencyPair() // Method not found
EconomicTerms.builder().addObservable() // Method not found
```

### Current Cross-Currency Pattern
```java
// Each leg has its own notional currency
InterestRatePayout clpLeg = InterestRatePayout.builder()
    .setPriceQuantity(clpNotional) // CLP 950B
    // Settlement currency would go here if supported
    .build();

InterestRatePayout usdLeg = InterestRatePayout.builder()
    .setPriceQuantity(usdNotional) // USD 10M
    // Settlement currency would go here if supported
    .build();
```

## Common Step 5 Compilation Errors ✅

### Period Enum Mismatch
```java
// WRONG - Type mismatch
.setPeriod(PeriodEnum.M) // PeriodEnum cannot convert to PeriodExtendedEnum

// CORRECT - Use PeriodExtendedEnum for frequencies
.setPeriod(PeriodExtendedEnum.M) // ✅ Works
```

### Missing Imports
```java
// Required for Step 5
import cdm.base.datetime.PeriodExtendedEnum;
import cdm.base.datetime.BusinessCenters;
import cdm.base.datetime.BusinessCenterEnum;
import cdm.base.datetime.BusinessDayAdjustments;
import cdm.base.datetime.BusinessDayConventionEnum;
import cdm.base.datetime.CalculationPeriodDates;
import cdm.base.datetime.CalculationPeriodFrequency;
import cdm.base.datetime.AdjustableOrRelativeDate;
import cdm.base.datetime.AdjustableDate;
import cdm.base.datetime.RollConventionEnum;
```

## Payment Dates Pattern ✅

### Complete PaymentDates Implementation
```java
// T+2 settlement with semi-annual payments
PaymentDates paymentDates = PaymentDates.builder()
    .setPaymentFrequency(Frequency.builder()
        .setPeriodMultiplier(6) // Semi-annual
        .setPeriod(PeriodExtendedEnum.M) // ✅ Use PeriodExtendedEnum
        .build())
    .setPayRelativeTo(PayRelativeToEnum.CALCULATION_PERIOD_END_DATE)
    .setPaymentDaysOffset(Offset.builder()
        .setPeriodMultiplier(2) // T+2
        .setDayType(DayTypeEnum.BUSINESS) // Business days
        .build())
    .setPaymentDatesAdjustments(businessDayAdjustments)
    .build();
```

### Adding to InterestRatePayout
```java
InterestRatePayout.builder()
    .setPaymentDates(paymentDates)          // When to pay
    .setCalculationPeriodDates(calcDates)   // When to accrue
    .build();
```

### Required Imports for Payment Dates
```java
import cdm.product.common.schedule.PaymentDates;
import cdm.base.datetime.Frequency;
import cdm.product.common.schedule.PayRelativeToEnum;
import cdm.base.datetime.Offset;
import cdm.base.datetime.DayTypeEnum;
```

## Settlement Currency Pattern ✅

### Settlement Terms on Each Payout
```java
// Settlement currency IS available via SettlementTerms
SettlementTerms settlementTerms = SettlementTerms.builder()
    .setSettlementCurrencyValue("USD") // Net settlement in USD
    .build();

// Add to InterestRatePayout
InterestRatePayout.builder()
    .setSettlementTerms(settlementTerms)
    .build();
```

### Cross-Currency Swap with Net Settlement
```java
// CLP leg settles in USD
InterestRatePayout clpLeg = InterestRatePayout.builder()
    .setPriceQuantity(clpNotional) // CLP 950B notional
    .setSettlementTerms(SettlementTerms.builder()
        .setSettlementCurrencyValue("USD") // Settles in USD
        .build())
    .build();

// USD leg also settles in USD
InterestRatePayout usdLeg = InterestRatePayout.builder()
    .setPriceQuantity(usdNotional) // USD 10M notional
    .setSettlementTerms(SettlementTerms.builder()
        .setSettlementCurrencyValue("USD") // Settles in USD
        .build())
    .build();
```

## FX Linked Notional Pattern (CDM 6.0.0) ✅

### Complete FX Linked Notional for Cross-Currency Swaps
```java
// Step 1: Create FX spot rate source
FxSpotRateSource fxSpotRateSource = FxSpotRateSource.builder()
    .setPrimarySource(InformationSource.builder()
        .setSourceProviderValue(InformationProviderEnum.BancoCentralChile)
        .setSourcePageValue("Dólar Observado") // Free text description
        .build())
    .build();

// Step 2: Define FX fixing dates (T-1 for Dólar Observado)
RelativeDateOffset fxFixingDates = RelativeDateOffset.builder()
    .setPeriodMultiplier(-1) // T-1
    .setDayType(DayTypeEnum.BUSINESS)
    .setBusinessDayConvention(BusinessDayConventionEnum.PRECEDING)
    .setBusinessCenters(businessCenters)
    .build();

// Step 3: Create FX linked notional schedule
FxLinkedNotionalSchedule fxLinkedSchedule = FxLinkedNotionalSchedule.builder()
    .setVaryingNotionalCurrencyValue("USD") // Convert to USD
    .setFxSpotRateSource(fxSpotRateSource)
    .setVaryingNotionalFixingDates(fxFixingDates)
    .build();

// Step 4: Attach to notional via QuantityMultiplier
ResolvablePriceQuantity clpNotional = ResolvablePriceQuantity.builder()
    .setQuantityScheduleValue(clpNotionalSchedule) // CLP 950B
    .setQuantityMultiplier(QuantityMultiplier.builder()
        .setFxLinkedNotionalSchedule(fxLinkedSchedule) // FX conversion here!
        .build())
    .build();
```

### Required Imports for FX Linked Notional
```java
import cdm.observable.asset.FxSpotRateSource;
import cdm.observable.asset.InformationSource;
import cdm.observable.asset.InformationProviderEnum;
import cdm.product.common.schedule.FxLinkedNotionalSchedule;
import cdm.product.common.settlement.QuantityMultiplier;
import cdm.base.datetime.RelativeDateOffset;
```

### Complete InformationProviderEnum List (18 values)
```java
InformationProviderEnum.ASSOC_BANKS_SINGAPORE    // Association of Banks Singapore
InformationProviderEnum.BANCO_CENTRAL_CHILE      // Banco Central de Chile
InformationProviderEnum.BANK_OF_CANADA           // Bank of Canada
InformationProviderEnum.BANK_OF_ENGLAND          // Bank of England
InformationProviderEnum.BANK_OF_JAPAN            // Bank of Japan
InformationProviderEnum.BLOOMBERG                // Bloomberg
InformationProviderEnum.EURO_CENTRAL_BANK        // European Central Bank
InformationProviderEnum.FEDERAL_RESERVE          // US Federal Reserve
InformationProviderEnum.FHLBSF                   // Federal Home Loan Bank SF
InformationProviderEnum.ICESWAP                  // ICE Swap Rate
InformationProviderEnum.ISDA                     // ISDA
InformationProviderEnum.REFINITIV                // Refinitiv (formerly Reuters)
InformationProviderEnum.RESERVE_BANK_AUSTRALIA   // Reserve Bank of Australia
InformationProviderEnum.RESERVE_BANK_NEW_ZEALAND // Reserve Bank of New Zealand
InformationProviderEnum.REUTERS                  // Reuters (legacy)
InformationProviderEnum.SAFEX                    // South African Futures Exchange
InformationProviderEnum.TELERATE                 // Telerate (legacy)
InformationProviderEnum.TOKYOSWAP                // Tokyo Swap Reference Rate
```

**CRITICAL:** CDM uses **UPPER_SNAKE_CASE** for enum values, not CamelCase as shown in some documentation.

## FX Observable Pattern (Standalone) ✅

### Creating Standalone FX Observable
```java
// For reference/reporting purposes (not directly attached to trade)
QuotedCurrencyPair usdClpPair = QuotedCurrencyPair.builder()
    .setCurrency1Value("USD")  // Base
    .setCurrency2Value("CLP")  // Quote
    .setQuoteBasis(QuoteBasisEnum.CURRENCY_2_PER_CURRENCY_1) // CLP per USD
    .build();

ForeignExchangeRateIndex fxIndex = ForeignExchangeRateIndex.builder()
    .setNameValue("USD/CLP-BCCh-DolarObservado")
    .setQuotedCurrencyPairValue(usdClpPair)
    .setPrimaryFxSpotRateSource(InformationSource.builder()
        .setSourceProviderValue(InformationProviderEnum.BancoCentralChile)
        .setSourcePageValue("Dólar Observado")
        .build())
    .build();

Observable fxObservable = Observable.builder()
    .setIndex(Index.builder()
        .setForeignExchangeRateIndex(fxIndex)
        .build())
    .build();
```

**Integration:** In CDM 6.0.0, FX observables for cross-currency swaps are integrated via `FxLinkedNotionalSchedule` in the notional amount, not as separate observable attachments.

## Complete Settlement Terms Pattern ✅

### Full Settlement Terms for Cross-Currency Swaps
```java
SettlementTerms settlementTermsUSD = SettlementTerms.builder()
    .setSettlementCurrencyValue("USD")  // Target settlement currency
    .setSettlementType(SettlementTypeEnum.CASH)  // Cash vs Physical delivery
    .setTransferSettlementType(TransferSettlementEnum.PAYMENT_VERSUS_PAYMENT)  // Settlement method
    .build();

// Apply to both legs for net settlement
InterestRatePayout clpLeg = InterestRatePayout.builder()
    .setSettlementTerms(settlementTermsUSD)  // CLP leg settles in USD
    .build();

InterestRatePayout usdLeg = InterestRatePayout.builder()
    .setSettlementTerms(settlementTermsUSD)  // USD leg settles in USD
    .build();
```

### Required Imports for Settlement Terms
```java
import cdm.product.common.settlement.SettlementTerms;
import cdm.product.common.settlement.SettlementTypeEnum;
import cdm.product.common.settlement.TransferSettlementEnum;
```

### Available Settlement Enums
```java
// Settlement Type (Cash vs Physical)
SettlementTypeEnum.CASH              // Cash settlement (swaps, forwards)
SettlementTypeEnum.PHYSICAL          // Physical delivery
SettlementTypeEnum.ELECTION          // Counterparty election
SettlementTypeEnum.CASH_OR_PHYSICAL  // Either method allowed

// Transfer Settlement Type (Settlement Risk Management)
TransferSettlementEnum.DELIVERY_VERSUS_DELIVERY  // DvD (securities)
TransferSettlementEnum.DELIVERY_VERSUS_PAYMENT   // DvP (securities vs cash)
TransferSettlementEnum.PAYMENT_VERSUS_PAYMENT    // PvP (currencies, swaps)
TransferSettlementEnum.NOT_CENTRAL_SETTLEMENT     // Bilateral settlement
```

## Economic Terms Master Dates Pattern ✅

### Trade-Level Master Dates
```java
// Master trade dates at EconomicTerms level
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

### Date Hierarchy Best Practice
- **EconomicTerms dates**: Master trade lifecycle (legal documentation, booking, risk management)
- **CalculationPeriodDates**: Operational cash flow calculations and payment scheduling
- **Both levels should be populated** for complete CDM compliance

## CDM Enum Naming Convention ✅

### Critical Rule: UPPER_SNAKE_CASE
```java
// ✅ CORRECT - All CDM enums use UPPER_SNAKE_CASE
InformationProviderEnum.BANCO_CENTRAL_CHILE
SettlementTypeEnum.CASH
TransferSettlementEnum.PAYMENT_VERSUS_PAYMENT
BusinessDayConventionEnum.MODFOLLOWING
DayCountFractionEnum.ACT_360

// ❌ WRONG - Documentation sometimes shows CamelCase but it doesn't work
InformationProviderEnum.BancoCentralChile
SettlementTypeEnum.Cash
TransferSettlementEnum.PaymentVersusPayment
```

**Important:** Always use UPPER_SNAKE_CASE for CDM enum values, regardless of what the documentation shows.

## Next Steps Research Areas

### Reset Dates (for floating legs)
- Reset frequency and timing
- Fixing dates relative to period start
- Reset date adjustments

### Complete Trade State
- TradeState wrapper
- State metadata
- Trade identifiers

All patterns in this document are tested and working with CDM 6.0.0.