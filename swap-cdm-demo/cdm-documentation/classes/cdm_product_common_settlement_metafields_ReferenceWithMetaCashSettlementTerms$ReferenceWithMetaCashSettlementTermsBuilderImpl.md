# ReferenceWithMetaCashSettlementTermsBuilderImpl

**Full Name:** `cdm.product.common.settlement.metafields.ReferenceWithMetaCashSettlementTerms$ReferenceWithMetaCashSettlementTermsBuilderImpl`

**Package:** `cdm.product.common.settlement.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.metafields.ReferenceWithMetaCashSettlementTerms$ReferenceWithMetaCashSettlementTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `CashSettlementTermsBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaCashSettlementTerms build()`

#### Setter Methods

- `ReferenceWithMetaCashSettlementTermsBuilder setValue(CashSettlementTerms arg0)`
- `ReferenceWithMetaCashSettlementTermsBuilder setReference(Reference arg0)`
- `ReferenceWithMetaCashSettlementTermsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaCashSettlementTermsBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `CashSettlementTermsBuilder getValue()`
- `CashSettlementTermsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaCashSettlementTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaCashSettlementTermsBuilder prune()`
- `ReferenceWithMetaCashSettlementTermsBuilder toBuilder()`
- `boolean hasData()`

