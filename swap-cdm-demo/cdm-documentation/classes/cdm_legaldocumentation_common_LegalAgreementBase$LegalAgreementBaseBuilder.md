# LegalAgreementBaseBuilder

**Full Name:** `cdm.legaldocumentation.common.LegalAgreementBase$LegalAgreementBaseBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.LegalAgreementBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `IdentifierBuilder getOrCreateIdentifier(int arg0)`
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

- `LegalAgreementBaseBuilder addIdentifier(Identifier arg0)`
- `LegalAgreementBaseBuilder addIdentifier(List arg0)`
- `LegalAgreementBaseBuilder addIdentifier(Identifier arg0, int arg1)`
- `LegalAgreementBaseBuilder addContractualPartyValue(Party arg0)`
- `LegalAgreementBaseBuilder addContractualPartyValue(List arg0)`
- `LegalAgreementBaseBuilder addContractualPartyValue(Party arg0, int arg1)`
- `LegalAgreementBaseBuilder addContractualParty(ReferenceWithMetaParty arg0)`
- `LegalAgreementBaseBuilder addContractualParty(ReferenceWithMetaParty arg0, int arg1)`
- `LegalAgreementBaseBuilder addContractualParty(List arg0)`
- `LegalAgreementBaseBuilder addOtherParty(List arg0)`
- `LegalAgreementBaseBuilder addOtherParty(PartyRole arg0)`
- `LegalAgreementBaseBuilder addOtherParty(PartyRole arg0, int arg1)`
- `LegalAgreementBaseBuilder addAttachment(Resource arg0, int arg1)`
- `LegalAgreementBaseBuilder addAttachment(List arg0)`
- `LegalAgreementBaseBuilder addAttachment(Resource arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LegalAgreementBaseBuilder prune()`

