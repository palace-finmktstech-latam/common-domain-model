# WorkflowStateBuilder

**Full Name:** `cdm.event.workflow.WorkflowState$WorkflowStateBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.WorkflowState`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `WorkflowStateBuilder setComment(String arg0)`
- `WorkflowStateBuilder setWorkflowStatus(WorkflowStatusEnum arg0)`
- `WorkflowStateBuilder setWarehouseIdentity(WarehouseIdentityEnum arg0)`
- `WorkflowStateBuilder setPartyCustomisedWorkflow(List arg0)`

#### Getter Methods

- `List getPartyCustomisedWorkflow()`
- `PartyCustomisedWorkflowBuilder getOrCreatePartyCustomisedWorkflow(int arg0)`

#### Adder Methods

- `WorkflowStateBuilder addPartyCustomisedWorkflow(List arg0)`
- `WorkflowStateBuilder addPartyCustomisedWorkflow(PartyCustomisedWorkflow arg0, int arg1)`
- `WorkflowStateBuilder addPartyCustomisedWorkflow(PartyCustomisedWorkflow arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `WorkflowStateBuilder prune()`

