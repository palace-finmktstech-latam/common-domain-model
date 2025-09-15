# DetermineWeightingDates

**Full Name:** `cdm.observable.asset.calculatedrate.functions.DetermineWeightingDates`

**Package:** `cdm.observable.asset.calculatedrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| appendDateToList | `AppendDateToList` |  |
| generateObservationDates | `GenerateObservationDates` |  |
| getAllBusinessCenters | `GetAllBusinessCenters` |  |

### Methods

#### Other Methods

- `List evaluate(FloatingRateCalculationParameters arg0, List arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3, Integer arg4)`
- `List doEvaluate(FloatingRateCalculationParameters arg0, List arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3, Integer arg4)`
- `MapperC businessCenters(FloatingRateCalculationParameters arg0, List arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3, Integer arg4)`
- `MapperC weightingDatesAll(FloatingRateCalculationParameters arg0, List arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3, Integer arg4)`
- `MapperC baseWeightingDates(FloatingRateCalculationParameters arg0, List arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3, Integer arg4)`
- `MapperS obsShift(FloatingRateCalculationParameters arg0, List arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3, Integer arg4)`
- `MapperS lookback(FloatingRateCalculationParameters arg0, List arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3, Integer arg4)`
- `MapperS wtPeriod(FloatingRateCalculationParameters arg0, List arg1, CalculationPeriodBase arg2, CalculationPeriodBase arg3, Integer arg4)`

### Annotations

- **ImplementedBy**

