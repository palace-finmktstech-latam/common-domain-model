# AdjustedRelativeDateOffsetBuilder

**Full Name:** `cdm.base.datetime.AdjustedRelativeDateOffset$AdjustedRelativeDateOffsetBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AdjustedRelativeDateOffset`
- `cdm.base.datetime.RelativeDateOffset$RelativeDateOffsetBuilder`

### Methods

#### Setter Methods

- `AdjustedRelativeDateOffsetBuilder setMeta(MetaFields arg0)`
- `AdjustedRelativeDateOffsetBuilder setDateRelativeTo(ReferenceWithMetaDate arg0)`
- `AdjustedRelativeDateOffsetBuilder setRelativeDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustedRelativeDateOffsetBuilder setDateRelativeToValue(Date arg0)`
- `AdjustedRelativeDateOffsetBuilder setBusinessCenters(BusinessCenters arg0)`
- `AdjustedRelativeDateOffsetBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `AdjustedRelativeDateOffsetBuilder setAdjustedDate(Date arg0)`
- `AdjustedRelativeDateOffsetBuilder setDayType(DayTypeEnum arg0)`
- `AdjustedRelativeDateOffsetBuilder setPeriod(PeriodEnum arg0)`
- `AdjustedRelativeDateOffsetBuilder setPeriodMultiplier(Integer arg0)`
- `AdjustedRelativeDateOffsetBuilder setBusinessCentersReference(ReferenceWithMetaBusinessCenters arg0)`
- `AdjustedRelativeDateOffsetBuilder setBusinessCentersReferenceValue(BusinessCenters arg0)`

#### Getter Methods

- `BusinessDayAdjustmentsBuilder getRelativeDateAdjustments()`
- `BusinessDayAdjustmentsBuilder getOrCreateRelativeDateAdjustments()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustedRelativeDateOffsetBuilder prune()`

