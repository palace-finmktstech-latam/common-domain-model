# AncillaryPartyBuilderImpl

**Full Name:** `cdm.base.staticdata.party.AncillaryParty$AncillaryPartyBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.AncillaryParty$AncillaryPartyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| role | `AncillaryRoleEnum` |  |
| partyReference | `java.util.List<cdm.base.staticdata.party.metafields.ReferenceWithMetaParty$ReferenceWithMetaPartyBuilder>` |  |
| onBehalfOf | `CounterpartyRoleEnum` |  |

### Methods

#### Builder Methods

- `AncillaryParty build()`

#### Setter Methods

- `AncillaryPartyBuilder setRole(AncillaryRoleEnum arg0)`
- `AncillaryPartyBuilder setOnBehalfOf(CounterpartyRoleEnum arg0)`
- `AncillaryPartyBuilder setPartyReference(List arg0)`
- `AncillaryPartyBuilder setPartyReferenceValue(List arg0)`

#### Getter Methods

- `AncillaryRoleEnum getRole()`
- `List getPartyReference()`
- `CounterpartyRoleEnum getOnBehalfOf()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference(int arg0)`

#### Adder Methods

- `AncillaryPartyBuilder addPartyReferenceValue(Party arg0)`
- `AncillaryPartyBuilder addPartyReferenceValue(Party arg0, int arg1)`
- `AncillaryPartyBuilder addPartyReferenceValue(List arg0)`
- `AncillaryPartyBuilder addPartyReference(ReferenceWithMetaParty arg0, int arg1)`
- `AncillaryPartyBuilder addPartyReference(ReferenceWithMetaParty arg0)`
- `AncillaryPartyBuilder addPartyReference(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AncillaryPartyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AncillaryPartyBuilder prune()`
- `AncillaryPartyBuilder toBuilder()`
- `boolean hasData()`

