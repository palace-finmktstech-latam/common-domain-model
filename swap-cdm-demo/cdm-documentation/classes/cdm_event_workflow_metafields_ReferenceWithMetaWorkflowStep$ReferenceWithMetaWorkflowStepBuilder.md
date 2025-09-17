# ReferenceWithMetaWorkflowStepBuilder

**Full Name:** `cdm.event.workflow.metafields.ReferenceWithMetaWorkflowStep$ReferenceWithMetaWorkflowStepBuilder`

**Package:** `cdm.event.workflow.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.metafields.ReferenceWithMetaWorkflowStep`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaWorkflowStepBuilder setValue(WorkflowStep arg0)`
- `ReferenceWithMetaWorkflowStepBuilder setReference(Reference arg0)`
- `ReferenceWithMetaWorkflowStepBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaWorkflowStepBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `WorkflowStepBuilder getValue()`
- `WorkflowStepBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaWorkflowStepBuilder prune()`

