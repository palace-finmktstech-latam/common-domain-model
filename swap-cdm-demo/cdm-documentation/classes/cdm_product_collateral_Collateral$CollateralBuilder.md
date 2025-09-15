# CollateralBuilder

**Full Name:** `cdm.product.collateral.Collateral$CollateralBuilder`

**Package:** `cdm.product.collateral`

## Type: Interface

### Implemented Interfaces

- `cdm.product.collateral.Collateral`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `CollateralBuilder setPortfolioIdentifier(List arg0)`
- `CollateralBuilder setCollateralProvisions(CollateralProvisions arg0)`
- `CollateralBuilder setIndependentAmount(IndependentAmount arg0)`
- `CollateralBuilder setCollateralPortfolioValue(List arg0)`
- `CollateralBuilder setCollateralPortfolio(List arg0)`
- `CollateralBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `List getPortfolioIdentifier()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `List getCollateralPortfolio()`
- `ReferenceWithMetaCollateralPortfolioBuilder getOrCreateCollateralPortfolio(int arg0)`
- `CollateralProvisionsBuilder getOrCreateCollateralProvisions()`
- `IndependentAmountBuilder getOrCreateIndependentAmount()`
- `MetaFieldsBuilder getMeta()`
- `IndependentAmountBuilder getIndependentAmount()`
- `CollateralProvisionsBuilder getCollateralProvisions()`
- `IdentifierBuilder getOrCreatePortfolioIdentifier(int arg0)`

#### Adder Methods

- `CollateralBuilder addCollateralPortfolio(ReferenceWithMetaCollateralPortfolio arg0)`
- `CollateralBuilder addCollateralPortfolio(List arg0)`
- `CollateralBuilder addCollateralPortfolio(ReferenceWithMetaCollateralPortfolio arg0, int arg1)`
- `CollateralBuilder addPortfolioIdentifier(Identifier arg0, int arg1)`
- `CollateralBuilder addPortfolioIdentifier(Identifier arg0)`
- `CollateralBuilder addPortfolioIdentifier(List arg0)`
- `CollateralBuilder addCollateralPortfolioValue(CollateralPortfolio arg0, int arg1)`
- `CollateralBuilder addCollateralPortfolioValue(CollateralPortfolio arg0)`
- `CollateralBuilder addCollateralPortfolioValue(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralBuilder prune()`

