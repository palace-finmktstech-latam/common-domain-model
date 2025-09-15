# ReferenceObligation

**Full Name:** `cdm.product.asset.ReferenceObligation`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `ReferenceObligation build()`

#### Getter Methods

- `Class getType()`
- `LegalEntity getPrimaryObligor()`
- `LegalEntity getGuarantor()`
- `String getGuarantorReference()`
- `ReferenceWithMetaLegalEntity getPrimaryObligorReference()`
- `Loan getLoan()`
- `Security getSecurity()`
- `Boolean getStandardReferenceObligation()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ReferenceObligationBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

