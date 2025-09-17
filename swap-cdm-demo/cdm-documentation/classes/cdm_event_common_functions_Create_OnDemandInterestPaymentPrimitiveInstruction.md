# Create_OnDemandInterestPaymentPrimitiveInstruction

**Full Name:** `cdm.event.common.functions.Create_OnDemandInterestPaymentPrimitiveInstruction`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| conditionValidator | `ConditionValidator` |  |
| objectValidator | `ModelObjectValidator` |  |
| extractCounterpartyByRole | `ExtractCounterpartyByRole` |  |

### Methods

#### Other Methods

- `MapperS transfer(TradeState arg0, Money arg1, SettlementDate arg2)`
- `PrimitiveInstruction evaluate(TradeState arg0, Money arg1, SettlementDate arg2)`
- `MapperS payerReceiver(TradeState arg0, Money arg1, SettlementDate arg2)`
- `MapperS interestRatePayout(TradeState arg0, Money arg1, SettlementDate arg2)`
- `PrimitiveInstructionBuilder doEvaluate(TradeState arg0, Money arg1, SettlementDate arg2)`

### Annotations

- **ImplementedBy**

