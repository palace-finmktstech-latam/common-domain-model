# SecurityFinanceCashSettlementAmount

**Full Name:** `cdm.event.common.functions.SecurityFinanceCashSettlementAmount`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| conditionValidator | `ConditionValidator` |  |
| objectValidator | `ModelObjectValidator` |  |
| assetDeepPathUtil | `AssetDeepPathUtil` |  |
| extractCounterpartyByRole | `ExtractCounterpartyByRole` |  |
| filterPrice | `FilterPrice` |  |
| filterQuantityByFinancialUnit | `FilterQuantityByFinancialUnit` |  |

### Methods

#### Other Methods

- `Transfer evaluate(TradeState arg0, Date arg1, Quantity arg2, PayerReceiver arg3)`
- `MapperS assetPayout(TradeState arg0, Date arg1, Quantity arg2, PayerReceiver arg3)`
- `MapperS securityQuantity(TradeState arg0, Date arg1, Quantity arg2, PayerReceiver arg3)`
- `MapperS marginRatio(TradeState arg0, Date arg1, Quantity arg2, PayerReceiver arg3)`
- `MapperS securityPrice(TradeState arg0, Date arg1, Quantity arg2, PayerReceiver arg3)`
- `TransferBuilder doEvaluate(TradeState arg0, Date arg1, Quantity arg2, PayerReceiver arg3)`
- `MapperS collateral(TradeState arg0, Date arg1, Quantity arg2, PayerReceiver arg3)`
- `MapperS payout(TradeState arg0, Date arg1, Quantity arg2, PayerReceiver arg3)`

### Annotations

- **ImplementedBy**

