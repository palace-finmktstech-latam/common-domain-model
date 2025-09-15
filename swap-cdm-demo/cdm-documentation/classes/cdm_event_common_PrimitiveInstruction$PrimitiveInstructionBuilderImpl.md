# PrimitiveInstructionBuilderImpl

**Full Name:** `cdm.event.common.PrimitiveInstruction$PrimitiveInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.PrimitiveInstruction$PrimitiveInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| contractFormation | `ContractFormationInstructionBuilder` |  |
| execution | `ExecutionInstructionBuilder` |  |
| exercise | `ExerciseInstructionBuilder` |  |
| partyChange | `PartyChangeInstructionBuilder` |  |
| quantityChange | `QuantityChangeInstructionBuilder` |  |
| reset | `ResetInstructionBuilder` |  |
| split | `SplitInstructionBuilder` |  |
| termsChange | `TermsChangeInstructionBuilder` |  |
| transfer | `TransferInstructionBuilder` |  |
| indexTransition | `IndexTransitionInstructionBuilder` |  |
| stockSplit | `StockSplitInstructionBuilder` |  |
| observation | `ObservationInstructionBuilder` |  |
| valuation | `ValuationInstructionBuilder` |  |

### Methods

#### Builder Methods

- `PrimitiveInstruction build()`

#### Setter Methods

- `PrimitiveInstructionBuilder setReset(ResetInstruction arg0)`
- `PrimitiveInstructionBuilder setSplit(SplitInstruction arg0)`
- `PrimitiveInstructionBuilder setValuation(ValuationInstruction arg0)`
- `PrimitiveInstructionBuilder setContractFormation(ContractFormationInstruction arg0)`
- `PrimitiveInstructionBuilder setPartyChange(PartyChangeInstruction arg0)`
- `PrimitiveInstructionBuilder setQuantityChange(QuantityChangeInstruction arg0)`
- `PrimitiveInstructionBuilder setExecution(ExecutionInstruction arg0)`
- `PrimitiveInstructionBuilder setExercise(ExerciseInstruction arg0)`
- `PrimitiveInstructionBuilder setTermsChange(TermsChangeInstruction arg0)`
- `PrimitiveInstructionBuilder setStockSplit(StockSplitInstruction arg0)`
- `PrimitiveInstructionBuilder setObservation(ObservationInstruction arg0)`
- `PrimitiveInstructionBuilder setIndexTransition(IndexTransitionInstruction arg0)`
- `PrimitiveInstructionBuilder setTransfer(TransferInstruction arg0)`

#### Getter Methods

- `SplitInstructionBuilder getSplit()`
- `ResetInstructionBuilder getReset()`
- `ValuationInstructionBuilder getOrCreateValuation()`
- `QuantityChangeInstructionBuilder getOrCreateQuantityChange()`
- `SplitInstructionBuilder getOrCreateSplit()`
- `ResetInstructionBuilder getOrCreateReset()`
- `IndexTransitionInstructionBuilder getOrCreateIndexTransition()`
- `TermsChangeInstructionBuilder getOrCreateTermsChange()`
- `StockSplitInstructionBuilder getOrCreateStockSplit()`
- `IndexTransitionInstructionBuilder getIndexTransition()`
- `StockSplitInstructionBuilder getStockSplit()`
- `PartyChangeInstructionBuilder getOrCreatePartyChange()`
- `TermsChangeInstructionBuilder getTermsChange()`
- `ObservationInstructionBuilder getOrCreateObservation()`
- `QuantityChangeInstructionBuilder getQuantityChange()`
- `ContractFormationInstructionBuilder getContractFormation()`
- `ExecutionInstructionBuilder getOrCreateExecution()`
- `ExerciseInstructionBuilder getOrCreateExercise()`
- `ExerciseInstructionBuilder getExercise()`
- `PartyChangeInstructionBuilder getPartyChange()`
- `ObservationInstructionBuilder getObservation()`
- `TransferInstructionBuilder getTransfer()`
- `TransferInstructionBuilder getOrCreateTransfer()`
- `ValuationInstructionBuilder getValuation()`
- `ExecutionInstructionBuilder getExecution()`
- `ContractFormationInstructionBuilder getOrCreateContractFormation()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PrimitiveInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PrimitiveInstructionBuilder toBuilder()`
- `PrimitiveInstructionBuilder prune()`

