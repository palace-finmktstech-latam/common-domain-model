# ComputeCalculationPeriodFIXING_DATE

**Full Name:** `cdm.observable.asset.calculatedrate.functions.ComputeCalculationPeriod$ComputeCalculationPeriodFIXING_DATE`

**Package:** `cdm.observable.asset.calculatedrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| addBusinessDays | `AddBusinessDays` |  |
| getAllBusinessCenters | `GetAllBusinessCenters` |  |

### Methods

#### Getter Methods

- `MapperS isStart(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`

#### Other Methods

- `CalculationPeriodBase evaluate(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`
- `MapperS startDate(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`
- `MapperS endDate(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`
- `CalculationPeriodBaseBuilder doEvaluate(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`
- `MapperS resetRelativeTo(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`
- `MapperC businessCenters(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`
- `MapperS fixingOffsetDays(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`
- `MapperS calcPd(CalculationPeriodBase arg0, CalculationPeriodBase arg1, ObservationPeriodDatesEnum arg2, ResetDates arg3)`

### Annotations

- **ImplementedBy**

