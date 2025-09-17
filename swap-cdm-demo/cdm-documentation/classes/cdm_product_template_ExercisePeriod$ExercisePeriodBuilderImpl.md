# ExercisePeriodBuilderImpl

**Full Name:** `cdm.product.template.ExercisePeriod$ExercisePeriodBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.ExercisePeriod$ExercisePeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| earliestExerciseDateTenor | `PeriodBuilder` |  |
| exerciseFrequency | `PeriodBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ExercisePeriod build()`

#### Setter Methods

- `ExercisePeriodBuilder setExerciseFrequency(Period arg0)`
- `ExercisePeriodBuilder setEarliestExerciseDateTenor(Period arg0)`
- `ExercisePeriodBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `PeriodBuilder getEarliestExerciseDateTenor()`
- `PeriodBuilder getOrCreateExerciseFrequency()`
- `PeriodBuilder getOrCreateEarliestExerciseDateTenor()`
- `PeriodBuilder getExerciseFrequency()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExercisePeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ExercisePeriodBuilder prune()`
- `ExercisePeriodBuilder toBuilder()`
- `boolean hasData()`

