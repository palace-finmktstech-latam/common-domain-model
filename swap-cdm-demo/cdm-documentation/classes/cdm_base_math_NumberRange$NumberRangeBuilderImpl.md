# NumberRangeBuilderImpl

**Full Name:** `cdm.base.math.NumberRange$NumberRangeBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.math.NumberRange$NumberRangeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| lowerBound | `NumberBoundBuilder` |  |
| upperBound | `NumberBoundBuilder` |  |

### Methods

#### Builder Methods

- `NumberRange build()`

#### Setter Methods

- `NumberRangeBuilder setUpperBound(NumberBound arg0)`
- `NumberRangeBuilder setLowerBound(NumberBound arg0)`

#### Getter Methods

- `NumberBoundBuilder getUpperBound()`
- `NumberBoundBuilder getLowerBound()`
- `NumberBoundBuilder getOrCreateLowerBound()`
- `NumberBoundBuilder getOrCreateUpperBound()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `NumberRangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `NumberRangeBuilder prune()`
- `NumberRangeBuilder toBuilder()`
- `boolean hasData()`

