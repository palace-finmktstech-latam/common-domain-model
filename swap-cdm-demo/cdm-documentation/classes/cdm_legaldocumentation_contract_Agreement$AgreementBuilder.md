# AgreementBuilder

**Full Name:** `cdm.legaldocumentation.contract.Agreement$AgreementBuilder`

**Package:** `cdm.legaldocumentation.contract`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.contract.Agreement`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AgreementBuilder setSecurityAgreementElections(SecurityAgreementElections arg0)`
- `AgreementBuilder setTransactionAdditionalTerms(TransactionAdditionalTerms arg0)`
- `AgreementBuilder setCreditSupportAgreementElections(CreditSupportAgreementElections arg0)`
- `AgreementBuilder setCollateralTransferAgreementElections(CollateralTransferAgreementElections arg0)`
- `AgreementBuilder setMasterAgreementSchedule(MasterAgreementSchedule arg0)`

#### Getter Methods

- `CollateralTransferAgreementElectionsBuilder getOrCreateCollateralTransferAgreementElections()`
- `TransactionAdditionalTermsBuilder getTransactionAdditionalTerms()`
- `CreditSupportAgreementElectionsBuilder getOrCreateCreditSupportAgreementElections()`
- `CollateralTransferAgreementElectionsBuilder getCollateralTransferAgreementElections()`
- `SecurityAgreementElectionsBuilder getOrCreateSecurityAgreementElections()`
- `CreditSupportAgreementElectionsBuilder getCreditSupportAgreementElections()`
- `SecurityAgreementElectionsBuilder getSecurityAgreementElections()`
- `TransactionAdditionalTermsBuilder getOrCreateTransactionAdditionalTerms()`
- `MasterAgreementScheduleBuilder getOrCreateMasterAgreementSchedule()`
- `MasterAgreementScheduleBuilder getMasterAgreementSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AgreementBuilder prune()`

