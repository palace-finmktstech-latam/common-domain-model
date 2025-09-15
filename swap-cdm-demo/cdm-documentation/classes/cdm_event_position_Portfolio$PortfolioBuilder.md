# PortfolioBuilder

**Full Name:** `cdm.event.position.Portfolio$PortfolioBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.Portfolio`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PortfolioBuilder setAggregationParameters(AggregationParameters arg0)`
- `PortfolioBuilder setPortfolioState(PortfolioState arg0)`

#### Getter Methods

- `AggregationParametersBuilder getOrCreateAggregationParameters()`
- `AggregationParametersBuilder getAggregationParameters()`
- `PortfolioStateBuilder getPortfolioState()`
- `PortfolioStateBuilder getOrCreatePortfolioState()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PortfolioBuilder prune()`

