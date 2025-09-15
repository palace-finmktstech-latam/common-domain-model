# PartyChangeInstructionBuilderImpl

**Full Name:** `cdm.event.common.PartyChangeInstruction$PartyChangeInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.PartyChangeInstruction$PartyChangeInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| counterparty | `CounterpartyBuilder` |  |
| ancillaryParty | `AncillaryPartyBuilder` |  |
| partyRole | `PartyRoleBuilder` |  |
| tradeId | `java.util.List<cdm.event.common.TradeIdentifier$TradeIdentifierBuilder>` |  |

### Methods

#### Builder Methods

- `PartyChangeInstruction build()`

#### Setter Methods

- `PartyChangeInstructionBuilder setTradeId(List arg0)`
- `PartyChangeInstructionBuilder setCounterparty(Counterparty arg0)`
- `PartyChangeInstructionBuilder setAncillaryParty(AncillaryParty arg0)`
- `PartyChangeInstructionBuilder setPartyRole(PartyRole arg0)`

#### Getter Methods

- `List getTradeId()`
- `AncillaryPartyBuilder getOrCreateAncillaryParty()`
- `CounterpartyBuilder getOrCreateCounterparty()`
- `TradeIdentifierBuilder getOrCreateTradeId(int arg0)`
- `PartyRoleBuilder getOrCreatePartyRole()`
- `CounterpartyBuilder getCounterparty()`
- `PartyRoleBuilder getPartyRole()`
- `AncillaryPartyBuilder getAncillaryParty()`

#### Adder Methods

- `PartyChangeInstructionBuilder addTradeId(List arg0)`
- `PartyChangeInstructionBuilder addTradeId(TradeIdentifier arg0, int arg1)`
- `PartyChangeInstructionBuilder addTradeId(TradeIdentifier arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartyChangeInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PartyChangeInstructionBuilder toBuilder()`
- `PartyChangeInstructionBuilder prune()`

