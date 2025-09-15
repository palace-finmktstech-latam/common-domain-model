# TransferExpressionBuilder

**Full Name:** `cdm.event.common.TransferExpression$TransferExpressionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.TransferExpression`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `TransferExpressionBuilder setPriceTransfer(FeeTypeEnum arg0)`
- `TransferExpressionBuilder setScheduledTransfer(ScheduledTransfer arg0)`

#### Getter Methods

- `ScheduledTransferBuilder getScheduledTransfer()`
- `ScheduledTransferBuilder getOrCreateScheduledTransfer()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `TransferExpressionBuilder prune()`

