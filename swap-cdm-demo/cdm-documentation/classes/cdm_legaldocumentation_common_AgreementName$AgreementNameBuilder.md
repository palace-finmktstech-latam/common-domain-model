# AgreementNameBuilder

**Full Name:** `cdm.legaldocumentation.common.AgreementName$AgreementNameBuilder`

**Package:** `cdm.legaldocumentation.common`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.common.AgreementName`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AgreementNameBuilder setOtherAgreement(String arg0)`
- `AgreementNameBuilder setCreditSupportAgreementTypeValue(CreditSupportAgreementTypeEnum arg0)`
- `AgreementNameBuilder setMasterConfirmationTypeValue(MasterConfirmationTypeEnum arg0)`
- `AgreementNameBuilder setMasterAgreementTypeValue(MasterAgreementTypeEnum arg0)`
- `AgreementNameBuilder setMasterConfirmationAnnexTypeValue(MasterConfirmationAnnexTypeEnum arg0)`
- `AgreementNameBuilder setAgreementType(LegalAgreementTypeEnum arg0)`
- `AgreementNameBuilder setCreditSupportAgreementType(FieldWithMetaCreditSupportAgreementTypeEnum arg0)`
- `AgreementNameBuilder setContractualDefinitionsTypeValue(List arg0)`
- `AgreementNameBuilder setContractualDefinitionsType(List arg0)`
- `AgreementNameBuilder setCreditSupportAgreementMarginType(CollateralMarginTypeEnum arg0)`
- `AgreementNameBuilder setContractualTermsSupplement(List arg0)`
- `AgreementNameBuilder setMasterConfirmationAnnexType(FieldWithMetaMasterConfirmationAnnexTypeEnum arg0)`
- `AgreementNameBuilder setMasterAgreementType(FieldWithMetaMasterAgreementTypeEnum arg0)`
- `AgreementNameBuilder setContractualMatrix(List arg0)`
- `AgreementNameBuilder setMasterConfirmationType(FieldWithMetaMasterConfirmationTypeEnum arg0)`

#### Getter Methods

- `FieldWithMetaMasterConfirmationTypeEnumBuilder getMasterConfirmationType()`
- `List getContractualMatrix()`
- `FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder getOrCreateMasterConfirmationAnnexType()`
- `FieldWithMetaCreditSupportAgreementTypeEnumBuilder getOrCreateCreditSupportAgreementType()`
- `FieldWithMetaMasterConfirmationTypeEnumBuilder getOrCreateMasterConfirmationType()`
- `FieldWithMetaMasterAgreementTypeEnumBuilder getOrCreateMasterAgreementType()`
- `List getContractualDefinitionsType()`
- `FieldWithMetaMasterAgreementTypeEnumBuilder getMasterAgreementType()`
- `FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder getMasterConfirmationAnnexType()`
- `FieldWithMetaCreditSupportAgreementTypeEnumBuilder getCreditSupportAgreementType()`
- `List getContractualTermsSupplement()`
- `FieldWithMetaContractualDefinitionsEnumBuilder getOrCreateContractualDefinitionsType(int arg0)`
- `ContractualTermsSupplementBuilder getOrCreateContractualTermsSupplement(int arg0)`
- `ContractualMatrixBuilder getOrCreateContractualMatrix(int arg0)`

#### Adder Methods

- `AgreementNameBuilder addContractualMatrix(ContractualMatrix arg0)`
- `AgreementNameBuilder addContractualMatrix(ContractualMatrix arg0, int arg1)`
- `AgreementNameBuilder addContractualMatrix(List arg0)`
- `AgreementNameBuilder addContractualTermsSupplement(ContractualTermsSupplement arg0)`
- `AgreementNameBuilder addContractualTermsSupplement(ContractualTermsSupplement arg0, int arg1)`
- `AgreementNameBuilder addContractualTermsSupplement(List arg0)`
- `AgreementNameBuilder addContractualDefinitionsType(List arg0)`
- `AgreementNameBuilder addContractualDefinitionsType(FieldWithMetaContractualDefinitionsEnum arg0, int arg1)`
- `AgreementNameBuilder addContractualDefinitionsType(FieldWithMetaContractualDefinitionsEnum arg0)`
- `AgreementNameBuilder addContractualDefinitionsTypeValue(ContractualDefinitionsEnum arg0)`
- `AgreementNameBuilder addContractualDefinitionsTypeValue(List arg0)`
- `AgreementNameBuilder addContractualDefinitionsTypeValue(ContractualDefinitionsEnum arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AgreementNameBuilder prune()`

