# PaymentDateScheduleBuilderImpl

**Full Name:** `cdm.product.common.schedule.PaymentDateSchedule$PaymentDateScheduleBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.PaymentDateSchedule$PaymentDateScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| interimPaymentDates | `java.util.List<cdm.base.datetime.AdjustableRelativeOrPeriodicDates$AdjustableRelativeOrPeriodicDatesBuilder>` |  |
| finalPaymentDate | `AdjustableOrRelativeDateBuilder` |  |

### Methods

#### Builder Methods

- `PaymentDateSchedule build()`

#### Setter Methods

- `PaymentDateScheduleBuilder setInterimPaymentDates(List arg0)`
- `PaymentDateScheduleBuilder setFinalPaymentDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `List getInterimPaymentDates()`
- `AdjustableOrRelativeDateBuilder getFinalPaymentDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateFinalPaymentDate()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateInterimPaymentDates(int arg0)`

#### Adder Methods

- `PaymentDateScheduleBuilder addInterimPaymentDates(List arg0)`
- `PaymentDateScheduleBuilder addInterimPaymentDates(AdjustableRelativeOrPeriodicDates arg0)`
- `PaymentDateScheduleBuilder addInterimPaymentDates(AdjustableRelativeOrPeriodicDates arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PaymentDateScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PaymentDateScheduleBuilder toBuilder()`
- `PaymentDateScheduleBuilder prune()`

