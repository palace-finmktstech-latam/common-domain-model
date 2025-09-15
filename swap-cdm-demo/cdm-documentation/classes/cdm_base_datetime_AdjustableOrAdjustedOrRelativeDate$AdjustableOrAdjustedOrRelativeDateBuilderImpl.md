# AdjustableOrAdjustedOrRelativeDateBuilderImpl

**Full Name:** `cdm.base.datetime.AdjustableOrAdjustedOrRelativeDate$AdjustableOrAdjustedOrRelativeDateBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.AdjustableOrAdjustedOrRelativeDate$AdjustableOrAdjustedOrRelativeDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| unadjustedDate | `Date` |  |
| dateAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| adjustedDate | `FieldWithMetaDateBuilder` |  |
| relativeDate | `RelativeDateOffsetBuilder` |  |

### Methods

#### Builder Methods

- `AdjustableOrAdjustedOrRelativeDate build()`

#### Setter Methods

- `AdjustableOrAdjustedOrRelativeDateBuilder setUnadjustedDate(Date arg0)`
- `AdjustableOrAdjustedOrRelativeDateBuilder setAdjustedDate(FieldWithMetaDate arg0)`
- `AdjustableOrAdjustedOrRelativeDateBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustableOrAdjustedOrRelativeDateBuilder setAdjustedDateValue(Date arg0)`
- `AdjustableOrAdjustedOrRelativeDateBuilder setRelativeDate(RelativeDateOffset arg0)`

#### Getter Methods

- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `FieldWithMetaDateBuilder getAdjustedDate()`
- `Date getUnadjustedDate()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate()`
- `RelativeDateOffsetBuilder getOrCreateRelativeDate()`
- `RelativeDateOffsetBuilder getRelativeDate()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableOrAdjustedOrRelativeDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AdjustableOrAdjustedOrRelativeDateBuilder toBuilder()`
- `AdjustableOrAdjustedOrRelativeDateBuilder prune()`

