# ValuationInstructionBuilder

**Full Name:** `cdm.event.common.ValuationInstruction$ValuationInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.ValuationInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ValuationInstructionBuilder setValuation(List arg0)`
- `ValuationInstructionBuilder setReplace(Boolean arg0)`

#### Getter Methods

- `ValuationBuilder getOrCreateValuation(int arg0)`
- `List getValuation()`

#### Adder Methods

- `ValuationInstructionBuilder addValuation(List arg0)`
- `ValuationInstructionBuilder addValuation(Valuation arg0)`
- `ValuationInstructionBuilder addValuation(Valuation arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationInstructionBuilder prune()`

