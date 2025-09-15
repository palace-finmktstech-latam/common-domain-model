# AssetTypeBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.AssetType$AssetTypeBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.AssetType$AssetTypeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| assetType | `AssetTypeEnum` |  |
| securityType | `InstrumentTypeEnum` |  |
| debtType | `DebtTypeBuilder` |  |
| equityType | `EquityTypeEnum` |  |
| fundType | `FundProductTypeEnum` |  |
| otherAssetType | `java.util.List<java.lang.String>` |  |

### Methods

#### Builder Methods

- `AssetType build()`

#### Setter Methods

- `AssetTypeBuilder setDebtType(DebtType arg0)`
- `AssetTypeBuilder setEquityType(EquityTypeEnum arg0)`
- `AssetTypeBuilder setFundType(FundProductTypeEnum arg0)`
- `AssetTypeBuilder setOtherAssetType(List arg0)`
- `AssetTypeBuilder setSecurityType(InstrumentTypeEnum arg0)`
- `AssetTypeBuilder setAssetType(AssetTypeEnum arg0)`

#### Getter Methods

- `EquityTypeEnum getEquityType()`
- `FundProductTypeEnum getFundType()`
- `DebtTypeBuilder getOrCreateDebtType()`
- `DebtTypeBuilder getDebtType()`
- `AssetTypeEnum getAssetType()`
- `InstrumentTypeEnum getSecurityType()`
- `List getOtherAssetType()`

#### Adder Methods

- `AssetTypeBuilder addOtherAssetType(String arg0)`
- `AssetTypeBuilder addOtherAssetType(String arg0, int arg1)`
- `AssetTypeBuilder addOtherAssetType(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetTypeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AssetTypeBuilder toBuilder()`
- `AssetTypeBuilder prune()`

