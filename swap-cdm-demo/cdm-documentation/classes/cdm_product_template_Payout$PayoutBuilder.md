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

- `PayoutBuilder setAssetPayout(AssetPayout arg0)`
- `PayoutBuilder setCommodityPayout(CommodityPayout arg0)`
- `PayoutBuilder setOptionPayout(OptionPayout arg0)`
- `PayoutBuilder setCreditDefaultPayout(CreditDefaultPayout arg0)`
- `PayoutBuilder setSettlementPayout(SettlementPayout arg0)`
- `PayoutBuilder setFixedPricePayout(FixedPricePayout arg0)`
- `PayoutBuilder setInterestRatePayout(InterestRatePayout arg0)`
- `PayoutBuilder setPerformancePayout(PerformancePayout arg0)`
- `PayoutBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `CreditDefaultPayoutBuilder getCreditDefaultPayout()`
- `AssetPayoutBuilder getOrCreateAssetPayout()`
- `CommodityPayoutBuilder getOrCreateCommodityPayout()`
- `OptionPayoutBuilder getOrCreateOptionPayout()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `InterestRatePayoutBuilder getInterestRatePayout()`
- `CreditDefaultPayoutBuilder getOrCreateCreditDefaultPayout()`
- `PerformancePayoutBuilder getOrCreatePerformancePayout()`
- `FixedPricePayoutBuilder getOrCreateFixedPricePayout()`
- `InterestRatePayoutBuilder getOrCreateInterestRatePayout()`
- `SettlementPayoutBuilder getOrCreateSettlementPayout()`
- `MetaFieldsBuilder getMeta()`
- `CommodityPayoutBuilder getCommodityPayout()`
- `PerformancePayoutBuilder getPerformancePayout()`
- `SettlementPayoutBuilder getSettlementPayout()`
- `AssetPayoutBuilder getAssetPayout()`
- `FixedPricePayoutBuilder getFixedPricePayout()`
- `OptionPayoutBuilder getOptionPayout()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PayoutBuilder prune()`

