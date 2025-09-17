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

- `ClearingInstructionBuilder setClearerParty1(Party arg0)`
- `ClearingInstructionBuilder setClearingParty(Party arg0)`
- `ClearingInstructionBuilder setAlphaContract(TradeState arg0)`
- `ClearingInstructionBuilder setClearerParty2(Party arg0)`
- `ClearingInstructionBuilder setIsOpenOffer(Boolean arg0)`
- `ClearingInstructionBuilder setParty1(Party arg0)`
- `ClearingInstructionBuilder setParty2(Party arg0)`

#### Getter Methods

- `Boolean getIsOpenOffer()`
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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ClearingInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ClearingInstructionBuilder prune()`
- `ClearingInstructionBuilder toBuilder()`
- `boolean hasData()`

