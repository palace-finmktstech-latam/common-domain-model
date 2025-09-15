# ObservationScheduleBuilderImpl

**Full Name:** `cdm.product.common.schedule.ObservationSchedule$ObservationScheduleBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationSchedule$ObservationScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| observationDate | `java.util.List<cdm.product.common.schedule.ObservationDate$ObservationDateBuilder>` |  |
| dateAdjustments | `BusinessDayAdjustmentsBuilder` |  |

### Methods

#### Builder Methods

- `ObservationSchedule build()`

#### Setter Methods

- `ObservationScheduleBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `ObservationScheduleBuilder setObservationDate(List arg0)`

#### Getter Methods

- `List getObservationDate()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `ObservationDateBuilder getOrCreateObservationDate(int arg0)`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`

#### Adder Methods

- `ObservationScheduleBuilder addObservationDate(ObservationDate arg0, int arg1)`
- `ObservationScheduleBuilder addObservationDate(List arg0)`
- `ObservationScheduleBuilder addObservationDate(ObservationDate arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ObservationScheduleBuilder toBuilder()`
- `ObservationScheduleBuilder prune()`

