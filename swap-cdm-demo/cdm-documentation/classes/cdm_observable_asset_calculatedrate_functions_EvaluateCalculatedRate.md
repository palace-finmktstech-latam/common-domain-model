# EvaluateCalculatedRate

**Full Name:** `cdm.observable.asset.calculatedrate.functions.EvaluateCalculatedRate`

**Package:** `cdm.observable.asset.calculatedrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| applyAveragingFormula | `ApplyAveragingFormula` |  |
| applyCompoundingFormula | `ApplyCompoundingFormula` |  |
| generateObservationDatesAndWeights | `GenerateObservationDatesAndWeights` |  |
| indexValueObservationMultiple | `IndexValueObservationMultiple` |  |
| processObservations | `ProcessObservations` |  |
| yearFractionForOneDay | `YearFractionForOneDay` |  |

### Methods

#### Getter Methods

- `MapperS isCompounding(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`

#### Other Methods

- `FloatingRateSettingDetails evaluate(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperC observations(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `FloatingRateSettingDetailsBuilder doEvaluate(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperS calculationMethod(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperS rate(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperS yearFraction(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperC observationDates(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperC processedObservations(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperS calculationResults(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperS datesAndWeights(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`
- `MapperC weights(InterestRateIndex arg0, FloatingRateCalculationParameters arg1, ResetDates arg2, CalculationPeriodBase arg3, CalculationPeriodBase arg4, DayCountFractionEnum arg5)`

### Annotations

- **ImplementedBy**

