# RelativeDateOffsetBuilderImpl

**Full Name:** `cdm.base.datetime.RelativeDateOffset$RelativeDateOffsetBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.datetime.Offset$OffsetBuilderImpl`

### Implemented Interfaces

- `cdm.base.datetime.RelativeDateOffset$RelativeDateOffsetBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| businessDayConvention | `BusinessDayConventionEnum` |  |
| businessCenters | `BusinessCentersBuilder` |  |
| businessCentersReference | `ReferenceWithMetaBusinessCentersBuilder` |  |
| dateRelativeTo | `ReferenceWithMetaDateBuilder` |  |
| adjustedDate | `Date` |  |

### Methods

#### Builder Methods

- `RelativeDateOffset build()`

#### Setter Methods

- `RelativeDateOffsetBuilder setMeta(MetaFields arg0)`
- `RelativeDateOffsetBuilder setDateRelativeTo(ReferenceWithMetaDate arg0)`
- `RelativeDateOffsetBuilder setDateRelativeToValue(Date arg0)`
- `RelativeDateOffsetBuilder setBusinessCenters(BusinessCenters arg0)`
- `RelativeDateOffsetBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `RelativeDateOffsetBuilder setAdjustedDate(Date arg0)`
- `RelativeDateOffsetBuilder setDayType(DayTypeEnum arg0)`
- `RelativeDateOffsetBuilder setPeriod(PeriodEnum arg0)`
- `RelativeDateOffsetBuilder setPeriodMultiplier(Integer arg0)`
- `RelativeDateOffsetBuilder setBusinessCentersReference(ReferenceWithMetaBusinessCenters arg0)`
- `RelativeDateOffsetBuilder setBusinessCentersReferenceValue(BusinessCenters arg0)`

#### Getter Methods

- `Date getAdjustedDate()`
- `ReferenceWithMetaDateBuilder getOrCreateDateRelativeTo()`
- `BusinessCentersBuilder getOrCreateBusinessCenters()`
- `BusinessCentersBuilder getBusinessCenters()`
- `ReferenceWithMetaDateBuilder getDateRelativeTo()`
- `BusinessDayConventionEnum getBusinessDayConvention()`
- `ReferenceWithMetaBusinessCentersBuilder getOrCreateBusinessCentersReference()`
- `ReferenceWithMetaBusinessCentersBuilder getBusinessCentersReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RelativeDateOffsetBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `RelativeDateOffsetBuilder prune()`
- `RelativeDateOffsetBuilder toBuilder()`
- `boolean hasData()`

