# ApplyFloatingRateProcessing

**Full Name:** `cdm.product.asset.floatingrate.functions.ApplyFloatingRateProcessing`

**Package:** `cdm.product.asset.floatingrate.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| applyFloatingRatePostSpreadProcessing | `ApplyFloatingRatePostSpreadProcessing` |  |
| applyUSRateTreatment | `ApplyUSRateTreatment` |  |
| max | `Max` |  |

### Methods

#### Adder Methods

- `MapperS added(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`

#### Other Methods

- `FloatingRateProcessingDetails evaluate(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS multiplier(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `FloatingRateProcessingDetailsBuilder doEvaluate(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS initialRate(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS negativeTreatedRatePlusSpread(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS multiplied(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS spreadRate(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS negativeTreatment(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS initialRatePluSpread(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS negativeTreatedRate(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS initialRatePlusSpread(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS multipliedRate(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS doInitialRate(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS treatedRate(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`
- `MapperS ratePlusSpread(FloatingRateProcessingParameters arg0, BigDecimal arg1, CalculationPeriodBase arg2, Boolean arg3)`

### Annotations

- **ImplementedBy**

