# ReferenceWithMetaPhysicalSettlementTermsBuilderImpl

**Full Name:** `cdm.product.common.settlement.metafields.ReferenceWithMetaPhysicalSettlementTerms$ReferenceWithMetaPhysicalSettlementTermsBuilderImpl`

**Package:** `cdm.product.common.settlement.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.metafields.ReferenceWithMetaPhysicalSettlementTerms$ReferenceWithMetaPhysicalSettlementTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `PhysicalSettlementTermsBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaPhysicalSettlementTerms build()`

#### Setter Methods

- `ReferenceWithMetaPhysicalSettlementTermsBuilder setValue(PhysicalSettlementTerms arg0)`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder setReference(Reference arg0)`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `PhysicalSettlementTermsBuilder getValue()`
- `PhysicalSettlementTermsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder prune()`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder toBuilder()`
- `boolean hasData()`

