# ShapingProvisionBuilder

**Full Name:** `cdm.product.common.settlement.ShapingProvision$ShapingProvisionBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.ShapingProvision`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ShapingProvisionBuilder setShapeSchedule(List arg0)`

#### Getter Methods

- `List getShapeSchedule()`
- `MoneyBuilder getOrCreateShapeSchedule(int arg0)`

#### Adder Methods

- `ShapingProvisionBuilder addShapeSchedule(Money arg0)`
- `ShapingProvisionBuilder addShapeSchedule(Money arg0, int arg1)`
- `ShapingProvisionBuilder addShapeSchedule(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ShapingProvisionBuilder prune()`

