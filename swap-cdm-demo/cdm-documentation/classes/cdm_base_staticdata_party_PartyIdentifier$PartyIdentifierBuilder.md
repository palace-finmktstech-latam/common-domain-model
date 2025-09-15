# PartyIdentifierBuilder

**Full Name:** `cdm.base.staticdata.party.PartyIdentifier$PartyIdentifierBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.PartyIdentifier`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PartyIdentifierBuilder setIdentifierType(PartyIdentifierTypeEnum arg0)`
- `PartyIdentifierBuilder setIdentifier(FieldWithMetaString arg0)`
- `PartyIdentifierBuilder setIdentifierValue(String arg0)`
- `PartyIdentifierBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PartyIdentifierBuilder prune()`

