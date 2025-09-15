# CollateralPortfolioBuilderImpl

**Full Name:** `cdm.event.common.CollateralPortfolio$CollateralPortfolioBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.CollateralPortfolio$CollateralPortfolioBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| portfolioIdentifier | `IdentifierBuilder` |  |
| collateralPosition | `java.util.List<cdm.event.common.CollateralPosition$CollateralPositionBuilder>` |  |
| collateralBalance | `java.util.List<cdm.event.common.CollateralBalance$CollateralBalanceBuilder>` |  |
| legalAgreement | `ReferenceWithMetaLegalAgreementBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `CollateralPortfolio build()`

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

- `CollateralPortfolioBuilder addCollateralPosition(CollateralPosition arg0, int arg1)`
- `CollateralPortfolioBuilder addCollateralPosition(CollateralPosition arg0)`
- `CollateralPortfolioBuilder addCollateralPosition(List arg0)`
- `CollateralPortfolioBuilder addCollateralBalance(List arg0)`
- `CollateralPortfolioBuilder addCollateralBalance(CollateralBalance arg0)`
- `CollateralPortfolioBuilder addCollateralBalance(CollateralBalance arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CollateralPortfolioBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CollateralPortfolioBuilder toBuilder()`
- `CollateralPortfolioBuilder prune()`

