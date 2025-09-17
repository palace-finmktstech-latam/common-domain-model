# WorkflowBuilderImpl

**Full Name:** `cdm.event.workflow.Workflow$WorkflowBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.Workflow$WorkflowBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| steps | `java.util.List<cdm.event.workflow.WorkflowStep$WorkflowStepBuilder>` |  |

### Methods

#### Builder Methods

- `Workflow build()`

#### Setter Methods

- `WorkflowBuilder setSteps(List arg0)`

#### Getter Methods

- `List getSteps()`
- `WorkflowStepBuilder getOrCreateSteps(int arg0)`

#### Adder Methods

- `WorkflowBuilder addSteps(List arg0)`
- `WorkflowBuilder addSteps(WorkflowStep arg0)`
- `WorkflowBuilder addSteps(WorkflowStep arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `WorkflowBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `WorkflowBuilder prune()`
- `WorkflowBuilder toBuilder()`
- `boolean hasData()`

