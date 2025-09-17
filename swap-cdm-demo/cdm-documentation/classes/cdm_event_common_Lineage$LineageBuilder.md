# LineageBuilder

**Full Name:** `cdm.event.common.Lineage$LineageBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.Lineage`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `LineageBuilder setTradeReference(List arg0)`
- `LineageBuilder setTradeReferenceValue(List arg0)`
- `LineageBuilder setEventReference(List arg0)`
- `LineageBuilder setEventReferenceValue(List arg0)`
- `LineageBuilder setPortfolioStateReference(List arg0)`
- `LineageBuilder setPortfolioStateReferenceValue(List arg0)`

#### Getter Methods

- `List getTradeReference()`
- `ReferenceWithMetaTradeBuilder getOrCreateTradeReference(int arg0)`
- `ReferenceWithMetaWorkflowStepBuilder getOrCreateEventReference(int arg0)`
- `List getEventReference()`
- `List getPortfolioStateReference()`
- `ReferenceWithMetaPortfolioStateBuilder getOrCreatePortfolioStateReference(int arg0)`

#### Adder Methods

- `LineageBuilder addEventReference(ReferenceWithMetaWorkflowStep arg0)`
- `LineageBuilder addEventReference(ReferenceWithMetaWorkflowStep arg0, int arg1)`
- `LineageBuilder addEventReference(List arg0)`
- `LineageBuilder addPortfolioStateReference(List arg0)`
- `LineageBuilder addPortfolioStateReference(ReferenceWithMetaPortfolioState arg0)`
- `LineageBuilder addPortfolioStateReference(ReferenceWithMetaPortfolioState arg0, int arg1)`
- `LineageBuilder addTradeReferenceValue(List arg0)`
- `LineageBuilder addTradeReferenceValue(Trade arg0)`
- `LineageBuilder addTradeReferenceValue(Trade arg0, int arg1)`
- `LineageBuilder addEventReferenceValue(WorkflowStep arg0)`
- `LineageBuilder addEventReferenceValue(List arg0)`
- `LineageBuilder addEventReferenceValue(WorkflowStep arg0, int arg1)`
- `LineageBuilder addTradeReference(ReferenceWithMetaTrade arg0, int arg1)`
- `LineageBuilder addTradeReference(List arg0)`
- `LineageBuilder addTradeReference(ReferenceWithMetaTrade arg0)`
- `LineageBuilder addPortfolioStateReferenceValue(PortfolioState arg0, int arg1)`
- `LineageBuilder addPortfolioStateReferenceValue(PortfolioState arg0)`
- `LineageBuilder addPortfolioStateReferenceValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LineageBuilder prune()`

