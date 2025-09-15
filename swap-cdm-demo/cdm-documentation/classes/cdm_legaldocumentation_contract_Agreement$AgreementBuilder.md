# AgreementBuilder

**Full Name:** `cdm.legaldocumentation.contract.Agreement$AgreementBuilder`

**Package:** `cdm.legaldocumentation.contract`

## Type: Interface

### Implemented Interfaces

- `cdm.legaldocumentation.contract.Agreement`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `AgreementBuilder setMasterAgreementSchedule(MasterAgreementSchedule arg0)`
- `AgreementBuilder setCreditSupportAgreementElections(CreditSupportAgreementElections arg0)`
- `AgreementBuilder setSecurityAgreementElections(SecurityAgreementElections arg0)`
- `AgreementBuilder setCollateralTransferAgreementElections(CollateralTransferAgreementElections arg0)`
- `AgreementBuilder setTransactionAdditionalTerms(TransactionAdditionalTerms arg0)`

#### Getter Methods

- `MasterAgreementScheduleBuilder getMasterAgreementSchedule()`
- `CollateralTransferAgreementElectionsBuilder getOrCreateCollateralTransferAgreementElections()`
- `TransactionAdditionalTermsBuilder getTransactionAdditionalTerms()`
- `CreditSupportAgreementElectionsBuilder getCreditSupportAgreementElections()`
- `CollateralTransferAgreementElectionsBuilder getCollateralTransferAgreementElections()`
- `SecurityAgreementElectionsBuilder getSecurityAgreementElections()`
- `CreditSupportAgreementElectionsBuilder getOrCreateCreditSupportAgreementElections()`
- `MasterAgreementScheduleBuilder getOrCreateMasterAgreementSchedule()`
- `TransactionAdditionalTermsBuilder getOrCreateTransactionAdditionalTerms()`
- `SecurityAgreementElectionsBuilder getOrCreateSecurityAgreementElections()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AgreementBuilder prune()`

