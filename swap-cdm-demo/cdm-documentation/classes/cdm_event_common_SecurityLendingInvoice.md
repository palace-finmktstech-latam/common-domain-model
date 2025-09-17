# SecurityLendingInvoice

**Full Name:** `cdm.event.common.SecurityLendingInvoice`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `SecurityLendingInvoice build()`

#### Getter Methods

- `Class getType()`
- `List getBillingSummary()`
- `List getBillingRecord()`
- `Party getSendingParty()`
- `Party getReceivingParty()`
- `Date getBillingEndDate()`
- `Date getBillingStartDate()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `SecurityLendingInvoiceBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

