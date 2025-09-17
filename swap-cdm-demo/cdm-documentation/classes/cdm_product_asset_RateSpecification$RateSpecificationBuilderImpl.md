# RateSpecificationBuilderImpl

**Full Name:** `cdm.product.asset.RateSpecification$RateSpecificationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.RateSpecification$RateSpecificationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| fixedRateSpecification | `FixedRateSpecificationBuilder` |  |
| floatingRateSpecification | `FloatingRateSpecificationBuilder` |  |
| inflationRateSpecification | `InflationRateSpecificationBuilder` |  |

### Methods

#### Builder Methods

- `RateSpecification build()`

#### Setter Methods

- `RateSpecificationBuilder setFixedRateSpecification(FixedRateSpecification arg0)`
- `RateSpecificationBuilder setInflationRateSpecification(InflationRateSpecification arg0)`
- `RateSpecificationBuilder setFloatingRateSpecification(FloatingRateSpecification arg0)`

#### Getter Methods

- `FloatingRateSpecificationBuilder getOrCreateFloatingRateSpecification()`
- `FixedRateSpecificationBuilder getOrCreateFixedRateSpecification()`
- `InflationRateSpecificationBuilder getOrCreateInflationRateSpecification()`
- `InflationRateSpecificationBuilder getInflationRateSpecification()`
- `FloatingRateSpecificationBuilder getFloatingRateSpecification()`
- `FixedRateSpecificationBuilder getFixedRateSpecification()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RateSpecificationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `RateSpecificationBuilder prune()`
- `RateSpecificationBuilder toBuilder()`
- `boolean hasData()`

