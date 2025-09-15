# CalculateFloatingCashFlow

**Full Name:** `cdm.product.asset.calculation.functions.CalculateFloatingCashFlow`

**Package:** `cdm.product.asset.calculation.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| calculateYearFraction | `CalculateYearFraction` |  |

### Methods

#### Other Methods

- `FloatingAmountCalculationDetails evaluate(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `FloatingAmountCalculationDetailsBuilder doEvaluate(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `MapperS yearFraction(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `MapperS dcf(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `MapperS cashflow(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `MapperS appliedRate(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `MapperS spreadExclusiveRate(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `MapperS annualAccrual(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `MapperS notionalAccrual(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`
- `MapperS spreadExclusiveCashflow(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2, String arg3, FloatingRateSettingDetails arg4, FloatingRateProcessingDetails arg5)`

### Annotations

- **ImplementedBy**

