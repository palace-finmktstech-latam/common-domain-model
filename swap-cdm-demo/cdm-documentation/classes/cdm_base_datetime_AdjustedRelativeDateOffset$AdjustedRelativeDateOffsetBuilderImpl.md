# AdjustedRelativeDateOffsetBuilderImpl

**Full Name:** `cdm.base.datetime.AdjustedRelativeDateOffset$AdjustedRelativeDateOffsetBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.datetime.RelativeDateOffset$RelativeDateOffsetBuilderImpl`

### Implemented Interfaces

- `cdm.base.datetime.AdjustedRelativeDateOffset$AdjustedRelativeDateOffsetBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| relativeDateAdjustments | `BusinessDayAdjustmentsBuilder` |  |

### Methods

#### Builder Methods

- `AdjustedRelativeDateOffset build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustedRelativeDateOffsetBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AdjustedRelativeDateOffsetBuilder prune()`
- `AdjustedRelativeDateOffsetBuilder toBuilder()`
- `boolean hasData()`

