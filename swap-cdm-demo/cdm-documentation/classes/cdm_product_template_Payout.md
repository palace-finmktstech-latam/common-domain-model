# Payout

**Full Name:** `cdm.product.template.Payout`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `Payout build()`

#### Getter Methods

- `Class getType()`
- `CreditDefaultPayout getCreditDefaultPayout()`
- `InterestRatePayout getInterestRatePayout()`
- `MetaFields getMeta()`
- `AssetPayout getAssetPayout()`
- `CommodityPayout getCommodityPayout()`
- `OptionPayout getOptionPayout()`
- `FixedPricePayout getFixedPricePayout()`
- `PerformancePayout getPerformancePayout()`
- `SettlementPayout getSettlementPayout()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

