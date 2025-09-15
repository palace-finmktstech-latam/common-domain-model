# ReferenceWithMetaExecutionDetailsBuilder

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaExecutionDetails$ReferenceWithMetaExecutionDetailsBuilder`

**Package:** `cdm.event.common.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaExecutionDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaExecutionDetailsBuilder setValue(ExecutionDetails arg0)`
- `ReferenceWithMetaExecutionDetailsBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaExecutionDetailsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaExecutionDetailsBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `ExecutionDetailsBuilder getValue()`
- `ExecutionDetailsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaExecutionDetailsBuilder prune()`

