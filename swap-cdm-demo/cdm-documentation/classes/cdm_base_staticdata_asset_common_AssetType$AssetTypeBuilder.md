# AssetTypeBuilder

**Full Name:** `cdm.base.staticdata.asset.common.AssetType$AssetTypeBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.AssetType`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AssetTypeBuilder setAssetType(AssetTypeEnum arg0)`
- `AssetTypeBuilder setOtherAssetType(List arg0)`
- `AssetTypeBuilder setSecurityType(InstrumentTypeEnum arg0)`
- `AssetTypeBuilder setEquityType(EquityTypeEnum arg0)`
- `AssetTypeBuilder setFundType(FundProductTypeEnum arg0)`
- `AssetTypeBuilder setDebtType(DebtType arg0)`

#### Getter Methods

- `DebtTypeBuilder getDebtType()`
- `DebtTypeBuilder getOrCreateDebtType()`

#### Adder Methods

- `AssetTypeBuilder addOtherAssetType(String arg0, int arg1)`
- `AssetTypeBuilder addOtherAssetType(List arg0)`
- `AssetTypeBuilder addOtherAssetType(String arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetTypeBuilder prune()`

