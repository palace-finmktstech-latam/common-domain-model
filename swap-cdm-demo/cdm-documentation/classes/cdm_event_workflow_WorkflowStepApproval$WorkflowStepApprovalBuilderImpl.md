# WorkflowStepApprovalBuilderImpl

**Full Name:** `cdm.event.workflow.WorkflowStepApproval$WorkflowStepApprovalBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.WorkflowStepApproval$WorkflowStepApprovalBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| approved | `Boolean` |  |
| party | `ReferenceWithMetaPartyBuilder` |  |
| rejectedReason | `String` |  |
| timestamp | `EventTimestampBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `WorkflowStepApproval build()`

#### Setter Methods

- `WorkflowStepApprovalBuilder setTimestamp(EventTimestamp arg0)`
- `WorkflowStepApprovalBuilder setMeta(MetaFields arg0)`
- `WorkflowStepApprovalBuilder setApproved(Boolean arg0)`
- `WorkflowStepApprovalBuilder setPartyValue(Party arg0)`
- `WorkflowStepApprovalBuilder setRejectedReason(String arg0)`
- `WorkflowStepApprovalBuilder setParty(ReferenceWithMetaParty arg0)`

#### Getter Methods

- `EventTimestampBuilder getTimestamp()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `ReferenceWithMetaPartyBuilder getParty()`
- `EventTimestampBuilder getOrCreateTimestamp()`
- `String getRejectedReason()`
- `Boolean getApproved()`
- `ReferenceWithMetaPartyBuilder getOrCreateParty()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `WorkflowStepApprovalBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `WorkflowStepApprovalBuilder prune()`
- `WorkflowStepApprovalBuilder toBuilder()`
- `boolean hasData()`

