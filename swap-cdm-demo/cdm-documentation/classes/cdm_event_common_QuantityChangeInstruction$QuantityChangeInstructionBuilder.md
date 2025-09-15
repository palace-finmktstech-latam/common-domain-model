# QuantityChangeInstructionBuilder

**Full Name:** `cdm.event.common.QuantityChangeInstruction$QuantityChangeInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.QuantityChangeInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `QuantityChangeInstructionBuilder setChange(List arg0)`
- `QuantityChangeInstructionBuilder setLotIdentifier(List arg0)`
- `QuantityChangeInstructionBuilder setDirection(QuantityChangeDirectionEnum arg0)`

#### Getter Methods

- `IdentifierBuilder getOrCreateLotIdentifier(int arg0)`
- `PriceQuantityBuilder getOrCreateChange(int arg0)`
- `List getLotIdentifier()`
- `List getChange()`

#### Adder Methods

- `QuantityChangeInstructionBuilder addChange(PriceQuantity arg0)`
- `QuantityChangeInstructionBuilder addChange(List arg0)`
- `QuantityChangeInstructionBuilder addChange(PriceQuantity arg0, int arg1)`
- `QuantityChangeInstructionBuilder addLotIdentifier(Identifier arg0, int arg1)`
- `QuantityChangeInstructionBuilder addLotIdentifier(Identifier arg0)`
- `QuantityChangeInstructionBuilder addLotIdentifier(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `QuantityChangeInstructionBuilder prune()`

