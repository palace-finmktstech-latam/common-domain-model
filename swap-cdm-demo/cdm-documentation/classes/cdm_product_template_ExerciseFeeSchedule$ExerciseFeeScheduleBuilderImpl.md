# ExerciseFeeScheduleBuilderImpl

**Full Name:** `cdm.product.template.ExerciseFeeSchedule$ExerciseFeeScheduleBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.party.PayerReceiver$PayerReceiverBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.ExerciseFeeSchedule$ExerciseFeeScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| notionalReference | `ReferenceWithMetaMoneyBuilder` |  |
| feeAmountSchedule | `AmountScheduleBuilder` |  |
| feeRateSchedule | `ScheduleBuilder` |  |
| feePaymentDate | `RelativeDateOffsetBuilder` |  |

### Methods

#### Builder Methods

- `ExerciseFeeSchedule build()`

#### Setter Methods

- `ExerciseFeeScheduleBuilder setReceiver(CounterpartyRoleEnum arg0)`
- `ExerciseFeeScheduleBuilder setFeeRateSchedule(Schedule arg0)`
- `ExerciseFeeScheduleBuilder setNotionalReference(ReferenceWithMetaMoney arg0)`
- `ExerciseFeeScheduleBuilder setFeeAmountSchedule(AmountSchedule arg0)`
- `ExerciseFeeScheduleBuilder setFeePaymentDate(RelativeDateOffset arg0)`
- `ExerciseFeeScheduleBuilder setNotionalReferenceValue(Money arg0)`
- `ExerciseFeeScheduleBuilder setPayer(CounterpartyRoleEnum arg0)`

#### Getter Methods

- `ReferenceWithMetaMoneyBuilder getOrCreateNotionalReference()`
- `AmountScheduleBuilder getOrCreateFeeAmountSchedule()`
- `ScheduleBuilder getOrCreateFeeRateSchedule()`
- `ReferenceWithMetaMoneyBuilder getNotionalReference()`
- `AmountScheduleBuilder getFeeAmountSchedule()`
- `RelativeDateOffsetBuilder getFeePaymentDate()`
- `RelativeDateOffsetBuilder getOrCreateFeePaymentDate()`
- `ScheduleBuilder getFeeRateSchedule()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExerciseFeeScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ExerciseFeeScheduleBuilder toBuilder()`
- `ExerciseFeeScheduleBuilder prune()`

