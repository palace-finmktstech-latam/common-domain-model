# WorkflowStepImpl

**Full Name:** `cdm.event.workflow.WorkflowStep$WorkflowStepImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.WorkflowStep`

### Methods

#### Builder Methods

- `WorkflowStep build()`

#### Setter Methods

- `void setBuilderFields(WorkflowStepBuilder arg0)`

#### Getter Methods

- `List getTimestamp()`
- `MetaFields getMeta()`
- `List getParty()`
- `List getAccount()`
- `ActionEnum getAction()`
- `Lineage getLineage()`
- `List getApproval()`
- `MessageInformation getMessageInformation()`
- `CreditLimitInformation getCreditLimitInformation()`
- `EventInstruction getProposedEvent()`
- `Boolean getRejected()`
- `BusinessEvent getBusinessEvent()`
- `ReferenceWithMetaWorkflowStep getPreviousWorkflowStep()`
- `WorkflowState getWorkflowState()`
- `List getEventIdentifier()`
- `EventInstruction getNextEvent()`
- `CounterpartyPositionBusinessEvent getCounterpartyPositionBusinessEvent()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `WorkflowStepBuilder toBuilder()`

