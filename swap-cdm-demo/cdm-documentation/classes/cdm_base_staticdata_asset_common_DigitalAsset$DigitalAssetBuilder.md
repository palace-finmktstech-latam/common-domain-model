# DigitalAssetBuilder

**Full Name:** `cdm.base.staticdata.asset.common.DigitalAsset$DigitalAssetBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.DigitalAsset`
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilder`

### Methods

#### Setter Methods

- `DigitalAssetBuilder setIdentifier(List arg0)`
- `DigitalAssetBuilder setTaxonomy(List arg0)`
- `DigitalAssetBuilder setExchange(LegalEntity arg0)`
- `DigitalAssetBuilder setIsExchangeListed(Boolean arg0)`
- `DigitalAssetBuilder setRelatedExchange(List arg0)`

#### Adder Methods

- `DigitalAssetBuilder addIdentifier(AssetIdentifier arg0)`
- `DigitalAssetBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `DigitalAssetBuilder addIdentifier(List arg0)`
- `DigitalAssetBuilder addTaxonomy(Taxonomy arg0)`
- `DigitalAssetBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `DigitalAssetBuilder addTaxonomy(List arg0)`
- `DigitalAssetBuilder addRelatedExchange(List arg0)`
- `DigitalAssetBuilder addRelatedExchange(LegalEntity arg0, int arg1)`
- `DigitalAssetBuilder addRelatedExchange(LegalEntity arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DigitalAssetBuilder prune()`

