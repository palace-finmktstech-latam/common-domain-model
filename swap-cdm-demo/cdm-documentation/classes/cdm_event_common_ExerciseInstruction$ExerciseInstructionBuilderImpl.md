# ExerciseInstructionBuilderImpl

**Full Name:** `cdm.event.common.ExerciseInstruction$ExerciseInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ExerciseInstruction$ExerciseInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| exerciseQuantity | `PrimitiveInstructionBuilder` |  |
| exerciseOption | `ReferenceWithMetaOptionPayoutBuilder` |  |
| exerciseDate | `AdjustableOrAdjustedDateBuilder` |  |
| exerciseTime | `BusinessCenterTimeBuilder` |  |
| replacementTradeIdentifier | `java.util.List<cdm.event.common.TradeIdentifier$TradeIdentifierBuilder>` |  |

### Methods

#### Builder Methods

- `ExerciseInstruction build()`

#### Setter Methods

- `ExerciseInstructionBuilder setReplacementTradeIdentifier(List arg0)`
- `ExerciseInstructionBuilder setExerciseQuantity(PrimitiveInstruction arg0)`
- `ExerciseInstructionBuilder setExerciseTime(BusinessCenterTime arg0)`
- `ExerciseInstructionBuilder setExerciseOption(ReferenceWithMetaOptionPayout arg0)`
- `ExerciseInstructionBuilder setExerciseDate(AdjustableOrAdjustedDate arg0)`
- `ExerciseInstructionBuilder setExerciseOptionValue(OptionPayout arg0)`

#### Getter Methods

- `List getReplacementTradeIdentifier()`
- `PrimitiveInstructionBuilder getOrCreateExerciseQuantity()`
- `TradeIdentifierBuilder getOrCreateReplacementTradeIdentifier(int arg0)`
- `BusinessCenterTimeBuilder getExerciseTime()`
- `ReferenceWithMetaOptionPayoutBuilder getOrCreateExerciseOption()`
- `PrimitiveInstructionBuilder getExerciseQuantity()`
- `BusinessCenterTimeBuilder getOrCreateExerciseTime()`
- `ReferenceWithMetaOptionPayoutBuilder getExerciseOption()`
- `AdjustableOrAdjustedDateBuilder getOrCreateExerciseDate()`
- `AdjustableOrAdjustedDateBuilder getExerciseDate()`

#### Adder Methods

- `ExerciseInstructionBuilder addReplacementTradeIdentifier(TradeIdentifier arg0, int arg1)`
- `ExerciseInstructionBuilder addReplacementTradeIdentifier(List arg0)`
- `ExerciseInstructionBuilder addReplacementTradeIdentifier(TradeIdentifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExerciseInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ExerciseInstructionBuilder prune()`
- `ExerciseInstructionBuilder toBuilder()`
- `boolean hasData()`

