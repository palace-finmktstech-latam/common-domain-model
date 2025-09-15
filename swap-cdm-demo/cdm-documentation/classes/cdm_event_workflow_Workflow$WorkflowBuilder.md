# WorkflowBuilder

**Full Name:** `cdm.event.workflow.Workflow$WorkflowBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.Workflow`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `WorkflowBuilder setSteps(List arg0)`

#### Getter Methods

- `WorkflowStepBuilder getOrCreateSteps(int arg0)`
- `List getSteps()`

#### Adder Methods

- `WorkflowBuilder addSteps(WorkflowStep arg0, int arg1)`
- `WorkflowBuilder addSteps(List arg0)`
- `WorkflowBuilder addSteps(WorkflowStep arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `WorkflowBuilder prune()`

