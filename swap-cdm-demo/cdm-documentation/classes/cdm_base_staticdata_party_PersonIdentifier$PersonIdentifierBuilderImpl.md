# PersonIdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.party.PersonIdentifier$PersonIdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.PersonIdentifier$PersonIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `FieldWithMetaStringBuilder` |  |
| identifierType | `PersonIdentifierTypeEnum` |  |
| country | `FieldWithMetaStringBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PersonIdentifier build()`

#### Setter Methods

- `PersonIdentifierBuilder setIdentifierType(PersonIdentifierTypeEnum arg0)`
- `PersonIdentifierBuilder setCountryValue(String arg0)`
- `PersonIdentifierBuilder setIdentifier(FieldWithMetaString arg0)`
- `PersonIdentifierBuilder setIdentifierValue(String arg0)`
- `PersonIdentifierBuilder setCountry(FieldWithMetaString arg0)`
- `PersonIdentifierBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCountry()`
- `FieldWithMetaStringBuilder getOrCreateCountry()`
- `PersonIdentifierTypeEnum getIdentifierType()`
- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PersonIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PersonIdentifierBuilder toBuilder()`
- `PersonIdentifierBuilder prune()`

