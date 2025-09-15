# PrimitiveInstruction

**Full Name:** `cdm.event.common.PrimitiveInstruction`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `PrimitiveInstruction build()`

#### Getter Methods

- `Class getType()`
- `SplitInstruction getSplit()`
- `ResetInstruction getReset()`
- `IndexTransitionInstruction getIndexTransition()`
- `StockSplitInstruction getStockSplit()`
- `TermsChangeInstruction getTermsChange()`
- `QuantityChangeInstruction getQuantityChange()`
- `ContractFormationInstruction getContractFormation()`
- `ExerciseInstruction getExercise()`
- `PartyChangeInstruction getPartyChange()`
- `ObservationInstruction getObservation()`
- `TransferInstruction getTransfer()`
- `ValuationInstruction getValuation()`
- `ExecutionInstruction getExecution()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PrimitiveInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

