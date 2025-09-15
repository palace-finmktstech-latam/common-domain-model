# ClearingInstructionBuilderImpl

**Full Name:** `cdm.event.common.ClearingInstruction$ClearingInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ClearingInstruction$ClearingInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| alphaContract | `TradeStateBuilder` |  |
| clearingParty | `PartyBuilder` |  |
| party1 | `PartyBuilder` |  |
| party2 | `PartyBuilder` |  |
| clearerParty1 | `PartyBuilder` |  |
| clearerParty2 | `PartyBuilder` |  |
| isOpenOffer | `Boolean` |  |

### Methods

#### Builder Methods

- `ClearingInstruction build()`

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
- `Boolean getIsOpenOffer()`
- `PartyBuilder getParty1()`
- `PartyBuilder getParty2()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ClearingInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ClearingInstructionBuilder toBuilder()`
- `ClearingInstructionBuilder prune()`

