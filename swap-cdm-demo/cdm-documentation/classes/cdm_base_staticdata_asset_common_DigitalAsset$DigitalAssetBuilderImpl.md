# DigitalAssetBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.DigitalAsset$DigitalAssetBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.asset.common.AssetBase$AssetBaseBuilderImpl`

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.DigitalAsset$DigitalAssetBuilder`

### Methods

#### Builder Methods

- `DigitalAsset build()`

#### Setter Methods

- `DigitalAssetBuilder setIdentifier(List arg0)`
- `DigitalAssetBuilder setTaxonomy(List arg0)`
- `DigitalAssetBuilder setExchange(LegalEntity arg0)`
- `DigitalAssetBuilder setIsExchangeListed(Boolean arg0)`
- `DigitalAssetBuilder setRelatedExchange(List arg0)`

#### Adder Methods

- `DigitalAssetBuilder addIdentifier(AssetIdentifier arg0, int arg1)`
- `DigitalAssetBuilder addIdentifier(AssetIdentifier arg0)`
- `DigitalAssetBuilder addIdentifier(List arg0)`
- `DigitalAssetBuilder addTaxonomy(Taxonomy arg0, int arg1)`
- `DigitalAssetBuilder addTaxonomy(Taxonomy arg0)`
- `DigitalAssetBuilder addTaxonomy(List arg0)`
- `DigitalAssetBuilder addRelatedExchange(LegalEntity arg0)`
- `DigitalAssetBuilder addRelatedExchange(List arg0)`
- `DigitalAssetBuilder addRelatedExchange(LegalEntity arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DigitalAssetBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DigitalAssetBuilder prune()`
- `DigitalAssetBuilder toBuilder()`
- `boolean hasData()`

