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
- `ActionEnum getAction()`
- `Lineage getLineage()`
- `ReferenceWithMetaWorkflowStep getPreviousWorkflowStep()`
- `EventInstruction getProposedEvent()`
- `List getApproval()`
- `Boolean getRejected()`
- `BusinessEvent getBusinessEvent()`
- `WorkflowState getWorkflowState()`
- `EventInstruction getNextEvent()`
- `List getEventIdentifier()`
- `CreditLimitInformation getCreditLimitInformation()`
- `MessageInformation getMessageInformation()`
- `List getAccount()`
- `List getParty()`
- `CounterpartyPositionBusinessEvent getCounterpartyPositionBusinessEvent()`
- `MetaFields getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `WorkflowStepBuilder toBuilder()`

