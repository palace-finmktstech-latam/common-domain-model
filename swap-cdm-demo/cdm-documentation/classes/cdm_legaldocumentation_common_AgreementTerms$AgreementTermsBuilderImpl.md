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

- `List getCounterparty()`
- `CounterpartyBuilder getOrCreateCounterparty(int arg0)`
- `AgreementBuilder getOrCreateAgreement()`
- `Boolean getClauseLibrary()`
- `AgreementBuilder getAgreement()`

#### Adder Methods

- `AgreementTermsBuilder addCounterparty(Counterparty arg0)`
- `AgreementTermsBuilder addCounterparty(Counterparty arg0, int arg1)`
- `AgreementTermsBuilder addCounterparty(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AgreementTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AgreementTermsBuilder prune()`
- `AgreementTermsBuilder toBuilder()`
- `boolean hasData()`

