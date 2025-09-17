# PartyRoleBuilderImpl

**Full Name:** `cdm.base.staticdata.party.PartyRole$PartyRoleBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.PartyRole$PartyRoleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| partyReference | `ReferenceWithMetaPartyBuilder` |  |
| role | `PartyRoleEnum` |  |
| ownershipPartyReference | `ReferenceWithMetaPartyBuilder` |  |

### Methods

#### Builder Methods

- `PartyRole build()`

#### Setter Methods

- `PartyRoleBuilder setRole(PartyRoleEnum arg0)`
- `PartyRoleBuilder setOwnershipPartyReference(ReferenceWithMetaParty arg0)`
- `PartyRoleBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `PartyRoleBuilder setPartyReferenceValue(Party arg0)`
- `PartyRoleBuilder setOwnershipPartyReferenceValue(Party arg0)`

#### Getter Methods

- `PartyRoleEnum getRole()`
- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `ReferenceWithMetaPartyBuilder getOwnershipPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreateOwnershipPartyReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartyRoleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PartyRoleBuilder prune()`
- `PartyRoleBuilder toBuilder()`
- `boolean hasData()`

