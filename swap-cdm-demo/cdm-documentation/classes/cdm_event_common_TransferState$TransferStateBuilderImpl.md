# TransferStateBuilderImpl

**Full Name:** `cdm.event.common.TransferState$TransferStateBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.TransferState$TransferStateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| transfer | `TransferBuilder` |  |
| transferStatus | `TransferStatusEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `TransferState build()`

#### Setter Methods

- `TransferStateBuilder setTransfer(Transfer arg0)`
- `TransferStateBuilder setTransferStatus(TransferStatusEnum arg0)`
- `TransferStateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `TransferStatusEnum getTransferStatus()`
- `TransferBuilder getOrCreateTransfer()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `TransferBuilder getTransfer()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TransferStateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TransferStateBuilder prune()`
- `TransferStateBuilder toBuilder()`
- `boolean hasData()`

