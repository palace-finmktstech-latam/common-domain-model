# AgreementTermsBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.AgreementTerms$AgreementTermsBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.AgreementTerms$AgreementTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| agreement | `AgreementBuilder` |  |
| clauseLibrary | `Boolean` |  |
| counterparty | `java.util.List<cdm.base.staticdata.party.Counterparty$CounterpartyBuilder>` |  |

### Methods

#### Builder Methods

- `AgreementTerms build()`

#### Setter Methods

- `AgreementTermsBuilder setCounterparty(List arg0)`
- `AgreementTermsBuilder setAgreement(Agreement arg0)`
- `AgreementTermsBuilder setClauseLibrary(Boolean arg0)`

#### Getter Methods

- `CounterpartyBuilder getOrCreateCounterparty(int arg0)`
- `Boolean getClauseLibrary()`
- `AgreementBuilder getOrCreateAgreement()`
- `AgreementBuilder getAgreement()`
- `List getCounterparty()`

#### Adder Methods

- `AgreementTermsBuilder addCounterparty(Counterparty arg0, int arg1)`
- `AgreementTermsBuilder addCounterparty(Counterparty arg0)`
- `AgreementTermsBuilder addCounterparty(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AgreementTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AgreementTermsBuilder toBuilder()`
- `AgreementTermsBuilder prune()`

