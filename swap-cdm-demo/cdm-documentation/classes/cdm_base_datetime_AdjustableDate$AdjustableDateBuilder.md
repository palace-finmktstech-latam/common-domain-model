# AdjustableDateBuilder

**Full Name:** `cdm.base.datetime.AdjustableDate$AdjustableDateBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AdjustableDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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
- `MetaFieldsBuilder getOrCreateMeta()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate()`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder getOrCreateDateAdjustmentsReference()`
- `ReferenceWithMetaBusinessDayAdjustmentsBuilder getDateAdjustmentsReference()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustableDateBuilder prune()`

