# RelativeDateOffsetBuilder

**Full Name:** `cdm.base.datetime.RelativeDateOffset$RelativeDateOffsetBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.RelativeDateOffset`
- `cdm.base.datetime.Offset$OffsetBuilder`

### Methods

#### Setter Methods

- `RelativeDateOffsetBuilder setDateRelativeToValue(Date arg0)`
- `RelativeDateOffsetBuilder setAdjustedDate(Date arg0)`
- `RelativeDateOffsetBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `RelativeDateOffsetBuilder setBusinessCenters(BusinessCenters arg0)`
- `RelativeDateOffsetBuilder setDateRelativeTo(ReferenceWithMetaDate arg0)`
- `RelativeDateOffsetBuilder setDayType(DayTypeEnum arg0)`
- `RelativeDateOffsetBuilder setPeriod(PeriodEnum arg0)`
- `RelativeDateOffsetBuilder setPeriodMultiplier(Integer arg0)`
- `RelativeDateOffsetBuilder setBusinessCentersReferenceValue(BusinessCenters arg0)`
- `RelativeDateOffsetBuilder setBusinessCentersReference(ReferenceWithMetaBusinessCenters arg0)`
- `RelativeDateOffsetBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `ReferenceWithMetaDateBuilder getOrCreateDateRelativeTo()`
- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `ReferenceWithMetaDateBuilder getDateRelativeTo()`
- `ReferenceWithMetaBusinessCentersBuilder getBusinessCentersReference()`
- `ReferenceWithMetaBusinessCentersBuilder getOrCreateBusinessCentersReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `RelativeDateOffsetBuilder prune()`

