# AdjustableRelativeOrPeriodicDatesBuilder

**Full Name:** `cdm.base.datetime.AdjustableRelativeOrPeriodicDates$AdjustableRelativeOrPeriodicDatesBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.AdjustableRelativeOrPeriodicDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `AdjustableRelativeOrPeriodicDatesBuilder setAdjustableDates(AdjustableDates arg0)`
- `AdjustableRelativeOrPeriodicDatesBuilder setPeriodicDates(PeriodicDates arg0)`
- `AdjustableRelativeOrPeriodicDatesBuilder setRelativeDates(RelativeDates arg0)`
- `AdjustableRelativeOrPeriodicDatesBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `AdjustableDatesBuilder getAdjustableDates()`
- `PeriodicDatesBuilder getPeriodicDates()`
- `RelativeDatesBuilder getRelativeDates()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableDatesBuilder getOrCreateAdjustableDates()`
- `RelativeDatesBuilder getOrCreateRelativeDates()`
- `PeriodicDatesBuilder getOrCreatePeriodicDates()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AdjustableRelativeOrPeriodicDatesBuilder prune()`

