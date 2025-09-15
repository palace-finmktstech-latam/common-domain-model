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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableRelativeOrPeriodicDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AdjustableRelativeOrPeriodicDatesBuilder toBuilder()`
- `AdjustableRelativeOrPeriodicDatesBuilder prune()`

