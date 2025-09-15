# Create_QuantityChange

**Full Name:** `cdm.event.common.functions.Create_QuantityChange`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| conditionValidator | `ConditionValidator` |  |
| objectValidator | `ModelObjectValidator` |  |
| addTradeLot | `AddTradeLot` |  |
| filterTradeLot | `FilterTradeLot` |  |
| replaceTradeLot | `ReplaceTradeLot` |  |
| updateAmountForEachMatchingQuantity | `UpdateAmountForEachMatchingQuantity` |  |

### Methods

#### Other Methods

- `TradeState evaluate(QuantityChangeInstruction arg0, TradeState arg1)`
- `TradeStateBuilder doEvaluate(QuantityChangeInstruction arg0, TradeState arg1)`
- `MapperC newTradeLots(QuantityChangeInstruction arg0, TradeState arg1)`
- `MapperC newPriceQuantity(QuantityChangeInstruction arg0, TradeState arg1)`
- `MapperS tradeLotExists(QuantityChangeInstruction arg0, TradeState arg1)`
- `MapperS trade(QuantityChangeInstruction arg0, TradeState arg1)`
- `MapperC tradeLot(QuantityChangeInstruction arg0, TradeState arg1)`

### Annotations

- **ImplementedBy**

