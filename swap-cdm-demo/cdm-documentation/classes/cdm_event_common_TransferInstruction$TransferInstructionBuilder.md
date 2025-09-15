# TransferInstructionBuilder

**Full Name:** `cdm.event.common.TransferInstruction$TransferInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.TransferInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TransferInstructionBuilder setTransferState(List arg0)`

#### Getter Methods

- `List getTransferState()`
- `TransferStateBuilder getOrCreateTransferState(int arg0)`

#### Adder Methods

- `TransferInstructionBuilder addTransferState(List arg0)`
- `TransferInstructionBuilder addTransferState(TransferState arg0)`
- `TransferInstructionBuilder addTransferState(TransferState arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TransferInstructionBuilder prune()`

