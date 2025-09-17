# ReferenceWithMetaContractDetailsBuilder

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaContractDetails$ReferenceWithMetaContractDetailsBuilder`

**Package:** `cdm.event.common.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaContractDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaContractDetailsBuilder setValue(ContractDetails arg0)`
- `ReferenceWithMetaContractDetailsBuilder setReference(Reference arg0)`
- `ReferenceWithMetaContractDetailsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaContractDetailsBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `ContractDetailsBuilder getValue()`
- `ContractDetailsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaContractDetailsBuilder prune()`

