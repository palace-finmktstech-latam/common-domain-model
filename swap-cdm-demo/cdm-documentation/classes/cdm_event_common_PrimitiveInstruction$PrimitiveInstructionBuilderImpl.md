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

- `PrimitiveInstructionBuilder setTransfer(TransferInstruction arg0)`
- `PrimitiveInstructionBuilder setReset(ResetInstruction arg0)`
- `PrimitiveInstructionBuilder setSplit(SplitInstruction arg0)`
- `PrimitiveInstructionBuilder setValuation(ValuationInstruction arg0)`
- `PrimitiveInstructionBuilder setExecution(ExecutionInstruction arg0)`
- `PrimitiveInstructionBuilder setStockSplit(StockSplitInstruction arg0)`
- `PrimitiveInstructionBuilder setExercise(ExerciseInstruction arg0)`
- `PrimitiveInstructionBuilder setIndexTransition(IndexTransitionInstruction arg0)`
- `PrimitiveInstructionBuilder setObservation(ObservationInstruction arg0)`
- `PrimitiveInstructionBuilder setPartyChange(PartyChangeInstruction arg0)`
- `PrimitiveInstructionBuilder setContractFormation(ContractFormationInstruction arg0)`
- `PrimitiveInstructionBuilder setQuantityChange(QuantityChangeInstruction arg0)`
- `PrimitiveInstructionBuilder setTermsChange(TermsChangeInstruction arg0)`

#### Getter Methods

- `TransferInstructionBuilder getOrCreateTransfer()`
- `ObservationInstructionBuilder getObservation()`
- `ExecutionInstructionBuilder getExecution()`
- `TransferInstructionBuilder getTransfer()`
- `SplitInstructionBuilder getSplit()`
- `ResetInstructionBuilder getReset()`
- `ValuationInstructionBuilder getOrCreateValuation()`
- `ContractFormationInstructionBuilder getContractFormation()`
- `QuantityChangeInstructionBuilder getOrCreateQuantityChange()`
- `ExecutionInstructionBuilder getOrCreateExecution()`
- `ExerciseInstructionBuilder getOrCreateExercise()`
- `PartyChangeInstructionBuilder getOrCreatePartyChange()`
- `ExerciseInstructionBuilder getExercise()`
- `PartyChangeInstructionBuilder getPartyChange()`
- `ResetInstructionBuilder getOrCreateReset()`
- `TermsChangeInstructionBuilder getOrCreateTermsChange()`
- `TermsChangeInstructionBuilder getTermsChange()`
- `IndexTransitionInstructionBuilder getOrCreateIndexTransition()`
- `SplitInstructionBuilder getOrCreateSplit()`
- `IndexTransitionInstructionBuilder getIndexTransition()`
- `StockSplitInstructionBuilder getOrCreateStockSplit()`
- `QuantityChangeInstructionBuilder getQuantityChange()`
- `ContractFormationInstructionBuilder getOrCreateContractFormation()`
- `ObservationInstructionBuilder getOrCreateObservation()`
- `StockSplitInstructionBuilder getStockSplit()`
- `ValuationInstructionBuilder getValuation()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PrimitiveInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PrimitiveInstructionBuilder prune()`
- `PrimitiveInstructionBuilder toBuilder()`
- `boolean hasData()`

