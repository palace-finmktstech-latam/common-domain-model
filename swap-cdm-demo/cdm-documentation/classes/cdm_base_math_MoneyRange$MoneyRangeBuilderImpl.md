# MoneyRangeBuilderImpl

**Full Name:** `cdm.base.math.MoneyRange$MoneyRangeBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.math.MoneyRange$MoneyRangeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| lowerBound | `MoneyBoundBuilder` |  |
| upperBound | `MoneyBoundBuilder` |  |

### Methods

#### Builder Methods

- `MoneyRange build()`

#### Setter Methods

- `MoneyRangeBuilder setUpperBound(MoneyBound arg0)`
- `MoneyRangeBuilder setLowerBound(MoneyBound arg0)`

#### Getter Methods

- `MoneyBoundBuilder getUpperBound()`
- `MoneyBoundBuilder getLowerBound()`
- `MoneyBoundBuilder getOrCreateLowerBound()`
- `MoneyBoundBuilder getOrCreateUpperBound()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MoneyRangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MoneyRangeBuilder prune()`
- `MoneyRangeBuilder toBuilder()`
- `boolean hasData()`

