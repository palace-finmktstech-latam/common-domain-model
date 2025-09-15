# ClearingInstructionBuilder

**Full Name:** `cdm.event.common.ClearingInstruction$ClearingInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ClearingInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ClearingInstructionBuilder setAlphaContract(TradeState arg0)`
- `ClearingInstructionBuilder setClearerParty1(Party arg0)`
- `ClearingInstructionBuilder setClearerParty2(Party arg0)`
- `ClearingInstructionBuilder setIsOpenOffer(Boolean arg0)`
- `ClearingInstructionBuilder setClearingParty(Party arg0)`
- `ClearingInstructionBuilder setParty2(Party arg0)`
- `ClearingInstructionBuilder setParty1(Party arg0)`

#### Getter Methods

- `TradeStateBuilder getOrCreateAlphaContract()`
- `TradeStateBuilder getAlphaContract()`
- `PartyBuilder getClearingParty()`
- `PartyBuilder getOrCreateParty1()`
- `PartyBuilder getOrCreateParty2()`
- `PartyBuilder getClearerParty1()`
- `PartyBuilder getOrCreateClearerParty2()`
- `PartyBuilder getOrCreateClearerParty1()`
- `PartyBuilder getClearerParty2()`
- `PartyBuilder getOrCreateClearingParty()`
- `PartyBuilder getParty1()`
- `PartyBuilder getParty2()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ClearingInstructionBuilder prune()`

