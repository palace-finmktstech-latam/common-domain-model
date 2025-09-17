# TransferStateBuilder

**Full Name:** `cdm.event.common.TransferState$TransferStateBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.TransferState`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `TransferStateBuilder setTransfer(Transfer arg0)`
- `TransferStateBuilder setTransferStatus(TransferStatusEnum arg0)`
- `TransferStateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `TransferBuilder getOrCreateTransfer()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `TransferBuilder getTransfer()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TransferStateBuilder prune()`

