# BondReferenceBuilderImpl

**Full Name:** `cdm.product.asset.BondReference$BondReferenceBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.BondReference$BondReferenceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| bond | `SecurityBuilder` |  |
| conditionPrecedentBond | `Boolean` |  |
| discrepancyClause | `Boolean` |  |
| couponRate | `FixedRateSpecificationBuilder` |  |

### Methods

#### Builder Methods

- `BondReference build()`

#### Setter Methods

- `BondReferenceBuilder setConditionPrecedentBond(Boolean arg0)`
- `BondReferenceBuilder setDiscrepancyClause(Boolean arg0)`
- `BondReferenceBuilder setCouponRate(FixedRateSpecification arg0)`
- `BondReferenceBuilder setBond(Security arg0)`

#### Getter Methods

- `Boolean getDiscrepancyClause()`
- `Boolean getConditionPrecedentBond()`
- `FixedRateSpecificationBuilder getCouponRate()`
- `SecurityBuilder getOrCreateBond()`
- `FixedRateSpecificationBuilder getOrCreateCouponRate()`
- `SecurityBuilder getBond()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BondReferenceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BondReferenceBuilder toBuilder()`
- `BondReferenceBuilder prune()`

