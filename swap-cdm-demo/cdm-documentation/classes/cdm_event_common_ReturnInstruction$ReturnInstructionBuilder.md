# ReturnInstructionBuilder

**Full Name:** `cdm.event.common.ReturnInstruction$ReturnInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ReturnInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReturnInstructionBuilder prune()`

