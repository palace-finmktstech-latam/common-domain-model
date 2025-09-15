# LegalEntityBuilder

**Full Name:** `cdm.base.staticdata.party.LegalEntity$LegalEntityBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.LegalEntity`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `LegalEntityBuilder setName(FieldWithMetaString arg0)`
- `LegalEntityBuilder setEntityId(List arg0)`
- `LegalEntityBuilder setEntityIdValue(List arg0)`
- `LegalEntityBuilder setNameValue(String arg0)`
- `LegalEntityBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getName()`
- `FieldWithMetaStringBuilder getOrCreateEntityId(int arg0)`
- `MetaFieldsBuilder getOrCreateMeta()`
- `FieldWithMetaStringBuilder getOrCreateName()`
- `List getEntityId()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `LegalEntityBuilder addEntityId(FieldWithMetaString arg0, int arg1)`
- `LegalEntityBuilder addEntityId(FieldWithMetaString arg0)`
- `LegalEntityBuilder addEntityId(List arg0)`
- `LegalEntityBuilder addEntityIdValue(List arg0)`
- `LegalEntityBuilder addEntityIdValue(String arg0, int arg1)`
- `LegalEntityBuilder addEntityIdValue(String arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LegalEntityBuilder prune()`

