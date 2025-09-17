# PaymentDatesBuilder

**Full Name:** `cdm.product.common.schedule.PaymentDates$PaymentDatesBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.PaymentDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PaymentDatesBuilder setMeta(MetaFields arg0)`
- `PaymentDatesBuilder setLastRegularPaymentDate(Date arg0)`
- `PaymentDatesBuilder setPaymentFrequency(Frequency arg0)`
- `PaymentDatesBuilder setPaymentDateSchedule(PaymentDateSchedule arg0)`
- `PaymentDatesBuilder setPaymentDatesAdjustments(BusinessDayAdjustments arg0)`
- `PaymentDatesBuilder setPayRelativeTo(PayRelativeToEnum arg0)`
- `PaymentDatesBuilder setFirstPaymentDate(Date arg0)`
- `PaymentDatesBuilder setPaymentDaysOffset(Offset arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `OffsetBuilder getPaymentDaysOffset()`
- `FrequencyBuilder getPaymentFrequency()`
- `PaymentDateScheduleBuilder getPaymentDateSchedule()`
- `BusinessDayAdjustmentsBuilder getPaymentDatesAdjustments()`
- `FrequencyBuilder getOrCreatePaymentFrequency()`
- `PaymentDateScheduleBuilder getOrCreatePaymentDateSchedule()`
- `OffsetBuilder getOrCreatePaymentDaysOffset()`
- `BusinessDayAdjustmentsBuilder getOrCreatePaymentDatesAdjustments()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PaymentDatesBuilder prune()`

