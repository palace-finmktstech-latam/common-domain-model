# DetermineObservationPeriod

**Full Name:** `cdm.observable.asset.calculatedrate.functions.DetermineObservationPeriod`

**Package:** `cdm.observable.asset.calculatedrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| generateObservationPeriod | `GenerateObservationPeriod` |  |
| getAllBusinessCenters | `GetAllBusinessCenters` |  |

### Methods

#### Adder Methods

- `MapperS additionalBusinessDays(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`

#### Other Methods

- `MapperS shift(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`
- `CalculationPeriodBase evaluate(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`
- `CalculationPeriodBaseBuilder doEvaluate(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`
- `MapperS shiftDefaulted(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`
- `MapperC allBusinessDays(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`
- `MapperS businessDays(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`
- `MapperS obsShift(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`
- `MapperS lookback(CalculationPeriodBase arg0, FloatingRateCalculationParameters arg1)`

### Annotations

- **ImplementedBy**

