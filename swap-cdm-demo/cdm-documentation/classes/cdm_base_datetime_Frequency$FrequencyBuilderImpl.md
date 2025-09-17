# FrequencyBuilderImpl

**Full Name:** `cdm.base.datetime.Frequency$FrequencyBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.Frequency$FrequencyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| periodMultiplier | `Integer` |  |
| period | `PeriodExtendedEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Frequency build()`

#### Setter Methods

- `FrequencyBuilder setMeta(MetaFields arg0)`
- `FrequencyBuilder setPeriod(PeriodExtendedEnum arg0)`
- `FrequencyBuilder setPeriodMultiplier(Integer arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Integer getPeriodMultiplier()`
- `MetaFieldsBuilder getMeta()`
- `PeriodExtendedEnum getPeriod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FrequencyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FrequencyBuilder prune()`
- `FrequencyBuilder toBuilder()`
- `boolean hasData()`

