# BillingSummaryBuilderImpl

**Full Name:** `cdm.event.common.BillingSummary$BillingSummaryBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.BillingSummary$BillingSummaryBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| summaryTransfer | `TransferBuilder` |  |
| summaryAmountType | `RecordAmountTypeEnum` |  |

### Methods

#### Builder Methods

- `BillingSummary build()`

#### Setter Methods

- `BillingSummaryBuilder setSummaryTransfer(Transfer arg0)`
- `BillingSummaryBuilder setSummaryAmountType(RecordAmountTypeEnum arg0)`

#### Getter Methods

- `TransferBuilder getOrCreateSummaryTransfer()`
- `RecordAmountTypeEnum getSummaryAmountType()`
- `TransferBuilder getSummaryTransfer()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BillingSummaryBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BillingSummaryBuilder toBuilder()`
- `BillingSummaryBuilder prune()`

