# CreditEventsBuilder

**Full Name:** `cdm.observable.event.CreditEvents$CreditEventsBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.CreditEvents`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `CreditEventsBuilder setFailureToPayPrincipal(Boolean arg0)`
- `CreditEventsBuilder setWritedown(Boolean arg0)`
- `CreditEventsBuilder setFailureToPay(FailureToPay arg0)`
- `CreditEventsBuilder setObligationAcceleration(Boolean arg0)`
- `CreditEventsBuilder setRepudiationMoratorium(Boolean arg0)`
- `CreditEventsBuilder setBankruptcy(Boolean arg0)`
- `CreditEventsBuilder setImpliedWritedown(Boolean arg0)`
- `CreditEventsBuilder setFailureToPayInterest(Boolean arg0)`
- `CreditEventsBuilder setObligationDefault(Boolean arg0)`
- `CreditEventsBuilder setDefaultRequirement(Money arg0)`
- `CreditEventsBuilder setRestructuring(Restructuring arg0)`
- `CreditEventsBuilder setMaturityExtension(Boolean arg0)`
- `CreditEventsBuilder setCreditEventNotice(CreditEventNotice arg0)`
- `CreditEventsBuilder setDistressedRatingsDowngrade(Boolean arg0)`
- `CreditEventsBuilder setGovernmentalIntervention(Boolean arg0)`
- `CreditEventsBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FailureToPayBuilder getOrCreateFailureToPay()`
- `RestructuringBuilder getOrCreateRestructuring()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MoneyBuilder getOrCreateDefaultRequirement()`
- `CreditEventNoticeBuilder getOrCreateCreditEventNotice()`
- `CreditEventNoticeBuilder getCreditEventNotice()`
- `RestructuringBuilder getRestructuring()`
- `FailureToPayBuilder getFailureToPay()`
- `MoneyBuilder getDefaultRequirement()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditEventsBuilder prune()`

