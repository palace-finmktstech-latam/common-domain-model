# ReferenceWithMetaPayoutBuilderImpl

**Full Name:** `cdm.product.template.metafields.ReferenceWithMetaPayout$ReferenceWithMetaPayoutBuilderImpl`

**Package:** `cdm.product.template.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.metafields.ReferenceWithMetaPayout$ReferenceWithMetaPayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `PayoutBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaPayout build()`

#### Setter Methods

- `ReferenceWithMetaPayoutBuilder setValue(Payout arg0)`
- `ReferenceWithMetaPayoutBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaPayoutBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaPayoutBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `PayoutBuilder getValue()`
- `PayoutBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaPayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaPayoutBuilder toBuilder()`
- `ReferenceWithMetaPayoutBuilder prune()`

