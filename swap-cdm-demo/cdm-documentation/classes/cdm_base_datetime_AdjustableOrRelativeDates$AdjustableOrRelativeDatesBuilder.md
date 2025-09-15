# AdjustableOrRelativeDatesBuilder

**Full Name:** `cdm.base.datetime.AdjustableOrRelativeDates$AdjustableOrRelativeDatesBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AdjustableOrRelativeDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `AdjustableOrRelativeDatesBuilder setAdjustableDates(AdjustableDates arg0)`
- `AdjustableOrRelativeDatesBuilder setRelativeDates(RelativeDates arg0)`
- `AdjustableOrRelativeDatesBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `AdjustableDatesBuilder getAdjustableDates()`
- `RelativeDatesBuilder getRelativeDates()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableDatesBuilder getOrCreateAdjustableDates()`
- `RelativeDatesBuilder getOrCreateRelativeDates()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustableOrRelativeDatesBuilder prune()`

