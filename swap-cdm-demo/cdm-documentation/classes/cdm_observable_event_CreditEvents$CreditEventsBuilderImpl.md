# CreditEventsBuilderImpl

**Full Name:** `cdm.observable.event.CreditEvents$CreditEventsBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.CreditEvents$CreditEventsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| bankruptcy | `Boolean` |  |
| failureToPay | `FailureToPayBuilder` |  |
| failureToPayPrincipal | `Boolean` |  |
| failureToPayInterest | `Boolean` |  |
| obligationDefault | `Boolean` |  |
| obligationAcceleration | `Boolean` |  |
| repudiationMoratorium | `Boolean` |  |
| restructuring | `RestructuringBuilder` |  |
| governmentalIntervention | `Boolean` |  |
| distressedRatingsDowngrade | `Boolean` |  |
| maturityExtension | `Boolean` |  |
| writedown | `Boolean` |  |
| impliedWritedown | `Boolean` |  |
| defaultRequirement | `MoneyBuilder` |  |
| creditEventNotice | `CreditEventNoticeBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `CreditEvents build()`

#### Setter Methods

- `CreditEventsBuilder setMeta(MetaFields arg0)`
- `CreditEventsBuilder setImpliedWritedown(Boolean arg0)`
- `CreditEventsBuilder setBankruptcy(Boolean arg0)`
- `CreditEventsBuilder setMaturityExtension(Boolean arg0)`
- `CreditEventsBuilder setObligationDefault(Boolean arg0)`
- `CreditEventsBuilder setObligationAcceleration(Boolean arg0)`
- `CreditEventsBuilder setFailureToPay(FailureToPay arg0)`
- `CreditEventsBuilder setRestructuring(Restructuring arg0)`
- `CreditEventsBuilder setWritedown(Boolean arg0)`
- `CreditEventsBuilder setFailureToPayPrincipal(Boolean arg0)`
- `CreditEventsBuilder setCreditEventNotice(CreditEventNotice arg0)`
- `CreditEventsBuilder setRepudiationMoratorium(Boolean arg0)`
- `CreditEventsBuilder setFailureToPayInterest(Boolean arg0)`
- `CreditEventsBuilder setDefaultRequirement(Money arg0)`
- `CreditEventsBuilder setGovernmentalIntervention(Boolean arg0)`
- `CreditEventsBuilder setDistressedRatingsDowngrade(Boolean arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Boolean getBankruptcy()`
- `Boolean getGovernmentalIntervention()`
- `MetaFieldsBuilder getMeta()`
- `MoneyBuilder getDefaultRequirement()`
- `FailureToPayBuilder getFailureToPay()`
- `RestructuringBuilder getRestructuring()`
- `CreditEventNoticeBuilder getCreditEventNotice()`
- `RestructuringBuilder getOrCreateRestructuring()`
- `FailureToPayBuilder getOrCreateFailureToPay()`
- `Boolean getFailureToPayPrincipal()`
- `Boolean getImpliedWritedown()`
- `Boolean getWritedown()`
- `Boolean getFailureToPayInterest()`
- `Boolean getMaturityExtension()`
- `Boolean getObligationAcceleration()`
- `Boolean getRepudiationMoratorium()`
- `Boolean getObligationDefault()`
- `Boolean getDistressedRatingsDowngrade()`
- `MoneyBuilder getOrCreateDefaultRequirement()`
- `CreditEventNoticeBuilder getOrCreateCreditEventNotice()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditEventsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CreditEventsBuilder prune()`
- `CreditEventsBuilder toBuilder()`
- `boolean hasData()`

