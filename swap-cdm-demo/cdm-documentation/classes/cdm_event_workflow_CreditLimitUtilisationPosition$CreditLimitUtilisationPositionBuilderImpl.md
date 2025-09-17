# CreditLimitUtilisationPositionBuilderImpl

**Full Name:** `cdm.event.workflow.CreditLimitUtilisationPosition$CreditLimitUtilisationPositionBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.CreditLimitUtilisationPosition$CreditLimitUtilisationPositionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| shortPosition | `BigDecimal` |  |
| longPosition | `BigDecimal` |  |
| global | `BigDecimal` |  |

### Methods

#### Builder Methods

- `CreditLimitUtilisationPosition build()`

#### Setter Methods

- `CreditLimitUtilisationPositionBuilder setGlobal(BigDecimal arg0)`
- `CreditLimitUtilisationPositionBuilder setLongPosition(BigDecimal arg0)`
- `CreditLimitUtilisationPositionBuilder setShortPosition(BigDecimal arg0)`

#### Getter Methods

- `BigDecimal getGlobal()`
- `BigDecimal getLongPosition()`
- `BigDecimal getShortPosition()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditLimitUtilisationPositionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CreditLimitUtilisationPositionBuilder prune()`
- `CreditLimitUtilisationPositionBuilder toBuilder()`
- `boolean hasData()`

