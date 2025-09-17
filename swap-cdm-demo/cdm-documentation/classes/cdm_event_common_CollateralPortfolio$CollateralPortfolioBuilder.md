# CollateralPortfolioBuilder

**Full Name:** `cdm.event.common.CollateralPortfolio$CollateralPortfolioBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.CollateralPortfolio`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `CollateralPortfolioBuilder setPortfolioIdentifier(Identifier arg0)`
- `CollateralPortfolioBuilder setCollateralBalance(List arg0)`
- `CollateralPortfolioBuilder setCollateralPosition(List arg0)`
- `CollateralPortfolioBuilder setLegalAgreementValue(LegalAgreement arg0)`
- `CollateralPortfolioBuilder setLegalAgreement(ReferenceWithMetaLegalAgreement arg0)`
- `CollateralPortfolioBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `List getCollateralBalance()`
- `ReferenceWithMetaLegalAgreementBuilder getOrCreateLegalAgreement()`
- `ReferenceWithMetaLegalAgreementBuilder getLegalAgreement()`
- `IdentifierBuilder getPortfolioIdentifier()`
- `List getCollateralPosition()`
- `IdentifierBuilder getOrCreatePortfolioIdentifier()`
- `CollateralBalanceBuilder getOrCreateCollateralBalance(int arg0)`
- `CollateralPositionBuilder getOrCreateCollateralPosition(int arg0)`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `CollateralPortfolioBuilder addCollateralPosition(CollateralPosition arg0)`
- `CollateralPortfolioBuilder addCollateralPosition(List arg0)`
- `CollateralPortfolioBuilder addCollateralPosition(CollateralPosition arg0, int arg1)`
- `CollateralPortfolioBuilder addCollateralBalance(CollateralBalance arg0)`
- `CollateralPortfolioBuilder addCollateralBalance(CollateralBalance arg0, int arg1)`
- `CollateralPortfolioBuilder addCollateralBalance(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralPortfolioBuilder prune()`

