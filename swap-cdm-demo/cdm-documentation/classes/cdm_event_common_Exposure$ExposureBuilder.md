# ExposureBuilder

**Full Name:** `cdm.event.common.Exposure$ExposureBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.Exposure`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ExposureBuilder setAggregateValue(Money arg0)`
- `ExposureBuilder setCalculationDateTime(ZonedDateTime arg0)`
- `ExposureBuilder setTradePortfolio(ReferenceWithMetaPortfolioState arg0)`
- `ExposureBuilder setValuationDateTime(ZonedDateTime arg0)`
- `ExposureBuilder setTradePortfolioValue(PortfolioState arg0)`

#### Getter Methods

- `MoneyBuilder getAggregateValue()`
- `ReferenceWithMetaPortfolioStateBuilder getTradePortfolio()`
- `MoneyBuilder getOrCreateAggregateValue()`
- `ReferenceWithMetaPortfolioStateBuilder getOrCreateTradePortfolio()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExposureBuilder prune()`

