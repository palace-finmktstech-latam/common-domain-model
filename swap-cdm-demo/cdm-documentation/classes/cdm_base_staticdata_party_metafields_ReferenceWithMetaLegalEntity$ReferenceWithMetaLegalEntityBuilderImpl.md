# ReferenceWithMetaLegalEntityBuilderImpl

**Full Name:** `cdm.base.staticdata.party.metafields.ReferenceWithMetaLegalEntity$ReferenceWithMetaLegalEntityBuilderImpl`

**Package:** `cdm.base.staticdata.party.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.metafields.ReferenceWithMetaLegalEntity$ReferenceWithMetaLegalEntityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `LegalEntityBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaLegalEntity build()`

#### Setter Methods

- `ReferenceWithMetaLegalEntityBuilder setValue(LegalEntity arg0)`
- `ReferenceWithMetaLegalEntityBuilder setReference(Reference arg0)`
- `ReferenceWithMetaLegalEntityBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaLegalEntityBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `LegalEntityBuilder getValue()`
- `LegalEntityBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaLegalEntityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaLegalEntityBuilder prune()`
- `ReferenceWithMetaLegalEntityBuilder toBuilder()`
- `boolean hasData()`

