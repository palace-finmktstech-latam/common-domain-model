# ExerciseInstructionBuilder

**Full Name:** `cdm.event.common.ExerciseInstruction$ExerciseInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ExerciseInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ExerciseInstructionBuilder setExerciseQuantity(PrimitiveInstruction arg0)`
- `ExerciseInstructionBuilder setExerciseOption(ReferenceWithMetaOptionPayout arg0)`
- `ExerciseInstructionBuilder setExerciseTime(BusinessCenterTime arg0)`
- `ExerciseInstructionBuilder setExerciseOptionValue(OptionPayout arg0)`
- `ExerciseInstructionBuilder setExerciseDate(AdjustableOrAdjustedDate arg0)`
- `ExerciseInstructionBuilder setReplacementTradeIdentifier(List arg0)`

#### Getter Methods

- `PrimitiveInstructionBuilder getExerciseQuantity()`
- `AdjustableOrAdjustedDateBuilder getExerciseDate()`
- `ReferenceWithMetaOptionPayoutBuilder getExerciseOption()`
- `BusinessCenterTimeBuilder getExerciseTime()`
- `AdjustableOrAdjustedDateBuilder getOrCreateExerciseDate()`
- `BusinessCenterTimeBuilder getOrCreateExerciseTime()`
- `ReferenceWithMetaOptionPayoutBuilder getOrCreateExerciseOption()`
- `List getReplacementTradeIdentifier()`
- `PrimitiveInstructionBuilder getOrCreateExerciseQuantity()`
- `TradeIdentifierBuilder getOrCreateReplacementTradeIdentifier(int arg0)`

#### Adder Methods

- `ExerciseInstructionBuilder addReplacementTradeIdentifier(TradeIdentifier arg0)`
- `ExerciseInstructionBuilder addReplacementTradeIdentifier(TradeIdentifier arg0, int arg1)`
- `ExerciseInstructionBuilder addReplacementTradeIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExerciseInstructionBuilder prune()`

