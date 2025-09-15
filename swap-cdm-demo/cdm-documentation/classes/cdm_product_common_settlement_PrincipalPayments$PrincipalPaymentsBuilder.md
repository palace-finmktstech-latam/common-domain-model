# PrincipalPaymentsBuilder

**Full Name:** `cdm.product.common.settlement.PrincipalPayments$PrincipalPaymentsBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PrincipalPayments`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PrincipalPaymentsBuilder setInitialPayment(Boolean arg0)`
- `PrincipalPaymentsBuilder setIntermediatePayment(Boolean arg0)`
- `PrincipalPaymentsBuilder setFinalPayment(Boolean arg0)`
- `PrincipalPaymentsBuilder setVaryingLegNotionalCurrency(List arg0)`
- `PrincipalPaymentsBuilder setPrincipalPaymentSchedule(PrincipalPaymentSchedule arg0)`
- `PrincipalPaymentsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `PrincipalPaymentScheduleBuilder getOrCreatePrincipalPaymentSchedule()`
- `PrincipalPaymentScheduleBuilder getPrincipalPaymentSchedule()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `PrincipalPaymentsBuilder addVaryingLegNotionalCurrency(String arg0)`
- `PrincipalPaymentsBuilder addVaryingLegNotionalCurrency(String arg0, int arg1)`
- `PrincipalPaymentsBuilder addVaryingLegNotionalCurrency(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PrincipalPaymentsBuilder prune()`

