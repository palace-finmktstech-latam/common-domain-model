# EquityCashSettlementAmount

**Full Name:** `cdm.event.common.functions.EquityCashSettlementAmount`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| abs | `Abs` |  |
| equityPerformance0 | `EquityPerformance` |  |
| extractCounterpartyByRole | `ExtractCounterpartyByRole` |  |
| resolveCashSettlementDate | `ResolveCashSettlementDate` |  |
| resolveEquityInitialPrice | `ResolveEquityInitialPrice` |  |

### Methods

#### Other Methods

- `MapperS receiver(TradeState arg0, Date arg1)`
- `Transfer evaluate(TradeState arg0, Date arg1)`
- `MapperS payer(TradeState arg0, Date arg1)`
- `TransferBuilder doEvaluate(TradeState arg0, Date arg1)`
- `MapperS equityPerformancePayout(TradeState arg0, Date arg1)`
- `MapperS equityPerformance1(TradeState arg0, Date arg1)`
- `MapperS payout(TradeState arg0, Date arg1)`

### Annotations

- **ImplementedBy**

