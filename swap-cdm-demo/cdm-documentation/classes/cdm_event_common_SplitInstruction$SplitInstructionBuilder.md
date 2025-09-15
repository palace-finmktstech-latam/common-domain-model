# SplitInstructionBuilder

**Full Name:** `cdm.event.common.SplitInstruction$SplitInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.SplitInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `SplitInstructionBuilder setBreakdown(List arg0)`

#### Getter Methods

- `PrimitiveInstructionBuilder getOrCreateBreakdown(int arg0)`
- `List getBreakdown()`

#### Adder Methods

- `SplitInstructionBuilder addBreakdown(PrimitiveInstruction arg0, int arg1)`
- `SplitInstructionBuilder addBreakdown(PrimitiveInstruction arg0)`
- `SplitInstructionBuilder addBreakdown(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SplitInstructionBuilder prune()`

