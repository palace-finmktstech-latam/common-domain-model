# AdjustableOrAdjustedOrRelativeDateBuilder

**Full Name:** `cdm.base.datetime.AdjustableOrAdjustedOrRelativeDate$AdjustableOrAdjustedOrRelativeDateBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AdjustableOrAdjustedOrRelativeDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AdjustableOrAdjustedOrRelativeDateBuilder setUnadjustedDate(Date arg0)`
- `AdjustableOrAdjustedOrRelativeDateBuilder setAdjustedDate(FieldWithMetaDate arg0)`
- `AdjustableOrAdjustedOrRelativeDateBuilder setDateAdjustments(BusinessDayAdjustments arg0)`
- `AdjustableOrAdjustedOrRelativeDateBuilder setAdjustedDateValue(Date arg0)`
- `AdjustableOrAdjustedOrRelativeDateBuilder setRelativeDate(RelativeDateOffset arg0)`

#### Getter Methods

- `FieldWithMetaDateBuilder getAdjustedDate()`
- `RelativeDateOffsetBuilder getRelativeDate()`
- `BusinessDayAdjustmentsBuilder getOrCreateDateAdjustments()`
- `FieldWithMetaDateBuilder getOrCreateAdjustedDate()`
- `BusinessDayAdjustmentsBuilder getDateAdjustments()`
- `RelativeDateOffsetBuilder getOrCreateRelativeDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustableOrAdjustedOrRelativeDateBuilder prune()`

