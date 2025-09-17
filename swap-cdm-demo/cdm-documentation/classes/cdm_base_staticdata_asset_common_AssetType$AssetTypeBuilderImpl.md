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

- `AssetTypeBuilder setAssetType(AssetTypeEnum arg0)`
- `AssetTypeBuilder setOtherAssetType(List arg0)`
- `AssetTypeBuilder setSecurityType(InstrumentTypeEnum arg0)`
- `AssetTypeBuilder setEquityType(EquityTypeEnum arg0)`
- `AssetTypeBuilder setFundType(FundProductTypeEnum arg0)`
- `AssetTypeBuilder setDebtType(DebtType arg0)`

#### Getter Methods

- `List getOtherAssetType()`
- `InstrumentTypeEnum getSecurityType()`
- `AssetTypeEnum getAssetType()`
- `DebtTypeBuilder getDebtType()`
- `EquityTypeEnum getEquityType()`
- `FundProductTypeEnum getFundType()`
- `DebtTypeBuilder getOrCreateDebtType()`

#### Adder Methods

- `AssetTypeBuilder addOtherAssetType(List arg0)`
- `AssetTypeBuilder addOtherAssetType(String arg0)`
- `AssetTypeBuilder addOtherAssetType(String arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetTypeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetTypeBuilder prune()`
- `AssetTypeBuilder toBuilder()`
- `boolean hasData()`

