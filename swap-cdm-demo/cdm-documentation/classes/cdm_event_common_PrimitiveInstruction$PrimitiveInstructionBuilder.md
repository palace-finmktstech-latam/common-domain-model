# PrimitiveInstructionBuilder

**Full Name:** `cdm.event.common.PrimitiveInstruction$PrimitiveInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.PrimitiveInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PrimitiveInstructionBuilder prune()`

