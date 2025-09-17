# BillingInstruction

**Full Name:** `cdm.event.common.BillingInstruction`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `BillingInstruction build()`

#### Getter Methods

- `Class getType()`
- `List getBillingSummary()`
- `Party getSendingParty()`
- `Party getReceivingParty()`
- `Date getBillingEndDate()`
- `Date getBillingStartDate()`
- `List getBillingRecordInstruction()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `BillingInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

