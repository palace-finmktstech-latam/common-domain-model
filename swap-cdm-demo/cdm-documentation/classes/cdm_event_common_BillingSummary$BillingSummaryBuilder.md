# BillingSummaryBuilder

**Full Name:** `cdm.event.common.BillingSummary$BillingSummaryBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.BillingSummary`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `BillingSummaryBuilder setSummaryTransfer(Transfer arg0)`
- `BillingSummaryBuilder setSummaryAmountType(RecordAmountTypeEnum arg0)`

#### Getter Methods

- `TransferBuilder getOrCreateSummaryTransfer()`
- `TransferBuilder getSummaryTransfer()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BillingSummaryBuilder prune()`

