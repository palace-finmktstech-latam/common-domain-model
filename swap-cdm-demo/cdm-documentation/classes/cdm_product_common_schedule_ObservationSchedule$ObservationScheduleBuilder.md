# ObservationScheduleBuilder

**Full Name:** `cdm.product.common.schedule.ObservationSchedule$ObservationScheduleBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.ObservationSchedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationScheduleBuilder setObservationDate(List arg0)`
- `ObservationScheduleBuilder setDateAdjustments(BusinessDayAdjustments arg0)`

#### Getter Methods

- `ObservationDateBuilder getOrCreateObservationDate(int arg0)`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `List getObservationDate()`

#### Adder Methods

- `ObservationScheduleBuilder addObservationDate(List arg0)`
- `ObservationScheduleBuilder addObservationDate(ObservationDate arg0)`
- `ObservationScheduleBuilder addObservationDate(ObservationDate arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationScheduleBuilder prune()`

