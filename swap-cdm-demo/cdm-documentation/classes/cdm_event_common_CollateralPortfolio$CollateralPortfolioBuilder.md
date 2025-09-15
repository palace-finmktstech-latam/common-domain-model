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

- `CollateralPortfolioBuilder setCollateralPosition(List arg0)`
- `CollateralPortfolioBuilder setPortfolioIdentifier(Identifier arg0)`
- `CollateralPortfolioBuilder setCollateralBalance(List arg0)`
- `CollateralPortfolioBuilder setLegalAgreementValue(LegalAgreement arg0)`
- `CollateralPortfolioBuilder setLegalAgreement(ReferenceWithMetaLegalAgreement arg0)`
- `CollateralPortfolioBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `ReferenceWithMetaLegalAgreementBuilder getLegalAgreement()`
- `IdentifierBuilder getPortfolioIdentifier()`
- `List getCollateralBalance()`
- `ReferenceWithMetaLegalAgreementBuilder getOrCreateLegalAgreement()`
- `List getCollateralPosition()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `CollateralBalanceBuilder getOrCreateCollateralBalance(int arg0)`
- `CollateralPositionBuilder getOrCreateCollateralPosition(int arg0)`
- `IdentifierBuilder getOrCreatePortfolioIdentifier()`

#### Adder Methods

- `CollateralPortfolioBuilder addCollateralPosition(List arg0)`
- `CollateralPortfolioBuilder addCollateralPosition(CollateralPosition arg0)`
- `CollateralPortfolioBuilder addCollateralPosition(CollateralPosition arg0, int arg1)`
- `CollateralPortfolioBuilder addCollateralBalance(List arg0)`
- `CollateralPortfolioBuilder addCollateralBalance(CollateralBalance arg0, int arg1)`
- `CollateralPortfolioBuilder addCollateralBalance(CollateralBalance arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CollateralPortfolioBuilder prune()`

