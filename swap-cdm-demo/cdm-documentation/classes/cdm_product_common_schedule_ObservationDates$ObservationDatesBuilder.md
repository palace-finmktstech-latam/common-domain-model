# ObservationDatesBuilder

**Full Name:** `cdm.product.common.schedule.ObservationDates$ObservationDatesBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationDatesBuilder setPeriodicSchedule(PeriodicDates arg0)`
- `ObservationDatesBuilder setObservationSchedule(ObservationSchedule arg0)`
- `ObservationDatesBuilder setParametricDates(ParametricDates arg0)`

#### Getter Methods

- `ParametricDatesBuilder getOrCreateParametricDates()`
- `ObservationScheduleBuilder getObservationSchedule()`
- `PeriodicDatesBuilder getPeriodicSchedule()`
- `ParametricDatesBuilder getParametricDates()`
- `PeriodicDatesBuilder getOrCreatePeriodicSchedule()`
- `ObservationScheduleBuilder getOrCreateObservationSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationDatesBuilder prune()`

