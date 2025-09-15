# ValuationBuilderImpl

**Full Name:** `cdm.event.common.Valuation$ValuationBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.Valuation$ValuationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| amount | `MoneyBuilder` |  |
| timestamp | `ZonedDateTime` |  |
| method | `ValuationTypeEnum` |  |
| source | `ValuationSourceEnum` |  |
| delta | `BigDecimal` |  |
| valuationTiming | `PriceTimingEnum` |  |
| priceComponent | `PriceBuilder` |  |

### Methods

#### Builder Methods

- `Valuation build()`

#### Setter Methods

- `ValuationBuilder setMethod(ValuationTypeEnum arg0)`
- `ValuationBuilder setTimestamp(ZonedDateTime arg0)`
- `ValuationBuilder setValuationTiming(PriceTimingEnum arg0)`
- `ValuationBuilder setPriceComponent(Price arg0)`
- `ValuationBuilder setSource(ValuationSourceEnum arg0)`
- `ValuationBuilder setDelta(BigDecimal arg0)`
- `ValuationBuilder setAmount(Money arg0)`

#### Getter Methods

- `ValuationTypeEnum getMethod()`
- `ZonedDateTime getTimestamp()`
- `ValuationSourceEnum getSource()`
- `MoneyBuilder getOrCreateAmount()`
- `PriceBuilder getPriceComponent()`
- `PriceBuilder getOrCreatePriceComponent()`
- `PriceTimingEnum getValuationTiming()`
- `BigDecimal getDelta()`
- `MoneyBuilder getAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ValuationBuilder toBuilder()`
- `ValuationBuilder prune()`

