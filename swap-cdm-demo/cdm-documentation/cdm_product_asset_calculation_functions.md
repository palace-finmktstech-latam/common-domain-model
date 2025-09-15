# Package: cdm.product.asset.calculation.functions

## Abstract Classes

### ApplyFloatingRateSetting
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `ApplyFloatingRateProcessing applyFloatingRateProcessing`
- `CalculateFloatingCashFlow calculateFloatingCashFlow`
- `DefaultFloatingRate defaultFloatingRate`
- `GetFloatingRateProcessingParameters getFloatingRateProcessingParameters`
- `GetNotionalAmount getNotionalAmount`

### CalculateFloatingCashFlow
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `CalculateYearFraction calculateYearFraction`

### CalculateYearFraction
**Implements:** `RosettaFunction` 

**Fields:**
- `PeriodsInYear periodsInYear0`
- `YearFraction yearFraction`

### Create_CalculationPeriodBase
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### DefaultFloatingRate
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### FixedAmountCalculation
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `CalculateYearFraction calculateYearFraction`
- `GetFixedRate getFixedRate`
- `GetNotionalAmount getNotionalAmount`

### FloatingAmountCalculation
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `ApplyFloatingRateSetting applyFloatingRateSetting`
- `DetermineFloatingRateReset determineFloatingRateReset`

### GetFixedRate
**Implements:** `RosettaFunction` 

**Fields:**
- `GetRateScheduleAmount getRateScheduleAmount`

### GetNotionalAmount
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`
- `GetQuantityScheduleStepValues getQuantityScheduleStepValues`

### GetQuantityScheduleStepValues
**Implements:** `RosettaFunction` 

## Concrete Classes

### ApplyFloatingRateSettingDefault
**Extends:** `ApplyFloatingRateSetting` 

### CalculateFloatingCashFlowDefault
**Extends:** `CalculateFloatingCashFlow` 

### CalculateYearFractionDefault
**Extends:** `CalculateYearFraction` 

### Create_CalculationPeriodBaseDefault
**Extends:** `Create_CalculationPeriodBase` 

### DefaultFloatingRateDefault
**Extends:** `DefaultFloatingRate` 

### FixedAmountCalculationDefault
**Extends:** `FixedAmountCalculation` 

### FloatingAmountCalculationDefault
**Extends:** `FloatingAmountCalculation` 

### GetFixedRateDefault
**Extends:** `GetFixedRate` 

### GetNotionalAmountDefault
**Extends:** `GetNotionalAmount` 

### GetQuantityScheduleStepValuesDefault
**Extends:** `GetQuantityScheduleStepValues` 

