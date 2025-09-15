# WeightedAveragingObservationBuilderImpl

**Full Name:** `cdm.product.common.schedule.WeightedAveragingObservation$WeightedAveragingObservationBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.WeightedAveragingObservation$WeightedAveragingObservationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| dateTime | `ZonedDateTime` |  |
| observationNumber | `Integer` |  |
| weight | `BigDecimal` |  |

### Methods

#### Builder Methods

- `WeightedAveragingObservation build()`

#### Setter Methods

- `WeightedAveragingObservationBuilder setDateTime(ZonedDateTime arg0)`
- `WeightedAveragingObservationBuilder setObservationNumber(Integer arg0)`
- `WeightedAveragingObservationBuilder setWeight(BigDecimal arg0)`

#### Getter Methods

- `ZonedDateTime getDateTime()`
- `BigDecimal getWeight()`
- `Integer getObservationNumber()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `WeightedAveragingObservationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `WeightedAveragingObservationBuilder toBuilder()`
- `WeightedAveragingObservationBuilder prune()`

