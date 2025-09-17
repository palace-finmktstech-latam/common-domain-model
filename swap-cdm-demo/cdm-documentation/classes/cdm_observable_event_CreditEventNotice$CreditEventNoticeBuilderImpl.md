# CreditEventNoticeBuilderImpl

**Full Name:** `cdm.observable.event.CreditEventNotice$CreditEventNoticeBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.CreditEventNotice$CreditEventNoticeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| notifyingParty | `java.util.List<cdm.base.staticdata.party.CounterpartyRoleEnum>` |  |
| businessCenter | `BusinessCenterEnum` |  |
| publiclyAvailableInformation | `PubliclyAvailableInformationBuilder` |  |

### Methods

#### Builder Methods

- `CreditEventNotice build()`

#### Setter Methods

- `CreditEventNoticeBuilder setPubliclyAvailableInformation(PubliclyAvailableInformation arg0)`
- `CreditEventNoticeBuilder setBusinessCenter(BusinessCenterEnum arg0)`
- `CreditEventNoticeBuilder setNotifyingParty(List arg0)`

#### Getter Methods

- `PubliclyAvailableInformationBuilder getPubliclyAvailableInformation()`
- `PubliclyAvailableInformationBuilder getOrCreatePubliclyAvailableInformation()`
- `List getNotifyingParty()`
- `BusinessCenterEnum getBusinessCenter()`

#### Adder Methods

- `CreditEventNoticeBuilder addNotifyingParty(CounterpartyRoleEnum arg0)`
- `CreditEventNoticeBuilder addNotifyingParty(CounterpartyRoleEnum arg0, int arg1)`
- `CreditEventNoticeBuilder addNotifyingParty(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditEventNoticeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CreditEventNoticeBuilder prune()`
- `CreditEventNoticeBuilder toBuilder()`
- `boolean hasData()`

