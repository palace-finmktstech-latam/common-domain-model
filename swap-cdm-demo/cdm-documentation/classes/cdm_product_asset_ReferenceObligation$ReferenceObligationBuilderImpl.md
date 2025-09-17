# ReferenceObligationBuilderImpl

**Full Name:** `cdm.product.asset.ReferenceObligation$ReferenceObligationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ReferenceObligation$ReferenceObligationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| security | `SecurityBuilder` |  |
| loan | `LoanBuilder` |  |
| primaryObligor | `LegalEntityBuilder` |  |
| primaryObligorReference | `ReferenceWithMetaLegalEntityBuilder` |  |
| guarantor | `LegalEntityBuilder` |  |
| guarantorReference | `String` |  |
| standardReferenceObligation | `Boolean` |  |

### Methods

#### Builder Methods

- `ReferenceObligation build()`

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
- `Boolean getStandardReferenceObligation()`
- `ReferenceWithMetaLegalEntityBuilder getPrimaryObligorReference()`
- `LegalEntityBuilder getOrCreateGuarantor()`
- `LoanBuilder getOrCreateLoan()`
- `LegalEntityBuilder getGuarantor()`
- `LegalEntityBuilder getOrCreatePrimaryObligor()`
- `LegalEntityBuilder getPrimaryObligor()`
- `String getGuarantorReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceObligationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceObligationBuilder prune()`
- `ReferenceObligationBuilder toBuilder()`
- `boolean hasData()`

