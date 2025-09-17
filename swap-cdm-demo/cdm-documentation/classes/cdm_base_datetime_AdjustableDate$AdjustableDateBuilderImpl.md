# AdjustableDateBuilderImpl

**Full Name:** `cdm.base.datetime.AdjustableDate$AdjustableDateBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.AdjustableDate$AdjustableDateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| unadjustedDate | `Date` |  |
| dateAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| dateAdjustmentsReference | `ReferenceWithMetaBusinessDayAdjustmentsBuilder` |  |
| adjustedDate | `FieldWithMetaDateBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `AdjustableDate build()`

#### Setter Methods

- `AdjustableDateBuilder setMeta(MetaFields arg0)`
- `AdjustableDateBuilder setUnadjustedDate(Date arg0)`
- `AdjustableDateBuilder setAdjustedDate(FieldWithMetaDate arg0)`
- `AdjustableDateBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustableDateBuilder setAdjustedDateValue(Date arg0)`
- `AdjustableDateBuilder setDateAdjustmentsReference(ReferenceWithMetaBusinessDayAdjustments arg0)`
- `AdjustableDateBuilder setDateAdjustmentsReferenceValue(BusinessDayAdjustments arg0)`

#### Getter Methods

- `FieldWithMetaDateBuilder getAdjustedDate()`
- `Date getUnadjustedDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder getDateAdjustmentsReference()`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder getOrCreateDateAdjustmentsReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AdjustableDateBuilder prune()`
- `AdjustableDateBuilder toBuilder()`
- `boolean hasData()`

