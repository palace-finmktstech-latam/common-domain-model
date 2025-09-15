# AssetBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.Asset$AssetBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Asset$AssetBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| cash | `CashBuilder` |  |
| commodity | `CommodityBuilder` |  |
| digitalAsset | `DigitalAssetBuilder` |  |
| instrument | `InstrumentBuilder` |  |

### Methods

#### Builder Methods

- `Asset build()`

#### Setter Methods

- `AssetBuilder setDigitalAsset(DigitalAsset arg0)`
- `AssetBuilder setInstrument(Instrument arg0)`
- `AssetBuilder setCommodity(Commodity arg0)`
- `AssetBuilder setCash(Cash arg0)`

#### Getter Methods

- `CommodityBuilder getOrCreateCommodity()`
- `DigitalAssetBuilder getOrCreateDigitalAsset()`
- `InstrumentBuilder getInstrument()`
- `CashBuilder getOrCreateCash()`
- `CashBuilder getCash()`
- `CommodityBuilder getCommodity()`
- `DigitalAssetBuilder getDigitalAsset()`
- `InstrumentBuilder getOrCreateInstrument()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AssetBuilder toBuilder()`
- `AssetBuilder prune()`

