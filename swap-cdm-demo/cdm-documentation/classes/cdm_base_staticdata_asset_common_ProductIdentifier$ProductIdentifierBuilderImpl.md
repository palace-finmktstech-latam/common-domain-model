# ProductIdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.ProductIdentifier$ProductIdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.ProductIdentifier$ProductIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `FieldWithMetaStringBuilder` |  |
| source | `ProductIdTypeEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ProductIdentifier build()`

#### Setter Methods

- `ProductIdentifierBuilder setIdentifier(FieldWithMetaString arg0)`
- `ProductIdentifierBuilder setIdentifierValue(String arg0)`
- `ProductIdentifierBuilder setSource(ProductIdTypeEnum arg0)`
- `ProductIdentifierBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `ProductIdTypeEnum getSource()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ProductIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ProductIdentifierBuilder toBuilder()`
- `ProductIdentifierBuilder prune()`

