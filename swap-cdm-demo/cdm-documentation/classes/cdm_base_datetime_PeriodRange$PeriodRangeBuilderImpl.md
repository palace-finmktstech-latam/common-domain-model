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

- `PeriodRangeBuilder setLowerBound(PeriodBound arg0)`
- `PeriodRangeBuilder setUpperBound(PeriodBound arg0)`

#### Getter Methods

- `PeriodBoundBuilder getOrCreateUpperBound()`
- `PeriodBoundBuilder getOrCreateLowerBound()`
- `PeriodBoundBuilder getLowerBound()`
- `PeriodBoundBuilder getUpperBound()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PeriodRangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PeriodRangeBuilder toBuilder()`
- `PeriodRangeBuilder prune()`

