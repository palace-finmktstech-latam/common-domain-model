# VarianceCapFloorBuilderImpl

**Full Name:** `cdm.product.asset.VarianceCapFloor$VarianceCapFloorBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.VarianceCapFloor$VarianceCapFloorBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| varianceCap | `Boolean` |  |
| unadjustedVarianceCap | `BigDecimal` |  |
| boundedVariance | `BoundedVarianceBuilder` |  |

### Methods

#### Builder Methods

- `VarianceCapFloor build()`

#### Setter Methods

- `VarianceCapFloorBuilder setVarianceCap(Boolean arg0)`
- `VarianceCapFloorBuilder setUnadjustedVarianceCap(BigDecimal arg0)`
- `VarianceCapFloorBuilder setBoundedVariance(BoundedVariance arg0)`

#### Getter Methods

- `Boolean getVarianceCap()`
- `BoundedVarianceBuilder getOrCreateBoundedVariance()`
- `BoundedVarianceBuilder getBoundedVariance()`
- `BigDecimal getUnadjustedVarianceCap()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `VarianceCapFloorBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `VarianceCapFloorBuilder toBuilder()`
- `VarianceCapFloorBuilder prune()`

