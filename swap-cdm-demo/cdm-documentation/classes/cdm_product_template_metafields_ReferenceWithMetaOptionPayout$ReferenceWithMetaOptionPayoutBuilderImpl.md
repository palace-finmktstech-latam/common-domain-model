# ReferenceWithMetaOptionPayoutBuilderImpl

**Full Name:** `cdm.product.template.metafields.ReferenceWithMetaOptionPayout$ReferenceWithMetaOptionPayoutBuilderImpl`

**Package:** `cdm.product.template.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.metafields.ReferenceWithMetaOptionPayout$ReferenceWithMetaOptionPayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `OptionPayoutBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaOptionPayout build()`

#### Setter Methods

- `ReferenceWithMetaOptionPayoutBuilder setValue(OptionPayout arg0)`
- `ReferenceWithMetaOptionPayoutBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaOptionPayoutBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaOptionPayoutBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `OptionPayoutBuilder getValue()`
- `OptionPayoutBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaOptionPayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaOptionPayoutBuilder toBuilder()`
- `ReferenceWithMetaOptionPayoutBuilder prune()`

