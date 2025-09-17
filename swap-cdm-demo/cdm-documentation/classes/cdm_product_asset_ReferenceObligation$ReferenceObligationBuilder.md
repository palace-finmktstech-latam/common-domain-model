# ReferenceObligationBuilder

**Full Name:** `cdm.product.asset.ReferenceObligation$ReferenceObligationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ReferenceObligation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ReferenceObligationBuilder setLoan(Loan arg0)`
- `ReferenceObligationBuilder setStandardReferenceObligation(Boolean arg0)`
- `ReferenceObligationBuilder setPrimaryObligorReferenceValue(LegalEntity arg0)`
- `ReferenceObligationBuilder setSecurity(Security arg0)`
- `ReferenceObligationBuilder setGuarantorReference(String arg0)`
- `ReferenceObligationBuilder setGuarantor(LegalEntity arg0)`
- `ReferenceObligationBuilder setPrimaryObligorReference(ReferenceWithMetaLegalEntity arg0)`
- `ReferenceObligationBuilder setPrimaryObligor(LegalEntity arg0)`

#### Getter Methods

- `SecurityBuilder getSecurity()`
- `SecurityBuilder getOrCreateSecurity()`
- `LoanBuilder getLoan()`
- `ReferenceWithMetaLegalEntityBuilder getOrCreatePrimaryObligorReference()`
- `ReferenceWithMetaLegalEntityBuilder getPrimaryObligorReference()`
- `LegalEntityBuilder getOrCreateGuarantor()`
- `LoanBuilder getOrCreateLoan()`
- `LegalEntityBuilder getGuarantor()`
- `LegalEntityBuilder getOrCreatePrimaryObligor()`
- `LegalEntityBuilder getPrimaryObligor()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceObligationBuilder prune()`

