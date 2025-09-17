# ReferenceWithMetaExecutionDetailsBuilderImpl

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaExecutionDetails$ReferenceWithMetaExecutionDetailsBuilderImpl`

**Package:** `cdm.event.common.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaExecutionDetails$ReferenceWithMetaExecutionDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `ExecutionDetailsBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaExecutionDetails build()`

#### Setter Methods

- `ReferenceWithMetaExecutionDetailsBuilder setValue(ExecutionDetails arg0)`
- `ReferenceWithMetaExecutionDetailsBuilder setReference(Reference arg0)`
- `ReferenceWithMetaExecutionDetailsBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaExecutionDetailsBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `ExecutionDetailsBuilder getValue()`
- `ExecutionDetailsBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaExecutionDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaExecutionDetailsBuilder prune()`
- `ReferenceWithMetaExecutionDetailsBuilder toBuilder()`
- `boolean hasData()`

