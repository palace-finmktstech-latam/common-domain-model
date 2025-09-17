# ClearingInstructionBuilder

**Full Name:** `cdm.event.common.ClearingInstruction$ClearingInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ClearingInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ClearingInstructionBuilder setClearerParty1(Party arg0)`
- `ClearingInstructionBuilder setClearingParty(Party arg0)`
- `ClearingInstructionBuilder setAlphaContract(TradeState arg0)`
- `ClearingInstructionBuilder setClearerParty2(Party arg0)`
- `ClearingInstructionBuilder setIsOpenOffer(Boolean arg0)`
- `ClearingInstructionBuilder setParty1(Party arg0)`
- `ClearingInstructionBuilder setParty2(Party arg0)`

#### Getter Methods

- `TradeStateBuilder getOrCreateAlphaContract()`
- `PartyBuilder getOrCreateClearerParty2()`
- `PartyBuilder getOrCreateClearerParty1()`
- `PartyBuilder getOrCreateParty1()`
- `PartyBuilder getOrCreateClearingParty()`
- `PartyBuilder getClearerParty2()`
- `PartyBuilder getClearingParty()`
- `PartyBuilder getClearerParty1()`
- `TradeStateBuilder getAlphaContract()`
- `PartyBuilder getOrCreateParty2()`
- `PartyBuilder getParty2()`
- `PartyBuilder getParty1()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ClearingInstructionBuilder prune()`

