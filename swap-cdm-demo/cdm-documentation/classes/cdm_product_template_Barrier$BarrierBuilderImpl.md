# BarrierBuilderImpl

**Full Name:** `cdm.product.template.Barrier$BarrierBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.Barrier$BarrierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| barrierCap | `TriggerEventBuilder` |  |
| barrierFloor | `TriggerEventBuilder` |  |

### Methods

#### Builder Methods

- `Barrier build()`

#### Setter Methods

- `BarrierBuilder setBarrierFloor(TriggerEvent arg0)`
- `BarrierBuilder setBarrierCap(TriggerEvent arg0)`

#### Getter Methods

- `TriggerEventBuilder getOrCreateBarrierCap()`
- `TriggerEventBuilder getOrCreateBarrierFloor()`
- `TriggerEventBuilder getBarrierFloor()`
- `TriggerEventBuilder getBarrierCap()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `BarrierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `BarrierBuilder toBuilder()`
- `BarrierBuilder prune()`

