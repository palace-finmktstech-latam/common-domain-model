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

- `List getLotIdentifier()`
- `IdentifierBuilder getOrCreateLotIdentifier(int arg0)`
- `List getChange()`
- `PriceQuantityBuilder getOrCreateChange(int arg0)`

#### Adder Methods

- `QuantityChangeInstructionBuilder addChange(PriceQuantity arg0, int arg1)`
- `QuantityChangeInstructionBuilder addChange(PriceQuantity arg0)`
- `QuantityChangeInstructionBuilder addChange(List arg0)`
- `QuantityChangeInstructionBuilder addLotIdentifier(Identifier arg0)`
- `QuantityChangeInstructionBuilder addLotIdentifier(List arg0)`
- `QuantityChangeInstructionBuilder addLotIdentifier(Identifier arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `QuantityChangeInstructionBuilder prune()`

