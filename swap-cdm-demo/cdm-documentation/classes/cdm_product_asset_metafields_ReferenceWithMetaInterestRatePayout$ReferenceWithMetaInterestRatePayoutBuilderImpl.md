# ReferenceWithMetaInterestRatePayoutBuilderImpl

**Full Name:** `cdm.product.asset.metafields.ReferenceWithMetaInterestRatePayout$ReferenceWithMetaInterestRatePayoutBuilderImpl`

**Package:** `cdm.product.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.metafields.ReferenceWithMetaInterestRatePayout$ReferenceWithMetaInterestRatePayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `InterestRatePayoutBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaInterestRatePayout build()`

#### Setter Methods

- `ReferenceWithMetaInterestRatePayoutBuilder setValue(InterestRatePayout arg0)`
- `ReferenceWithMetaInterestRatePayoutBuilder setReference(Reference arg0)`
- `ReferenceWithMetaInterestRatePayoutBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaInterestRatePayoutBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `InterestRatePayoutBuilder getValue()`
- `InterestRatePayoutBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaInterestRatePayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaInterestRatePayoutBuilder prune()`
- `ReferenceWithMetaInterestRatePayoutBuilder toBuilder()`
- `boolean hasData()`

