# BillingInstructionBuilderImpl

**Full Name:** `cdm.event.common.BillingInstruction$BillingInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.BillingInstruction$BillingInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| sendingParty | `PartyBuilder` |  |
| receivingParty | `PartyBuilder` |  |
| billingStartDate | `Date` |  |
| billingEndDate | `Date` |  |
| billingRecordInstruction | `java.util.List<cdm.event.common.BillingRecordInstruction$BillingRecordInstructionBuilder>` |  |
| billingSummary | `java.util.List<cdm.event.common.BillingSummaryInstruction$BillingSummaryInstructionBuilder>` |  |

### Methods

#### Builder Methods

- `BillingInstruction build()`

#### Setter Methods

- `BillingInstructionBuilder setBillingSummary(List arg0)`
- `BillingInstructionBuilder setBillingEndDate(Date arg0)`
- `BillingInstructionBuilder setBillingStartDate(Date arg0)`
- `BillingInstructionBuilder setSendingParty(Party arg0)`
- `BillingInstructionBuilder setReceivingParty(Party arg0)`
- `BillingInstructionBuilder setBillingRecordInstruction(List arg0)`

#### Getter Methods

- `PartyBuilder getOrCreateSendingParty()`
- `BillingSummaryInstructionBuilder getOrCreateBillingSummary(int arg0)`
- `PartyBuilder getOrCreateReceivingParty()`
- `Date getBillingStartDate()`
- `List getBillingSummary()`
- `PartyBuilder getReceivingParty()`
- `Date getBillingEndDate()`
- `PartyBuilder getSendingParty()`
- `List getBillingRecordInstruction()`
- `BillingRecordInstructionBuilder getOrCreateBillingRecordInstruction(int arg0)`

#### Adder Methods

- `BillingInstructionBuilder addBillingSummary(List arg0)`
- `BillingInstructionBuilder addBillingSummary(BillingSummaryInstruction arg0, int arg1)`
- `BillingInstructionBuilder addBillingSummary(BillingSummaryInstruction arg0)`
- `BillingInstructionBuilder addBillingRecordInstruction(List arg0)`
- `BillingInstructionBuilder addBillingRecordInstruction(BillingRecordInstruction arg0, int arg1)`
- `BillingInstructionBuilder addBillingRecordInstruction(BillingRecordInstruction arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BillingInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BillingInstructionBuilder toBuilder()`
- `BillingInstructionBuilder prune()`

