# CreditNotationsBuilderImpl

**Full Name:** `cdm.observable.asset.CreditNotations$CreditNotationsBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.CreditNotations$CreditNotationsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| creditNotation | `CreditNotationBuilder` |  |
| creditNotations | `MultipleCreditNotationsBuilder` |  |

### Methods

#### Builder Methods

- `CreditNotations build()`

#### Setter Methods

- `CreditNotationsBuilder setCreditNotations(MultipleCreditNotations arg0)`
- `CreditNotationsBuilder setCreditNotation(CreditNotation arg0)`

#### Getter Methods

- `MultipleCreditNotationsBuilder getCreditNotations()`
- `MultipleCreditNotationsBuilder getOrCreateCreditNotations()`
- `CreditNotationBuilder getOrCreateCreditNotation()`
- `CreditNotationBuilder getCreditNotation()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditNotationsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CreditNotationsBuilder toBuilder()`
- `CreditNotationsBuilder prune()`

