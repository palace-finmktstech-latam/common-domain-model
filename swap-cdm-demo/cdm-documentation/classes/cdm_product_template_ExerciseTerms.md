# ExerciseTerms

**Full Name:** `cdm.product.template.ExerciseTerms`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `ExerciseTerms build()`

#### Getter Methods

- `Class getType()`
- `MetaFields getMeta()`
- `OptionExerciseStyleEnum getStyle()`
- `List getExpirationDate()`
- `ExerciseFee getExerciseFee()`
- `ExerciseProcedure getExerciseProcedure()`
- `AdjustableOrRelativeDates getRelevantUnderlyingDate()`
- `BusinessCenterTime getLatestExerciseTime()`
- `BusinessCenterTime getEarliestExerciseTime()`
- `PartialExercise getPartialExercise()`
- `AdjustableOrRelativeDate getCommencementDate()`
- `MultipleExercise getMultipleExercise()`
- `ExerciseFeeSchedule getExerciseFeeSchedule()`
- `BusinessCenterTime getExpirationTime()`
- `ExpirationTimeTypeEnum getExpirationTimeType()`
- `AdjustableOrRelativeDates getExerciseDates()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExerciseTermsBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

