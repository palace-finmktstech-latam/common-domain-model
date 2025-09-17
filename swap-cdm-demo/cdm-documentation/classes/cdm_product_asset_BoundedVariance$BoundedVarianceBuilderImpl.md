# BoundedVarianceBuilderImpl

**Full Name:** `cdm.product.asset.BoundedVariance$BoundedVarianceBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.BoundedVariance$BoundedVarianceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| realisedVarianceMethod | `RealisedVarianceMethodEnum` |  |
| daysInRangeAdjustment | `Boolean` |  |
| upperBarrier | `BigDecimal` |  |
| lowerBarrier | `BigDecimal` |  |

### Methods

#### Builder Methods

- `BoundedVariance build()`

#### Setter Methods

- `BoundedVarianceBuilder setRealisedVarianceMethod(RealisedVarianceMethodEnum arg0)`
- `BoundedVarianceBuilder setDaysInRangeAdjustment(Boolean arg0)`
- `BoundedVarianceBuilder setUpperBarrier(BigDecimal arg0)`
- `BoundedVarianceBuilder setLowerBarrier(BigDecimal arg0)`

#### Getter Methods

- `RealisedVarianceMethodEnum getRealisedVarianceMethod()`
- `Boolean getDaysInRangeAdjustment()`
- `BigDecimal getUpperBarrier()`
- `BigDecimal getLowerBarrier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BoundedVarianceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BoundedVarianceBuilder prune()`
- `BoundedVarianceBuilder toBuilder()`
- `boolean hasData()`

