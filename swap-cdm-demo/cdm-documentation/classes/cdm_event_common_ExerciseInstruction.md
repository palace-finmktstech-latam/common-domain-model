# ExerciseInstruction

**Full Name:** `cdm.event.common.ExerciseInstruction`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ExerciseInstruction build()`

#### Getter Methods

- `Class getType()`
- `PrimitiveInstruction getExerciseQuantity()`
- `AdjustableOrAdjustedDate getExerciseDate()`
- `ReferenceWithMetaOptionPayout getExerciseOption()`
- `BusinessCenterTime getExerciseTime()`
- `List getReplacementTradeIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExerciseInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

