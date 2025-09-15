# AgreementTermsBuilder

**Full Name:** `cdm.legaldocumentation.common.AgreementTerms$AgreementTermsBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.AgreementTerms`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AgreementTermsBuilder setCounterparty(List arg0)`
- `AgreementTermsBuilder setAgreement(Agreement arg0)`
- `AgreementTermsBuilder setClauseLibrary(Boolean arg0)`

#### Getter Methods

- `CounterpartyBuilder getOrCreateCounterparty(int arg0)`
- `AgreementBuilder getOrCreateAgreement()`
- `AgreementBuilder getAgreement()`
- `List getCounterparty()`

#### Adder Methods

- `AgreementTermsBuilder addCounterparty(List arg0)`
- `AgreementTermsBuilder addCounterparty(Counterparty arg0)`
- `AgreementTermsBuilder addCounterparty(Counterparty arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AgreementTermsBuilder prune()`

