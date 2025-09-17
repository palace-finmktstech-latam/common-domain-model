# PeriodRangeBuilderImpl

**Full Name:** `cdm.base.datetime.PeriodRange$PeriodRangeBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.PeriodRange$PeriodRangeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| lowerBound | `PeriodBoundBuilder` |  |
| upperBound | `PeriodBoundBuilder` |  |

### Methods

#### Builder Methods

- `PeriodRange build()`

#### Setter Methods

- `PeriodRangeBuilder setUpperBound(PeriodBound arg0)`
- `PeriodRangeBuilder setLowerBound(PeriodBound arg0)`

#### Getter Methods

- `PeriodBoundBuilder getUpperBound()`
- `PeriodBoundBuilder getLowerBound()`
- `PeriodBoundBuilder getOrCreateLowerBound()`
- `PeriodBoundBuilder getOrCreateUpperBound()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PeriodRangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PeriodRangeBuilder prune()`
- `PeriodRangeBuilder toBuilder()`
- `boolean hasData()`

