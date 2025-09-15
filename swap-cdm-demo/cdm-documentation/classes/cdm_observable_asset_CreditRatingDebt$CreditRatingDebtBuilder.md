# CreditRatingDebtBuilder

**Full Name:** `cdm.observable.asset.CreditRatingDebt$CreditRatingDebtBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.CreditRatingDebt`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditRatingDebtBuilder prune()`

