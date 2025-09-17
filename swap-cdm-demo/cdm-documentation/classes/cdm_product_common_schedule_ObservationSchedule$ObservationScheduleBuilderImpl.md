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

- `ObservationScheduleBuilder setObservationDate(List arg0)`
- `ObservationScheduleBuilder setDateAdjustments(BusinessDayAdjustments arg0)`

#### Getter Methods

- `ObservationDateBuilder getOrCreateObservationDate(int arg0)`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `List getObservationDate()`

#### Adder Methods

- `ObservationScheduleBuilder addObservationDate(ObservationDate arg0)`
- `ObservationScheduleBuilder addObservationDate(ObservationDate arg0, int arg1)`
- `ObservationScheduleBuilder addObservationDate(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ObservationScheduleBuilder prune()`
- `ObservationScheduleBuilder toBuilder()`
- `boolean hasData()`

