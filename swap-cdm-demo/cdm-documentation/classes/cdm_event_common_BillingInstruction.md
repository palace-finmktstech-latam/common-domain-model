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
- `Date getBillingStartDate()`
- `List getBillingSummary()`
- `Party getReceivingParty()`
- `Date getBillingEndDate()`
- `Party getSendingParty()`
- `List getBillingRecordInstruction()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `BillingInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

