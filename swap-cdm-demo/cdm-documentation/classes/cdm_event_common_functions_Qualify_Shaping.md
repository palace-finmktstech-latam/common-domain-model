# Qualify_Shaping

**Full Name:** `cdm.event.common.functions.Qualify_Shaping`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`
- `com.rosetta.model.lib.functions.IQualifyFunctionExtension`

### Fields

| Name | Type | Description |
|------|------|-------------|
| filterClosedTradeStates | `FilterClosedTradeStates` |  |
| filterOpenTradeStates | `FilterOpenTradeStates` |  |
| tradeNoExecutionDetails | `TradeNoExecutionDetails` |  |

### Methods

#### Getter Methods

- `String getNamePrefix()`

#### Other Methods

- `Boolean evaluate(BusinessEvent arg0)`
- `MapperS instruction(BusinessEvent arg0)`
- `MapperS beforeTradeState(BusinessEvent arg0)`
- `MapperC openTradeNoExecutionDetails(BusinessEvent arg0)`
- `Boolean doEvaluate(BusinessEvent arg0)`
- `MapperC packageRef(BusinessEvent arg0)`
- `MapperC openTradeStates(BusinessEvent arg0)`
- `MapperS closedTradeState(BusinessEvent arg0)`

### Annotations

- **ImplementedBy**

