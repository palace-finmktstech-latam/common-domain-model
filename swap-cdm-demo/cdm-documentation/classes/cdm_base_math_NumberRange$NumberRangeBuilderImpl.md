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

- `NumberRangeBuilder setLowerBound(NumberBound arg0)`
- `NumberRangeBuilder setUpperBound(NumberBound arg0)`

#### Getter Methods

- `NumberBoundBuilder getOrCreateUpperBound()`
- `NumberBoundBuilder getOrCreateLowerBound()`
- `NumberBoundBuilder getLowerBound()`
- `NumberBoundBuilder getUpperBound()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `NumberRangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `NumberRangeBuilder toBuilder()`
- `NumberRangeBuilder prune()`

