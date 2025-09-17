# TradePricingReportBuilder

**Full Name:** `cdm.event.common.TradePricingReport$TradePricingReportBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.TradePricingReport`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TradePricingReportBuilder setPricingTime(TimeZone arg0)`
- `TradePricingReportBuilder setDiscountingIndex(FloatingRateIndexEnum arg0)`
- `TradePricingReportBuilder setTrade(Trade arg0)`

#### Getter Methods

- `TradeBuilder getOrCreateTrade()`
- `TimeZoneBuilder getPricingTime()`
- `TimeZoneBuilder getOrCreatePricingTime()`
- `TradeBuilder getTrade()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TradePricingReportBuilder prune()`

