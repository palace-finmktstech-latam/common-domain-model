# ExercisePeriodBuilder

**Full Name:** `cdm.product.template.ExercisePeriod$ExercisePeriodBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ExercisePeriod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `ExercisePeriodBuilder setExerciseFrequency(Period arg0)`
- `ExercisePeriodBuilder setEarliestExerciseDateTenor(Period arg0)`
- `ExercisePeriodBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `PeriodBuilder getExerciseFrequency()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `PeriodBuilder getEarliestExerciseDateTenor()`
- `PeriodBuilder getOrCreateExerciseFrequency()`
- `PeriodBuilder getOrCreateEarliestExerciseDateTenor()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExercisePeriodBuilder prune()`

