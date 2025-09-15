# IndexTransitionInstructionBuilder

**Full Name:** `cdm.event.common.IndexTransitionInstruction$IndexTransitionInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.IndexTransitionInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `IndexTransitionInstructionBuilder setCashTransfer(Transfer arg0)`
- `IndexTransitionInstructionBuilder setEffectiveDate(Date arg0)`
- `IndexTransitionInstructionBuilder setPriceQuantity(List arg0)`

#### Getter Methods

- `TransferBuilder getOrCreateCashTransfer()`
- `TransferBuilder getCashTransfer()`
- `List getPriceQuantity()`
- `PriceQuantityBuilder getOrCreatePriceQuantity(int arg0)`

#### Adder Methods

- `IndexTransitionInstructionBuilder addPriceQuantity(PriceQuantity arg0, int arg1)`
- `IndexTransitionInstructionBuilder addPriceQuantity(PriceQuantity arg0)`
- `IndexTransitionInstructionBuilder addPriceQuantity(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `IndexTransitionInstructionBuilder prune()`

