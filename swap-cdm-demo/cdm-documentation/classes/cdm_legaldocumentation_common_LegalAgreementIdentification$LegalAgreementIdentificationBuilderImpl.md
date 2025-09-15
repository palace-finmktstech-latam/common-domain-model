# LegalAgreementIdentificationBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.LegalAgreementIdentification$LegalAgreementIdentificationBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.LegalAgreementIdentification$LegalAgreementIdentificationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| governingLaw | `GoverningLawEnum` |  |
| agreementName | `AgreementNameBuilder` |  |
| publisher | `LegalAgreementPublisherEnum` |  |
| vintage | `Integer` |  |

### Methods

#### Builder Methods

- `LegalAgreementIdentification build()`

#### Setter Methods

- `LegalAgreementIdentificationBuilder setGoverningLaw(GoverningLawEnum arg0)`
- `LegalAgreementIdentificationBuilder setAgreementName(AgreementName arg0)`
- `LegalAgreementIdentificationBuilder setPublisher(LegalAgreementPublisherEnum arg0)`
- `LegalAgreementIdentificationBuilder setVintage(Integer arg0)`

#### Getter Methods

- `LegalAgreementPublisherEnum getPublisher()`
- `AgreementNameBuilder getAgreementName()`
- `Integer getVintage()`
- `GoverningLawEnum getGoverningLaw()`
- `AgreementNameBuilder getOrCreateAgreementName()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LegalAgreementIdentificationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `LegalAgreementIdentificationBuilder toBuilder()`
- `LegalAgreementIdentificationBuilder prune()`

