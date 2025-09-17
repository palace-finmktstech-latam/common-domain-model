# FxMarkToMarket

**Full Name:** `cdm.event.position.functions.FxMarkToMarket`

**Package:** `cdm.event.position.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| conditionValidator | `ConditionValidator` |  |
| filterQuantityByCurrency | `FilterQuantityByCurrency` |  |
| interpolateForwardRate | `InterpolateForwardRate` |  |

### Methods

#### Setter Methods

- `MapperS settlementPayout(Trade arg0)`

#### Other Methods

- `BigDecimal evaluate(Trade arg0)`
- `BigDecimal doEvaluate(Trade arg0)`
- `MapperS quotedCurrency(Trade arg0)`
- `MapperS baseCurrency(Trade arg0)`
- `MapperS quotedQuantity(Trade arg0)`
- `MapperS baseQuantity(Trade arg0)`
- `MapperS interpolatedRate(Trade arg0)`
- `MapperC quantities(Trade arg0)`

### Annotations

- **ImplementedBy**

