# WorkflowStepApprovalBuilder

**Full Name:** `cdm.event.workflow.WorkflowStepApproval$WorkflowStepApprovalBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.WorkflowStepApproval`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `WorkflowStepApprovalBuilder setApproved(Boolean arg0)`
- `WorkflowStepApprovalBuilder setPartyValue(Party arg0)`
- `WorkflowStepApprovalBuilder setRejectedReason(String arg0)`
- `WorkflowStepApprovalBuilder setTimestamp(EventTimestamp arg0)`
- `WorkflowStepApprovalBuilder setParty(ReferenceWithMetaParty arg0)`
- `WorkflowStepApprovalBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `EventTimestampBuilder getTimestamp()`
- `EventTimestampBuilder getOrCreateTimestamp()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `ReferenceWithMetaPartyBuilder getParty()`
- `ReferenceWithMetaPartyBuilder getOrCreateParty()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `WorkflowStepApprovalBuilder prune()`

