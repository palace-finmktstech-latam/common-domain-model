# ExerciseEventBuilderImpl

**Full Name:** `cdm.event.common.ExerciseEvent$ExerciseEventBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ExerciseEvent$ExerciseEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustedExerciseDate | `Date` |  |
| adjustedRelevantSwapEffectiveDate | `Date` |  |
| adjustedCashSettlementValuationDate | `Date` |  |
| adjustedCashSettlementPaymentDate | `Date` |  |
| adjustedExerciseFeePaymentDate | `Date` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ExerciseEvent build()`

#### Setter Methods

- `ExerciseEventBuilder setAdjustedRelevantSwapEffectiveDate(Date arg0)`
- `ExerciseEventBuilder setAdjustedCashSettlementValuationDate(Date arg0)`
- `ExerciseEventBuilder setAdjustedExerciseFeePaymentDate(Date arg0)`
- `ExerciseEventBuilder setAdjustedCashSettlementPaymentDate(Date arg0)`
- `ExerciseEventBuilder setAdjustedExerciseDate(Date arg0)`
- `ExerciseEventBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Date getAdjustedCashSettlementPaymentDate()`
- `Date getAdjustedRelevantSwapEffectiveDate()`
- `Date getAdjustedExerciseFeePaymentDate()`
- `Date getAdjustedCashSettlementValuationDate()`
- `Date getAdjustedExerciseDate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExerciseEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ExerciseEventBuilder toBuilder()`
- `ExerciseEventBuilder prune()`

