# ReferenceWithMetaInterestRateIndexBuilderImpl

**Full Name:** `cdm.observable.asset.metafields.ReferenceWithMetaInterestRateIndex$ReferenceWithMetaInterestRateIndexBuilderImpl`

**Package:** `cdm.observable.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.metafields.ReferenceWithMetaInterestRateIndex$ReferenceWithMetaInterestRateIndexBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `InterestRateIndexBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaInterestRateIndex build()`

#### Setter Methods

- `ReferenceWithMetaInterestRateIndexBuilder setValue(InterestRateIndex arg0)`
- `ReferenceWithMetaInterestRateIndexBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaInterestRateIndexBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaInterestRateIndexBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `InterestRateIndexBuilder getValue()`
- `InterestRateIndexBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaInterestRateIndexBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaInterestRateIndexBuilder toBuilder()`
- `ReferenceWithMetaInterestRateIndexBuilder prune()`

