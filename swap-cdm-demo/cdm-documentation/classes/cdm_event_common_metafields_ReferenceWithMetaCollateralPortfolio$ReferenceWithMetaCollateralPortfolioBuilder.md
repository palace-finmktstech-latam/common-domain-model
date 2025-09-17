# ReferenceWithMetaCollateralPortfolioBuilder

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaCollateralPortfolio$ReferenceWithMetaCollateralPortfolioBuilder`

**Package:** `cdm.event.common.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaCollateralPortfolio`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaCollateralPortfolioBuilder setValue(CollateralPortfolio arg0)`
- `ReferenceWithMetaCollateralPortfolioBuilder setReference(Reference arg0)`
- `ReferenceWithMetaCollateralPortfolioBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaCollateralPortfolioBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `CollateralPortfolioBuilder getValue()`
- `CollateralPortfolioBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaCollateralPortfolioBuilder prune()`

