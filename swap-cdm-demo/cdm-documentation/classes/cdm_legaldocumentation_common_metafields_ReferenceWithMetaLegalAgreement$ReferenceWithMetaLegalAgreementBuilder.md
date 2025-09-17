# ReferenceWithMetaLegalAgreementBuilder

**Full Name:** `cdm.legaldocumentation.common.metafields.ReferenceWithMetaLegalAgreement$ReferenceWithMetaLegalAgreementBuilder`

**Package:** `cdm.legaldocumentation.common.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.metafields.ReferenceWithMetaLegalAgreement`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaLegalAgreementBuilder setValue(LegalAgreement arg0)`
- `ReferenceWithMetaLegalAgreementBuilder setReference(Reference arg0)`
- `ReferenceWithMetaLegalAgreementBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaLegalAgreementBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `LegalAgreementBuilder getValue()`
- `LegalAgreementBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaLegalAgreementBuilder prune()`

