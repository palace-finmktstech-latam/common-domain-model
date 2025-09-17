# LegalAgreementBaseBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.LegalAgreementBase$LegalAgreementBaseBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.LegalAgreementBase$LegalAgreementBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| agreementDate | `Date` |  |
| effectiveDate | `Date` |  |
| identifier | `java.util.List<cdm.base.staticdata.identifier.Identifier$IdentifierBuilder>` |  |
| legalAgreementIdentification | `LegalAgreementIdentificationBuilder` |  |
| contractualParty | `java.util.List<cdm.base.staticdata.party.metafields.ReferenceWithMetaParty$ReferenceWithMetaPartyBuilder>` |  |
| otherParty | `java.util.List<cdm.base.staticdata.party.PartyRole$PartyRoleBuilder>` |  |
| attachment | `java.util.List<cdm.legaldocumentation.common.Resource$ResourceBuilder>` |  |

### Methods

#### Builder Methods

- `LegalAgreementBase build()`

#### Setter Methods

- `LegalAgreementBaseBuilder setIdentifier(List arg0)`
- `LegalAgreementBaseBuilder setContractualParty(List arg0)`
- `LegalAgreementBaseBuilder setAgreementDate(Date arg0)`
- `LegalAgreementBaseBuilder setLegalAgreementIdentification(LegalAgreementIdentification arg0)`
- `LegalAgreementBaseBuilder setOtherParty(List arg0)`
- `LegalAgreementBaseBuilder setContractualPartyValue(List arg0)`
- `LegalAgreementBaseBuilder setAttachment(List arg0)`
- `LegalAgreementBaseBuilder setEffectiveDate(Date arg0)`

#### Getter Methods

- `Date getAgreementDate()`
- `IdentifierBuilder getOrCreateIdentifier(int arg0)`
- `Date getEffectiveDate()`
- `LegalAgreementIdentificationBuilder getOrCreateLegalAgreementIdentification()`
- `LegalAgreementIdentificationBuilder getLegalAgreementIdentification()`
- `ReferenceWithMetaPartyBuilder getOrCreateContractualParty(int arg0)`
- `List getAttachment()`
- `List getContractualParty()`
- `List getOtherParty()`
- `ResourceBuilder getOrCreateAttachment(int arg0)`
- `PartyRoleBuilder getOrCreateOtherParty(int arg0)`
- `List getIdentifier()`

#### Adder Methods

- `LegalAgreementBaseBuilder addIdentifier(Identifier arg0, int arg1)`
- `LegalAgreementBaseBuilder addIdentifier(Identifier arg0)`
- `LegalAgreementBaseBuilder addIdentifier(List arg0)`
- `LegalAgreementBaseBuilder addContractualPartyValue(Party arg0, int arg1)`
- `LegalAgreementBaseBuilder addContractualPartyValue(List arg0)`
- `LegalAgreementBaseBuilder addContractualPartyValue(Party arg0)`
- `LegalAgreementBaseBuilder addContractualParty(ReferenceWithMetaParty arg0)`
- `LegalAgreementBaseBuilder addContractualParty(ReferenceWithMetaParty arg0, int arg1)`
- `LegalAgreementBaseBuilder addContractualParty(List arg0)`
- `LegalAgreementBaseBuilder addOtherParty(PartyRole arg0, int arg1)`
- `LegalAgreementBaseBuilder addOtherParty(List arg0)`
- `LegalAgreementBaseBuilder addOtherParty(PartyRole arg0)`
- `LegalAgreementBaseBuilder addAttachment(List arg0)`
- `LegalAgreementBaseBuilder addAttachment(Resource arg0)`
- `LegalAgreementBaseBuilder addAttachment(Resource arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LegalAgreementBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `LegalAgreementBaseBuilder prune()`
- `LegalAgreementBaseBuilder toBuilder()`
- `boolean hasData()`

