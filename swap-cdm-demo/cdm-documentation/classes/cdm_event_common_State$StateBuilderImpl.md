# StateBuilderImpl

**Full Name:** `cdm.event.common.State$StateBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.State$StateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| closedState | `ClosedStateBuilder` |  |
| positionState | `PositionStatusEnum` |  |

### Methods

#### Builder Methods

- `State build()`

#### Setter Methods

- `StateBuilder setPositionState(PositionStatusEnum arg0)`
- `StateBuilder setClosedState(ClosedState arg0)`

#### Getter Methods

- `ClosedStateBuilder getClosedState()`
- `PositionStatusEnum getPositionState()`
- `ClosedStateBuilder getOrCreateClosedState()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `StateBuilder prune()`
- `StateBuilder toBuilder()`
- `boolean hasData()`

