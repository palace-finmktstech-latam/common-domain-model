# PrincipalPaymentScheduleBuilder

**Full Name:** `cdm.product.common.settlement.PrincipalPaymentSchedule$PrincipalPaymentScheduleBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PrincipalPaymentSchedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PrincipalPaymentScheduleBuilder prune()`

