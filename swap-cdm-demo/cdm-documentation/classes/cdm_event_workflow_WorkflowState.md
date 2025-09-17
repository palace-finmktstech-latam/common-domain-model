# WorkflowState

**Full Name:** `cdm.event.workflow.WorkflowState`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `WorkflowState build()`

#### Getter Methods

- `Class getType()`
- `String getComment()`
- `List getPartyCustomisedWorkflow()`
- `WorkflowStatusEnum getWorkflowStatus()`
- `WarehouseIdentityEnum getWarehouseIdentity()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `WorkflowStateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

