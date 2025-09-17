# LagBuilder

**Full Name:** `cdm.product.common.schedule.Lag$LagBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.Lag`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `LagBuilder setLagDuration(Offset arg0)`
- `LagBuilder setFirstObservationDateOffset(Offset arg0)`

#### Getter Methods

- `OffsetBuilder getOrCreateLagDuration()`
- `OffsetBuilder getLagDuration()`
- `OffsetBuilder getOrCreateFirstObservationDateOffset()`
- `OffsetBuilder getFirstObservationDateOffset()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LagBuilder prune()`

