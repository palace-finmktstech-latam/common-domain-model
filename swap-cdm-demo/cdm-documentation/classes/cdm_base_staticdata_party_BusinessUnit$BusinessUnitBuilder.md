# BusinessUnitBuilder

**Full Name:** `cdm.base.staticdata.party.BusinessUnit$BusinessUnitBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.BusinessUnit`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `BusinessUnitBuilder setName(String arg0)`
- `BusinessUnitBuilder setIdentifier(Identifier arg0)`
- `BusinessUnitBuilder setContactInformation(ContactInformation arg0)`
- `BusinessUnitBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `IdentifierBuilder getOrCreateIdentifier()`
- `ContactInformationBuilder getContactInformation()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `ContactInformationBuilder getOrCreateContactInformation()`
- `MetaFieldsBuilder getMeta()`
- `IdentifierBuilder getIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BusinessUnitBuilder prune()`

