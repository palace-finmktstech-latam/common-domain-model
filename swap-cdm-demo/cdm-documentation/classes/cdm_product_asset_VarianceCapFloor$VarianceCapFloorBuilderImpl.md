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

- `VarianceCapFloorBuilder setUnadjustedVarianceCap(BigDecimal arg0)`
- `VarianceCapFloorBuilder setBoundedVariance(BoundedVariance arg0)`
- `VarianceCapFloorBuilder setVarianceCap(Boolean arg0)`

#### Getter Methods

- `Boolean getVarianceCap()`
- `BigDecimal getUnadjustedVarianceCap()`
- `BoundedVarianceBuilder getBoundedVariance()`
- `BoundedVarianceBuilder getOrCreateBoundedVariance()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `VarianceCapFloorBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `VarianceCapFloorBuilder prune()`
- `VarianceCapFloorBuilder toBuilder()`
- `boolean hasData()`

