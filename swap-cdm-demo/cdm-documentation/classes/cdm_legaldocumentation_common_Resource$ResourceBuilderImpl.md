# ResourceBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.Resource$ResourceBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.Resource$ResourceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| resourceId | `FieldWithMetaStringBuilder` |  |
| resourceType | `FieldWithMetaResourceTypeEnumBuilder` |  |
| language | `FieldWithMetaStringBuilder` |  |
| sizeInBytes | `BigDecimal` |  |
| length | `ResourceLengthBuilder` |  |
| mimeType | `FieldWithMetaStringBuilder` |  |
| name | `String` |  |
| comments | `String` |  |
| string | `String` |  |
| url | `String` |  |

### Methods

#### Builder Methods

- `Resource build()`

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

- `String getName()`
- `ResourceLengthBuilder getLength()`
- `FieldWithMetaStringBuilder getLanguage()`
- `String getString()`
- `String getComments()`
- `String getUrl()`
- `FieldWithMetaStringBuilder getResourceId()`
- `FieldWithMetaResourceTypeEnumBuilder getResourceType()`
- `BigDecimal getSizeInBytes()`
- `FieldWithMetaStringBuilder getMimeType()`
- `FieldWithMetaStringBuilder getOrCreateLanguage()`
- `FieldWithMetaStringBuilder getOrCreateResourceId()`
- `FieldWithMetaStringBuilder getOrCreateMimeType()`
- `ResourceLengthBuilder getOrCreateLength()`
- `FieldWithMetaResourceTypeEnumBuilder getOrCreateResourceType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ResourceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ResourceBuilder prune()`
- `ResourceBuilder toBuilder()`
- `boolean hasData()`

