# ReferenceWithMetaLegalAgreementBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.metafields.ReferenceWithMetaLegalAgreement$ReferenceWithMetaLegalAgreementBuilderImpl`

**Package:** `cdm.legaldocumentation.common.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.metafields.ReferenceWithMetaLegalAgreement$ReferenceWithMetaLegalAgreementBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `LegalAgreementBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaLegalAgreement build()`

#### Setter Methods

- `ReferenceWithMetaLegalAgreementBuilder setValue(LegalAgreement arg0)`
- `ReferenceWithMetaLegalAgreementBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaLegalAgreementBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaLegalAgreementBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `LegalAgreementBuilder getValue()`
- `LegalAgreementBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaLegalAgreementBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaLegalAgreementBuilder toBuilder()`
- `ReferenceWithMetaLegalAgreementBuilder prune()`

