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

- `AveragingCalculationBuilder setAveragingMethod(AveragingCalculationMethod arg0)`
- `AveragingCalculationBuilder setPrecision(Rounding arg0)`

#### Getter Methods

- `AveragingCalculationMethodBuilder getOrCreateAveragingMethod()`
- `RoundingBuilder getOrCreatePrecision()`
- `AveragingCalculationMethodBuilder getAveragingMethod()`
- `RoundingBuilder getPrecision()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AveragingCalculationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AveragingCalculationBuilder toBuilder()`
- `AveragingCalculationBuilder prune()`

