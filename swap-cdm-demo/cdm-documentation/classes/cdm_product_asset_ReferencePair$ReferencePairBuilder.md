# ReferencePairBuilder

**Full Name:** `cdm.product.asset.ReferencePair$ReferencePairBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ReferencePair`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ReferencePairBuilder setReferenceObligation(ReferenceObligation arg0)`
- `ReferencePairBuilder setReferenceEntity(LegalEntity arg0)`
- `ReferencePairBuilder setNoReferenceObligation(Boolean arg0)`
- `ReferencePairBuilder setEntityType(FieldWithMetaEntityTypeEnum arg0)`
- `ReferencePairBuilder setEntityTypeValue(EntityTypeEnum arg0)`

#### Getter Methods

- `LegalEntityBuilder getOrCreateReferenceEntity()`
- `FieldWithMetaEntityTypeEnumBuilder getEntityType()`
- `FieldWithMetaEntityTypeEnumBuilder getOrCreateEntityType()`
- `ReferenceObligationBuilder getReferenceObligation()`
- `LegalEntityBuilder getReferenceEntity()`
- `ReferenceObligationBuilder getOrCreateReferenceObligation()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferencePairBuilder prune()`

