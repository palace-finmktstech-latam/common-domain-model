# Package: cdm.product.asset.functions

## Abstract Classes

### DividendCashSettlementAmount
**Implements:** `RosettaFunction` 

### ExtractFixedLeg
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### FixedAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `CalculationPeriod calculationPeriod0`
- `Create_CalculationPeriodBase create_CalculationPeriodBase`
- `FixedAmountCalculation fixedAmountCalculation`

### FloatingAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `CalculationPeriod calculationPeriod0`
- `Create_CalculationPeriodBase create_CalculationPeriodBase`
- `FloatingAmountCalculation floatingAmountCalculation`

### ResolveEquityInitialPrice
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### ResolvePerformancePeriodStartPrice
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `AdjustedValuationDates adjustedValuationDates0`
- `ResolveEquityInitialPrice resolveEquityInitialPrice`

### ResolveRateIndex
**Implements:** `RosettaFunction` 

## Concrete Classes

### DividendCashSettlementAmountDefault
**Extends:** `DividendCashSettlementAmount` 

### ExtractFixedLegDefault
**Extends:** `ExtractFixedLeg` 

### FixedAmountDefault
**Extends:** `FixedAmount` 

### FloatingAmountDefault
**Extends:** `FloatingAmount` 

### ResolveEquityInitialPriceDefault
**Extends:** `ResolveEquityInitialPrice` 

### ResolvePerformancePeriodStartPriceDefault
**Extends:** `ResolvePerformancePeriodStartPrice` 

### ResolveRateIndexDefault
**Extends:** `ResolveRateIndex` 

