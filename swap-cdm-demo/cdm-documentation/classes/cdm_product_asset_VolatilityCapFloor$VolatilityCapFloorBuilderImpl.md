# VolatilityCapFloorBuilderImpl

**Full Name:** `cdm.product.asset.VolatilityCapFloor$VolatilityCapFloorBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.VolatilityCapFloor$VolatilityCapFloorBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| applicable | `Boolean` |  |
| totalVolatilityCap | `BigDecimal` |  |
| volatilityCapFactor | `BigDecimal` |  |

### Methods

#### Builder Methods

- `VolatilityCapFloor build()`

#### Setter Methods

- `VolatilityCapFloorBuilder setApplicable(Boolean arg0)`
- `VolatilityCapFloorBuilder setTotalVolatilityCap(BigDecimal arg0)`
- `VolatilityCapFloorBuilder setVolatilityCapFactor(BigDecimal arg0)`

#### Getter Methods

- `BigDecimal getTotalVolatilityCap()`
- `BigDecimal getVolatilityCapFactor()`
- `Boolean getApplicable()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `VolatilityCapFloorBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `VolatilityCapFloorBuilder toBuilder()`
- `VolatilityCapFloorBuilder prune()`

