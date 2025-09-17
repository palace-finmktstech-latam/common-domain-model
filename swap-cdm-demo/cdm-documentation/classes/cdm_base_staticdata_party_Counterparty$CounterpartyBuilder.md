# CounterpartyBuilder

**Full Name:** `cdm.base.staticdata.party.Counterparty$CounterpartyBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.Counterparty`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CounterpartyBuilder setRole(CounterpartyRoleEnum arg0)`
- `CounterpartyBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `CounterpartyBuilder setPartyReferenceValue(Party arg0)`

#### Getter Methods

- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CounterpartyBuilder prune()`

