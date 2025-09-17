# ExerciseTermsBuilderImpl

**Full Name:** `cdm.product.template.ExerciseTerms$ExerciseTermsBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.ExerciseTerms$ExerciseTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| style | `OptionExerciseStyleEnum` |  |
| commencementDate | `AdjustableOrRelativeDateBuilder` |  |
| exerciseDates | `AdjustableOrRelativeDatesBuilder` |  |
| expirationDate | `java.util.List<cdm.base.datetime.AdjustableOrRelativeDate$AdjustableOrRelativeDateBuilder>` |  |
| relevantUnderlyingDate | `AdjustableOrRelativeDatesBuilder` |  |
| earliestExerciseTime | `BusinessCenterTimeBuilder` |  |
| latestExerciseTime | `BusinessCenterTimeBuilder` |  |
| expirationTime | `BusinessCenterTimeBuilder` |  |
| expirationTimeType | `ExpirationTimeTypeEnum` |  |
| multipleExercise | `MultipleExerciseBuilder` |  |
| exerciseFeeSchedule | `ExerciseFeeScheduleBuilder` |  |
| exerciseProcedure | `ExerciseProcedureBuilder` |  |
| exerciseFee | `ExerciseFeeBuilder` |  |
| partialExercise | `PartialExerciseBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ExerciseTerms build()`

#### Setter Methods

- `ExerciseTermsBuilder setExpirationTime(BusinessCenterTime arg0)`
- `ExerciseTermsBuilder setMeta(MetaFields arg0)`
- `ExerciseTermsBuilder setEarliestExerciseTime(BusinessCenterTime arg0)`
- `ExerciseTermsBuilder setLatestExerciseTime(BusinessCenterTime arg0)`
- `ExerciseTermsBuilder setExerciseDates(AdjustableOrRelativeDates arg0)`
- `ExerciseTermsBuilder setMultipleExercise(MultipleExercise arg0)`
- `ExerciseTermsBuilder setExerciseFee(ExerciseFee arg0)`
- `ExerciseTermsBuilder setPartialExercise(PartialExercise arg0)`
- `ExerciseTermsBuilder setExerciseProcedure(ExerciseProcedure arg0)`
- `ExerciseTermsBuilder setCommencementDate(AdjustableOrRelativeDate arg0)`
- `ExerciseTermsBuilder setExpirationDate(List arg0)`
- `ExerciseTermsBuilder setRelevantUnderlyingDate(AdjustableOrRelativeDates arg0)`
- `ExerciseTermsBuilder setExpirationTimeType(ExpirationTimeTypeEnum arg0)`
- `ExerciseTermsBuilder setExerciseFeeSchedule(ExerciseFeeSchedule arg0)`
- `ExerciseTermsBuilder setStyle(OptionExerciseStyleEnum arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `OptionExerciseStyleEnum getStyle()`
- `List getExpirationDate()`
- `BusinessCenterTimeBuilder getOrCreateExpirationTime()`
- `AdjustableOrRelativeDateBuilder getOrCreateExpirationDate(int arg0)`
- `AdjustableOrRelativeDatesBuilder getOrCreateExerciseDates()`
- `ExerciseFeeBuilder getOrCreateExerciseFee()`
- `PartialExerciseBuilder getOrCreatePartialExercise()`
- `ExerciseFeeBuilder getExerciseFee()`
- `ExerciseProcedureBuilder getExerciseProcedure()`
- `AdjustableOrRelativeDatesBuilder getRelevantUnderlyingDate()`
- `BusinessCenterTimeBuilder getLatestExerciseTime()`
- `BusinessCenterTimeBuilder getEarliestExerciseTime()`
- `PartialExerciseBuilder getPartialExercise()`
- `AdjustableOrRelativeDateBuilder getCommencementDate()`
- `MultipleExerciseBuilder getMultipleExercise()`
- `ExerciseFeeScheduleBuilder getExerciseFeeSchedule()`
- `BusinessCenterTimeBuilder getExpirationTime()`
- `ExpirationTimeTypeEnum getExpirationTimeType()`
- `AdjustableOrRelativeDatesBuilder getExerciseDates()`
- `ExerciseFeeScheduleBuilder getOrCreateExerciseFeeSchedule()`
- `AdjustableOrRelativeDatesBuilder getOrCreateRelevantUnderlyingDate()`
- `BusinessCenterTimeBuilder getOrCreateLatestExerciseTime()`
- `ExerciseProcedureBuilder getOrCreateExerciseProcedure()`
- `AdjustableOrRelativeDateBuilder getOrCreateCommencementDate()`
- `BusinessCenterTimeBuilder getOrCreateEarliestExerciseTime()`
- `MultipleExerciseBuilder getOrCreateMultipleExercise()`

#### Adder Methods

- `ExerciseTermsBuilder addExpirationDate(AdjustableOrRelativeDate arg0, int arg1)`
- `ExerciseTermsBuilder addExpirationDate(List arg0)`
- `ExerciseTermsBuilder addExpirationDate(AdjustableOrRelativeDate arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExerciseTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ExerciseTermsBuilder prune()`
- `ExerciseTermsBuilder toBuilder()`
- `boolean hasData()`

