# AssetBuilder

**Full Name:** `cdm.base.staticdata.asset.common.Asset$AssetBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.Asset`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetBuilder prune()`

