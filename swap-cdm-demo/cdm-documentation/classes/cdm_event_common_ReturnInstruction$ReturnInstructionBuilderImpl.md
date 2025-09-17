# ReturnInstructionBuilderImpl

**Full Name:** `cdm.event.common.ReturnInstruction$ReturnInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.ReturnInstruction$ReturnInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| quantity | `java.util.List<cdm.base.math.Quantity$QuantityBuilder>` |  |

### Methods

#### Builder Methods

- `ReturnInstruction build()`

#### Setter Methods

- `ReturnInstructionBuilder setQuantity(List arg0)`

#### Getter Methods

- `List getQuantity()`
- `QuantityBuilder getOrCreateQuantity(int arg0)`

#### Adder Methods

- `ReturnInstructionBuilder addQuantity(List arg0)`
- `ReturnInstructionBuilder addQuantity(Quantity arg0)`
- `ReturnInstructionBuilder addQuantity(Quantity arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReturnInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReturnInstructionBuilder prune()`
- `ReturnInstructionBuilder toBuilder()`
- `boolean hasData()`

