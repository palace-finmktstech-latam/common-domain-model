# AdjustableDatesBuilderImpl

**Full Name:** `cdm.base.datetime.AdjustableDates$AdjustableDatesBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.AdjustableDates$AdjustableDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| unadjustedDate | `java.util.List<com.rosetta.model.lib.records.Date>` |  |
| dateAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| adjustedDate | `java.util.List<com.rosetta.model.metafields.FieldWithMetaDate$FieldWithMetaDateBuilder>` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `AdjustableDates build()`

#### Setter Methods

- `AdjustableDatesBuilder setMeta(MetaFields arg0)`
- `AdjustableDatesBuilder setUnadjustedDate(List arg0)`
- `AdjustableDatesBuilder setAdjustedDate(List arg0)`
- `AdjustableDatesBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustableDatesBuilder setAdjustedDateValue(List arg0)`

#### Getter Methods

- `List getAdjustedDate()`
- `List getUnadjustedDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate(int arg0)`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`

#### Adder Methods

- `AdjustableDatesBuilder addUnadjustedDate(Date arg0)`
- `AdjustableDatesBuilder addUnadjustedDate(Date arg0, int arg1)`
- `AdjustableDatesBuilder addUnadjustedDate(List arg0)`
- `AdjustableDatesBuilder addAdjustedDateValue(List arg0)`
- `AdjustableDatesBuilder addAdjustedDateValue(Date arg0, int arg1)`
- `AdjustableDatesBuilder addAdjustedDateValue(Date arg0)`
- `AdjustableDatesBuilder addAdjustedDate(List arg0)`
- `AdjustableDatesBuilder addAdjustedDate(FieldWithMetaDate arg0, int arg1)`
- `AdjustableDatesBuilder addAdjustedDate(FieldWithMetaDate arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AdjustableDatesBuilder prune()`
- `AdjustableDatesBuilder toBuilder()`
- `boolean hasData()`

