# PeriodBoundBuilderImpl

**Full Name:** `cdm.base.datetime.PeriodBound$PeriodBoundBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.PeriodBound$PeriodBoundBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| period | `PeriodBuilder` |  |
| inclusive | `Boolean` |  |

### Methods

#### Builder Methods

- `PeriodBound build()`

#### Setter Methods

- `PeriodBoundBuilder setInclusive(Boolean arg0)`
- `PeriodBoundBuilder setPeriod(Period arg0)`

#### Getter Methods

- `Boolean getInclusive()`
- `PeriodBuilder getOrCreatePeriod()`
- `PeriodBuilder getPeriod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PeriodBoundBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PeriodBoundBuilder toBuilder()`
- `PeriodBoundBuilder prune()`

