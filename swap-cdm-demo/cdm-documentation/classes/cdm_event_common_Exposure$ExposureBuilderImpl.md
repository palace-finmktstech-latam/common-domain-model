# ExposureBuilderImpl

**Full Name:** `cdm.event.common.Exposure$ExposureBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.Exposure$ExposureBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| tradePortfolio | `ReferenceWithMetaPortfolioStateBuilder` |  |
| aggregateValue | `MoneyBuilder` |  |
| calculationDateTime | `ZonedDateTime` |  |
| valuationDateTime | `ZonedDateTime` |  |

### Methods

#### Builder Methods

- `Exposure build()`

#### Setter Methods

- `ExposureBuilder setAggregateValue(Money arg0)`
- `ExposureBuilder setCalculationDateTime(ZonedDateTime arg0)`
- `ExposureBuilder setTradePortfolio(ReferenceWithMetaPortfolioState arg0)`
- `ExposureBuilder setValuationDateTime(ZonedDateTime arg0)`
- `ExposureBuilder setTradePortfolioValue(PortfolioState arg0)`

#### Getter Methods

- `MoneyBuilder getAggregateValue()`
- `ZonedDateTime getValuationDateTime()`
- `ZonedDateTime getCalculationDateTime()`
- `ReferenceWithMetaPortfolioStateBuilder getTradePortfolio()`
- `MoneyBuilder getOrCreateAggregateValue()`
- `ReferenceWithMetaPortfolioStateBuilder getOrCreateTradePortfolio()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExposureBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ExposureBuilder toBuilder()`
- `ExposureBuilder prune()`

