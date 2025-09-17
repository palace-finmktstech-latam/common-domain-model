# AveragingScheduleBuilderImpl

**Full Name:** `cdm.base.datetime.AveragingSchedule$AveragingScheduleBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.AveragingSchedule$AveragingScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| startDate | `Date` |  |
| endDate | `Date` |  |
| averagingPeriodFrequency | `CalculationPeriodFrequencyBuilder` |  |

### Methods

#### Builder Methods

- `AveragingSchedule build()`

#### Setter Methods

- `AveragingScheduleBuilder setEndDate(Date arg0)`
- `AveragingScheduleBuilder setStartDate(Date arg0)`
- `AveragingScheduleBuilder setAveragingPeriodFrequency(CalculationPeriodFrequency arg0)`

#### Getter Methods

- `Date getEndDate()`
- `Date getStartDate()`
- `CalculationPeriodFrequencyBuilder getAveragingPeriodFrequency()`
- `CalculationPeriodFrequencyBuilder getOrCreateAveragingPeriodFrequency()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AveragingScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AveragingScheduleBuilder prune()`
- `AveragingScheduleBuilder toBuilder()`
- `boolean hasData()`

