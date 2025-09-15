# PaymentDatesBuilderImpl

**Full Name:** `cdm.product.common.schedule.PaymentDates$PaymentDatesBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.PaymentDates$PaymentDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| paymentFrequency | `FrequencyBuilder` |  |
| firstPaymentDate | `Date` |  |
| lastRegularPaymentDate | `Date` |  |
| paymentDateSchedule | `PaymentDateScheduleBuilder` |  |
| payRelativeTo | `PayRelativeToEnum` |  |
| paymentDaysOffset | `OffsetBuilder` |  |
| paymentDatesAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PaymentDates build()`

#### Setter Methods

- `PaymentDatesBuilder setPaymentDatesAdjustments(BusinessDayAdjustments arg0)`
- `PaymentDatesBuilder setFirstPaymentDate(Date arg0)`
- `PaymentDatesBuilder setLastRegularPaymentDate(Date arg0)`
- `PaymentDatesBuilder setPaymentDaysOffset(Offset arg0)`
- `PaymentDatesBuilder setPaymentFrequency(Frequency arg0)`
- `PaymentDatesBuilder setPaymentDateSchedule(PaymentDateSchedule arg0)`
- `PaymentDatesBuilder setPayRelativeTo(PayRelativeToEnum arg0)`
- `PaymentDatesBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `FrequencyBuilder getPaymentFrequency()`
- `Date getFirstPaymentDate()`
- `PayRelativeToEnum getPayRelativeTo()`
- `PaymentDateScheduleBuilder getPaymentDateSchedule()`
- `BusinessDayAdjustmentsBuilder getPaymentDatesAdjustments()`
- `Date getLastRegularPaymentDate()`
- `OffsetBuilder getPaymentDaysOffset()`
- `BusinessDayAdjustmentsBuilder getOrCreatePaymentDatesAdjustments()`
- `OffsetBuilder getOrCreatePaymentDaysOffset()`
- `FrequencyBuilder getOrCreatePaymentFrequency()`
- `PaymentDateScheduleBuilder getOrCreatePaymentDateSchedule()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PaymentDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PaymentDatesBuilder toBuilder()`
- `PaymentDatesBuilder prune()`

