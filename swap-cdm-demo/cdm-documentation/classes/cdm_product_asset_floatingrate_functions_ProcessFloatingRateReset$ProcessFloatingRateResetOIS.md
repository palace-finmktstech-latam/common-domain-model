# ProcessFloatingRateResetOIS

**Full Name:** `cdm.product.asset.floatingrate.functions.ProcessFloatingRateReset$ProcessFloatingRateResetOIS`

**Package:** `cdm.product.asset.floatingrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| evaluateCalculatedRate | `EvaluateCalculatedRate` |  |
| getCalculatedFROCalculationParameters | `GetCalculatedFROCalculationParameters` |  |

### Methods

#### Other Methods

- `FloatingRateSettingDetails evaluate(InterestRatePayout arg0, CalculationPeriodBase arg1, FloatingRateIndexProcessingTypeEnum arg2)`
- `FloatingRateSettingDetailsBuilder doEvaluate(InterestRatePayout arg0, CalculationPeriodBase arg1, FloatingRateIndexProcessingTypeEnum arg2)`
- `MapperS resetDates(InterestRatePayout arg0, CalculationPeriodBase arg1, FloatingRateIndexProcessingTypeEnum arg2)`
- `MapperS rateDef(InterestRatePayout arg0, CalculationPeriodBase arg1, FloatingRateIndexProcessingTypeEnum arg2)`
- `MapperS dayCount(InterestRatePayout arg0, CalculationPeriodBase arg1, FloatingRateIndexProcessingTypeEnum arg2)`
- `MapperS calcParams(InterestRatePayout arg0, CalculationPeriodBase arg1, FloatingRateIndexProcessingTypeEnum arg2)`
- `MapperS fro(InterestRatePayout arg0, CalculationPeriodBase arg1, FloatingRateIndexProcessingTypeEnum arg2)`

### Annotations

- **ImplementedBy**

