# AdjustableOrAdjustedDateBuilderImpl

**Full Name:** `cdm.base.datetime.AdjustableOrAdjustedDate$AdjustableOrAdjustedDateBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.AdjustableOrAdjustedDate$AdjustableOrAdjustedDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| unadjustedDate | `Date` |  |
| dateAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| adjustedDate | `FieldWithMetaDateBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `AdjustableOrAdjustedDate build()`

#### Setter Methods

- `AdjustableOrAdjustedDateBuilder setMeta(MetaFields arg0)`
- `AdjustableOrAdjustedDateBuilder setUnadjustedDate(Date arg0)`
- `AdjustableOrAdjustedDateBuilder setAdjustedDate(FieldWithMetaDate arg0)`
- `AdjustableOrAdjustedDateBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustableOrAdjustedDateBuilder setAdjustedDateValue(Date arg0)`

#### Getter Methods

- `FieldWithMetaDateBuilder getAdjustedDate()`
- `Date getUnadjustedDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableOrAdjustedDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AdjustableOrAdjustedDateBuilder prune()`
- `AdjustableOrAdjustedDateBuilder toBuilder()`
- `boolean hasData()`

