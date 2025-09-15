# Create_AdjustmentPrimitiveInstruction

**Full Name:** `cdm.event.common.functions.Create_AdjustmentPrimitiveInstruction`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| conditionValidator | `ConditionValidator` |  |
| objectValidator | `ModelObjectValidator` |  |
| create_EffectiveOrTerminationDateTermChangeInstruction | `Create_EffectiveOrTerminationDateTermChangeInstruction` |  |
| create_TerminationInstruction | `Create_TerminationInstruction` |  |

### Methods

#### Other Methods

- `PrimitiveInstruction evaluate(TradeState arg0, BigDecimal arg1, BigDecimal arg2, AdjustableOrRelativeDate arg3)`
- `PrimitiveInstructionBuilder doEvaluate(TradeState arg0, BigDecimal arg1, BigDecimal arg2, AdjustableOrRelativeDate arg3)`
- `MapperS newPriceQuantity(TradeState arg0, BigDecimal arg1, BigDecimal arg2, AdjustableOrRelativeDate arg3)`
- `MapperC oldPriceQuantity(TradeState arg0, BigDecimal arg1, BigDecimal arg2, AdjustableOrRelativeDate arg3)`
- `MapperS currentAssetPrice(TradeState arg0, BigDecimal arg1, BigDecimal arg2, AdjustableOrRelativeDate arg3)`
- `MapperC changeQuantity(TradeState arg0, BigDecimal arg1, BigDecimal arg2, AdjustableOrRelativeDate arg3)`
- `MapperS newPrice(TradeState arg0, BigDecimal arg1, BigDecimal arg2, AdjustableOrRelativeDate arg3)`

### Annotations

- **ImplementedBy**

