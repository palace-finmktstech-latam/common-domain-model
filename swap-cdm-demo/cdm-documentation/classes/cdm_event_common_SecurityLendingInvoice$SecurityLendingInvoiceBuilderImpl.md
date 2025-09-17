# SecurityLendingInvoiceBuilderImpl

**Full Name:** `cdm.event.common.SecurityLendingInvoice$SecurityLendingInvoiceBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.SecurityLendingInvoice$SecurityLendingInvoiceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| sendingParty | `PartyBuilder` |  |
| receivingParty | `PartyBuilder` |  |
| billingStartDate | `Date` |  |
| billingEndDate | `Date` |  |
| billingRecord | `java.util.List<cdm.event.common.BillingRecord$BillingRecordBuilder>` |  |
| billingSummary | `java.util.List<cdm.event.common.BillingSummary$BillingSummaryBuilder>` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `SecurityLendingInvoice build()`

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
- `Date getBillingEndDate()`
- `Date getBillingStartDate()`
- `MetaFieldsBuilder getMeta()`
- `BillingRecordBuilder getOrCreateBillingRecord(int arg0)`
- `PartyBuilder getOrCreateSendingParty()`
- `PartyBuilder getOrCreateReceivingParty()`
- `BillingSummaryBuilder getOrCreateBillingSummary(int arg0)`

#### Adder Methods

- `SecurityLendingInvoiceBuilder addBillingSummary(List arg0)`
- `SecurityLendingInvoiceBuilder addBillingSummary(BillingSummary arg0)`
- `SecurityLendingInvoiceBuilder addBillingSummary(BillingSummary arg0, int arg1)`
- `SecurityLendingInvoiceBuilder addBillingRecord(BillingRecord arg0, int arg1)`
- `SecurityLendingInvoiceBuilder addBillingRecord(BillingRecord arg0)`
- `SecurityLendingInvoiceBuilder addBillingRecord(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SecurityLendingInvoiceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `SecurityLendingInvoiceBuilder prune()`
- `SecurityLendingInvoiceBuilder toBuilder()`
- `boolean hasData()`

