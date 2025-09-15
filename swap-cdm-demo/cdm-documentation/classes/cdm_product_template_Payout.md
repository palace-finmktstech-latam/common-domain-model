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
- `CommodityPayout getCommodityPayout()`
- `PerformancePayout getPerformancePayout()`
- `SettlementPayout getSettlementPayout()`
- `AssetPayout getAssetPayout()`
- `FixedPricePayout getFixedPricePayout()`
- `OptionPayout getOptionPayout()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

