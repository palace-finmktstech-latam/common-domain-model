# AssetIdentifierBuilder

**Full Name:** `cdm.base.staticdata.asset.common.AssetIdentifier$AssetIdentifierBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.AssetIdentifier`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AssetIdentifierBuilder setIdentifierType(AssetIdTypeEnum arg0)`
- `AssetIdentifierBuilder setIdentifier(FieldWithMetaString arg0)`
- `AssetIdentifierBuilder setIdentifierValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetIdentifierBuilder prune()`

