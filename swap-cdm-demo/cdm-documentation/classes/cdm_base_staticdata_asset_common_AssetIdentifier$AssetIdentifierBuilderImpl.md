# AssetIdentifierBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.AssetIdentifier$AssetIdentifierBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.AssetIdentifier$AssetIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `FieldWithMetaStringBuilder` |  |
| identifierType | `AssetIdTypeEnum` |  |

### Methods

#### Builder Methods

- `AssetIdentifier build()`

#### Setter Methods

- `AssetIdentifierBuilder setIdentifierValue(String arg0)`
- `AssetIdentifierBuilder setIdentifier(FieldWithMetaString arg0)`
- `AssetIdentifierBuilder setIdentifierType(AssetIdTypeEnum arg0)`

#### Getter Methods

- `AssetIdTypeEnum getIdentifierType()`
- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetIdentifierBuilder prune()`
- `AssetIdentifierBuilder toBuilder()`
- `boolean hasData()`

