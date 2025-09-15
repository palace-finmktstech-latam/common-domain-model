# MarginCallResponseActionBuilder

**Full Name:** `cdm.event.common.MarginCallResponseAction$MarginCallResponseActionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.MarginCallResponseAction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `MarginCallResponseActionBuilder setCollateralPositionComponent(List arg0)`
- `MarginCallResponseActionBuilder setMarginCallAction(MarginCallActionEnum arg0)`

#### Getter Methods

- `CollateralPositionBuilder getOrCreateCollateralPositionComponent(int arg0)`
- `List getCollateralPositionComponent()`

#### Adder Methods

- `MarginCallResponseActionBuilder addCollateralPositionComponent(CollateralPosition arg0, int arg1)`
- `MarginCallResponseActionBuilder addCollateralPositionComponent(List arg0)`
- `MarginCallResponseActionBuilder addCollateralPositionComponent(CollateralPosition arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MarginCallResponseActionBuilder prune()`

