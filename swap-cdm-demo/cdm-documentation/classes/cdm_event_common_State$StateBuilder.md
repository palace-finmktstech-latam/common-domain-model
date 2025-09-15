# StateBuilder

**Full Name:** `cdm.event.common.State$StateBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.State`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `StateBuilder setClosedState(ClosedState arg0)`
- `StateBuilder setPositionState(PositionStatusEnum arg0)`

#### Getter Methods

- `ClosedStateBuilder getOrCreateClosedState()`
- `ClosedStateBuilder getClosedState()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `StateBuilder prune()`

