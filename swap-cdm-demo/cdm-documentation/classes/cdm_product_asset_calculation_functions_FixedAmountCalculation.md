# FixedAmountCalculation

**Full Name:** `cdm.product.asset.calculation.functions.FixedAmountCalculation`

**Package:** `cdm.product.asset.calculation.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| calculateYearFraction | `CalculateYearFraction` |  |
| getFixedRate | `GetFixedRate` |  |
| getNotionalAmount | `GetNotionalAmount` |  |

### Methods

#### Other Methods

- `FixedAmountCalculationDetails evaluate(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2)`
- `FixedAmountCalculationDetailsBuilder doEvaluate(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2)`
- `MapperS dcf(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2)`
- `MapperS calcAmt(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2)`
- `MapperS fixedRate(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2)`
- `MapperS yearFraction(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2)`
- `MapperS calculationAmount(InterestRatePayout arg0, CalculationPeriodBase arg1, BigDecimal arg2)`

### Annotations

- **ImplementedBy**

