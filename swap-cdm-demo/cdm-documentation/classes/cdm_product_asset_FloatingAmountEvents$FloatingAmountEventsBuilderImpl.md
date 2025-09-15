# FloatingAmountEventsBuilderImpl

**Full Name:** `cdm.product.asset.FloatingAmountEvents$FloatingAmountEventsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.FloatingAmountEvents$FloatingAmountEventsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| failureToPayPrincipal | `Boolean` |  |
| interestShortfall | `InterestShortFallBuilder` |  |
| writedown | `Boolean` |  |
| impliedWritedown | `Boolean` |  |
| floatingAmountProvisions | `FloatingAmountProvisionsBuilder` |  |
| additionalFixedPayments | `AdditionalFixedPaymentsBuilder` |  |

### Methods

#### Builder Methods

- `FloatingAmountEvents build()`

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
- `Boolean getWritedown()`
- `Boolean getFailureToPayPrincipal()`
- `Boolean getImpliedWritedown()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingAmountEventsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FloatingAmountEventsBuilder toBuilder()`
- `FloatingAmountEventsBuilder prune()`

