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

- `AdjustableOrRelativeDateBuilder setMeta(MetaFields arg0)`
- `AdjustableOrRelativeDateBuilder setAdjustableDate(AdjustableDate arg0)`
- `AdjustableOrRelativeDateBuilder setRelativeDate(AdjustedRelativeDateOffset arg0)`

#### Getter Methods

- `AdjustableDateBuilder getAdjustableDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustedRelativeDateOffsetBuilder getRelativeDate()`
- `MetaFieldsBuilder getMeta()`
- `AdjustableDateBuilder getOrCreateAdjustableDate()`
- `AdjustedRelativeDateOffsetBuilder getOrCreateRelativeDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustableOrRelativeDateBuilder prune()`

