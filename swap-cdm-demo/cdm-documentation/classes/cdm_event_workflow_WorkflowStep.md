# WorkflowStep

**Full Name:** `cdm.event.workflow.WorkflowStep`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `WorkflowStep build()`

#### Getter Methods

- `Class getType()`
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

- `void process(RosettaPath arg0, Processor arg1)`
- `WorkflowStepBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

