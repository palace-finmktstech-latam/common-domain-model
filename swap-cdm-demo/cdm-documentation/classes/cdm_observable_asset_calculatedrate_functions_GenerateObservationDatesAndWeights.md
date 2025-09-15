# GenerateObservationDatesAndWeights

**Full Name:** `cdm.observable.asset.calculatedrate.functions.GenerateObservationDatesAndWeights`

**Package:** `cdm.observable.asset.calculatedrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| computeCalculationPeriod | `ComputeCalculationPeriod` |  |
| determineObservationPeriod | `DetermineObservationPeriod` |  |
| generateObservationDates | `GenerateObservationDates` |  |
| generateWeightings | `GenerateWeightings` |  |
| getAllBusinessCenters | `GetAllBusinessCenters` |  |

### Methods

#### Other Methods

- `CalculatedRateObservationDatesAndWeights evaluate(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `CalculatedRateObservationDatesAndWeightsBuilder doEvaluate(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperC observationDates(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperC businessDays(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperS specifiedLockout(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperS lockoutDays(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperS calculateRelative(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperS observationPeriod(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperS adjustedCalculationPeriod(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperS lockout(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`
- `MapperS obsShift(FloatingRateCalculationParameters arg0, ResetDates arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3)`

### Annotations

- **ImplementedBy**

