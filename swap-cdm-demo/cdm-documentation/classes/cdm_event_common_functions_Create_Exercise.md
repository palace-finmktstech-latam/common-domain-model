# Create_Exercise

**Full Name:** `cdm.event.common.functions.Create_Exercise`

**Package:** `cdm.event.common.functions`

## Type: Abstract Class

### Implemented Interfaces

- `com.rosetta.model.lib.functions.RosettaFunction`

### Fields

| Name | Type | Description |
|------|------|-------------|
| conditionValidator | `ConditionValidator` |  |
| objectValidator | `ModelObjectValidator` |  |
| create_Execution | `Create_Execution` |  |
| create_NonTransferableProduct | `Create_NonTransferableProduct` |  |
| create_TradeState | `Create_TradeState` |  |
| update_ProductDirection | `Update_ProductDirection` |  |

### Methods

#### Other Methods

- `List evaluate(ExerciseInstruction arg0, TradeState arg1)`
- `MapperS execution(ExerciseInstruction arg0, TradeState arg1)`
- `List doEvaluate(ExerciseInstruction arg0, TradeState arg1)`
- `MapperS underlier(ExerciseInstruction arg0, TradeState arg1)`
- `MapperS optionPayout(ExerciseInstruction arg0, TradeState arg1)`
- `MapperS productWithDirection(ExerciseInstruction arg0, TradeState arg1)`
- `MapperS resultProduct(ExerciseInstruction arg0, TradeState arg1)`

### Annotations

- **ImplementedBy**

