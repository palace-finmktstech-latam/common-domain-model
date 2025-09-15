# PersonIdentifierBuilder

**Full Name:** `cdm.base.staticdata.party.PersonIdentifier$PersonIdentifierBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.PersonIdentifier`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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
- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PersonIdentifierBuilder prune()`

