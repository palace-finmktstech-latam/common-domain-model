# ResourceBuilder

**Full Name:** `cdm.legaldocumentation.common.Resource$ResourceBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.Resource`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ResourceBuilder setName(String arg0)`
- `ResourceBuilder setLength(ResourceLength arg0)`
- `ResourceBuilder setLanguage(FieldWithMetaString arg0)`
- `ResourceBuilder setComments(String arg0)`
- `ResourceBuilder setUrl(String arg0)`
- `ResourceBuilder setMimeType(FieldWithMetaString arg0)`
- `ResourceBuilder setResourceId(FieldWithMetaString arg0)`
- `ResourceBuilder setLanguageValue(String arg0)`
- `ResourceBuilder setSizeInBytes(BigDecimal arg0)`
- `ResourceBuilder setResourceIdValue(String arg0)`
- `ResourceBuilder setResourceType(FieldWithMetaResourceTypeEnum arg0)`
- `ResourceBuilder setResourceTypeValue(ResourceTypeEnum arg0)`
- `ResourceBuilder setMimeTypeValue(String arg0)`
- `ResourceBuilder setString(String arg0)`

#### Getter Methods

- `ResourceLengthBuilder getLength()`
- `FieldWithMetaStringBuilder getLanguage()`
- `FieldWithMetaStringBuilder getResourceId()`
- `FieldWithMetaResourceTypeEnumBuilder getResourceType()`
- `FieldWithMetaStringBuilder getMimeType()`
- `FieldWithMetaStringBuilder getOrCreateLanguage()`
- `FieldWithMetaStringBuilder getOrCreateResourceId()`
- `FieldWithMetaStringBuilder getOrCreateMimeType()`
- `ResourceLengthBuilder getOrCreateLength()`
- `FieldWithMetaResourceTypeEnumBuilder getOrCreateResourceType()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ResourceBuilder prune()`

