# AveragingPeriodBuilderImpl

**Full Name:** `cdm.product.common.schedule.AveragingPeriod$AveragingPeriodBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.AveragingPeriod$AveragingPeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| schedule | `java.util.List<cdm.base.datetime.AveragingSchedule$AveragingScheduleBuilder>` |  |
| averagingDateTimes | `DateTimeListBuilder` |  |
| averagingObservations | `AveragingObservationListBuilder` |  |
| marketDisruption | `FieldWithMetaMarketDisruptionEnumBuilder` |  |

### Methods

#### Builder Methods

- `AveragingPeriod build()`

#### Setter Methods

- `AveragingPeriodBuilder setSchedule(List arg0)`
- `AveragingPeriodBuilder setMarketDisruptionValue(MarketDisruptionEnum arg0)`
- `AveragingPeriodBuilder setMarketDisruption(FieldWithMetaMarketDisruptionEnum arg0)`
- `AveragingPeriodBuilder setAveragingObservations(AveragingObservationList arg0)`
- `AveragingPeriodBuilder setAveragingDateTimes(DateTimeList arg0)`

#### Getter Methods

- `List getSchedule()`
- `AveragingScheduleBuilder getOrCreateSchedule(int arg0)`
- `FieldWithMetaMarketDisruptionEnumBuilder getOrCreateMarketDisruption()`
- `AveragingObservationListBuilder getOrCreateAveragingObservations()`
- `DateTimeListBuilder getOrCreateAveragingDateTimes()`
- `FieldWithMetaMarketDisruptionEnumBuilder getMarketDisruption()`
- `AveragingObservationListBuilder getAveragingObservations()`
- `DateTimeListBuilder getAveragingDateTimes()`

#### Adder Methods

- `AveragingPeriodBuilder addSchedule(AveragingSchedule arg0, int arg1)`
- `AveragingPeriodBuilder addSchedule(AveragingSchedule arg0)`
- `AveragingPeriodBuilder addSchedule(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AveragingPeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AveragingPeriodBuilder toBuilder()`
- `AveragingPeriodBuilder prune()`

