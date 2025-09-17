# PrimitiveInstructionBuilder

**Full Name:** `cdm.event.common.PrimitiveInstruction$PrimitiveInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.PrimitiveInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PrimitiveInstructionBuilder prune()`

