# PartyRoleBuilder

**Full Name:** `cdm.base.staticdata.party.PartyRole$PartyRoleBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.PartyRole`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PartyRoleBuilder setRole(PartyRoleEnum arg0)`
- `PartyRoleBuilder setPartyReferenceValue(Party arg0)`
- `PartyRoleBuilder setOwnershipPartyReference(ReferenceWithMetaParty arg0)`
- `PartyRoleBuilder setOwnershipPartyReferenceValue(Party arg0)`
- `PartyRoleBuilder setPartyReference(ReferenceWithMetaParty arg0)`

#### Getter Methods

- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreateOwnershipPartyReference()`
- `ReferenceWithMetaPartyBuilder getOwnershipPartyReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PartyRoleBuilder prune()`

