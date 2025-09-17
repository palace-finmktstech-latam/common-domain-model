# Create_AssetTransfer

**Full Name:** `cdm.event.common.functions.Create_AssetTransfer`

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

- `Transfer evaluate(CalculateTransferInstruction arg0)`
- `MapperS assetPayout(CalculateTransferInstruction arg0)`
- `MapperS securityQuantity(CalculateTransferInstruction arg0)`
- `MapperS securityPrice(CalculateTransferInstruction arg0)`
- `TransferBuilder doEvaluate(CalculateTransferInstruction arg0)`
- `MapperS payout(CalculateTransferInstruction arg0)`
- `MapperS tradeQuantity(CalculateTransferInstruction arg0)`

### Annotations

- **ImplementedBy**

