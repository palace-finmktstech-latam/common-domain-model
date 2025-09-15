# LineageBuilderImpl

**Full Name:** `cdm.event.common.Lineage$LineageBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.Lineage$LineageBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| tradeReference | `java.util.List<cdm.event.common.metafields.ReferenceWithMetaTrade$ReferenceWithMetaTradeBuilder>` |  |
| eventReference | `java.util.List<cdm.event.workflow.metafields.ReferenceWithMetaWorkflowStep$ReferenceWithMetaWorkflowStepBuilder>` |  |
| portfolioStateReference | `java.util.List<cdm.event.position.metafields.ReferenceWithMetaPortfolioState$ReferenceWithMetaPortfolioStateBuilder>` |  |

### Methods

#### Builder Methods

- `Lineage build()`

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

- `LineageBuilder addPortfolioStateReferenceValue(PortfolioState arg0, int arg1)`
- `LineageBuilder addPortfolioStateReferenceValue(PortfolioState arg0)`
- `LineageBuilder addPortfolioStateReferenceValue(List arg0)`
- `LineageBuilder addEventReference(ReferenceWithMetaWorkflowStep arg0)`
- `LineageBuilder addEventReference(ReferenceWithMetaWorkflowStep arg0, int arg1)`
- `LineageBuilder addEventReference(List arg0)`
- `LineageBuilder addEventReferenceValue(List arg0)`
- `LineageBuilder addEventReferenceValue(WorkflowStep arg0)`
- `LineageBuilder addEventReferenceValue(WorkflowStep arg0, int arg1)`
- `LineageBuilder addTradeReference(ReferenceWithMetaTrade arg0, int arg1)`
- `LineageBuilder addTradeReference(ReferenceWithMetaTrade arg0)`
- `LineageBuilder addTradeReference(List arg0)`
- `LineageBuilder addPortfolioStateReference(List arg0)`
- `LineageBuilder addPortfolioStateReference(ReferenceWithMetaPortfolioState arg0)`
- `LineageBuilder addPortfolioStateReference(ReferenceWithMetaPortfolioState arg0, int arg1)`
- `LineageBuilder addTradeReferenceValue(Trade arg0)`
- `LineageBuilder addTradeReferenceValue(List arg0)`
- `LineageBuilder addTradeReferenceValue(Trade arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LineageBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `LineageBuilder toBuilder()`
- `LineageBuilder prune()`

