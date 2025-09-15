# ReferenceObligationBuilder

**Full Name:** `cdm.product.asset.ReferenceObligation$ReferenceObligationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ReferenceObligation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ReferenceObligationBuilder setGuarantorReference(String arg0)`
- `ReferenceObligationBuilder setSecurity(Security arg0)`
- `ReferenceObligationBuilder setGuarantor(LegalEntity arg0)`
- `ReferenceObligationBuilder setPrimaryObligorReference(ReferenceWithMetaLegalEntity arg0)`
- `ReferenceObligationBuilder setPrimaryObligor(LegalEntity arg0)`
- `ReferenceObligationBuilder setStandardReferenceObligation(Boolean arg0)`
- `ReferenceObligationBuilder setPrimaryObligorReferenceValue(LegalEntity arg0)`
- `ReferenceObligationBuilder setLoan(Loan arg0)`

#### Getter Methods

- `LegalEntityBuilder getOrCreateGuarantor()`
- `LegalEntityBuilder getPrimaryObligor()`
- `LegalEntityBuilder getGuarantor()`
- `LegalEntityBuilder getOrCreatePrimaryObligor()`
- `ReferenceWithMetaLegalEntityBuilder getPrimaryObligorReference()`
- `LoanBuilder getOrCreateLoan()`
- `LoanBuilder getLoan()`
- `SecurityBuilder getSecurity()`
- `SecurityBuilder getOrCreateSecurity()`
- `ReferenceWithMetaLegalEntityBuilder getOrCreatePrimaryObligorReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceObligationBuilder prune()`

