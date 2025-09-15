# MoneyBoundBuilderImpl

**Full Name:** `cdm.base.math.MoneyBound$MoneyBoundBuilderImpl`

**Package:** `cdm.base.math`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.math.MoneyBound$MoneyBoundBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| money | `MoneyBuilder` |  |
| inclusive | `Boolean` |  |

### Methods

#### Builder Methods

- `MoneyBound build()`

#### Setter Methods

- `MoneyBoundBuilder setInclusive(Boolean arg0)`
- `MoneyBoundBuilder setMoney(Money arg0)`

#### Getter Methods

- `Boolean getInclusive()`
- `MoneyBuilder getOrCreateMoney()`
- `MoneyBuilder getMoney()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MoneyBoundBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `MoneyBoundBuilder toBuilder()`
- `MoneyBoundBuilder prune()`

