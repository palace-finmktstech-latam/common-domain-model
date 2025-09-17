# OtherAgreementBuilder

**Full Name:** `cdm.legaldocumentation.common.OtherAgreement$OtherAgreementBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.OtherAgreement`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `OtherAgreementBuilder setVersion(FieldWithMetaString arg0)`
- `OtherAgreementBuilder setDate(Date arg0)`
- `OtherAgreementBuilder setIdentifierValue(String arg0)`
- `OtherAgreementBuilder setIdentifier(FieldWithMetaString arg0)`
- `OtherAgreementBuilder setVersionValue(String arg0)`
- `OtherAgreementBuilder setOtherAgreementType(FieldWithMetaString arg0)`
- `OtherAgreementBuilder setOtherAgreementTypeValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getVersion()`
- `FieldWithMetaStringBuilder getOrCreateIdentifier()`
- `FieldWithMetaStringBuilder getOrCreateVersion()`
- `FieldWithMetaStringBuilder getOtherAgreementType()`
- `FieldWithMetaStringBuilder getOrCreateOtherAgreementType()`
- `FieldWithMetaStringBuilder getIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `OtherAgreementBuilder prune()`

