# ReferencePoolItemBuilder

**Full Name:** `cdm.product.asset.ReferencePoolItem$ReferencePoolItemBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ReferencePoolItem`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ReferencePoolItemBuilder setConstituentWeight(ConstituentWeight arg0)`
- `ReferencePoolItemBuilder setReferencePair(ReferencePair arg0)`
- `ReferencePoolItemBuilder setProtectionTermsReference(ReferenceWithMetaProtectionTerms arg0)`
- `ReferencePoolItemBuilder setPhysicalSettlementTermsReference(ReferenceWithMetaPhysicalSettlementTerms arg0)`
- `ReferencePoolItemBuilder setCashSettlementTermsReference(ReferenceWithMetaCashSettlementTerms arg0)`
- `ReferencePoolItemBuilder setCashSettlementTermsReferenceValue(CashSettlementTerms arg0)`
- `ReferencePoolItemBuilder setProtectionTermsReferenceValue(ProtectionTerms arg0)`
- `ReferencePoolItemBuilder setPhysicalSettlementTermsReferenceValue(PhysicalSettlementTerms arg0)`

#### Getter Methods

- `ReferenceWithMetaPhysicalSettlementTermsBuilder getOrCreatePhysicalSettlementTermsReference()`
- `ConstituentWeightBuilder getConstituentWeight()`
- `ReferencePairBuilder getOrCreateReferencePair()`
- `ReferencePairBuilder getReferencePair()`
- `ReferenceWithMetaProtectionTermsBuilder getProtectionTermsReference()`
- `ReferenceWithMetaCashSettlementTermsBuilder getCashSettlementTermsReference()`
- `ConstituentWeightBuilder getOrCreateConstituentWeight()`
- `ReferenceWithMetaProtectionTermsBuilder getOrCreateProtectionTermsReference()`
- `ReferenceWithMetaCashSettlementTermsBuilder getOrCreateCashSettlementTermsReference()`
- `ReferenceWithMetaPhysicalSettlementTermsBuilder getPhysicalSettlementTermsReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferencePoolItemBuilder prune()`

