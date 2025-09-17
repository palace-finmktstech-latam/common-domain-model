# Create_StockSplit

**Full Name:** `cdm.event.common.functions.Create_StockSplit`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| create_TradeState | `Create_TradeState` |  |
| filterQuantityByFinancialUnit | `FilterQuantityByFinancialUnit` |  |

### Methods

#### Other Methods

- `TradeState evaluate(StockSplitInstruction arg0, TradeState arg1)`
- `MapperS quantityChangeInstruction(StockSplitInstruction arg0, TradeState arg1)`
- `MapperS preSplitNumberOfShares(StockSplitInstruction arg0, TradeState arg1)`
- `MapperS postSplitNumberOfShares(StockSplitInstruction arg0, TradeState arg1)`
- `MapperS preSplitPrice(StockSplitInstruction arg0, TradeState arg1)`
- `MapperS postSplitPrice(StockSplitInstruction arg0, TradeState arg1)`
- `MapperS postSplitPriceQuantity(StockSplitInstruction arg0, TradeState arg1)`
- `TradeStateBuilder doEvaluate(StockSplitInstruction arg0, TradeState arg1)`
- `MapperS primitiveInstruction(StockSplitInstruction arg0, TradeState arg1)`

### Annotations

- **ImplementedBy**

