# WorkflowStepApproval

**Full Name:** `cdm.event.workflow.WorkflowStepApproval`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `WorkflowStepApproval build()`

#### Getter Methods

- `Class getType()`
- `EventTimestamp getTimestamp()`
- `String getRejectedReason()`
- `Boolean getApproved()`
- `ReferenceWithMetaParty getParty()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `WorkflowStepApprovalBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

