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
- `List getReplacementTradeIdentifier()`
- `BusinessCenterTime getExerciseTime()`
- `PrimitiveInstruction getExerciseQuantity()`
- `ReferenceWithMetaOptionPayout getExerciseOption()`
- `AdjustableOrAdjustedDate getExerciseDate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExerciseInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

