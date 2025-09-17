# ReferenceWithMetaAccountBuilderImpl

**Full Name:** `cdm.base.staticdata.party.metafields.ReferenceWithMetaAccount$ReferenceWithMetaAccountBuilderImpl`

**Package:** `cdm.base.staticdata.party.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.metafields.ReferenceWithMetaAccount$ReferenceWithMetaAccountBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `AccountBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaAccount build()`

#### Setter Methods

- `ReferenceWithMetaAccountBuilder setValue(Account arg0)`
- `ReferenceWithMetaAccountBuilder setReference(Reference arg0)`
- `ReferenceWithMetaAccountBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaAccountBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `AccountBuilder getValue()`
- `AccountBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaAccountBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaAccountBuilder prune()`
- `ReferenceWithMetaAccountBuilder toBuilder()`
- `boolean hasData()`

