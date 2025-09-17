# ExerciseFeeScheduleBuilder

**Full Name:** `cdm.product.template.ExerciseFeeSchedule$ExerciseFeeScheduleBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ExerciseFeeSchedule`
- `cdm.base.staticdata.party.PayerReceiver$PayerReceiverBuilder`

### Methods

#### Setter Methods

- `ExerciseFeeScheduleBuilder setNotionalReferenceValue(Money arg0)`
- `ExerciseFeeScheduleBuilder setNotionalReference(ReferenceWithMetaMoney arg0)`
- `ExerciseFeeScheduleBuilder setFeeAmountSchedule(AmountSchedule arg0)`
- `ExerciseFeeScheduleBuilder setFeeRateSchedule(Schedule arg0)`
- `ExerciseFeeScheduleBuilder setFeePaymentDate(RelativeDateOffset arg0)`
- `ExerciseFeeScheduleBuilder setReceiver(CounterpartyRoleEnum arg0)`
- `ExerciseFeeScheduleBuilder setPayer(CounterpartyRoleEnum arg0)`

#### Getter Methods

- `ScheduleBuilder getOrCreateFeeRateSchedule()`
- `RelativeDateOffsetBuilder getFeePaymentDate()`
- `AmountScheduleBuilder getFeeAmountSchedule()`
- `ScheduleBuilder getFeeRateSchedule()`
- `RelativeDateOffsetBuilder getOrCreateFeePaymentDate()`
- `ReferenceWithMetaMoneyBuilder getNotionalReference()`
- `ReferenceWithMetaMoneyBuilder getOrCreateNotionalReference()`
- `AmountScheduleBuilder getOrCreateFeeAmountSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExerciseFeeScheduleBuilder prune()`

