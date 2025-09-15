# BillingRecordBuilderImpl

**Full Name:** `cdm.event.common.BillingRecord$BillingRecordBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.BillingRecord$BillingRecordBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| tradeState | `ReferenceWithMetaTradeStateBuilder` |  |
| recordTransfer | `TransferBuilder` |  |
| recordStartDate | `Date` |  |
| recordEndDate | `Date` |  |
| minimumFee | `MoneyBuilder` |  |

### Methods

#### Builder Methods

- `BillingRecord build()`

#### Setter Methods

- `BillingRecordBuilder setRecordEndDate(Date arg0)`
- `BillingRecordBuilder setMinimumFee(Money arg0)`
- `BillingRecordBuilder setRecordTransfer(Transfer arg0)`
- `BillingRecordBuilder setTradeState(ReferenceWithMetaTradeState arg0)`
- `BillingRecordBuilder setTradeStateValue(TradeState arg0)`
- `BillingRecordBuilder setRecordStartDate(Date arg0)`

#### Getter Methods

- `Date getRecordEndDate()`
- `ReferenceWithMetaTradeStateBuilder getTradeState()`
- `Date getRecordStartDate()`
- `MoneyBuilder getMinimumFee()`
- `TransferBuilder getRecordTransfer()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeState()`
- `TransferBuilder getOrCreateRecordTransfer()`
- `MoneyBuilder getOrCreateMinimumFee()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BillingRecordBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BillingRecordBuilder toBuilder()`
- `BillingRecordBuilder prune()`

