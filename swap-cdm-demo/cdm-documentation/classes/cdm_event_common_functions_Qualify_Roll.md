# Qualify_Roll

**Full Name:** `cdm.event.common.functions.Qualify_Roll`

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

### Methods

#### Getter Methods

- `String getNamePrefix()`

#### Other Methods

- `Boolean evaluate(BusinessEvent arg0)`
- `Boolean doEvaluate(BusinessEvent arg0)`
- `MapperS openEconomicTerms(BusinessEvent arg0)`
- `MapperS beforeEconomicterms(BusinessEvent arg0)`
- `MapperC closedTradeState(BusinessEvent arg0)`

### Annotations

- **ImplementedBy**

