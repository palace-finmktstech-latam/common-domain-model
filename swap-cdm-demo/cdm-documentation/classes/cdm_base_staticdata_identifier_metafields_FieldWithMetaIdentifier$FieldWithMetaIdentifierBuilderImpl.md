# FieldWithMetaIdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.identifier.metafields.FieldWithMetaIdentifier$FieldWithMetaIdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.identifier.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.identifier.metafields.FieldWithMetaIdentifier$FieldWithMetaIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `IdentifierBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `FieldWithMetaIdentifier build()`

#### Setter Methods

- `FieldWithMetaIdentifierBuilder setValue(Identifier arg0)`
- `FieldWithMetaIdentifierBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `IdentifierBuilder getValue()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `IdentifierBuilder getOrCreateValue()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FieldWithMetaIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FieldWithMetaIdentifierBuilder prune()`
- `FieldWithMetaIdentifierBuilder toBuilder()`
- `boolean hasData()`

