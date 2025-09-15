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
- `LineageBuilder setPortfolioStateReferenceValue(List arg0)`
- `LineageBuilder setPortfolioStateReference(List arg0)`
- `LineageBuilder setEventReferenceValue(List arg0)`
- `LineageBuilder setEventReference(List arg0)`

#### Getter Methods

- `ReferenceWithMetaTradeBuilder getOrCreateTradeReference(int arg0)`
- `List getTradeReference()`
- `ReferenceWithMetaPortfolioStateBuilder getOrCreatePortfolioStateReference(int arg0)`
- `ReferenceWithMetaWorkflowStepBuilder getOrCreateEventReference(int arg0)`
- `List getPortfolioStateReference()`
- `List getEventReference()`

#### Adder Methods

- `LineageBuilder addPortfolioStateReferenceValue(List arg0)`
- `LineageBuilder addPortfolioStateReferenceValue(PortfolioState arg0)`
- `LineageBuilder addPortfolioStateReferenceValue(PortfolioState arg0, int arg1)`
- `LineageBuilder addEventReference(ReferenceWithMetaWorkflowStep arg0)`
- `LineageBuilder addEventReference(List arg0)`
- `LineageBuilder addEventReference(ReferenceWithMetaWorkflowStep arg0, int arg1)`
- `LineageBuilder addEventReferenceValue(List arg0)`
- `LineageBuilder addEventReferenceValue(WorkflowStep arg0, int arg1)`
- `LineageBuilder addEventReferenceValue(WorkflowStep arg0)`
- `LineageBuilder addTradeReference(ReferenceWithMetaTrade arg0, int arg1)`
- `LineageBuilder addTradeReference(List arg0)`
- `LineageBuilder addTradeReference(ReferenceWithMetaTrade arg0)`
- `LineageBuilder addPortfolioStateReference(ReferenceWithMetaPortfolioState arg0)`
- `LineageBuilder addPortfolioStateReference(List arg0)`
- `LineageBuilder addPortfolioStateReference(ReferenceWithMetaPortfolioState arg0, int arg1)`
- `LineageBuilder addTradeReferenceValue(Trade arg0, int arg1)`
- `LineageBuilder addTradeReferenceValue(Trade arg0)`
- `LineageBuilder addTradeReferenceValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LineageBuilder prune()`

