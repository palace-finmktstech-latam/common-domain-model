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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PayoutBuilder toBuilder()`
- `PayoutBuilder prune()`

