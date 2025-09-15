# SplitInstructionBuilderImpl

**Full Name:** `cdm.event.common.SplitInstruction$SplitInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.SplitInstruction$SplitInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| breakdown | `java.util.List<cdm.event.common.PrimitiveInstruction$PrimitiveInstructionBuilder>` |  |

### Methods

#### Builder Methods

- `SplitInstruction build()`

#### Setter Methods

- `SplitInstructionBuilder setBreakdown(List arg0)`

#### Getter Methods

- `PrimitiveInstructionBuilder getOrCreateBreakdown(int arg0)`
- `List getBreakdown()`

#### Adder Methods

- `SplitInstructionBuilder addBreakdown(PrimitiveInstruction arg0)`
- `SplitInstructionBuilder addBreakdown(PrimitiveInstruction arg0, int arg1)`
- `SplitInstructionBuilder addBreakdown(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SplitInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `SplitInstructionBuilder toBuilder()`
- `SplitInstructionBuilder prune()`

