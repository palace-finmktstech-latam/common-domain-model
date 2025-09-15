# InterestShortFallBuilderImpl

**Full Name:** `cdm.product.asset.InterestShortFall$InterestShortFallBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.InterestShortFall$InterestShortFallBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| interestShortfallCap | `InterestShortfallCapEnum` |  |
| compounding | `Boolean` |  |
| rateSource | `FieldWithMetaFloatingRateIndexEnumBuilder` |  |

### Methods

#### Builder Methods

- `InterestShortFall build()`

#### Setter Methods

- `InterestShortFallBuilder setRateSource(FieldWithMetaFloatingRateIndexEnum arg0)`
- `InterestShortFallBuilder setInterestShortfallCap(InterestShortfallCapEnum arg0)`
- `InterestShortFallBuilder setCompounding(Boolean arg0)`
- `InterestShortFallBuilder setRateSourceValue(FloatingRateIndexEnum arg0)`

#### Getter Methods

- `FieldWithMetaFloatingRateIndexEnumBuilder getRateSource()`
- `InterestShortfallCapEnum getInterestShortfallCap()`
- `FieldWithMetaFloatingRateIndexEnumBuilder getOrCreateRateSource()`
- `Boolean getCompounding()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InterestShortFallBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InterestShortFallBuilder toBuilder()`
- `InterestShortFallBuilder prune()`

