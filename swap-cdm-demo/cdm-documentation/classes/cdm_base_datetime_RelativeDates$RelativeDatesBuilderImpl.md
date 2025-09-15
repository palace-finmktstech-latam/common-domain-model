# RelativeDatesBuilderImpl

**Full Name:** `cdm.base.datetime.RelativeDates$RelativeDatesBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.datetime.RelativeDateOffset$RelativeDateOffsetBuilderImpl`

### Implemented Interfaces

- `cdm.base.datetime.RelativeDates$RelativeDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| periodSkip | `Integer` |  |
| scheduleBounds | `DateRangeBuilder` |  |

### Methods

#### Builder Methods

- `RelativeDates build()`

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
- `Integer getPeriodSkip()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RelativeDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `RelativeDatesBuilder toBuilder()`
- `RelativeDatesBuilder prune()`

