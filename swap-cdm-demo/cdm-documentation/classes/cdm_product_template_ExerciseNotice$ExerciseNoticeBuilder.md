# ExerciseNoticeBuilder

**Full Name:** `cdm.product.template.ExerciseNotice$ExerciseNoticeBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ExerciseNotice`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ExerciseNoticeBuilder setBusinessCenterValue(BusinessCenterEnum arg0)`
- `ExerciseNoticeBuilder setBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)`
- `ExerciseNoticeBuilder setExerciseNoticeReceiver(AncillaryRoleEnum arg0)`
- `ExerciseNoticeBuilder setExerciseNoticeGiver(ExerciseNoticeGiverEnum arg0)`

#### Getter Methods

- `FieldWithMetaBusinessCenterEnumBuilder getOrCreateBusinessCenter()`
- `FieldWithMetaBusinessCenterEnumBuilder getBusinessCenter()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExerciseNoticeBuilder prune()`

