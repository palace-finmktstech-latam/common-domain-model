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
- `Date getRecordEndDate()`
- `ReferenceWithMetaTradeState getTradeState()`
- `Date getRecordStartDate()`
- `Money getMinimumFee()`
- `Transfer getRecordTransfer()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `BillingRecordBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

