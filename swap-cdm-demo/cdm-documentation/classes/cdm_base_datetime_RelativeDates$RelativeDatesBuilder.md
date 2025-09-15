# RelativeDatesBuilder

**Full Name:** `cdm.base.datetime.RelativeDates$RelativeDatesBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.RelativeDates`
- `cdm.base.datetime.RelativeDateOffset$RelativeDateOffsetBuilder`

### Methods

#### Setter Methods

- `RelativeDatesBuilder setDateRelativeToValue(Date arg0)`
- `RelativeDatesBuilder setAdjustedDate(Date arg0)`
- `RelativeDatesBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `RelativeDatesBuilder setBusinessCenters(BusinessCenters arg0)`
- `RelativeDatesBuilder setDateRelativeTo(ReferenceWithMetaDate arg0)`
- `RelativeDatesBuilder setDayType(DayTypeEnum arg0)`
- `RelativeDatesBuilder setPeriod(PeriodEnum arg0)`
- `RelativeDatesBuilder setPeriodMultiplier(Integer arg0)`
- `RelativeDatesBuilder setScheduleBounds(DateRange arg0)`
- `RelativeDatesBuilder setPeriodSkip(Integer arg0)`
- `RelativeDatesBuilder setBusinessCentersReferenceValue(BusinessCenters arg0)`
- `RelativeDatesBuilder setBusinessCentersReference(ReferenceWithMetaBusinessCenters arg0)`
- `RelativeDatesBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `DateRangeBuilder getScheduleBounds()`
- `DateRangeBuilder getOrCreateScheduleBounds()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `RelativeDatesBuilder prune()`

