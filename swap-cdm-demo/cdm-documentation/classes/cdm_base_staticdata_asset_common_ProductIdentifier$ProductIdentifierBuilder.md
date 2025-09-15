# ProductIdentifierBuilder

**Full Name:** `cdm.base.staticdata.asset.common.ProductIdentifier$ProductIdentifierBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.ProductIdentifier`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `ProductIdentifierBuilder setIdentifier(FieldWithMetaString arg0)`
- `ProductIdentifierBuilder setIdentifierValue(String arg0)`
- `ProductIdentifierBuilder setSource(ProductIdTypeEnum arg0)`
- `ProductIdentifierBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ProductIdentifierBuilder prune()`

