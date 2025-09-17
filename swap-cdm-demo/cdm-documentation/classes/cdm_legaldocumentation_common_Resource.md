# Resource

**Full Name:** `cdm.legaldocumentation.common.Resource`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `Resource build()`

#### Getter Methods

- `String getName()`
- `ResourceLength getLength()`
- `Class getType()`
- `FieldWithMetaString getLanguage()`
- `String getString()`
- `String getComments()`
- `String getUrl()`
- `FieldWithMetaString getResourceId()`
- `FieldWithMetaResourceTypeEnum getResourceType()`
- `BigDecimal getSizeInBytes()`
- `FieldWithMetaString getMimeType()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ResourceBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

