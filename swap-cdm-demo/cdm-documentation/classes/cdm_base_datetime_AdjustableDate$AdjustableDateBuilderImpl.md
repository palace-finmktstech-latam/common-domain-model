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

- `AdjustableDateBuilder setUnadjustedDate(Date arg0)`
- `AdjustableDateBuilder setAdjustedDate(FieldWithMetaDate arg0)`
- `AdjustableDateBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustableDateBuilder setAdjustedDateValue(Date arg0)`
- `AdjustableDateBuilder setDateAdjustmentsReference(ReferenceWithMetaBusinessDayAdjustments arg0)`
- `AdjustableDateBuilder setDateAdjustmentsReferenceValue(BusinessDayAdjustments arg0)`
- `AdjustableDateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `FieldWithMetaDateBuilder getAdjustedDate()`
- `Date getUnadjustedDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate()`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder getOrCreateDateAdjustmentsReference()`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder getDateAdjustmentsReference()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableDateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AdjustableDateBuilder toBuilder()`
- `AdjustableDateBuilder prune()`

