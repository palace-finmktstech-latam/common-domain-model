# PartyCustomisedWorkflowBuilderImpl

**Full Name:** `cdm.event.workflow.PartyCustomisedWorkflow$PartyCustomisedWorkflowBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.PartyCustomisedWorkflow$PartyCustomisedWorkflowBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| partyReference | `ReferenceWithMetaPartyBuilder` |  |
| partyName | `String` |  |
| customisedWorkflow | `java.util.List<cdm.event.workflow.CustomisedWorkflow$CustomisedWorkflowBuilder>` |  |

### Methods

#### Builder Methods

- `PartyCustomisedWorkflow build()`

#### Setter Methods

- `PartyCustomisedWorkflowBuilder setPartyName(String arg0)`
- `PartyCustomisedWorkflowBuilder setCustomisedWorkflow(List arg0)`
- `PartyCustomisedWorkflowBuilder setPartyReference(ReferenceWithMetaParty arg0)`
- `PartyCustomisedWorkflowBuilder setPartyReferenceValue(Party arg0)`

#### Getter Methods

- `ReferenceWithMetaPartyBuilder getPartyReference()`
- `String getPartyName()`
- `List getCustomisedWorkflow()`
- `ReferenceWithMetaPartyBuilder getOrCreatePartyReference()`
- `CustomisedWorkflowBuilder getOrCreateCustomisedWorkflow(int arg0)`

#### Adder Methods

- `PartyCustomisedWorkflowBuilder addCustomisedWorkflow(CustomisedWorkflow arg0, int arg1)`
- `PartyCustomisedWorkflowBuilder addCustomisedWorkflow(CustomisedWorkflow arg0)`
- `PartyCustomisedWorkflowBuilder addCustomisedWorkflow(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PartyCustomisedWorkflowBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PartyCustomisedWorkflowBuilder prune()`
- `PartyCustomisedWorkflowBuilder toBuilder()`
- `boolean hasData()`

