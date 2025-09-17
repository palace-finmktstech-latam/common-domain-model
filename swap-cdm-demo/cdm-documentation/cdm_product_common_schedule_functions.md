# Package: cdm.product.common.schedule.functions

## Abstract Classes

### CalculationPeriod
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### CalculationPeriodRange
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### CalculationPeriods
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### PaymentDate
**Implements:** `RosettaFunction` 

### PeriodsInYear
**Implements:** `RosettaFunction` 

## Concrete Classes

### 

### AdjustableDateUtils

### CalculationPeriodDefault
**Extends:** `CalculationPeriod` 

### CalculationPeriodImpl
**Extends:** `CalculationPeriod` 

**Key Methods:**
- `getSchedule(CalculationPeriodDates arg0, LocalDate arg1, LocalDate arg2)` → `Schedule` [Getter]
- `getSchedulePeriod(CalculationPeriodDates arg0, Date arg1, LocalDate arg2, LocalDate arg3)` → `Optional` [Getter]
- `getDaysThatAreInLeapYear(SchedulePeriod arg0)` → `int` [Getter]

### CalculationPeriodRangeDefault
**Extends:** `CalculationPeriodRange` 

### CalculationPeriodRangeImpl
**Extends:** `CalculationPeriodRange` 

**Key Methods:**
- `getDaysThatAreInLeapYear(LocalDate arg0, LocalDate arg1)` → `int` [Getter]

### CalculationPeriodsDefault
**Extends:** `CalculationPeriods` 

### CalculationPeriodsImpl
**Extends:** `CalculationPeriods` 

**Key Methods:**
- `getSchedule(CalculationPeriodDates arg0, LocalDate arg1, LocalDate arg2)` → `Schedule` [Getter]
- `getCalcPeriod(SchedulePeriod arg0)` → `CalculationPeriodDataBuilder` [Getter]
- `getDaysThatAreInLeapYear(SchedulePeriod arg0)` → `int` [Getter]

### CdmToStrataMapper

### PaymentDateDefault
**Extends:** `PaymentDate` 

### PeriodsInYearDefault
**Extends:** `PeriodsInYear` 

