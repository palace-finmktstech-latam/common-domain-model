# PeriodBuilderImpl

**Full Name:** `cdm.base.datetime.Period$PeriodBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.Period$PeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| periodMultiplier | `Integer` |  |
| period | `PeriodEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Period build()`

#### Setter Methods

- `PeriodBuilder setMeta(MetaFields arg0)`
- `PeriodBuilder setPeriod(PeriodEnum arg0)`
- `PeriodBuilder setPeriodMultiplier(Integer arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `Integer getPeriodMultiplier()`
- `MetaFieldsBuilder getMeta()`
- `PeriodEnum getPeriod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PeriodBuilder prune()`
- `PeriodBuilder toBuilder()`
- `boolean hasData()`

