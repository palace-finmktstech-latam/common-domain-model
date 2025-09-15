# AgreementNameBuilderImpl

**Full Name:** `cdm.legaldocumentation.common.AgreementName$AgreementNameBuilderImpl`

**Package:** `cdm.legaldocumentation.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.legaldocumentation.common.AgreementName$AgreementNameBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| agreementType | `LegalAgreementTypeEnum` |  |
| creditSupportAgreementType | `FieldWithMetaCreditSupportAgreementTypeEnumBuilder` |  |
| creditSupportAgreementMarginType | `CollateralMarginTypeEnum` |  |
| contractualDefinitionsType | `java.util.List<cdm.legaldocumentation.common.metafields.FieldWithMetaContractualDefinitionsEnum$FieldWithMetaContractualDefinitionsEnumBuilder>` |  |
| contractualTermsSupplement | `java.util.List<cdm.legaldocumentation.common.ContractualTermsSupplement$ContractualTermsSupplementBuilder>` |  |
| contractualMatrix | `java.util.List<cdm.legaldocumentation.common.ContractualMatrix$ContractualMatrixBuilder>` |  |
| masterAgreementType | `FieldWithMetaMasterAgreementTypeEnumBuilder` |  |
| masterConfirmationType | `FieldWithMetaMasterConfirmationTypeEnumBuilder` |  |
| masterConfirmationAnnexType | `FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder` |  |
| otherAgreement | `String` |  |

### Methods

#### Builder Methods

- `AgreementName build()`

#### Setter Methods

- `AgreementNameBuilder setCreditSupportAgreementMarginType(CollateralMarginTypeEnum arg0)`
- `AgreementNameBuilder setContractualTermsSupplement(List arg0)`
- `AgreementNameBuilder setCreditSupportAgreementType(FieldWithMetaCreditSupportAgreementTypeEnum arg0)`
- `AgreementNameBuilder setMasterConfirmationAnnexType(FieldWithMetaMasterConfirmationAnnexTypeEnum arg0)`
- `AgreementNameBuilder setContractualDefinitionsType(List arg0)`
- `AgreementNameBuilder setContractualDefinitionsTypeValue(List arg0)`
- `AgreementNameBuilder setMasterAgreementType(FieldWithMetaMasterAgreementTypeEnum arg0)`
- `AgreementNameBuilder setContractualMatrix(List arg0)`
- `AgreementNameBuilder setMasterConfirmationType(FieldWithMetaMasterConfirmationTypeEnum arg0)`
- `AgreementNameBuilder setMasterConfirmationTypeValue(MasterConfirmationTypeEnum arg0)`
- `AgreementNameBuilder setMasterAgreementTypeValue(MasterAgreementTypeEnum arg0)`
- `AgreementNameBuilder setCreditSupportAgreementTypeValue(CreditSupportAgreementTypeEnum arg0)`
- `AgreementNameBuilder setMasterConfirmationAnnexTypeValue(MasterConfirmationAnnexTypeEnum arg0)`
- `AgreementNameBuilder setOtherAgreement(String arg0)`
- `AgreementNameBuilder setAgreementType(LegalAgreementTypeEnum arg0)`

#### Getter Methods

- `List getContractualMatrix()`
- `FieldWithMetaMasterConfirmationTypeEnumBuilder getMasterConfirmationType()`
- `ContractualMatrixBuilder getOrCreateContractualMatrix(int arg0)`
- `FieldWithMetaContractualDefinitionsEnumBuilder getOrCreateContractualDefinitionsType(int arg0)`
- `ContractualTermsSupplementBuilder getOrCreateContractualTermsSupplement(int arg0)`
- `CollateralMarginTypeEnum getCreditSupportAgreementMarginType()`
- `List getContractualTermsSupplement()`
- `FieldWithMetaCreditSupportAgreementTypeEnumBuilder getCreditSupportAgreementType()`
- `FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder getMasterConfirmationAnnexType()`
- `FieldWithMetaMasterAgreementTypeEnumBuilder getOrCreateMasterAgreementType()`
- `FieldWithMetaCreditSupportAgreementTypeEnumBuilder getOrCreateCreditSupportAgreementType()`
- `FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder getOrCreateMasterConfirmationAnnexType()`
- `FieldWithMetaMasterConfirmationTypeEnumBuilder getOrCreateMasterConfirmationType()`
- `LegalAgreementTypeEnum getAgreementType()`
- `FieldWithMetaMasterAgreementTypeEnumBuilder getMasterAgreementType()`
- `String getOtherAgreement()`
- `List getContractualDefinitionsType()`

#### Adder Methods

- `AgreementNameBuilder addContractualDefinitionsTypeValue(ContractualDefinitionsEnum arg0)`
- `AgreementNameBuilder addContractualDefinitionsTypeValue(ContractualDefinitionsEnum arg0, int arg1)`
- `AgreementNameBuilder addContractualDefinitionsTypeValue(List arg0)`
- `AgreementNameBuilder addContractualTermsSupplement(ContractualTermsSupplement arg0)`
- `AgreementNameBuilder addContractualTermsSupplement(ContractualTermsSupplement arg0, int arg1)`
- `AgreementNameBuilder addContractualTermsSupplement(List arg0)`
- `AgreementNameBuilder addContractualDefinitionsType(List arg0)`
- `AgreementNameBuilder addContractualDefinitionsType(FieldWithMetaContractualDefinitionsEnum arg0, int arg1)`
- `AgreementNameBuilder addContractualDefinitionsType(FieldWithMetaContractualDefinitionsEnum arg0)`
- `AgreementNameBuilder addContractualMatrix(ContractualMatrix arg0, int arg1)`
- `AgreementNameBuilder addContractualMatrix(List arg0)`
- `AgreementNameBuilder addContractualMatrix(ContractualMatrix arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AgreementNameBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `AgreementNameBuilder toBuilder()`
- `AgreementNameBuilder prune()`

