# PrincipalPaymentsBuilderImpl

**Full Name:** `cdm.product.common.settlement.PrincipalPayments$PrincipalPaymentsBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PrincipalPayments$PrincipalPaymentsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| initialPayment | `Boolean` |  |
| finalPayment | `Boolean` |  |
| intermediatePayment | `Boolean` |  |
| varyingLegNotionalCurrency | `java.util.List<java.lang.String>` |  |
| principalPaymentSchedule | `PrincipalPaymentScheduleBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PrincipalPayments build()`

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
- `Boolean getIntermediatePayment()`
- `Boolean getFinalPayment()`
- `Boolean getInitialPayment()`
- `List getVaryingLegNotionalCurrency()`
- `PrincipalPaymentScheduleBuilder getPrincipalPaymentSchedule()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `PrincipalPaymentsBuilder addVaryingLegNotionalCurrency(String arg0, int arg1)`
- `PrincipalPaymentsBuilder addVaryingLegNotionalCurrency(String arg0)`
- `PrincipalPaymentsBuilder addVaryingLegNotionalCurrency(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PrincipalPaymentsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PrincipalPaymentsBuilder toBuilder()`
- `PrincipalPaymentsBuilder prune()`

