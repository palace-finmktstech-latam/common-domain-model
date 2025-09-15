# CreditRatingDebtBuilderImpl

**Full Name:** `cdm.observable.asset.CreditRatingDebt$CreditRatingDebtBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.CreditRatingDebt$CreditRatingDebtBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| debtType | `FieldWithMetaStringBuilder` |  |
| debtTypes | `MultipleDebtTypesBuilder` |  |

### Methods

#### Builder Methods

- `CreditRatingDebt build()`

#### Setter Methods

- `CreditRatingDebtBuilder setDebtType(FieldWithMetaString arg0)`
- `CreditRatingDebtBuilder setDebtTypes(MultipleDebtTypes arg0)`
- `CreditRatingDebtBuilder setDebtTypeValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getOrCreateDebtType()`
- `FieldWithMetaStringBuilder getDebtType()`
- `MultipleDebtTypesBuilder getDebtTypes()`
- `MultipleDebtTypesBuilder getOrCreateDebtTypes()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditRatingDebtBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CreditRatingDebtBuilder toBuilder()`
- `CreditRatingDebtBuilder prune()`

