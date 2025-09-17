# PartyCustomisedWorkflowBuilder

**Full Name:** `cdm.event.workflow.PartyCustomisedWorkflow$PartyCustomisedWorkflowBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.PartyCustomisedWorkflow`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PartyCustomisedWorkflowBuilder setPartyName(String arg0)`
- `PartyCustomisedWorkflowBuilder setCustomisedWorkflow(List arg0)`
- `PartyCustomisedWorkflowBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `PartyCustomisedWorkflowBuilder setPartyReferenceValue(Party arg0)`

#### Getter Methods

- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `List getCustomisedWorkflow()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `CustomisedWorkflowBuilder getOrCreateCustomisedWorkflow(int arg0)`

#### Adder Methods

- `PartyCustomisedWorkflowBuilder addCustomisedWorkflow(CustomisedWorkflow arg0, int arg1)`
- `PartyCustomisedWorkflowBuilder addCustomisedWorkflow(List arg0)`
- `PartyCustomisedWorkflowBuilder addCustomisedWorkflow(CustomisedWorkflow arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PartyCustomisedWorkflowBuilder prune()`

