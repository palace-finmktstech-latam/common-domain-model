# ReferenceWithMetaPartyBuilderImpl

**Full Name:** `cdm.base.staticdata.party.metafields.ReferenceWithMetaParty$ReferenceWithMetaPartyBuilderImpl`

**Package:** `cdm.base.staticdata.party.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.metafields.ReferenceWithMetaParty$ReferenceWithMetaPartyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `PartyBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaParty build()`

#### Setter Methods

- `ReferenceWithMetaPartyBuilder setValue(Party arg0)`
- `ReferenceWithMetaPartyBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaPartyBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaPartyBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `PartyBuilder getValue()`
- `PartyBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaPartyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaPartyBuilder toBuilder()`
- `ReferenceWithMetaPartyBuilder prune()`

