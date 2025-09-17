# ExposureBuilder

**Full Name:** `cdm.event.common.Exposure$ExposureBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.Exposure`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ExposureBuilder setCalculationDateTime(ZonedDateTime arg0)`
- `ExposureBuilder setValuationDateTime(ZonedDateTime arg0)`
- `ExposureBuilder setTradePortfolioValue(PortfolioState arg0)`
- `ExposureBuilder setTradePortfolio(ReferenceWithMetaPortfolioState arg0)`
- `ExposureBuilder setAggregateValue(Money arg0)`

#### Getter Methods

- `ReferenceWithMetaPortfolioStateBuilder getTradePortfolio()`
- `MoneyBuilder getAggregateValue()`
- `ReferenceWithMetaPortfolioStateBuilder getOrCreateTradePortfolio()`
- `MoneyBuilder getOrCreateAggregateValue()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExposureBuilder prune()`

