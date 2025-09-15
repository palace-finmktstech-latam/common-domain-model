# MultipleCreditNotationsBuilder

**Full Name:** `cdm.observable.asset.MultipleCreditNotations$MultipleCreditNotationsBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.MultipleCreditNotations`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `MultipleCreditNotationsBuilder setCondition(QuantifierEnum arg0)`
- `MultipleCreditNotationsBuilder setCreditNotation(List arg0)`
- `MultipleCreditNotationsBuilder setMismatchResolution(CreditNotationMismatchResolutionEnum arg0)`
- `MultipleCreditNotationsBuilder setCreditNotationValue(List arg0)`
- `MultipleCreditNotationsBuilder setReferenceAgency(CreditRatingAgencyEnum arg0)`

#### Getter Methods

- `FieldWithMetaCreditNotationBuilder getOrCreateCreditNotation(int arg0)`
- `List getCreditNotation()`

#### Adder Methods

- `MultipleCreditNotationsBuilder addCreditNotation(FieldWithMetaCreditNotation arg0)`
- `MultipleCreditNotationsBuilder addCreditNotation(FieldWithMetaCreditNotation arg0, int arg1)`
- `MultipleCreditNotationsBuilder addCreditNotation(List arg0)`
- `MultipleCreditNotationsBuilder addCreditNotationValue(CreditNotation arg0, int arg1)`
- `MultipleCreditNotationsBuilder addCreditNotationValue(CreditNotation arg0)`
- `MultipleCreditNotationsBuilder addCreditNotationValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MultipleCreditNotationsBuilder prune()`

