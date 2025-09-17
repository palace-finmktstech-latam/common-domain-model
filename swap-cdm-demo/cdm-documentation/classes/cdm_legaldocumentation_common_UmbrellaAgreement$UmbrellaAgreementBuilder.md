# UmbrellaAgreementBuilder

**Full Name:** `cdm.legaldocumentation.common.UmbrellaAgreement$UmbrellaAgreementBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.UmbrellaAgreement`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `UmbrellaAgreementBuilder setLanguage(String arg0)`
- `UmbrellaAgreementBuilder setParties(List arg0)`
- `UmbrellaAgreementBuilder setIsApplicable(Boolean arg0)`

#### Getter Methods

- `UmbrellaAgreementEntityBuilder getOrCreateParties(int arg0)`
- `List getParties()`

#### Adder Methods

- `UmbrellaAgreementBuilder addParties(UmbrellaAgreementEntity arg0, int arg1)`
- `UmbrellaAgreementBuilder addParties(List arg0)`
- `UmbrellaAgreementBuilder addParties(UmbrellaAgreementEntity arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `UmbrellaAgreementBuilder prune()`

