# Package: cdm.legaldocumentation.contract

## Interfaces

### Agreement
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Agreement` [Builder]
- `getMasterAgreementSchedule()` → `MasterAgreementSchedule` [Getter]
- `getTransactionAdditionalTerms()` → `TransactionAdditionalTerms` [Getter]
- `getCreditSupportAgreementElections()` → `CreditSupportAgreementElections` [Getter]
- `getCollateralTransferAgreementElections()` → `CollateralTransferAgreementElections` [Getter]
- `getSecurityAgreementElections()` → `SecurityAgreementElections` [Getter]

### AgreementBuilder
**Implements:** `Agreement` `RosettaModelObjectBuilder` 

**Key Methods:**
- `setMasterAgreementSchedule(MasterAgreementSchedule arg0)` → `AgreementBuilder` [Setter]
- `getMasterAgreementSchedule()` → `MasterAgreementScheduleBuilder` [Getter]
- `getOrCreateCollateralTransferAgreementElections()` → `CollateralTransferAgreementElectionsBuilder` [Getter]
- `getTransactionAdditionalTerms()` → `TransactionAdditionalTermsBuilder` [Getter]
- `getCreditSupportAgreementElections()` → `CreditSupportAgreementElectionsBuilder` [Getter]
- `setCreditSupportAgreementElections(CreditSupportAgreementElections arg0)` → `AgreementBuilder` [Setter]
- `setSecurityAgreementElections(SecurityAgreementElections arg0)` → `AgreementBuilder` [Setter]
- `getCollateralTransferAgreementElections()` → `CollateralTransferAgreementElectionsBuilder` [Getter]
- `getSecurityAgreementElections()` → `SecurityAgreementElectionsBuilder` [Getter]
- `getOrCreateCreditSupportAgreementElections()` → `CreditSupportAgreementElectionsBuilder` [Getter]

