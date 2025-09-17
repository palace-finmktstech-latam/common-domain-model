# BillingRecord

**Full Name:** `cdm.event.common.BillingRecord`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `BillingRecord build()`

#### Getter Methods

- `Class getType()`
- `ReferenceWithMetaTradeState getTradeState()`
- `Date getRecordStartDate()`
- `Date getRecordEndDate()`
- `Transfer getRecordTransfer()`
- `Money getMinimumFee()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `BillingRecordBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

