# ApplyFloatingRateSetting

**Full Name:** `cdm.product.asset.calculation.functions.ApplyFloatingRateSetting`

**Package:** `cdm.product.asset.calculation.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| applyFloatingRateProcessing | `ApplyFloatingRateProcessing` |  |
| calculateFloatingCashFlow | `CalculateFloatingCashFlow` |  |
| defaultFloatingRate | `DefaultFloatingRate` |  |
| getFloatingRateProcessingParameters | `GetFloatingRateProcessingParameters` |  |
| getNotionalAmount | `GetNotionalAmount` |  |

### Methods

#### Other Methods

- `FloatingAmountCalculationDetails evaluate(InterestRatePayout arg0, CalculationPeriodBase arg1, Boolean arg2, BigDecimal arg3, BigDecimal arg4, FloatingRateSettingDetails arg5)`
- `MapperS currency(InterestRatePayout arg0, CalculationPeriodBase arg1, Boolean arg2, BigDecimal arg3, BigDecimal arg4, FloatingRateSettingDetails arg5)`
- `FloatingAmountCalculationDetailsBuilder doEvaluate(InterestRatePayout arg0, CalculationPeriodBase arg1, Boolean arg2, BigDecimal arg3, BigDecimal arg4, FloatingRateSettingDetails arg5)`
- `MapperS floatingRate(InterestRatePayout arg0, CalculationPeriodBase arg1, Boolean arg2, BigDecimal arg3, BigDecimal arg4, FloatingRateSettingDetails arg5)`
- `MapperS periodNotional(InterestRatePayout arg0, CalculationPeriodBase arg1, Boolean arg2, BigDecimal arg3, BigDecimal arg4, FloatingRateSettingDetails arg5)`
- `MapperS processedRateDetails(InterestRatePayout arg0, CalculationPeriodBase arg1, Boolean arg2, BigDecimal arg3, BigDecimal arg4, FloatingRateSettingDetails arg5)`
- `MapperS processingParameters(InterestRatePayout arg0, CalculationPeriodBase arg1, Boolean arg2, BigDecimal arg3, BigDecimal arg4, FloatingRateSettingDetails arg5)`
- `MapperS notional(InterestRatePayout arg0, CalculationPeriodBase arg1, Boolean arg2, BigDecimal arg3, BigDecimal arg4, FloatingRateSettingDetails arg5)`

### Annotations

- **ImplementedBy**

