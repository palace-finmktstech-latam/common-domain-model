# InstructionBuilder

**Full Name:** `cdm.event.common.Instruction$InstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.Instruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `InstructionBuilder setBefore(ReferenceWithMetaTradeState arg0)`
- `InstructionBuilder setBeforeValue(TradeState arg0)`
- `InstructionBuilder setPrimitiveInstruction(PrimitiveInstruction arg0)`

#### Getter Methods

- `ReferenceWithMetaTradeStateBuilder getBefore()`
- `PrimitiveInstructionBuilder getPrimitiveInstruction()`
- `PrimitiveInstructionBuilder getOrCreatePrimitiveInstruction()`
- `ReferenceWithMetaTradeStateBuilder getOrCreateBefore()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InstructionBuilder prune()`

