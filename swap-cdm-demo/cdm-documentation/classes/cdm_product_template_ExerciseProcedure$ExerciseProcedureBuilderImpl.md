# ExerciseProcedureBuilderImpl

**Full Name:** `cdm.product.template.ExerciseProcedure$ExerciseProcedureBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.ExerciseProcedure$ExerciseProcedureBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| manualExercise | `ManualExerciseBuilder` |  |
| automaticExercise | `AutomaticExerciseBuilder` |  |
| followUpConfirmation | `Boolean` |  |
| limitedRightToConfirm | `Boolean` |  |
| splitTicket | `Boolean` |  |

### Methods

#### Builder Methods

- `ExerciseProcedure build()`

#### Setter Methods

- `ExerciseProcedureBuilder setManualExercise(ManualExercise arg0)`
- `ExerciseProcedureBuilder setFollowUpConfirmation(Boolean arg0)`
- `ExerciseProcedureBuilder setLimitedRightToConfirm(Boolean arg0)`
- `ExerciseProcedureBuilder setSplitTicket(Boolean arg0)`
- `ExerciseProcedureBuilder setAutomaticExercise(AutomaticExercise arg0)`

#### Getter Methods

- `Boolean getFollowUpConfirmation()`
- `AutomaticExerciseBuilder getOrCreateAutomaticExercise()`
- `ManualExerciseBuilder getOrCreateManualExercise()`
- `Boolean getLimitedRightToConfirm()`
- `ManualExerciseBuilder getManualExercise()`
- `Boolean getSplitTicket()`
- `AutomaticExerciseBuilder getAutomaticExercise()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExerciseProcedureBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ExerciseProcedureBuilder toBuilder()`
- `ExerciseProcedureBuilder prune()`

