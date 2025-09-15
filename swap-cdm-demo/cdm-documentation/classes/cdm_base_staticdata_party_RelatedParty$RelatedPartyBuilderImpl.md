# RelatedPartyBuilderImpl

**Full Name:** `cdm.base.staticdata.party.RelatedParty$RelatedPartyBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.RelatedParty$RelatedPartyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| partyReference | `ReferenceWithMetaPartyBuilder` |  |
| accountReference | `ReferenceWithMetaAccountBuilder` |  |
| role | `PartyRoleEnum` |  |

### Methods

#### Builder Methods

- `RelatedParty build()`

#### Setter Methods

- `RelatedPartyBuilder setRole(PartyRoleEnum arg0)`
- `RelatedPartyBuilder setPartyReferenceValue(Party arg0)`
- `RelatedPartyBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `RelatedPartyBuilder setAccountReference(ReferenceWithMetaAccount arg0)`
- `RelatedPartyBuilder setAccountReferenceValue(Account arg0)`

#### Getter Methods

- `PartyRoleEnum getRole()`
- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `ReferenceWithMetaAccountBuilder getOrCreateAccountReference()`
- `ReferenceWithMetaAccountBuilder getAccountReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RelatedPartyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `RelatedPartyBuilder toBuilder()`
- `RelatedPartyBuilder prune()`

