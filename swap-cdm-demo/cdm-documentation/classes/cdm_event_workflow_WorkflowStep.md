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

- `void process(RosettaPath arg0, Processor arg1)`
- `WorkflowStepBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

