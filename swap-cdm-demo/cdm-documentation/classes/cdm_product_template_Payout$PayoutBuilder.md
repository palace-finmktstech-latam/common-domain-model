# PayoutBuilder

**Full Name:** `cdm.product.template.Payout$PayoutBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Payout`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PayoutBuilder setMeta(MetaFields arg0)`
- `PayoutBuilder setOptionPayout(OptionPayout arg0)`
- `PayoutBuilder setSettlementPayout(SettlementPayout arg0)`
- `PayoutBuilder setCommodityPayout(CommodityPayout arg0)`
- `PayoutBuilder setFixedPricePayout(FixedPricePayout arg0)`
- `PayoutBuilder setCreditDefaultPayout(CreditDefaultPayout arg0)`
- `PayoutBuilder setAssetPayout(AssetPayout arg0)`
- `PayoutBuilder setPerformancePayout(PerformancePayout arg0)`
- `PayoutBuilder setInterestRatePayout(InterestRatePayout arg0)`

#### Getter Methods

- `CreditDefaultPayoutBuilder getCreditDefaultPayout()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `InterestRatePayoutBuilder getInterestRatePayout()`
- `MetaFieldsBuilder getMeta()`
- `AssetPayoutBuilder getOrCreateAssetPayout()`
- `CommodityPayoutBuilder getOrCreateCommodityPayout()`
- `InterestRatePayoutBuilder getOrCreateInterestRatePayout()`
- `FixedPricePayoutBuilder getOrCreateFixedPricePayout()`
- `PerformancePayoutBuilder getOrCreatePerformancePayout()`
- `CreditDefaultPayoutBuilder getOrCreateCreditDefaultPayout()`
- `OptionPayoutBuilder getOrCreateOptionPayout()`
- `AssetPayoutBuilder getAssetPayout()`
- `CommodityPayoutBuilder getCommodityPayout()`
- `OptionPayoutBuilder getOptionPayout()`
- `FixedPricePayoutBuilder getFixedPricePayout()`
- `PerformancePayoutBuilder getPerformancePayout()`
- `SettlementPayoutBuilder getSettlementPayout()`
- `SettlementPayoutBuilder getOrCreateSettlementPayout()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PayoutBuilder prune()`

