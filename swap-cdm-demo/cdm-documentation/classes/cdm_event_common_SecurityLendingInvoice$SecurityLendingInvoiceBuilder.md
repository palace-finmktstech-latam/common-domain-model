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

- `SecurityLendingInvoiceBuilder setBillingSummary(List arg0)`
- `SecurityLendingInvoiceBuilder setBillingRecord(List arg0)`
- `SecurityLendingInvoiceBuilder setBillingEndDate(Date arg0)`
- `SecurityLendingInvoiceBuilder setBillingStartDate(Date arg0)`
- `SecurityLendingInvoiceBuilder setSendingParty(Party arg0)`
- `SecurityLendingInvoiceBuilder setReceivingParty(Party arg0)`
- `SecurityLendingInvoiceBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `PartyBuilder getOrCreateSendingParty()`
- `BillingRecordBuilder getOrCreateBillingRecord(int arg0)`
- `BillingSummaryBuilder getOrCreateBillingSummary(int arg0)`
- `PartyBuilder getOrCreateReceivingParty()`
- `List getBillingRecord()`
- `List getBillingSummary()`
- `PartyBuilder getReceivingParty()`
- `PartyBuilder getSendingParty()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `SecurityLendingInvoiceBuilder addBillingSummary(List arg0)`
- `SecurityLendingInvoiceBuilder addBillingSummary(BillingSummary arg0, int arg1)`
- `SecurityLendingInvoiceBuilder addBillingSummary(BillingSummary arg0)`
- `SecurityLendingInvoiceBuilder addBillingRecord(List arg0)`
- `SecurityLendingInvoiceBuilder addBillingRecord(BillingRecord arg0)`
- `SecurityLendingInvoiceBuilder addBillingRecord(BillingRecord arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SecurityLendingInvoiceBuilder prune()`

