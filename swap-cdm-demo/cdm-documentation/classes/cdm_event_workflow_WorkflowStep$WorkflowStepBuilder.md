# WorkflowStepBuilder

**Full Name:** `cdm.event.workflow.WorkflowStep$WorkflowStepBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.WorkflowStep`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `WorkflowStepBuilder setBusinessEvent(BusinessEvent arg0)`
- `WorkflowStepBuilder setProposedEvent(EventInstruction arg0)`
- `WorkflowStepBuilder setApproval(List arg0)`
- `WorkflowStepBuilder setPreviousWorkflowStep(ReferenceWithMetaWorkflowStep arg0)`
- `WorkflowStepBuilder setRejected(Boolean arg0)`
- `WorkflowStepBuilder setNextEvent(EventInstruction arg0)`
- `WorkflowStepBuilder setWorkflowState(WorkflowState arg0)`
- `WorkflowStepBuilder setMessageInformation(MessageInformation arg0)`
- `WorkflowStepBuilder setEventIdentifier(List arg0)`
- `WorkflowStepBuilder setCreditLimitInformation(CreditLimitInformation arg0)`
- `WorkflowStepBuilder setAction(ActionEnum arg0)`
- `WorkflowStepBuilder setTimestamp(List arg0)`
- `WorkflowStepBuilder setAccount(List arg0)`
- `WorkflowStepBuilder setLineage(Lineage arg0)`
- `WorkflowStepBuilder setPreviousWorkflowStepValue(WorkflowStep arg0)`
- `WorkflowStepBuilder setCounterpartyPositionBusinessEvent(CounterpartyPositionBusinessEvent arg0)`
- `WorkflowStepBuilder setParty(List arg0)`
- `WorkflowStepBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `List getTimestamp()`
- `WorkflowStateBuilder getOrCreateWorkflowState()`
- `WorkflowStepApprovalBuilder getOrCreateApproval(int arg0)`
- `EventInstructionBuilder getOrCreateProposedEvent()`
- `IdentifierBuilder getOrCreateEventIdentifier(int arg0)`
- `BusinessEventBuilder getOrCreateBusinessEvent()`
- `EventTimestampBuilder getOrCreateTimestamp(int arg0)`
- `EventInstructionBuilder getOrCreateNextEvent()`
- `LineageBuilder getOrCreateLineage()`
- `CounterpartyPositionBusinessEventBuilder getOrCreateCounterpartyPositionBusinessEvent()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `LineageBuilder getLineage()`
- `ReferenceWithMetaWorkflowStepBuilder getPreviousWorkflowStep()`
- `EventInstructionBuilder getProposedEvent()`
- `List getApproval()`
- `BusinessEventBuilder getBusinessEvent()`
- `WorkflowStateBuilder getWorkflowState()`
- `EventInstructionBuilder getNextEvent()`
- `List getEventIdentifier()`
- `CreditLimitInformationBuilder getCreditLimitInformation()`
- `MessageInformationBuilder getMessageInformation()`
- `AccountBuilder getOrCreateAccount(int arg0)`
- `List getAccount()`
- `List getParty()`
- `CounterpartyPositionBusinessEventBuilder getCounterpartyPositionBusinessEvent()`
- `MessageInformationBuilder getOrCreateMessageInformation()`
- `CreditLimitInformationBuilder getOrCreateCreditLimitInformation()`
- `ReferenceWithMetaWorkflowStepBuilder getOrCreatePreviousWorkflowStep()`
- `PartyBuilder getOrCreateParty(int arg0)`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `WorkflowStepBuilder addParty(Party arg0, int arg1)`
- `WorkflowStepBuilder addParty(List arg0)`
- `WorkflowStepBuilder addParty(Party arg0)`
- `WorkflowStepBuilder addApproval(List arg0)`
- `WorkflowStepBuilder addApproval(WorkflowStepApproval arg0, int arg1)`
- `WorkflowStepBuilder addApproval(WorkflowStepApproval arg0)`
- `WorkflowStepBuilder addTimestamp(EventTimestamp arg0)`
- `WorkflowStepBuilder addTimestamp(List arg0)`
- `WorkflowStepBuilder addTimestamp(EventTimestamp arg0, int arg1)`
- `WorkflowStepBuilder addEventIdentifier(Identifier arg0)`
- `WorkflowStepBuilder addEventIdentifier(Identifier arg0, int arg1)`
- `WorkflowStepBuilder addEventIdentifier(List arg0)`
- `WorkflowStepBuilder addAccount(Account arg0)`
- `WorkflowStepBuilder addAccount(List arg0)`
- `WorkflowStepBuilder addAccount(Account arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `WorkflowStepBuilder prune()`

