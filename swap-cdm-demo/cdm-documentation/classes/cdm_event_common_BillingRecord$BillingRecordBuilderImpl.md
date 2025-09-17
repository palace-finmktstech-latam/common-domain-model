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

- `BillingRecordBuilder setMinimumFee(Money arg0)`
- `BillingRecordBuilder setRecordTransfer(Transfer arg0)`
- `BillingRecordBuilder setRecordEndDate(Date arg0)`
- `BillingRecordBuilder setRecordStartDate(Date arg0)`
- `BillingRecordBuilder setTradeState(ReferenceWithMetaTradeState arg0)`
- `BillingRecordBuilder setTradeStateValue(TradeState arg0)`

#### Getter Methods

- `ReferenceWithMetaTradeStateBuilder getTradeState()`
- `Date getRecordStartDate()`
- `Date getRecordEndDate()`
- `TransferBuilder getOrCreateRecordTransfer()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeState()`
- `MoneyBuilder getOrCreateMinimumFee()`
- `TransferBuilder getRecordTransfer()`
- `MoneyBuilder getMinimumFee()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BillingRecordBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BillingRecordBuilder prune()`
- `BillingRecordBuilder toBuilder()`
- `boolean hasData()`

