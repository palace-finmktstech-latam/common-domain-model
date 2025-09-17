# Create_TradeState

**Full Name:** `cdm.event.common.functions.Create_TradeState`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| conditionValidator | `ConditionValidator` |  |
| objectValidator | `ModelObjectValidator` |  |
| create_ContractFormation | `Create_ContractFormation` |  |
| create_Execution | `Create_Execution` |  |
| create_IndexTransitionTermsChange | `Create_IndexTransitionTermsChange` |  |
| create_Observation | `Create_Observation` |  |
| create_PartyChange | `Create_PartyChange` |  |
| create_QuantityChange | `Create_QuantityChange` |  |
| create_Reset | `Create_Reset` |  |
| create_StockSplit | `Create_StockSplit` |  |
| create_TermsChange | `Create_TermsChange` |  |
| create_Transfer | `Create_Transfer` |  |
| create_Valuation | `Create_Valuation` |  |

### Methods

#### Other Methods

- `MapperS reset(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS transfer(PrimitiveInstruction arg0, TradeState arg1)`
- `TradeState evaluate(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS observation(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS execution(PrimitiveInstruction arg0, TradeState arg1)`
- `TradeStateBuilder doEvaluate(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS stockSplit(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS valuation(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS contractFormation(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS partyChange(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS quantityChange(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS termsChange(PrimitiveInstruction arg0, TradeState arg1)`
- `MapperS indexTransition(PrimitiveInstruction arg0, TradeState arg1)`

### Annotations

- **ImplementedBy**

