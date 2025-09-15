# ObservationScheduleBuilder

**Full Name:** `cdm.product.common.schedule.ObservationSchedule$ObservationScheduleBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationSchedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationScheduleBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `ObservationScheduleBuilder setObservationDate(List arg0)`

#### Getter Methods

- `List getObservationDate()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `ObservationDateBuilder getOrCreateObservationDate(int arg0)`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`

#### Adder Methods

- `ObservationScheduleBuilder addObservationDate(List arg0)`
- `ObservationScheduleBuilder addObservationDate(ObservationDate arg0, int arg1)`
- `ObservationScheduleBuilder addObservationDate(ObservationDate arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationScheduleBuilder prune()`

