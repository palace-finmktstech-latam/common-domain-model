# ReferenceWithMetaQuotedCurrencyPairBuilderImpl

**Full Name:** `cdm.observable.asset.metafields.ReferenceWithMetaQuotedCurrencyPair$ReferenceWithMetaQuotedCurrencyPairBuilderImpl`

**Package:** `cdm.observable.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.metafields.ReferenceWithMetaQuotedCurrencyPair$ReferenceWithMetaQuotedCurrencyPairBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `QuotedCurrencyPairBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaQuotedCurrencyPair build()`

#### Setter Methods

- `ReferenceWithMetaQuotedCurrencyPairBuilder setValue(QuotedCurrencyPair arg0)`
- `ReferenceWithMetaQuotedCurrencyPairBuilder setReference(Reference arg0)`
- `ReferenceWithMetaQuotedCurrencyPairBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaQuotedCurrencyPairBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `QuotedCurrencyPairBuilder getValue()`
- `QuotedCurrencyPairBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaQuotedCurrencyPairBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaQuotedCurrencyPairBuilder prune()`
- `ReferenceWithMetaQuotedCurrencyPairBuilder toBuilder()`
- `boolean hasData()`

