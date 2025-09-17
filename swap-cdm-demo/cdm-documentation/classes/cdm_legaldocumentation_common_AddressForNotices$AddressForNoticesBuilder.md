# AddressForNoticesBuilder

**Full Name:** `cdm.legaldocumentation.common.AddressForNotices$AddressForNoticesBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.AddressForNotices`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AddressForNoticesBuilder setAdditionalNotices(List arg0)`
- `AddressForNoticesBuilder setPrimaryNotices(ContactElection arg0)`

#### Getter Methods

- `ContactElectionBuilder getOrCreatePrimaryNotices()`
- `List getAdditionalNotices()`
- `ContactElectionBuilder getPrimaryNotices()`
- `PartyContactInformationBuilder getOrCreateAdditionalNotices(int arg0)`

#### Adder Methods

- `AddressForNoticesBuilder addAdditionalNotices(PartyContactInformation arg0, int arg1)`
- `AddressForNoticesBuilder addAdditionalNotices(PartyContactInformation arg0)`
- `AddressForNoticesBuilder addAdditionalNotices(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AddressForNoticesBuilder prune()`

