# KnockBuilder

**Full Name:** `cdm.product.template.Knock$KnockBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.Knock`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `KnockBuilder setKnockOut(TriggerEvent arg0)`
- `KnockBuilder setKnockIn(TriggerEvent arg0)`

#### Getter Methods

- `TriggerEventBuilder getKnockIn()`
- `TriggerEventBuilder getOrCreateKnockOut()`
- `TriggerEventBuilder getOrCreateKnockIn()`
- `TriggerEventBuilder getKnockOut()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `KnockBuilder prune()`

