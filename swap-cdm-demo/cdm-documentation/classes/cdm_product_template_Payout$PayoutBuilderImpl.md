# PayoutBuilderImpl

**Full Name:** `cdm.product.template.Payout$PayoutBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.Payout$PayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| assetPayout | `AssetPayoutBuilder` |  |
| commodityPayout | `CommodityPayoutBuilder` |  |
| creditDefaultPayout | `CreditDefaultPayoutBuilder` |  |
| fixedPricePayout | `FixedPricePayoutBuilder` |  |
| interestRatePayout | `InterestRatePayoutBuilder` |  |
| optionPayout | `OptionPayoutBuilder` |  |
| performancePayout | `PerformancePayoutBuilder` |  |
| settlementPayout | `SettlementPayoutBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Payout build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PayoutBuilder prune()`
- `PayoutBuilder toBuilder()`
- `boolean hasData()`

