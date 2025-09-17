# AveragingCalculationBuilderImpl

**Full Name:** `cdm.product.template.AveragingCalculation$AveragingCalculationBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.AveragingCalculation$AveragingCalculationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| averagingMethod | `AveragingCalculationMethodBuilder` |  |
| precision | `RoundingBuilder` |  |

### Methods

#### Builder Methods

- `AveragingCalculation build()`

#### Setter Methods

- `AveragingCalculationBuilder setPrecision(Rounding arg0)`
- `AveragingCalculationBuilder setAveragingMethod(AveragingCalculationMethod arg0)`

#### Getter Methods

- `AveragingCalculationMethodBuilder getAveragingMethod()`
- `RoundingBuilder getPrecision()`
- `AveragingCalculationMethodBuilder getOrCreateAveragingMethod()`
- `RoundingBuilder getOrCreatePrecision()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AveragingCalculationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AveragingCalculationBuilder prune()`
- `AveragingCalculationBuilder toBuilder()`
- `boolean hasData()`

