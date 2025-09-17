# FieldWithMetaPersonIdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.party.metafields.FieldWithMetaPersonIdentifier$FieldWithMetaPersonIdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.party.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.metafields.FieldWithMetaPersonIdentifier$FieldWithMetaPersonIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `PersonIdentifierBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `FieldWithMetaPersonIdentifier build()`

#### Setter Methods

- `FieldWithMetaPersonIdentifierBuilder setValue(PersonIdentifier arg0)`
- `FieldWithMetaPersonIdentifierBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `PersonIdentifierBuilder getValue()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `PersonIdentifierBuilder getOrCreateValue()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FieldWithMetaPersonIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FieldWithMetaPersonIdentifierBuilder prune()`
- `FieldWithMetaPersonIdentifierBuilder toBuilder()`
- `boolean hasData()`

