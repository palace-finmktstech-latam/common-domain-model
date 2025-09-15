# ReferencePoolItemBuilder

**Full Name:** `cdm.product.asset.ReferencePoolItem$ReferencePoolItemBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ReferencePoolItem`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferencePoolItemBuilder prune()`

