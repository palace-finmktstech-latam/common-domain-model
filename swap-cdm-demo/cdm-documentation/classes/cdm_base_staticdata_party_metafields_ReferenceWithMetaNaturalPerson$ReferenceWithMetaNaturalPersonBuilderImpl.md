# ReferenceWithMetaNaturalPersonBuilderImpl

**Full Name:** `cdm.base.staticdata.party.metafields.ReferenceWithMetaNaturalPerson$ReferenceWithMetaNaturalPersonBuilderImpl`

**Package:** `cdm.base.staticdata.party.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.metafields.ReferenceWithMetaNaturalPerson$ReferenceWithMetaNaturalPersonBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `NaturalPersonBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaNaturalPerson build()`

#### Setter Methods

- `ReferenceWithMetaNaturalPersonBuilder setValue(NaturalPerson arg0)`
- `ReferenceWithMetaNaturalPersonBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaNaturalPersonBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaNaturalPersonBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `NaturalPersonBuilder getValue()`
- `NaturalPersonBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaNaturalPersonBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaNaturalPersonBuilder toBuilder()`
- `ReferenceWithMetaNaturalPersonBuilder prune()`

