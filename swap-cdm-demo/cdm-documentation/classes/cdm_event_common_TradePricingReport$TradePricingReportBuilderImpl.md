# TradePricingReportBuilderImpl

**Full Name:** `cdm.event.common.TradePricingReport$TradePricingReportBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.TradePricingReport$TradePricingReportBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| trade | `TradeBuilder` |  |
| pricingTime | `TimeZoneBuilder` |  |
| discountingIndex | `FloatingRateIndexEnum` |  |

### Methods

#### Builder Methods

- `TradePricingReport build()`

#### Setter Methods

- `TradePricingReportBuilder setPricingTime(TimeZone arg0)`
- `TradePricingReportBuilder setDiscountingIndex(FloatingRateIndexEnum arg0)`
- `TradePricingReportBuilder setTrade(Trade arg0)`

#### Getter Methods

- `TradeBuilder getOrCreateTrade()`
- `TimeZoneBuilder getPricingTime()`
- `FloatingRateIndexEnum getDiscountingIndex()`
- `TimeZoneBuilder getOrCreatePricingTime()`
- `TradeBuilder getTrade()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TradePricingReportBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TradePricingReportBuilder prune()`
- `TradePricingReportBuilder toBuilder()`
- `boolean hasData()`

