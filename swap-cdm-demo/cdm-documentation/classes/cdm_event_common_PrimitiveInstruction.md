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
- `ObservationInstruction getObservation()`
- `ExecutionInstruction getExecution()`
- `TransferInstruction getTransfer()`
- `SplitInstruction getSplit()`
- `ResetInstruction getReset()`
- `ContractFormationInstruction getContractFormation()`
- `ExerciseInstruction getExercise()`
- `PartyChangeInstruction getPartyChange()`
- `TermsChangeInstruction getTermsChange()`
- `IndexTransitionInstruction getIndexTransition()`
- `QuantityChangeInstruction getQuantityChange()`
- `StockSplitInstruction getStockSplit()`
- `ValuationInstruction getValuation()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PrimitiveInstructionBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

