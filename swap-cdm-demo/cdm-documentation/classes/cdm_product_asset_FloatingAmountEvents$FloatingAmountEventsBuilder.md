# FloatingAmountEventsBuilder

**Full Name:** `cdm.product.asset.FloatingAmountEvents$FloatingAmountEventsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingAmountEvents`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingAmountEventsBuilder setInterestShortfall(InterestShortFall arg0)`
- `FloatingAmountEventsBuilder setAdditionalFixedPayments(AdditionalFixedPayments arg0)`
- `FloatingAmountEventsBuilder setImpliedWritedown(Boolean arg0)`
- `FloatingAmountEventsBuilder setWritedown(Boolean arg0)`
- `FloatingAmountEventsBuilder setFailureToPayPrincipal(Boolean arg0)`
- `FloatingAmountEventsBuilder setFloatingAmountProvisions(FloatingAmountProvisions arg0)`

#### Getter Methods

- `InterestShortFallBuilder getInterestShortfall()`
- `FloatingAmountProvisionsBuilder getFloatingAmountProvisions()`
- `AdditionalFixedPaymentsBuilder getOrCreateAdditionalFixedPayments()`
- `FloatingAmountProvisionsBuilder getOrCreateFloatingAmountProvisions()`
- `InterestShortFallBuilder getOrCreateInterestShortfall()`
- `AdditionalFixedPaymentsBuilder getAdditionalFixedPayments()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingAmountEventsBuilder prune()`

