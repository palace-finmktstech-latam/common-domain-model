# DateRelativeToPaymentDatesBuilder

**Full Name:** `cdm.product.common.schedule.DateRelativeToPaymentDates$DateRelativeToPaymentDatesBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.DateRelativeToPaymentDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DateRelativeToPaymentDatesBuilder setPaymentDatesReference(List arg0)`
- `DateRelativeToPaymentDatesBuilder setPaymentDatesReferenceValue(List arg0)`

#### Getter Methods

- `List getPaymentDatesReference()`
- `ReferenceWithMetaPaymentDatesBuilder getOrCreatePaymentDatesReference(int arg0)`

#### Adder Methods

- `DateRelativeToPaymentDatesBuilder addPaymentDatesReference(List arg0)`
- `DateRelativeToPaymentDatesBuilder addPaymentDatesReference(ReferenceWithMetaPaymentDates arg0, int arg1)`
- `DateRelativeToPaymentDatesBuilder addPaymentDatesReference(ReferenceWithMetaPaymentDates arg0)`
- `DateRelativeToPaymentDatesBuilder addPaymentDatesReferenceValue(List arg0)`
- `DateRelativeToPaymentDatesBuilder addPaymentDatesReferenceValue(PaymentDates arg0, int arg1)`
- `DateRelativeToPaymentDatesBuilder addPaymentDatesReferenceValue(PaymentDates arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DateRelativeToPaymentDatesBuilder prune()`

