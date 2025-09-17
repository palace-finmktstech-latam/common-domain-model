# BillingRecordInstructionBuilderImpl

**Full Name:** `cdm.event.common.BillingRecordInstruction$BillingRecordInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.BillingRecordInstruction$BillingRecordInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| tradeState | `ReferenceWithMetaTradeStateBuilder` |  |
| observation | `java.util.List<cdm.observable.event.Observation$ObservationBuilder>` |  |
| recordStartDate | `Date` |  |
| recordEndDate | `Date` |  |
| settlementDate | `Date` |  |

### Methods

#### Builder Methods

- `BillingRecordInstruction build()`

#### Setter Methods

- `BillingRecordInstructionBuilder setSettlementDate(Date arg0)`
- `BillingRecordInstructionBuilder setRecordEndDate(Date arg0)`
- `BillingRecordInstructionBuilder setRecordStartDate(Date arg0)`
- `BillingRecordInstructionBuilder setTradeState(ReferenceWithMetaTradeState arg0)`
- `BillingRecordInstructionBuilder setTradeStateValue(TradeState arg0)`
- `BillingRecordInstructionBuilder setObservation(List arg0)`

#### Getter Methods

- `Date getSettlementDate()`
- `ReferenceWithMetaTradeStateBuilder getTradeState()`
- `List getObservation()`
- `Date getRecordStartDate()`
- `Date getRecordEndDate()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateTradeState()`
- `ObservationBuilder getOrCreateObservation(int arg0)`

#### Adder Methods

- `BillingRecordInstructionBuilder addObservation(Observation arg0, int arg1)`
- `BillingRecordInstructionBuilder addObservation(List arg0)`
- `BillingRecordInstructionBuilder addObservation(Observation arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BillingRecordInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `BillingRecordInstructionBuilder prune()`
- `BillingRecordInstructionBuilder toBuilder()`
- `boolean hasData()`

