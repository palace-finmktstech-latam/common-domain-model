# DebtEconomicsBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.DebtEconomics$DebtEconomicsBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.DebtEconomics$DebtEconomicsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| debtSeniority | `DebtSeniorityEnum` |  |
| debtInterest | `DebtInterestEnum` |  |
| debtPrincipal | `DebtPrincipalEnum` |  |

### Methods

#### Builder Methods

- `DebtEconomics build()`

#### Setter Methods

- `DebtEconomicsBuilder setDebtInterest(DebtInterestEnum arg0)`
- `DebtEconomicsBuilder setDebtPrincipal(DebtPrincipalEnum arg0)`
- `DebtEconomicsBuilder setDebtSeniority(DebtSeniorityEnum arg0)`

#### Getter Methods

- `DebtSeniorityEnum getDebtSeniority()`
- `DebtInterestEnum getDebtInterest()`
- `DebtPrincipalEnum getDebtPrincipal()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DebtEconomicsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DebtEconomicsBuilder toBuilder()`
- `DebtEconomicsBuilder prune()`

