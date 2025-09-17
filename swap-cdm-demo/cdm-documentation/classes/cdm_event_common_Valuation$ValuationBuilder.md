# ValuationBuilder

**Full Name:** `cdm.event.common.Valuation$ValuationBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.Valuation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ValuationBuilder setMethod(ValuationTypeEnum arg0)`
- `ValuationBuilder setPriceComponent(Price arg0)`
- `ValuationBuilder setValuationTiming(PriceTimingEnum arg0)`
- `ValuationBuilder setTimestamp(ZonedDateTime arg0)`
- `ValuationBuilder setSource(ValuationSourceEnum arg0)`
- `ValuationBuilder setAmount(Money arg0)`
- `ValuationBuilder setDelta(BigDecimal arg0)`

#### Getter Methods

- `MoneyBuilder getOrCreateAmount()`
- `PriceBuilder getOrCreatePriceComponent()`
- `PriceBuilder getPriceComponent()`
- `MoneyBuilder getAmount()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationBuilder prune()`

