# LegalAgreementIdentificationBuilder

**Full Name:** `cdm.legaldocumentation.common.LegalAgreementIdentification$LegalAgreementIdentificationBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.LegalAgreementIdentification`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `LegalAgreementIdentificationBuilder setGoverningLaw(GoverningLawEnum arg0)`
- `LegalAgreementIdentificationBuilder setAgreementName(AgreementName arg0)`
- `LegalAgreementIdentificationBuilder setPublisher(LegalAgreementPublisherEnum arg0)`
- `LegalAgreementIdentificationBuilder setVintage(Integer arg0)`

#### Getter Methods

- `AgreementNameBuilder getAgreementName()`
- `AgreementNameBuilder getOrCreateAgreementName()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LegalAgreementIdentificationBuilder prune()`

