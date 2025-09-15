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
- `Date getBillingStartDate()`
- `List getBillingRecord()`
- `List getBillingSummary()`
- `Party getReceivingParty()`
- `Date getBillingEndDate()`
- `Party getSendingParty()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `SecurityLendingInvoiceBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

