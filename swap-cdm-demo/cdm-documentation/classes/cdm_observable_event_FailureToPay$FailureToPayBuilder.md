# FailureToPayBuilder

**Full Name:** `cdm.observable.event.FailureToPay$FailureToPayBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.FailureToPay`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FailureToPayBuilder setPaymentRequirement(Money arg0)`
- `FailureToPayBuilder setGracePeriodExtension(GracePeriodExtension arg0)`
- `FailureToPayBuilder setApplicable(Boolean arg0)`

#### Getter Methods

- `GracePeriodExtensionBuilder getGracePeriodExtension()`
- `MoneyBuilder getPaymentRequirement()`
- `MoneyBuilder getOrCreatePaymentRequirement()`
- `GracePeriodExtensionBuilder getOrCreateGracePeriodExtension()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FailureToPayBuilder prune()`

