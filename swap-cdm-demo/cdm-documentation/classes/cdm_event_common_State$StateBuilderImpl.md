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

- `StateBuilder setClosedState(ClosedState arg0)`
- `StateBuilder setPositionState(PositionStatusEnum arg0)`

#### Getter Methods

- `ClosedStateBuilder getOrCreateClosedState()`
- `ClosedStateBuilder getClosedState()`
- `PositionStatusEnum getPositionState()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `StateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `StateBuilder toBuilder()`
- `StateBuilder prune()`

