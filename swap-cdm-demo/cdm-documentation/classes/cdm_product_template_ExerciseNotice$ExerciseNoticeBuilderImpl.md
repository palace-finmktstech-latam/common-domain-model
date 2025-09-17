# ExerciseNoticeBuilderImpl

**Full Name:** `cdm.product.template.ExerciseNotice$ExerciseNoticeBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.ExerciseNotice$ExerciseNoticeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| exerciseNoticeGiver | `ExerciseNoticeGiverEnum` |  |
| exerciseNoticeReceiver | `AncillaryRoleEnum` |  |
| businessCenter | `FieldWithMetaBusinessCenterEnumBuilder` |  |

### Methods

#### Builder Methods

- `ExerciseNotice build()`

#### Setter Methods

- `ExerciseNoticeBuilder setBusinessCenterValue(BusinessCenterEnum arg0)`
- `ExerciseNoticeBuilder setBusinessCenter(FieldWithMetaBusinessCenterEnum arg0)`
- `ExerciseNoticeBuilder setExerciseNoticeGiver(ExerciseNoticeGiverEnum arg0)`
- `ExerciseNoticeBuilder setExerciseNoticeReceiver(AncillaryRoleEnum arg0)`

#### Getter Methods

- `FieldWithMetaBusinessCenterEnumBuilder getBusinessCenter()`
- `FieldWithMetaBusinessCenterEnumBuilder getOrCreateBusinessCenter()`
- `AncillaryRoleEnum getExerciseNoticeReceiver()`
- `ExerciseNoticeGiverEnum getExerciseNoticeGiver()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExerciseNoticeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ExerciseNoticeBuilder prune()`
- `ExerciseNoticeBuilder toBuilder()`
- `boolean hasData()`

