# MultipleCreditNotationsBuilderImpl

**Full Name:** `cdm.observable.asset.MultipleCreditNotations$MultipleCreditNotationsBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.MultipleCreditNotations$MultipleCreditNotationsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| condition | `QuantifierEnum` |  |
| creditNotation | `java.util.List<cdm.observable.asset.metafields.FieldWithMetaCreditNotation$FieldWithMetaCreditNotationBuilder>` |  |
| mismatchResolution | `CreditNotationMismatchResolutionEnum` |  |
| referenceAgency | `CreditRatingAgencyEnum` |  |

### Methods

#### Builder Methods

- `MultipleCreditNotations build()`

#### Setter Methods

- `MultipleCreditNotationsBuilder setCondition(QuantifierEnum arg0)`
- `MultipleCreditNotationsBuilder setCreditNotation(List arg0)`
- `MultipleCreditNotationsBuilder setCreditNotationValue(List arg0)`
- `MultipleCreditNotationsBuilder setMismatchResolution(CreditNotationMismatchResolutionEnum arg0)`
- `MultipleCreditNotationsBuilder setReferenceAgency(CreditRatingAgencyEnum arg0)`

#### Getter Methods

- `List getCreditNotation()`
- `CreditNotationMismatchResolutionEnum getMismatchResolution()`
- `CreditRatingAgencyEnum getReferenceAgency()`
- `FieldWithMetaCreditNotationBuilder getOrCreateCreditNotation(int arg0)`
- `QuantifierEnum getCondition()`

#### Adder Methods

- `MultipleCreditNotationsBuilder addCreditNotationValue(CreditNotation arg0)`
- `MultipleCreditNotationsBuilder addCreditNotationValue(CreditNotation arg0, int arg1)`
- `MultipleCreditNotationsBuilder addCreditNotationValue(List arg0)`
- `MultipleCreditNotationsBuilder addCreditNotation(List arg0)`
- `MultipleCreditNotationsBuilder addCreditNotation(FieldWithMetaCreditNotation arg0, int arg1)`
- `MultipleCreditNotationsBuilder addCreditNotation(FieldWithMetaCreditNotation arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MultipleCreditNotationsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MultipleCreditNotationsBuilder prune()`
- `MultipleCreditNotationsBuilder toBuilder()`
- `boolean hasData()`

