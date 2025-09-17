# PartyIdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.party.PartyIdentifier$PartyIdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.PartyIdentifier$PartyIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `FieldWithMetaStringBuilder` |  |
| identifierType | `PartyIdentifierTypeEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PartyIdentifier build()`

#### Setter Methods

- `PartyIdentifierBuilder setIdentifierValue(String arg0)`
- `PartyIdentifierBuilder setIdentifier(FieldWithMetaString arg0)`
- `PartyIdentifierBuilder setMeta(MetaFields arg0)`
- `PartyIdentifierBuilder setIdentifierType(PartyIdentifierTypeEnum arg0)`

#### Getter Methods

- `PartyIdentifierTypeEnum getIdentifierType()`
- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartyIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PartyIdentifierBuilder prune()`
- `PartyIdentifierBuilder toBuilder()`
- `boolean hasData()`

