# BoundedCorrelationBuilderImpl

**Full Name:** `cdm.product.asset.BoundedCorrelation$BoundedCorrelationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.BoundedCorrelation$BoundedCorrelationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| minimumBoundaryPercent | `BigDecimal` |  |
| maximumBoundaryPercent | `BigDecimal` |  |

### Methods

#### Builder Methods

- `BoundedCorrelation build()`

#### Setter Methods

- `BoundedCorrelationBuilder setMaximumBoundaryPercent(BigDecimal arg0)`
- `BoundedCorrelationBuilder setMinimumBoundaryPercent(BigDecimal arg0)`

#### Getter Methods

- `BigDecimal getMaximumBoundaryPercent()`
- `BigDecimal getMinimumBoundaryPercent()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BoundedCorrelationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BoundedCorrelationBuilder prune()`
- `BoundedCorrelationBuilder toBuilder()`
- `boolean hasData()`

