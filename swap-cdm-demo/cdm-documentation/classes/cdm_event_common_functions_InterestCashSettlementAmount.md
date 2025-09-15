# InterestCashSettlementAmount

**Full Name:** `cdm.event.common.functions.InterestCashSettlementAmount`

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
| fixedAmount | `FixedAmount` |  |
| floatingAmount | `FloatingAmount` |  |

### Methods

#### Other Methods

- `MapperS receiver(TradeState arg0, Payout arg1, List arg2, Date arg3)`
- `Transfer evaluate(TradeState arg0, Payout arg1, List arg2, Date arg3)`
- `MapperS payer(TradeState arg0, Payout arg1, List arg2, Date arg3)`
- `TransferBuilder doEvaluate(TradeState arg0, Payout arg1, List arg2, Date arg3)`
- `MapperS performance(TradeState arg0, Payout arg1, List arg2, Date arg3)`
- `MapperS interestRatePayout(TradeState arg0, Payout arg1, List arg2, Date arg3)`

### Annotations

- **ImplementedBy**

