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

- `PortfolioBuilder setAggregationParameters(AggregationParameters arg0)`
- `PortfolioBuilder setPortfolioState(PortfolioState arg0)`

#### Getter Methods

- `AggregationParametersBuilder getOrCreateAggregationParameters()`
- `AggregationParametersBuilder getAggregationParameters()`
- `PortfolioStateBuilder getPortfolioState()`
- `PortfolioStateBuilder getOrCreatePortfolioState()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PortfolioBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PortfolioBuilder toBuilder()`
- `PortfolioBuilder prune()`

