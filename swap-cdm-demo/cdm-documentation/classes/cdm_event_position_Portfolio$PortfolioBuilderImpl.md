# PortfolioBuilderImpl

**Full Name:** `cdm.event.position.Portfolio$PortfolioBuilderImpl`

**Package:** `cdm.event.position`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.position.Portfolio$PortfolioBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| aggregationParameters | `AggregationParametersBuilder` |  |
| portfolioState | `PortfolioStateBuilder` |  |

### Methods

#### Builder Methods

- `Portfolio build()`

#### Setter Methods

- `PortfolioBuilder setPortfolioState(PortfolioState arg0)`
- `PortfolioBuilder setAggregationParameters(AggregationParameters arg0)`

#### Getter Methods

- `AggregationParametersBuilder getOrCreateAggregationParameters()`
- `PortfolioStateBuilder getPortfolioState()`
- `AggregationParametersBuilder getAggregationParameters()`
- `PortfolioStateBuilder getOrCreatePortfolioState()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PortfolioBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PortfolioBuilder prune()`
- `PortfolioBuilder toBuilder()`
- `boolean hasData()`

