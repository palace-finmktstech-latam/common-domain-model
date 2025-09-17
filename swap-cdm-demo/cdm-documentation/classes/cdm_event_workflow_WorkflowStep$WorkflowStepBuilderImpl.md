# WorkflowStepBuilderImpl

**Full Name:** `cdm.event.workflow.WorkflowStep$WorkflowStepBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.WorkflowStep$WorkflowStepBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| businessEvent | `BusinessEventBuilder` |  |
| counterpartyPositionBusinessEvent | `CounterpartyPositionBusinessEventBuilder` |  |
| proposedEvent | `EventInstructionBuilder` |  |
| rejected | `Boolean` |  |
| approval | `java.util.List<cdm.event.workflow.WorkflowStepApproval$WorkflowStepApprovalBuilder>` |  |
| previousWorkflowStep | `ReferenceWithMetaWorkflowStepBuilder` |  |
| nextEvent | `EventInstructionBuilder` |  |
| messageInformation | `MessageInformationBuilder` |  |
| timestamp | `java.util.List<cdm.event.workflow.EventTimestamp$EventTimestampBuilder>` |  |
| eventIdentifier | `java.util.List<cdm.base.staticdata.identifier.Identifier$IdentifierBuilder>` |  |
| action | `ActionEnum` |  |
| party | `java.util.List<cdm.base.staticdata.party.Party$PartyBuilder>` |  |
| account | `java.util.List<cdm.base.staticdata.party.Account$AccountBuilder>` |  |
| lineage | `LineageBuilder` |  |
| creditLimitInformation | `CreditLimitInformationBuilder` |  |
| workflowState | `WorkflowStateBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `WorkflowStep build()`

#### Setter Methods

- `WorkflowStepBuilder setTimestamp(List arg0)`
- `WorkflowStepBuilder setMeta(MetaFields arg0)`
- `WorkflowStepBuilder setWorkflowState(WorkflowState arg0)`
- `WorkflowStepBuilder setRejected(Boolean arg0)`
- `WorkflowStepBuilder setNextEvent(EventInstruction arg0)`
- `WorkflowStepBuilder setMessageInformation(MessageInformation arg0)`
- `WorkflowStepBuilder setEventIdentifier(List arg0)`
- `WorkflowStepBuilder setPreviousWorkflowStep(ReferenceWithMetaWorkflowStep arg0)`
- `WorkflowStepBuilder setApproval(List arg0)`
- `WorkflowStepBuilder setBusinessEvent(BusinessEvent arg0)`
- `WorkflowStepBuilder setCreditLimitInformation(CreditLimitInformation arg0)`
- `WorkflowStepBuilder setProposedEvent(EventInstruction arg0)`
- `WorkflowStepBuilder setParty(List arg0)`
- `WorkflowStepBuilder setAccount(List arg0)`
- `WorkflowStepBuilder setLineage(Lineage arg0)`
- `WorkflowStepBuilder setAction(ActionEnum arg0)`
- `WorkflowStepBuilder setPreviousWorkflowStepValue(WorkflowStep arg0)`
- `WorkflowStepBuilder setCounterpartyPositionBusinessEvent(CounterpartyPositionBusinessEvent arg0)`

#### Getter Methods

- `List getTimestamp()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `CounterpartyPositionBusinessEventBuilder getOrCreateCounterpartyPositionBusinessEvent()`
- `MetaFieldsBuilder getMeta()`
- `List getParty()`
- `List getAccount()`
- `IdentifierBuilder getOrCreateEventIdentifier(int arg0)`
- `EventInstructionBuilder getOrCreateNextEvent()`
- `EventTimestampBuilder getOrCreateTimestamp(int arg0)`
- `EventInstructionBuilder getOrCreateProposedEvent()`
- `WorkflowStateBuilder getOrCreateWorkflowState()`
- `BusinessEventBuilder getOrCreateBusinessEvent()`
- `WorkflowStepApprovalBuilder getOrCreateApproval(int arg0)`
- `LineageBuilder getOrCreateLineage()`
- `PartyBuilder getOrCreateParty(int arg0)`
- `ActionEnum getAction()`
- `LineageBuilder getLineage()`
- `List getApproval()`
- `MessageInformationBuilder getMessageInformation()`
- `CreditLimitInformationBuilder getCreditLimitInformation()`
- `EventInstructionBuilder getProposedEvent()`
- `Boolean getRejected()`
- `BusinessEventBuilder getBusinessEvent()`
- `ReferenceWithMetaWorkflowStepBuilder getPreviousWorkflowStep()`
- `WorkflowStateBuilder getWorkflowState()`
- `List getEventIdentifier()`
- `EventInstructionBuilder getNextEvent()`
- `AccountBuilder getOrCreateAccount(int arg0)`
- `CounterpartyPositionBusinessEventBuilder getCounterpartyPositionBusinessEvent()`
- `MessageInformationBuilder getOrCreateMessageInformation()`
- `CreditLimitInformationBuilder getOrCreateCreditLimitInformation()`
- `ReferenceWithMetaWorkflowStepBuilder getOrCreatePreviousWorkflowStep()`

#### Adder Methods

- `WorkflowStepBuilder addParty(Party arg0, int arg1)`
- `WorkflowStepBuilder addParty(Party arg0)`
- `WorkflowStepBuilder addParty(List arg0)`
- `WorkflowStepBuilder addApproval(WorkflowStepApproval arg0)`
- `WorkflowStepBuilder addApproval(List arg0)`
- `WorkflowStepBuilder addApproval(WorkflowStepApproval arg0, int arg1)`
- `WorkflowStepBuilder addEventIdentifier(Identifier arg0)`
- `WorkflowStepBuilder addEventIdentifier(Identifier arg0, int arg1)`
- `WorkflowStepBuilder addEventIdentifier(List arg0)`
- `WorkflowStepBuilder addTimestamp(List arg0)`
- `WorkflowStepBuilder addTimestamp(EventTimestamp arg0, int arg1)`
- `WorkflowStepBuilder addTimestamp(EventTimestamp arg0)`
- `WorkflowStepBuilder addAccount(Account arg0)`
- `WorkflowStepBuilder addAccount(Account arg0, int arg1)`
- `WorkflowStepBuilder addAccount(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `WorkflowStepBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `WorkflowStepBuilder prune()`
- `WorkflowStepBuilder toBuilder()`
- `boolean hasData()`

