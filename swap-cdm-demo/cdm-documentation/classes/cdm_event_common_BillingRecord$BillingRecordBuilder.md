# BillingRecordBuilder

**Full Name:** `cdm.event.common.BillingRecord$BillingRecordBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.BillingRecord`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `BillingRecordBuilder setMinimumFee(Money arg0)`
- `BillingRecordBuilder setRecordTransfer(Transfer arg0)`
- `BillingRecordBuilder setRecordEndDate(Date arg0)`
- `BillingRecordBuilder setRecordStartDate(Date arg0)`
- `BillingRecordBuilder setTradeState(ReferenceWithMetaTradeState arg0)`
- `BillingRecordBuilder setTradeStateValue(TradeState arg0)`

#### Getter Methods

- `ReferenceWithMetaTradeStateBuilder getTradeState()`
- `TransferBuilder getOrCreateRecordTransfer()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeState()`
- `MoneyBuilder getOrCreateMinimumFee()`
- `TransferBuilder getRecordTransfer()`
- `MoneyBuilder getMinimumFee()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BillingRecordBuilder prune()`

