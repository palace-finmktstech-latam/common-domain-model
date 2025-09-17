# AveragingPeriodBuilder

**Full Name:** `cdm.product.common.schedule.AveragingPeriod$AveragingPeriodBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.AveragingPeriod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AveragingPeriodBuilder setSchedule(List arg0)`
- `AveragingPeriodBuilder setAveragingDateTimes(DateTimeList arg0)`
- `AveragingPeriodBuilder setMarketDisruptionValue(MarketDisruptionEnum arg0)`
- `AveragingPeriodBuilder setMarketDisruption(FieldWithMetaMarketDisruptionEnum arg0)`
- `AveragingPeriodBuilder setAveragingObservations(AveragingObservationList arg0)`

#### Getter Methods

- `List getSchedule()`
- `AveragingScheduleBuilder getOrCreateSchedule(int arg0)`
- `FieldWithMetaMarketDisruptionEnumBuilder getMarketDisruption()`
- `AveragingObservationListBuilder getAveragingObservations()`
- `DateTimeListBuilder getAveragingDateTimes()`
- `FieldWithMetaMarketDisruptionEnumBuilder getOrCreateMarketDisruption()`
- `DateTimeListBuilder getOrCreateAveragingDateTimes()`
- `AveragingObservationListBuilder getOrCreateAveragingObservations()`

#### Adder Methods

- `AveragingPeriodBuilder addSchedule(AveragingSchedule arg0)`
- `AveragingPeriodBuilder addSchedule(AveragingSchedule arg0, int arg1)`
- `AveragingPeriodBuilder addSchedule(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AveragingPeriodBuilder prune()`

