# AveragingScheduleBuilder

**Full Name:** `cdm.base.datetime.AveragingSchedule$AveragingScheduleBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AveragingSchedule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AveragingScheduleBuilder setEndDate(Date arg0)`
- `AveragingScheduleBuilder setStartDate(Date arg0)`
- `AveragingScheduleBuilder setAveragingPeriodFrequency(CalculationPeriodFrequency arg0)`

#### Getter Methods

- `CalculationPeriodFrequencyBuilder getAveragingPeriodFrequency()`
- `CalculationPeriodFrequencyBuilder getOrCreateAveragingPeriodFrequency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AveragingScheduleBuilder prune()`

