# ReferencePoolItemBuilderImpl

**Full Name:** `cdm.product.asset.ReferencePoolItem$ReferencePoolItemBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ReferencePoolItem$ReferencePoolItemBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| constituentWeight | `ConstituentWeightBuilder` |  |
| referencePair | `ReferencePairBuilder` |  |
| protectionTermsReference | `ReferenceWithMetaProtectionTermsBuilder` |  |
| cashSettlementTermsReference | `ReferenceWithMetaCashSettlementTermsBuilder` |  |
| physicalSettlementTermsReference | `ReferenceWithMetaPhysicalSettlementTermsBuilder` |  |

### Methods

#### Builder Methods

- `ReferencePoolItem build()`

#### Setter Methods

- `ReferencePoolItemBuilder setReferencePair(ReferencePair arg0)`
- `ReferencePoolItemBuilder setConstituentWeight(ConstituentWeight arg0)`
- `ReferencePoolItemBuilder setProtectionTermsReference(ReferenceWithMetaProtectionTerms arg0)`
- `ReferencePoolItemBuilder setProtectionTermsReferenceValue(ProtectionTerms arg0)`
- `ReferencePoolItemBuilder setCashSettlementTermsReference(ReferenceWithMetaCashSettlementTerms arg0)`
- `ReferencePoolItemBuilder setCashSettlementTermsReferenceValue(CashSettlementTerms arg0)`
- `ReferencePoolItemBuilder setPhysicalSettlementTermsReference(ReferenceWithMetaPhysicalSettlementTerms arg0)`
- `ReferencePoolItemBuilder setPhysicalSettlementTermsReferenceValue(PhysicalSettlementTerms arg0)`

#### Getter Methods

- `ConstituentWeightBuilder getConstituentWeight()`
- `ReferencePairBuilder getReferencePair()`
- `ReferencePairBuilder getOrCreateReferencePair()`
- `ReferenceWithMetaCashSettlementTermsBuilder getOrCreateCashSettlementTermsReference()`
- `ReferenceWithMetaProtectionTermsBuilder getProtectionTermsReference()`
- `ReferenceWithMetaProtectionTermsBuilder getOrCreateProtectionTermsReference()`
- `ConstituentWeightBuilder getOrCreateConstituentWeight()`
- `ReferenceWithMetaCashSettlementTermsBuilder getCashSettlementTermsReference()`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder getPhysicalSettlementTermsReference()`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder getOrCreatePhysicalSettlementTermsReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferencePoolItemBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferencePoolItemBuilder toBuilder()`
- `ReferencePoolItemBuilder prune()`

