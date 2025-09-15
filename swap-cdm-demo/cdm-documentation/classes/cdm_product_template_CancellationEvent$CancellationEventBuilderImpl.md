# CancellationEventBuilderImpl

**Full Name:** `cdm.product.template.CancellationEvent$CancellationEventBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.CancellationEvent$CancellationEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustedExerciseDate | `Date` |  |
| adjustedEarlyTerminationDate | `Date` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `CancellationEvent build()`

#### Setter Methods

- `CancellationEventBuilder setAdjustedEarlyTerminationDate(Date arg0)`
- `CancellationEventBuilder setAdjustedExerciseDate(Date arg0)`
- `CancellationEventBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Date getAdjustedEarlyTerminationDate()`
- `Date getAdjustedExerciseDate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CancellationEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CancellationEventBuilder toBuilder()`
- `CancellationEventBuilder prune()`

