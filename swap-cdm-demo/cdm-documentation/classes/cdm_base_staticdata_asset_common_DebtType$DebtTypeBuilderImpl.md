# DebtTypeBuilderImpl

**Full Name:** `cdm.base.staticdata.asset.common.DebtType$DebtTypeBuilderImpl`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.DebtType$DebtTypeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| debtClass | `DebtClassEnum` |  |
| debtEconomics | `java.util.List<cdm.base.staticdata.asset.common.DebtEconomics$DebtEconomicsBuilder>` |  |

### Methods

#### Builder Methods

- `DebtType build()`

#### Setter Methods

- `DebtTypeBuilder setDebtClass(DebtClassEnum arg0)`
- `DebtTypeBuilder setDebtEconomics(List arg0)`

#### Getter Methods

- `DebtEconomicsBuilder getOrCreateDebtEconomics(int arg0)`
- `List getDebtEconomics()`
- `DebtClassEnum getDebtClass()`

#### Adder Methods

- `DebtTypeBuilder addDebtEconomics(List arg0)`
- `DebtTypeBuilder addDebtEconomics(DebtEconomics arg0, int arg1)`
- `DebtTypeBuilder addDebtEconomics(DebtEconomics arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DebtTypeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `DebtTypeBuilder toBuilder()`
- `DebtTypeBuilder prune()`

