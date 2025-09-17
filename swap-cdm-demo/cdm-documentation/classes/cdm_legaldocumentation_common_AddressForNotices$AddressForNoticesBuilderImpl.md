# AddressForNoticesBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.AddressForNotices$AddressForNoticesBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.AddressForNotices$AddressForNoticesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| primaryNotices | `ContactElectionBuilder` |  |
| additionalNotices | `java.util.List<cdm.base.staticdata.party.PartyContactInformation$PartyContactInformationBuilder>` |  |

### Methods

#### Builder Methods

- `AddressForNotices build()`

#### Setter Methods

- `AddressForNoticesBuilder setAdditionalNotices(List arg0)`
- `AddressForNoticesBuilder setPrimaryNotices(ContactElection arg0)`

#### Getter Methods

- `ContactElectionBuilder getOrCreatePrimaryNotices()`
- `List getAdditionalNotices()`
- `ContactElectionBuilder getPrimaryNotices()`
- `PartyContactInformationBuilder getOrCreateAdditionalNotices(int arg0)`

#### Adder Methods

- `AddressForNoticesBuilder addAdditionalNotices(PartyContactInformation arg0)`
- `AddressForNoticesBuilder addAdditionalNotices(List arg0)`
- `AddressForNoticesBuilder addAdditionalNotices(PartyContactInformation arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AddressForNoticesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AddressForNoticesBuilder prune()`
- `AddressForNoticesBuilder toBuilder()`
- `boolean hasData()`

