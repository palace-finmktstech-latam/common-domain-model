# FloatingAmountEventsBuilder

**Full Name:** `cdm.product.asset.FloatingAmountEvents$FloatingAmountEventsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingAmountEvents`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingAmountEventsBuilder setFailureToPayPrincipal(Boolean arg0)`
- `FloatingAmountEventsBuilder setWritedown(Boolean arg0)`
- `FloatingAmountEventsBuilder setImpliedWritedown(Boolean arg0)`
- `FloatingAmountEventsBuilder setInterestShortfall(InterestShortFall arg0)`
- `FloatingAmountEventsBuilder setAdditionalFixedPayments(AdditionalFixedPayments arg0)`
- `FloatingAmountEventsBuilder setFloatingAmountProvisions(FloatingAmountProvisions arg0)`

#### Getter Methods

- `AdditionalFixedPaymentsBuilder getAdditionalFixedPayments()`
- `InterestShortFallBuilder getOrCreateInterestShortfall()`
- `FloatingAmountProvisionsBuilder getOrCreateFloatingAmountProvisions()`
- `AdditionalFixedPaymentsBuilder getOrCreateAdditionalFixedPayments()`
- `InterestShortFallBuilder getInterestShortfall()`
- `FloatingAmountProvisionsBuilder getFloatingAmountProvisions()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingAmountEventsBuilder prune()`

