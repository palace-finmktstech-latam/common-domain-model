# PortfolioBuilder

**Full Name:** `cdm.event.position.Portfolio$PortfolioBuilder`

**Package:** `cdm.event.position`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.Portfolio`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PortfolioBuilder setPortfolioState(PortfolioState arg0)`
- `PortfolioBuilder setAggregationParameters(AggregationParameters arg0)`

#### Getter Methods

- `AggregationParametersBuilder getOrCreateAggregationParameters()`
- `PortfolioStateBuilder getPortfolioState()`
- `AggregationParametersBuilder getAggregationParameters()`
- `PortfolioStateBuilder getOrCreatePortfolioState()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PortfolioBuilder prune()`

