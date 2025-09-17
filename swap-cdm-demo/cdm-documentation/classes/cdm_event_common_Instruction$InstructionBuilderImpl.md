# InstructionBuilderImpl

**Full Name:** `cdm.event.common.Instruction$InstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.Instruction$InstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| primitiveInstruction | `PrimitiveInstructionBuilder` |  |
| before | `ReferenceWithMetaTradeStateBuilder` |  |

### Methods

#### Builder Methods

- `Instruction build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `InstructionBuilder prune()`
- `InstructionBuilder toBuilder()`
- `boolean hasData()`

