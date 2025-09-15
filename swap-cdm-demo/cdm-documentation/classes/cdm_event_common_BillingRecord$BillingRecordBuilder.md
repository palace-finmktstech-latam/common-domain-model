# BillingRecordBuilder

**Full Name:** `cdm.event.common.BillingRecord$BillingRecordBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.BillingRecord`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `BillingRecordBuilder setRecordEndDate(Date arg0)`
- `BillingRecordBuilder setMinimumFee(Money arg0)`
- `BillingRecordBuilder setRecordTransfer(Transfer arg0)`
- `BillingRecordBuilder setTradeState(ReferenceWithMetaTradeState arg0)`
- `BillingRecordBuilder setTradeStateValue(TradeState arg0)`
- `BillingRecordBuilder setRecordStartDate(Date arg0)`

#### Getter Methods

- `ReferenceWithMetaTradeStateBuilder getTradeState()`
- `MoneyBuilder getMinimumFee()`
- `TransferBuilder getRecordTransfer()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeState()`
- `TransferBuilder getOrCreateRecordTransfer()`
- `MoneyBuilder getOrCreateMinimumFee()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BillingRecordBuilder prune()`

