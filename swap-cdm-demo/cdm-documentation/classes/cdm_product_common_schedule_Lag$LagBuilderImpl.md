# LagBuilderImpl

**Full Name:** `cdm.product.common.schedule.Lag$LagBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.Lag$LagBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| lagDuration | `OffsetBuilder` |  |
| firstObservationDateOffset | `OffsetBuilder` |  |

### Methods

#### Builder Methods

- `Lag build()`

#### Setter Methods

- `LagBuilder setLagDuration(Offset arg0)`
- `LagBuilder setFirstObservationDateOffset(Offset arg0)`

#### Getter Methods

- `OffsetBuilder getOrCreateLagDuration()`
- `OffsetBuilder getLagDuration()`
- `OffsetBuilder getOrCreateFirstObservationDateOffset()`
- `OffsetBuilder getFirstObservationDateOffset()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LagBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `LagBuilder prune()`
- `LagBuilder toBuilder()`
- `boolean hasData()`

