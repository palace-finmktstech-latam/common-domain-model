# LegalEntityBuilderImpl

**Full Name:** `cdm.base.staticdata.party.LegalEntity$LegalEntityBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.LegalEntity$LegalEntityBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| entityId | `java.util.List<com.rosetta.model.metafields.FieldWithMetaString$FieldWithMetaStringBuilder>` |  |
| name | `FieldWithMetaStringBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `LegalEntity build()`

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

- `LegalEntityBuilder addEntityId(FieldWithMetaString arg0)`
- `LegalEntityBuilder addEntityId(FieldWithMetaString arg0, int arg1)`
- `LegalEntityBuilder addEntityId(List arg0)`
- `LegalEntityBuilder addEntityIdValue(List arg0)`
- `LegalEntityBuilder addEntityIdValue(String arg0)`
- `LegalEntityBuilder addEntityIdValue(String arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LegalEntityBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `LegalEntityBuilder toBuilder()`
- `LegalEntityBuilder prune()`

