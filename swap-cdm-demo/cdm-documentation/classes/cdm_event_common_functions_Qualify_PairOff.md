# Qualify_PairOff

**Full Name:** `cdm.event.common.functions.Qualify_PairOff`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`
- `com.rosetta.model.lib.functions.IQualifyFunctionExtension`

### Fields

| Name | Type | Description |
|------|------|-------------|
| filterOpenTradeStates | `FilterOpenTradeStates` |  |
| newTradeInstructionOnlyExists | `NewTradeInstructionOnlyExists` |  |

### Methods

#### Getter Methods

- `String getNamePrefix()`

#### Other Methods

- `Boolean evaluate(BusinessEvent arg0)`
- `Boolean doEvaluate(BusinessEvent arg0)`
- `MapperC newTradeInstruction(BusinessEvent arg0)`
- `MapperC openTradeState(BusinessEvent arg0)`
- `MapperC packageRef(BusinessEvent arg0)`

### Annotations

- **ImplementedBy**

