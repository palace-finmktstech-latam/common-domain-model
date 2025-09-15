# ResolveSecurityFinanceBillingAmount

**Full Name:** `cdm.event.common.functions.ResolveSecurityFinanceBillingAmount`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| objectValidator | `ModelObjectValidator` |  |
| calculationPeriodRange0 | `CalculationPeriodRange` |  |
| extractCounterpartyByRole | `ExtractCounterpartyByRole` |  |
| filterQuantityByFinancialUnit | `FilterQuantityByFinancialUnit` |  |
| fixedAmount | `FixedAmount` |  |
| floatingAmount | `FloatingAmount` |  |
| productDeepPathUtil | `ProductDeepPathUtil` |  |

### Methods

#### Other Methods

- `Transfer evaluate(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `TransferBuilder doEvaluate(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS payerPartyReference(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS receiverPartyReference(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS securityQuantity(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS marginRatio(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS assetPayout(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS billingQuantity(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS performance(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS valuationPercentage(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS calculationPeriodRange1(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS interestRatePayout(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS haircutPercentage(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`
- `MapperS collateral(TradeState arg0, Reset arg1, Date arg2, Date arg3, Date arg4)`

### Annotations

- **ImplementedBy**

