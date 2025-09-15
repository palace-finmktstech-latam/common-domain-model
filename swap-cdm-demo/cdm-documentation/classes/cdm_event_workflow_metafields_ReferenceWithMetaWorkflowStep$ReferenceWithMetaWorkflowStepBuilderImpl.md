# ReferenceWithMetaWorkflowStepBuilderImpl

**Full Name:** `cdm.event.workflow.metafields.ReferenceWithMetaWorkflowStep$ReferenceWithMetaWorkflowStepBuilderImpl`

**Package:** `cdm.event.workflow.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.metafields.ReferenceWithMetaWorkflowStep$ReferenceWithMetaWorkflowStepBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `WorkflowStepBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaWorkflowStep build()`

#### Setter Methods

- `ReferenceWithMetaWorkflowStepBuilder setValue(WorkflowStep arg0)`
- `ReferenceWithMetaWorkflowStepBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaWorkflowStepBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaWorkflowStepBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `WorkflowStepBuilder getValue()`
- `WorkflowStepBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaWorkflowStepBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaWorkflowStepBuilder toBuilder()`
- `ReferenceWithMetaWorkflowStepBuilder prune()`

