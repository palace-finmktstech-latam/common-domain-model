# AdjustableOrRelativeDateBuilder

**Full Name:** `cdm.base.datetime.AdjustableOrRelativeDate$AdjustableOrRelativeDateBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AdjustableOrRelativeDate`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `AdjustableOrRelativeDateBuilder setAdjustableDate(AdjustableDate arg0)`
- `AdjustableOrRelativeDateBuilder setRelativeDate(AdjustedRelativeDateOffset arg0)`
- `AdjustableOrRelativeDateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `AdjustableDateBuilder getAdjustableDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableDateBuilder getOrCreateAdjustableDate()`
- `AdjustedRelativeDateOffsetBuilder getOrCreateRelativeDate()`
- `AdjustedRelativeDateOffsetBuilder getRelativeDate()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustableOrRelativeDateBuilder prune()`

