# ResetInstructionBuilder

**Full Name:** `cdm.event.common.ResetInstruction$ResetInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ResetInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ResetInstructionBuilder setPayout(List arg0)`
- `ResetInstructionBuilder setPayoutValue(List arg0)`
- `ResetInstructionBuilder setRateRecordDate(Date arg0)`
- `ResetInstructionBuilder setResetDate(Date arg0)`

#### Getter Methods

- `ReferenceWithMetaPayoutBuilder getOrCreatePayout(int arg0)`
- `List getPayout()`

#### Adder Methods

- `ResetInstructionBuilder addPayout(ReferenceWithMetaPayout arg0, int arg1)`
- `ResetInstructionBuilder addPayout(List arg0)`
- `ResetInstructionBuilder addPayout(ReferenceWithMetaPayout arg0)`
- `ResetInstructionBuilder addPayoutValue(Payout arg0)`
- `ResetInstructionBuilder addPayoutValue(List arg0)`
- `ResetInstructionBuilder addPayoutValue(Payout arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ResetInstructionBuilder prune()`

