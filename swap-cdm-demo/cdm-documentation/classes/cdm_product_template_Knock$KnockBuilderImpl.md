# KnockBuilderImpl

**Full Name:** `cdm.product.template.Knock$KnockBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.Knock$KnockBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| knockIn | `TriggerEventBuilder` |  |
| knockOut | `TriggerEventBuilder` |  |

### Methods

#### Builder Methods

- `Knock build()`

#### Setter Methods

- `KnockBuilder setKnockIn(TriggerEvent arg0)`
- `KnockBuilder setKnockOut(TriggerEvent arg0)`

#### Getter Methods

- `TriggerEventBuilder getKnockOut()`
- `TriggerEventBuilder getKnockIn()`
- `TriggerEventBuilder getOrCreateKnockIn()`
- `TriggerEventBuilder getOrCreateKnockOut()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `KnockBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `KnockBuilder prune()`
- `KnockBuilder toBuilder()`
- `boolean hasData()`

