# ExerciseProcedureBuilder

**Full Name:** `cdm.product.template.ExerciseProcedure$ExerciseProcedureBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ExerciseProcedure`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ExerciseProcedureBuilder setFollowUpConfirmation(Boolean arg0)`
- `ExerciseProcedureBuilder setAutomaticExercise(AutomaticExercise arg0)`
- `ExerciseProcedureBuilder setManualExercise(ManualExercise arg0)`
- `ExerciseProcedureBuilder setLimitedRightToConfirm(Boolean arg0)`
- `ExerciseProcedureBuilder setSplitTicket(Boolean arg0)`

#### Getter Methods

- `ManualExerciseBuilder getOrCreateManualExercise()`
- `ManualExerciseBuilder getManualExercise()`
- `AutomaticExerciseBuilder getAutomaticExercise()`
- `AutomaticExerciseBuilder getOrCreateAutomaticExercise()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExerciseProcedureBuilder prune()`

