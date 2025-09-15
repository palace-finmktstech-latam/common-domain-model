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

- `MoneyRangeBuilder setLowerBound(MoneyBound arg0)`
- `MoneyRangeBuilder setUpperBound(MoneyBound arg0)`

#### Getter Methods

- `MoneyBoundBuilder getOrCreateUpperBound()`
- `MoneyBoundBuilder getOrCreateLowerBound()`
- `MoneyBoundBuilder getLowerBound()`
- `MoneyBoundBuilder getUpperBound()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MoneyRangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `MoneyRangeBuilder toBuilder()`
- `MoneyRangeBuilder prune()`

