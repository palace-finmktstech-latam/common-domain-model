# AdjustableOrRelativeDatesBuilderImpl

**Full Name:** `cdm.base.datetime.AdjustableOrRelativeDates$AdjustableOrRelativeDatesBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.AdjustableOrRelativeDates$AdjustableOrRelativeDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustableDates | `AdjustableDatesBuilder` |  |
| relativeDates | `RelativeDatesBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `AdjustableOrRelativeDates build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AdjustableOrRelativeDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AdjustableOrRelativeDatesBuilder toBuilder()`
- `AdjustableOrRelativeDatesBuilder prune()`

