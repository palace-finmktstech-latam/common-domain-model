# PartyChangeInstructionBuilder

**Full Name:** `cdm.event.common.PartyChangeInstruction$PartyChangeInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.PartyChangeInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PartyChangeInstructionBuilder setTradeId(List arg0)`
- `PartyChangeInstructionBuilder setCounterparty(Counterparty arg0)`
- `PartyChangeInstructionBuilder setAncillaryParty(AncillaryParty arg0)`
- `PartyChangeInstructionBuilder setPartyRole(PartyRole arg0)`

#### Getter Methods

- `PartyRoleBuilder getPartyRole()`
- `CounterpartyBuilder getCounterparty()`
- `AncillaryPartyBuilder getAncillaryParty()`
- `List getTradeId()`
- `AncillaryPartyBuilder getOrCreateAncillaryParty()`
- `CounterpartyBuilder getOrCreateCounterparty()`
- `PartyRoleBuilder getOrCreatePartyRole()`
- `TradeIdentifierBuilder getOrCreateTradeId(int arg0)`

#### Adder Methods

- `PartyChangeInstructionBuilder addTradeId(List arg0)`
- `PartyChangeInstructionBuilder addTradeId(TradeIdentifier arg0)`
- `PartyChangeInstructionBuilder addTradeId(TradeIdentifier arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PartyChangeInstructionBuilder prune()`

