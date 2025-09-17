# FailureToPayBuilder

**Full Name:** `cdm.observable.event.FailureToPay$FailureToPayBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.FailureToPay`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FailureToPayBuilder setApplicable(Boolean arg0)`
- `FailureToPayBuilder setPaymentRequirement(Money arg0)`
- `FailureToPayBuilder setGracePeriodExtension(GracePeriodExtension arg0)`

#### Getter Methods

- `GracePeriodExtensionBuilder getGracePeriodExtension()`
- `MoneyBuilder getPaymentRequirement()`
- `GracePeriodExtensionBuilder getOrCreateGracePeriodExtension()`
- `MoneyBuilder getOrCreatePaymentRequirement()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FailureToPayBuilder prune()`

