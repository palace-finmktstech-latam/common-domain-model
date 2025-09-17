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
- `PayRelativeToEnum getPayRelativeTo()`
- `OffsetBuilder getPaymentDaysOffset()`
- `FrequencyBuilder getPaymentFrequency()`
- `Date getFirstPaymentDate()`
- `PaymentDateScheduleBuilder getPaymentDateSchedule()`
- `Date getLastRegularPaymentDate()`
- `BusinessDayAdjustmentsBuilder getPaymentDatesAdjustments()`
- `FrequencyBuilder getOrCreatePaymentFrequency()`
- `PaymentDateScheduleBuilder getOrCreatePaymentDateSchedule()`
- `OffsetBuilder getOrCreatePaymentDaysOffset()`
- `BusinessDayAdjustmentsBuilder getOrCreatePaymentDatesAdjustments()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PaymentDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PaymentDatesBuilder prune()`
- `PaymentDatesBuilder toBuilder()`
- `boolean hasData()`

