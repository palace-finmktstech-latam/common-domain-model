# BillingRecordInstructionBuilder

**Full Name:** `cdm.event.common.BillingRecordInstruction$BillingRecordInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.BillingRecordInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `BillingRecordInstructionBuilder setObservation(List arg0)`
- `BillingRecordInstructionBuilder setSettlementDate(Date arg0)`
- `BillingRecordInstructionBuilder setRecordEndDate(Date arg0)`
- `BillingRecordInstructionBuilder setTradeState(ReferenceWithMetaTradeState arg0)`
- `BillingRecordInstructionBuilder setTradeStateValue(TradeState arg0)`
- `BillingRecordInstructionBuilder setRecordStartDate(Date arg0)`

#### Getter Methods

- `ObservationBuilder getOrCreateObservation(int arg0)`
- `ReferenceWithMetaTradeStateBuilder getTradeState()`
- `List getObservation()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeState()`

#### Adder Methods

- `BillingRecordInstructionBuilder addObservation(Observation arg0, int arg1)`
- `BillingRecordInstructionBuilder addObservation(List arg0)`
- `BillingRecordInstructionBuilder addObservation(Observation arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BillingRecordInstructionBuilder prune()`

