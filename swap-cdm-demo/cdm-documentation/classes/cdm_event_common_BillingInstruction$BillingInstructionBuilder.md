# BillingInstructionBuilder

**Full Name:** `cdm.event.common.BillingInstruction$BillingInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.BillingInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `BillingInstructionBuilder setBillingRecordInstruction(List arg0)`
- `BillingInstructionBuilder setBillingStartDate(Date arg0)`
- `BillingInstructionBuilder setSendingParty(Party arg0)`
- `BillingInstructionBuilder setReceivingParty(Party arg0)`
- `BillingInstructionBuilder setBillingSummary(List arg0)`
- `BillingInstructionBuilder setBillingEndDate(Date arg0)`

#### Getter Methods

- `List getBillingSummary()`
- `PartyBuilder getSendingParty()`
- `PartyBuilder getReceivingParty()`
- `List getBillingRecordInstruction()`
- `BillingRecordInstructionBuilder getOrCreateBillingRecordInstruction(int arg0)`
- `PartyBuilder getOrCreateSendingParty()`
- `PartyBuilder getOrCreateReceivingParty()`
- `BillingSummaryInstructionBuilder getOrCreateBillingSummary(int arg0)`

#### Adder Methods

- `BillingInstructionBuilder addBillingRecordInstruction(List arg0)`
- `BillingInstructionBuilder addBillingRecordInstruction(BillingRecordInstruction arg0, int arg1)`
- `BillingInstructionBuilder addBillingRecordInstruction(BillingRecordInstruction arg0)`
- `BillingInstructionBuilder addBillingSummary(List arg0)`
- `BillingInstructionBuilder addBillingSummary(BillingSummaryInstruction arg0, int arg1)`
- `BillingInstructionBuilder addBillingSummary(BillingSummaryInstruction arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BillingInstructionBuilder prune()`

