# LegalAgreementBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.LegalAgreement$LegalAgreementBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.legaldocumentation.common.LegalAgreementBase$LegalAgreementBaseBuilderImpl`

### Implemented Interfaces

- `cdm.legaldocumentation.common.LegalAgreement$LegalAgreementBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| agreementTerms | `AgreementTermsBuilder` |  |
| relatedAgreements | `java.util.List<cdm.legaldocumentation.common.LegalAgreement$LegalAgreementBuilder>` |  |
| umbrellaAgreement | `UmbrellaAgreementBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `LegalAgreement build()`

#### Setter Methods

- `LegalAgreementBuilder setIdentifier(List arg0)`
- `LegalAgreementBuilder setContractualParty(List arg0)`
- `LegalAgreementBuilder setAgreementDate(Date arg0)`
- `LegalAgreementBuilder setMeta(MetaFields arg0)`
- `LegalAgreementBuilder setLegalAgreementIdentification(LegalAgreementIdentification arg0)`
- `LegalAgreementBuilder setOtherParty(List arg0)`
- `LegalAgreementBuilder setAgreementTerms(AgreementTerms arg0)`
- `LegalAgreementBuilder setUmbrellaAgreement(UmbrellaAgreement arg0)`
- `LegalAgreementBuilder setRelatedAgreements(List arg0)`
- `LegalAgreementBuilder setContractualPartyValue(List arg0)`
- `LegalAgreementBuilder setAttachment(List arg0)`
- `LegalAgreementBuilder setEffectiveDate(Date arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `UmbrellaAgreementBuilder getOrCreateUmbrellaAgreement()`
- `LegalAgreementBuilder getOrCreateRelatedAgreements(int arg0)`
- `List getRelatedAgreements()`
- `AgreementTermsBuilder getOrCreateAgreementTerms()`
- `UmbrellaAgreementBuilder getUmbrellaAgreement()`
- `AgreementTermsBuilder getAgreementTerms()`

#### Adder Methods

- `LegalAgreementBuilder addIdentifier(Identifier arg0, int arg1)`
- `LegalAgreementBuilder addIdentifier(List arg0)`
- `LegalAgreementBuilder addIdentifier(Identifier arg0)`
- `LegalAgreementBuilder addContractualPartyValue(List arg0)`
- `LegalAgreementBuilder addContractualPartyValue(Party arg0)`
- `LegalAgreementBuilder addContractualPartyValue(Party arg0, int arg1)`
- `LegalAgreementBuilder addContractualParty(ReferenceWithMetaParty arg0)`
- `LegalAgreementBuilder addContractualParty(ReferenceWithMetaParty arg0, int arg1)`
- `LegalAgreementBuilder addContractualParty(List arg0)`
- `LegalAgreementBuilder addOtherParty(PartyRole arg0)`
- `LegalAgreementBuilder addOtherParty(List arg0)`
- `LegalAgreementBuilder addOtherParty(PartyRole arg0, int arg1)`
- `LegalAgreementBuilder addAttachment(List arg0)`
- `LegalAgreementBuilder addAttachment(Resource arg0)`
- `LegalAgreementBuilder addAttachment(Resource arg0, int arg1)`
- `LegalAgreementBuilder addRelatedAgreements(List arg0)`
- `LegalAgreementBuilder addRelatedAgreements(LegalAgreement arg0)`
- `LegalAgreementBuilder addRelatedAgreements(LegalAgreement arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LegalAgreementBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `LegalAgreementBuilder prune()`
- `LegalAgreementBuilder toBuilder()`
- `boolean hasData()`

