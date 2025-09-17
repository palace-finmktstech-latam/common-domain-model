# RelatedPartyBuilder

**Full Name:** `cdm.base.staticdata.party.RelatedParty$RelatedPartyBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.RelatedParty`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `RelatedPartyBuilder setRole(PartyRoleEnum arg0)`
- `RelatedPartyBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `RelatedPartyBuilder setPartyReferenceValue(Party arg0)`
- `RelatedPartyBuilder setAccountReferenceValue(Account arg0)`
- `RelatedPartyBuilder setAccountReference(ReferenceWithMetaAccount arg0)`

#### Getter Methods

- `ReferenceWithMetaAccountBuilder getOrCreateAccountReference()`
- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `ReferenceWithMetaAccountBuilder getAccountReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `RelatedPartyBuilder prune()`

