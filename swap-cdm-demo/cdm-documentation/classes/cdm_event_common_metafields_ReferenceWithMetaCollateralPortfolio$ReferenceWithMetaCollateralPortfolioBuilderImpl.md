# ReferenceWithMetaCollateralPortfolioBuilderImpl

**Full Name:** `cdm.event.common.metafields.ReferenceWithMetaCollateralPortfolio$ReferenceWithMetaCollateralPortfolioBuilderImpl`

**Package:** `cdm.event.common.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.metafields.ReferenceWithMetaCollateralPortfolio$ReferenceWithMetaCollateralPortfolioBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `CollateralPortfolioBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaCollateralPortfolio build()`

#### Setter Methods

- `ReferenceWithMetaCollateralPortfolioBuilder setValue(CollateralPortfolio arg0)`
- `ReferenceWithMetaCollateralPortfolioBuilder setExternalReference(String arg0)`
- `ReferenceWithMetaCollateralPortfolioBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaCollateralPortfolioBuilder setReference(Reference arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `CollateralPortfolioBuilder getValue()`
- `CollateralPortfolioBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaCollateralPortfolioBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReferenceWithMetaCollateralPortfolioBuilder toBuilder()`
- `ReferenceWithMetaCollateralPortfolioBuilder prune()`

