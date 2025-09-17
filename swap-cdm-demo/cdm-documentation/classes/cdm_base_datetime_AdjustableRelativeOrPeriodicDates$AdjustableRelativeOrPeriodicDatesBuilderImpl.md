# AdjustableRelativeOrPeriodicDatesBuilderImpl

**Full Name:** `cdm.base.datetime.AdjustableRelativeOrPeriodicDates$AdjustableRelativeOrPeriodicDatesBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.AdjustableRelativeOrPeriodicDates$AdjustableRelativeOrPeriodicDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustableDates | `AdjustableDatesBuilder` |  |
| relativeDates | `RelativeDatesBuilder` |  |
| periodicDates | `PeriodicDatesBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `AdjustableRelativeOrPeriodicDates build()`

#### Setter Methods

- `AdjustableRelativeOrPeriodicDatesBuilder setMeta(MetaFields arg0)`
- `AdjustableRelativeOrPeriodicDatesBuilder setRelativeDates(RelativeDates arg0)`
- `AdjustableRelativeOrPeriodicDatesBuilder setPeriodicDates(PeriodicDates arg0)`
- `AdjustableRelativeOrPeriodicDatesBuilder setAdjustableDates(AdjustableDates arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `PeriodicDatesBuilder getOrCreatePeriodicDates()`
- `AdjustableDatesBuilder getOrCreateAdjustableDates()`
- `RelativeDatesBuilder getOrCreateRelativeDates()`
- `AdjustableDatesBuilder getAdjustableDates()`
- `PeriodicDatesBuilder getPeriodicDates()`
- `RelativeDatesBuilder getRelativeDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableRelativeOrPeriodicDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AdjustableRelativeOrPeriodicDatesBuilder prune()`
- `AdjustableRelativeOrPeriodicDatesBuilder toBuilder()`
- `boolean hasData()`

