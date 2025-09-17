# BusinessUnitBuilderImpl

**Full Name:** `cdm.base.staticdata.party.BusinessUnit$BusinessUnitBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.BusinessUnit$BusinessUnitBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| name | `String` |  |
| identifier | `IdentifierBuilder` |  |
| contactInformation | `ContactInformationBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `BusinessUnit build()`

#### Setter Methods

- `BusinessUnitBuilder setName(String arg0)`
- `BusinessUnitBuilder setIdentifier(Identifier arg0)`
- `BusinessUnitBuilder setMeta(MetaFields arg0)`
- `BusinessUnitBuilder setContactInformation(ContactInformation arg0)`

#### Getter Methods

- `String getName()`
- `IdentifierBuilder getOrCreateIdentifier()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `ContactInformationBuilder getContactInformation()`
- `MetaFieldsBuilder getMeta()`
- `ContactInformationBuilder getOrCreateContactInformation()`
- `IdentifierBuilder getIdentifier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BusinessUnitBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BusinessUnitBuilder prune()`
- `BusinessUnitBuilder toBuilder()`
- `boolean hasData()`

