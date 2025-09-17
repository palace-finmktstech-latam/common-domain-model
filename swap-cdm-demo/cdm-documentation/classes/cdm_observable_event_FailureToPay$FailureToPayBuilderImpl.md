# FailureToPayBuilderImpl

**Full Name:** `cdm.observable.event.FailureToPay$FailureToPayBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.FailureToPay$FailureToPayBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| applicable | `Boolean` |  |
| gracePeriodExtension | `GracePeriodExtensionBuilder` |  |
| paymentRequirement | `MoneyBuilder` |  |

### Methods

#### Builder Methods

- `FailureToPay build()`

#### Setter Methods

- `FailureToPayBuilder setApplicable(Boolean arg0)`
- `FailureToPayBuilder setPaymentRequirement(Money arg0)`
- `FailureToPayBuilder setGracePeriodExtension(GracePeriodExtension arg0)`

#### Getter Methods

- `GracePeriodExtensionBuilder getGracePeriodExtension()`
- `MoneyBuilder getPaymentRequirement()`
- `GracePeriodExtensionBuilder getOrCreateGracePeriodExtension()`
- `MoneyBuilder getOrCreatePaymentRequirement()`
- `Boolean getApplicable()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FailureToPayBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FailureToPayBuilder prune()`
- `FailureToPayBuilder toBuilder()`
- `boolean hasData()`

