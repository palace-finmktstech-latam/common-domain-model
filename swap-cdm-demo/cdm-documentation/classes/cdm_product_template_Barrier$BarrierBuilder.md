# BarrierBuilder

**Full Name:** `cdm.product.template.Barrier$BarrierBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Barrier`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `BarrierBuilder setBarrierFloor(TriggerEvent arg0)`
- `BarrierBuilder setBarrierCap(TriggerEvent arg0)`

#### Getter Methods

- `TriggerEventBuilder getOrCreateBarrierCap()`
- `TriggerEventBuilder getOrCreateBarrierFloor()`
- `TriggerEventBuilder getBarrierCap()`
- `TriggerEventBuilder getBarrierFloor()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `BarrierBuilder prune()`

