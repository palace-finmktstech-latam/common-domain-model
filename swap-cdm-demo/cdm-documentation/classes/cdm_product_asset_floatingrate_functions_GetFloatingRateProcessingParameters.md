# GetFloatingRateProcessingParameters

**Full Name:** `cdm.product.asset.floatingrate.functions.GetFloatingRateProcessingParameters`

**Package:** `cdm.product.asset.floatingrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| capRateAmount | `CapRateAmount` |  |
| floorRateAmount | `FloorRateAmount` |  |
| multiplierAmount | `MultiplierAmount` |  |
| spreadAmount | `SpreadAmount` |  |

### Methods

#### Other Methods

- `MapperS floor(InterestRatePayout arg0, CalculationPeriodBase arg1)`
- `MapperS cap(InterestRatePayout arg0, CalculationPeriodBase arg1)`
- `FloatingRateProcessingParameters evaluate(InterestRatePayout arg0, CalculationPeriodBase arg1)`
- `MapperS multiplier(InterestRatePayout arg0, CalculationPeriodBase arg1)`
- `FloatingRateProcessingParametersBuilder doEvaluate(InterestRatePayout arg0, CalculationPeriodBase arg1)`
- `MapperS treatment(InterestRatePayout arg0, CalculationPeriodBase arg1)`
- `MapperS spreadRate(InterestRatePayout arg0, CalculationPeriodBase arg1)`
- `MapperS rounding(InterestRatePayout arg0, CalculationPeriodBase arg1)`
- `MapperS negativeTreatment(InterestRatePayout arg0, CalculationPeriodBase arg1)`

### Annotations

- **ImplementedBy**

