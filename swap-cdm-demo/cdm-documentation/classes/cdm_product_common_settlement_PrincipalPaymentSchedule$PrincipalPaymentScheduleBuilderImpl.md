# PrincipalPaymentScheduleBuilderImpl

**Full Name:** `cdm.product.common.settlement.PrincipalPaymentSchedule$PrincipalPaymentScheduleBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PrincipalPaymentSchedule$PrincipalPaymentScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| initialPrincipalPayment | `PrincipalPaymentBuilder` |  |
| intermediatePrincipalPayment | `AdjustableRelativeOrPeriodicDatesBuilder` |  |
| finalPrincipalPayment | `PrincipalPaymentBuilder` |  |

### Methods

#### Builder Methods

- `PrincipalPaymentSchedule build()`

#### Setter Methods

- `PrincipalPaymentScheduleBuilder setInitialPrincipalPayment(PrincipalPayment arg0)`
- `PrincipalPaymentScheduleBuilder setFinalPrincipalPayment(PrincipalPayment arg0)`
- `PrincipalPaymentScheduleBuilder setIntermediatePrincipalPayment(AdjustableRelativeOrPeriodicDates arg0)`

#### Getter Methods

- `PrincipalPaymentBuilder getInitialPrincipalPayment()`
- `PrincipalPaymentBuilder getFinalPrincipalPayment()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateIntermediatePrincipalPayment()`
- `AdjustableRelativeOrPeriodicDatesBuilder getIntermediatePrincipalPayment()`
- `PrincipalPaymentBuilder getOrCreateInitialPrincipalPayment()`
- `PrincipalPaymentBuilder getOrCreateFinalPrincipalPayment()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PrincipalPaymentScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PrincipalPaymentScheduleBuilder prune()`
- `PrincipalPaymentScheduleBuilder toBuilder()`
- `boolean hasData()`

