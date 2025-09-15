# WorkflowStateBuilderImpl

**Full Name:** `cdm.event.workflow.WorkflowState$WorkflowStateBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.WorkflowState$WorkflowStateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| workflowStatus | `WorkflowStatusEnum` |  |
| comment | `String` |  |
| partyCustomisedWorkflow | `java.util.List<cdm.event.workflow.PartyCustomisedWorkflow$PartyCustomisedWorkflowBuilder>` |  |
| warehouseIdentity | `WarehouseIdentityEnum` |  |

### Methods

#### Builder Methods

- `WorkflowState build()`

#### Setter Methods

- `WorkflowStateBuilder setComment(String arg0)`
- `WorkflowStateBuilder setWorkflowStatus(WorkflowStatusEnum arg0)`
- `WorkflowStateBuilder setWarehouseIdentity(WarehouseIdentityEnum arg0)`
- `WorkflowStateBuilder setPartyCustomisedWorkflow(List arg0)`

#### Getter Methods

- `String getComment()`
- `List getPartyCustomisedWorkflow()`
- `WarehouseIdentityEnum getWarehouseIdentity()`
- `WorkflowStatusEnum getWorkflowStatus()`
- `PartyCustomisedWorkflowBuilder getOrCreatePartyCustomisedWorkflow(int arg0)`

#### Adder Methods

- `WorkflowStateBuilder addPartyCustomisedWorkflow(PartyCustomisedWorkflow arg0)`
- `WorkflowStateBuilder addPartyCustomisedWorkflow(List arg0)`
- `WorkflowStateBuilder addPartyCustomisedWorkflow(PartyCustomisedWorkflow arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `WorkflowStateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `WorkflowStateBuilder toBuilder()`
- `WorkflowStateBuilder prune()`

