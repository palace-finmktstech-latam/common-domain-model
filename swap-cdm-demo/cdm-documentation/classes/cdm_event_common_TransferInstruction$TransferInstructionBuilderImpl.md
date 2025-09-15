# TransferInstructionBuilderImpl

**Full Name:** `cdm.event.common.TransferInstruction$TransferInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.TransferInstruction$TransferInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| transferState | `java.util.List<cdm.event.common.TransferState$TransferStateBuilder>` |  |

### Methods

#### Builder Methods

- `TransferInstruction build()`

#### Setter Methods

- `TransferInstructionBuilder setTransferState(List arg0)`

#### Getter Methods

- `List getTransferState()`
- `TransferStateBuilder getOrCreateTransferState(int arg0)`

#### Adder Methods

- `TransferInstructionBuilder addTransferState(List arg0)`
- `TransferInstructionBuilder addTransferState(TransferState arg0, int arg1)`
- `TransferInstructionBuilder addTransferState(TransferState arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TransferInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TransferInstructionBuilder toBuilder()`
- `TransferInstructionBuilder prune()`

