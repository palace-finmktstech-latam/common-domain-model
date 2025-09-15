# EarlyTerminationEventBuilderImpl

**Full Name:** `cdm.product.template.EarlyTerminationEvent$EarlyTerminationEventBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.EarlyTerminationEvent$EarlyTerminationEventBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustedExerciseDate | `Date` |  |
| adjustedEarlyTerminationDate | `Date` |  |
| adjustedCashSettlementValuationDate | `Date` |  |
| adjustedCashSettlementPaymentDate | `Date` |  |
| adjustedExerciseFeePaymentDate | `Date` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `EarlyTerminationEvent build()`

#### Setter Methods

- `EarlyTerminationEventBuilder setAdjustedEarlyTerminationDate(Date arg0)`
- `EarlyTerminationEventBuilder setAdjustedCashSettlementValuationDate(Date arg0)`
- `EarlyTerminationEventBuilder setAdjustedExerciseFeePaymentDate(Date arg0)`
- `EarlyTerminationEventBuilder setAdjustedCashSettlementPaymentDate(Date arg0)`
- `EarlyTerminationEventBuilder setAdjustedExerciseDate(Date arg0)`
- `EarlyTerminationEventBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Date getAdjustedEarlyTerminationDate()`
- `Date getAdjustedCashSettlementPaymentDate()`
- `Date getAdjustedExerciseFeePaymentDate()`
- `Date getAdjustedCashSettlementValuationDate()`
- `Date getAdjustedExerciseDate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `EarlyTerminationEventBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `EarlyTerminationEventBuilder toBuilder()`
- `EarlyTerminationEventBuilder prune()`

