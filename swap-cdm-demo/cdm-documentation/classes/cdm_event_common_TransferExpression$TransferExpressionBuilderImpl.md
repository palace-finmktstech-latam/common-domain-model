# TransferExpressionBuilderImpl

**Full Name:** `cdm.event.common.TransferExpression$TransferExpressionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.TransferExpression$TransferExpressionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| priceTransfer | `FeeTypeEnum` |  |
| scheduledTransfer | `ScheduledTransferBuilder` |  |

### Methods

#### Builder Methods

- `TransferExpression build()`

#### Setter Methods

- `TransferExpressionBuilder setPriceTransfer(FeeTypeEnum arg0)`
- `TransferExpressionBuilder setScheduledTransfer(ScheduledTransfer arg0)`

#### Getter Methods

- `FeeTypeEnum getPriceTransfer()`
- `ScheduledTransferBuilder getScheduledTransfer()`
- `ScheduledTransferBuilder getOrCreateScheduledTransfer()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TransferExpressionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TransferExpressionBuilder prune()`
- `TransferExpressionBuilder toBuilder()`
- `boolean hasData()`

