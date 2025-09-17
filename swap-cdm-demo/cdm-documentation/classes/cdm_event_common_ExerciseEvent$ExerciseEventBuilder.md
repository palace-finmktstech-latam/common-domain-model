# ExerciseEventBuilder

**Full Name:** `cdm.event.common.ExerciseEvent$ExerciseEventBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ExerciseEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `ExerciseEventBuilder setAdjustedRelevantSwapEffectiveDate(Date arg0)`
- `ExerciseEventBuilder setAdjustedCashSettlementPaymentDate(Date arg0)`
- `ExerciseEventBuilder setAdjustedExerciseFeePaymentDate(Date arg0)`
- `ExerciseEventBuilder setAdjustedCashSettlementValuationDate(Date arg0)`
- `ExerciseEventBuilder setAdjustedExerciseDate(Date arg0)`
- `ExerciseEventBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExerciseEventBuilder prune()`

