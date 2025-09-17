# PaymentDateScheduleBuilder

**Full Name:** `cdm.product.common.schedule.PaymentDateSchedule$PaymentDateScheduleBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.PaymentDateSchedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PaymentDateScheduleBuilder setInterimPaymentDates(List arg0)`
- `PaymentDateScheduleBuilder setFinalPaymentDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `List getInterimPaymentDates()`
- `AdjustableOrRelativeDateBuilder getFinalPaymentDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateFinalPaymentDate()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateInterimPaymentDates(int arg0)`

#### Adder Methods

- `PaymentDateScheduleBuilder addInterimPaymentDates(AdjustableRelativeOrPeriodicDates arg0)`
- `PaymentDateScheduleBuilder addInterimPaymentDates(AdjustableRelativeOrPeriodicDates arg0, int arg1)`
- `PaymentDateScheduleBuilder addInterimPaymentDates(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PaymentDateScheduleBuilder prune()`

