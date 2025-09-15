# EvaluateScreenRate

**Full Name:** `cdm.product.asset.floatingrate.functions.EvaluateScreenRate`

**Package:** `cdm.product.asset.floatingrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| determineFixingDate | `DetermineFixingDate` |  |
| determineResetDate | `DetermineResetDate` |  |
| indexValueObservation | `IndexValueObservation` |  |

### Methods

#### Other Methods

- `FloatingRateSettingDetails evaluate(FloatingRate arg0, ResetDates arg1, CalculationPeriodBase arg2)`
- `FloatingRateSettingDetailsBuilder doEvaluate(FloatingRate arg0, ResetDates arg1, CalculationPeriodBase arg2)`
- `MapperS observedRate(FloatingRate arg0, ResetDates arg1, CalculationPeriodBase arg2)`
- `MapperS resetDate(FloatingRate arg0, ResetDates arg1, CalculationPeriodBase arg2)`
- `MapperS fixingDate(FloatingRate arg0, ResetDates arg1, CalculationPeriodBase arg2)`

### Annotations

- **ImplementedBy**

