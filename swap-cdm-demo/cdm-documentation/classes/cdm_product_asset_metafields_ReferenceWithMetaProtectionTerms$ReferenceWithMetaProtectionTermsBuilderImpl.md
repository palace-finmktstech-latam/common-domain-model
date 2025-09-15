# ReferenceWithMetaProtectionTermsBuilderImpl

**Full Name:** `cdm.product.asset.metafields.ReferenceWithMetaProtectionTerms$ReferenceWithMetaProtectionTermsBuilderImpl`

**Package:** `cdm.product.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.metafields.ReferenceWithMetaProtectionTerms$ReferenceWithMetaProtectionTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `ProtectionTermsBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaProtectionTerms build()`

#### Setter Methods

- `ReferenceWithMetaProtectionTermsBuilder setValue(ProtectionTerms arg0)`
- `ReferenceWithMetaProtectionTermsBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaProtectionTermsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaProtectionTermsBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `ProtectionTermsBuilder getValue()`
- `ProtectionTermsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaProtectionTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaProtectionTermsBuilder toBuilder()`
- `ReferenceWithMetaProtectionTermsBuilder prune()`

