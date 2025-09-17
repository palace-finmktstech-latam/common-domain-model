# SecurityLendingInvoiceBuilder

**Full Name:** `cdm.event.common.SecurityLendingInvoice$SecurityLendingInvoiceBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.SecurityLendingInvoice`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `SecurityLendingInvoiceBuilder setMeta(MetaFields arg0)`
- `SecurityLendingInvoiceBuilder setBillingStartDate(Date arg0)`
- `SecurityLendingInvoiceBuilder setSendingParty(Party arg0)`
- `SecurityLendingInvoiceBuilder setReceivingParty(Party arg0)`
- `SecurityLendingInvoiceBuilder setBillingRecord(List arg0)`
- `SecurityLendingInvoiceBuilder setBillingSummary(List arg0)`
- `SecurityLendingInvoiceBuilder setBillingEndDate(Date arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `List getBillingSummary()`
- `List getBillingRecord()`
- `PartyBuilder getSendingParty()`
- `PartyBuilder getReceivingParty()`
- `MetaFieldsBuilder getMeta()`
- `BillingRecordBuilder getOrCreateBillingRecord(int arg0)`
- `PartyBuilder getOrCreateSendingParty()`
- `PartyBuilder getOrCreateReceivingParty()`
- `BillingSummaryBuilder getOrCreateBillingSummary(int arg0)`

#### Adder Methods

- `SecurityLendingInvoiceBuilder addBillingSummary(BillingSummary arg0)`
- `SecurityLendingInvoiceBuilder addBillingSummary(List arg0)`
- `SecurityLendingInvoiceBuilder addBillingSummary(BillingSummary arg0, int arg1)`
- `SecurityLendingInvoiceBuilder addBillingRecord(BillingRecord arg0)`
- `SecurityLendingInvoiceBuilder addBillingRecord(List arg0)`
- `SecurityLendingInvoiceBuilder addBillingRecord(BillingRecord arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SecurityLendingInvoiceBuilder prune()`

