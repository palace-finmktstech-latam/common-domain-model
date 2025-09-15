# ExerciseTermsBuilder

**Full Name:** `cdm.product.template.ExerciseTerms$ExerciseTermsBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ExerciseTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `ExerciseTermsBuilder setExpirationTime(BusinessCenterTime arg0)`
- `ExerciseTermsBuilder setStyle(OptionExerciseStyleEnum arg0)`
- `ExerciseTermsBuilder setLatestExerciseTime(BusinessCenterTime arg0)`
- `ExerciseTermsBuilder setExerciseFee(ExerciseFee arg0)`
- `ExerciseTermsBuilder setExpirationTimeType(ExpirationTimeTypeEnum arg0)`
- `ExerciseTermsBuilder setRelevantUnderlyingDate(AdjustableOrRelativeDates arg0)`
- `ExerciseTermsBuilder setEarliestExerciseTime(BusinessCenterTime arg0)`
- `ExerciseTermsBuilder setExpirationDate(List arg0)`
- `ExerciseTermsBuilder setExerciseFeeSchedule(ExerciseFeeSchedule arg0)`
- `ExerciseTermsBuilder setExerciseProcedure(ExerciseProcedure arg0)`
- `ExerciseTermsBuilder setPartialExercise(PartialExercise arg0)`
- `ExerciseTermsBuilder setExerciseDates(AdjustableOrRelativeDates arg0)`
- `ExerciseTermsBuilder setMultipleExercise(MultipleExercise arg0)`
- `ExerciseTermsBuilder setCommencementDate(AdjustableOrRelativeDate arg0)`
- `ExerciseTermsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `AdjustableOrRelativeDateBuilder getCommencementDate()`
- `BusinessCenterTimeBuilder getLatestExerciseTime()`
- `ExerciseFeeScheduleBuilder getExerciseFeeSchedule()`
- `BusinessCenterTimeBuilder getEarliestExerciseTime()`
- `MultipleExerciseBuilder getMultipleExercise()`
- `BusinessCenterTimeBuilder getExpirationTime()`
- `ExerciseFeeBuilder getExerciseFee()`
- `AdjustableOrRelativeDatesBuilder getRelevantUnderlyingDate()`
- `AdjustableOrRelativeDatesBuilder getExerciseDates()`
- `ExerciseProcedureBuilder getExerciseProcedure()`
- `PartialExerciseBuilder getPartialExercise()`
- `List getExpirationDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MultipleExerciseBuilder getOrCreateMultipleExercise()`
- `BusinessCenterTimeBuilder getOrCreateLatestExerciseTime()`
- `AdjustableOrRelativeDatesBuilder getOrCreateRelevantUnderlyingDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateCommencementDate()`
- `BusinessCenterTimeBuilder getOrCreateEarliestExerciseTime()`
- `ExerciseFeeScheduleBuilder getOrCreateExerciseFeeSchedule()`
- `ExerciseProcedureBuilder getOrCreateExerciseProcedure()`
- `ExerciseFeeBuilder getOrCreateExerciseFee()`
- `PartialExerciseBuilder getOrCreatePartialExercise()`
- `BusinessCenterTimeBuilder getOrCreateExpirationTime()`
- `AdjustableOrRelativeDatesBuilder getOrCreateExerciseDates()`
- `AdjustableOrRelativeDateBuilder getOrCreateExpirationDate(int arg0)`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `ExerciseTermsBuilder addExpirationDate(List arg0)`
- `ExerciseTermsBuilder addExpirationDate(AdjustableOrRelativeDate arg0)`
- `ExerciseTermsBuilder addExpirationDate(AdjustableOrRelativeDate arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExerciseTermsBuilder prune()`

