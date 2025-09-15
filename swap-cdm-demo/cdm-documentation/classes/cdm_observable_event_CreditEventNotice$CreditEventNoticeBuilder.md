# CreditEventNoticeBuilder

**Full Name:** `cdm.observable.event.CreditEventNotice$CreditEventNoticeBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.CreditEventNotice`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CreditEventNoticeBuilder setBusinessCenter(BusinessCenterEnum arg0)`
- `CreditEventNoticeBuilder setNotifyingParty(List arg0)`
- `CreditEventNoticeBuilder setPubliclyAvailableInformation(PubliclyAvailableInformation arg0)`

#### Getter Methods

- `PubliclyAvailableInformationBuilder getOrCreatePubliclyAvailableInformation()`
- `PubliclyAvailableInformationBuilder getPubliclyAvailableInformation()`

#### Adder Methods

- `CreditEventNoticeBuilder addNotifyingParty(CounterpartyRoleEnum arg0, int arg1)`
- `CreditEventNoticeBuilder addNotifyingParty(List arg0)`
- `CreditEventNoticeBuilder addNotifyingParty(CounterpartyRoleEnum arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditEventNoticeBuilder prune()`

