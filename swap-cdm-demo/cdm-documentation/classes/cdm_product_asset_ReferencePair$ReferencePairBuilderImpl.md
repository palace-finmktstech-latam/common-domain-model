# ReferencePairBuilderImpl

**Full Name:** `cdm.product.asset.ReferencePair$ReferencePairBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ReferencePair$ReferencePairBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| referenceEntity | `LegalEntityBuilder` |  |
| referenceObligation | `ReferenceObligationBuilder` |  |
| noReferenceObligation | `Boolean` |  |
| entityType | `FieldWithMetaEntityTypeEnumBuilder` |  |

### Methods

#### Builder Methods

- `ReferencePair build()`

#### Setter Methods

- `ReferencePairBuilder setEntityTypeValue(EntityTypeEnum arg0)`
- `ReferencePairBuilder setEntityType(FieldWithMetaEntityTypeEnum arg0)`
- `ReferencePairBuilder setReferenceObligation(ReferenceObligation arg0)`
- `ReferencePairBuilder setNoReferenceObligation(Boolean arg0)`
- `ReferencePairBuilder setReferenceEntity(LegalEntity arg0)`

#### Getter Methods

- `LegalEntityBuilder getReferenceEntity()`
- `ReferenceObligationBuilder getReferenceObligation()`
- `Boolean getNoReferenceObligation()`
- `FieldWithMetaEntityTypeEnumBuilder getOrCreateEntityType()`
- `FieldWithMetaEntityTypeEnumBuilder getEntityType()`
- `ReferenceObligationBuilder getOrCreateReferenceObligation()`
- `LegalEntityBuilder getOrCreateReferenceEntity()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferencePairBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferencePairBuilder prune()`
- `ReferencePairBuilder toBuilder()`
- `boolean hasData()`

