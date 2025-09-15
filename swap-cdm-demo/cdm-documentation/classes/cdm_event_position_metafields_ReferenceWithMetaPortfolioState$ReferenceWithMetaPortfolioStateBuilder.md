# ReferenceWithMetaPortfolioStateBuilder

**Full Name:** `cdm.event.position.metafields.ReferenceWithMetaPortfolioState$ReferenceWithMetaPortfolioStateBuilder`

**Package:** `cdm.event.position.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.event.position.metafields.ReferenceWithMetaPortfolioState`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaPortfolioStateBuilder setValue(PortfolioState arg0)`
- `ReferenceWithMetaPortfolioStateBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaPortfolioStateBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaPortfolioStateBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `PortfolioStateBuilder getValue()`
- `PortfolioStateBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaPortfolioStateBuilder prune()`

