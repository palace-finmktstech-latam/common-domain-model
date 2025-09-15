# AdjustableDatesBuilder

**Full Name:** `cdm.base.datetime.AdjustableDates$AdjustableDatesBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AdjustableDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `AdjustableDatesBuilder setUnadjustedDate(List arg0)`
- `AdjustableDatesBuilder setAdjustedDate(List arg0)`
- `AdjustableDatesBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustableDatesBuilder setAdjustedDateValue(List arg0)`
- `AdjustableDatesBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `List getAdjustedDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate(int arg0)`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `AdjustableDatesBuilder addUnadjustedDate(Date arg0)`
- `AdjustableDatesBuilder addUnadjustedDate(Date arg0, int arg1)`
- `AdjustableDatesBuilder addUnadjustedDate(List arg0)`
- `AdjustableDatesBuilder addAdjustedDateValue(Date arg0, int arg1)`
- `AdjustableDatesBuilder addAdjustedDateValue(List arg0)`
- `AdjustableDatesBuilder addAdjustedDateValue(Date arg0)`
- `AdjustableDatesBuilder addAdjustedDate(FieldWithMetaDate arg0)`
- `AdjustableDatesBuilder addAdjustedDate(FieldWithMetaDate arg0, int arg1)`
- `AdjustableDatesBuilder addAdjustedDate(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustableDatesBuilder prune()`

