# AdjustableOrAdjustedDateBuilder

**Full Name:** `cdm.base.datetime.AdjustableOrAdjustedDate$AdjustableOrAdjustedDateBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AdjustableOrAdjustedDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `AdjustableOrAdjustedDateBuilder setUnadjustedDate(Date arg0)`
- `AdjustableOrAdjustedDateBuilder setAdjustedDate(FieldWithMetaDate arg0)`
- `AdjustableOrAdjustedDateBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustableOrAdjustedDateBuilder setAdjustedDateValue(Date arg0)`
- `AdjustableOrAdjustedDateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `FieldWithMetaDateBuilder getAdjustedDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustableOrAdjustedDateBuilder prune()`

