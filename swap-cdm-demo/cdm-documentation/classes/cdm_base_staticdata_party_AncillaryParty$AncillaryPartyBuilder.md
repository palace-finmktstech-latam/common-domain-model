# AncillaryPartyBuilder

**Full Name:** `cdm.base.staticdata.party.AncillaryParty$AncillaryPartyBuilder`

**Package:** `cdm.base.staticdata.party`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.AncillaryParty`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AncillaryPartyBuilder setOnBehalfOf(CounterpartyRoleEnum arg0)`
- `AncillaryPartyBuilder setRole(AncillaryRoleEnum arg0)`
- `AncillaryPartyBuilder setPartyReferenceValue(List arg0)`
- `AncillaryPartyBuilder setPartyReference(List arg0)`

#### Getter Methods

- `List getPartyReference()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference(int arg0)`

#### Adder Methods

- `AncillaryPartyBuilder addPartyReferenceValue(Party arg0, int arg1)`
- `AncillaryPartyBuilder addPartyReferenceValue(Party arg0)`
- `AncillaryPartyBuilder addPartyReferenceValue(List arg0)`
- `AncillaryPartyBuilder addPartyReference(List arg0)`
- `AncillaryPartyBuilder addPartyReference(ReferenceWithMetaParty arg0, int arg1)`
- `AncillaryPartyBuilder addPartyReference(ReferenceWithMetaParty arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AncillaryPartyBuilder prune()`

