# DebtTypeBuilder

**Full Name:** `cdm.base.staticdata.asset.common.DebtType$DebtTypeBuilder`

**Package:** `cdm.base.staticdata.asset.common`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.asset.common.DebtType`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `DebtTypeBuilder setDebtClass(DebtClassEnum arg0)`
- `DebtTypeBuilder setDebtEconomics(List arg0)`

#### Getter Methods

- `List getDebtEconomics()`
- `DebtEconomicsBuilder getOrCreateDebtEconomics(int arg0)`

#### Adder Methods

- `DebtTypeBuilder addDebtEconomics(List arg0)`
- `DebtTypeBuilder addDebtEconomics(DebtEconomics arg0)`
- `DebtTypeBuilder addDebtEconomics(DebtEconomics arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `DebtTypeBuilder prune()`

