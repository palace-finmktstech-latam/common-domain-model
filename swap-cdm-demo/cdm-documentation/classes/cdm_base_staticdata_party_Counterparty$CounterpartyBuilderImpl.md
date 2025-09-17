# CounterpartyBuilderImpl

**Full Name:** `cdm.base.staticdata.party.Counterparty$CounterpartyBuilderImpl`

**Package:** `cdm.base.staticdata.party`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.party.Counterparty$CounterpartyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| role | `CounterpartyRoleEnum` |  |
| partyReference | `ReferenceWithMetaPartyBuilder` |  |

### Methods

#### Builder Methods

- `Counterparty build()`

#### Setter Methods

- `CounterpartyBuilder setRole(CounterpartyRoleEnum arg0)`
- `CounterpartyBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `CounterpartyBuilder setPartyReferenceValue(Party arg0)`

#### Getter Methods

- `CounterpartyRoleEnum getRole()`
- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CounterpartyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CounterpartyBuilder prune()`
- `CounterpartyBuilder toBuilder()`
- `boolean hasData()`

