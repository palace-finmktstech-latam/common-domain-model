# Package: cdm.legaldocumentation.contract

## Interfaces

### Agreement
**Implements:** `RosettaModelObject` 

**Key Methods:**
- `getType()` → `Class` [Getter]
- `build()` → `Agreement` [Builder]
- `getTransactionAdditionalTerms()` → `TransactionAdditionalTerms` [Getter]
- `getCollateralTransferAgreementElections()` → `CollateralTransferAgreementElections` [Getter]
- `getCreditSupportAgreementElections()` → `CreditSupportAgreementElections` [Getter]
- `getSecurityAgreementElections()` → `SecurityAgreementElections` [Getter]
- `getMasterAgreementSchedule()` → `MasterAgreementSchedule` [Getter]

### AgreementBuilder
**Implements:** `Agreement` `RosettaModelObjectBuilder` 

**Key Methods:**
- `getOrCreateCollateralTransferAgreementElections()` → `CollateralTransferAgreementElectionsBuilder` [Getter]
- `getTransactionAdditionalTerms()` → `TransactionAdditionalTermsBuilder` [Getter]
- `getOrCreateCreditSupportAgreementElections()` → `CreditSupportAgreementElectionsBuilder` [Getter]
- `getCollateralTransferAgreementElections()` → `CollateralTransferAgreementElectionsBuilder` [Getter]
- `getOrCreateSecurityAgreementElections()` → `SecurityAgreementElectionsBuilder` [Getter]
- `getCreditSupportAgreementElections()` → `CreditSupportAgreementElectionsBuilder` [Getter]
- `setSecurityAgreementElections(SecurityAgreementElections arg0)` → `AgreementBuilder` [Setter]
- `setTransactionAdditionalTerms(TransactionAdditionalTerms arg0)` → `AgreementBuilder` [Setter]
- `setCreditSupportAgreementElections(CreditSupportAgreementElections arg0)` → `AgreementBuilder` [Setter]
- `getSecurityAgreementElections()` → `SecurityAgreementElectionsBuilder` [Getter]

