# ObservationDatesBuilderImpl

**Full Name:** `cdm.product.common.schedule.ObservationDates$ObservationDatesBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationDates$ObservationDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| observationSchedule | `ObservationScheduleBuilder` |  |
| periodicSchedule | `PeriodicDatesBuilder` |  |
| parametricDates | `ParametricDatesBuilder` |  |

### Methods

#### Builder Methods

- `ObservationDates build()`

#### Setter Methods

- `ObservationDatesBuilder setPeriodicSchedule(PeriodicDates arg0)`
- `ObservationDatesBuilder setObservationSchedule(ObservationSchedule arg0)`
- `ObservationDatesBuilder setParametricDates(ParametricDates arg0)`

#### Getter Methods

- `PeriodicDatesBuilder getPeriodicSchedule()`
- `ObservationScheduleBuilder getObservationSchedule()`
- `ParametricDatesBuilder getParametricDates()`
- `ParametricDatesBuilder getOrCreateParametricDates()`
- `PeriodicDatesBuilder getOrCreatePeriodicSchedule()`
- `ObservationScheduleBuilder getOrCreateObservationSchedule()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ObservationDatesBuilder prune()`
- `ObservationDatesBuilder toBuilder()`
- `boolean hasData()`

