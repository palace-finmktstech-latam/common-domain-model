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

- `CollateralPortfolioBuilder addCollateralPosition(CollateralPosition arg0, int arg1)`
- `CollateralPortfolioBuilder addCollateralPosition(List arg0)`
- `CollateralPortfolioBuilder addCollateralPosition(CollateralPosition arg0)`
- `CollateralPortfolioBuilder addCollateralBalance(List arg0)`
- `CollateralPortfolioBuilder addCollateralBalance(CollateralBalance arg0, int arg1)`
- `CollateralPortfolioBuilder addCollateralBalance(CollateralBalance arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CollateralPortfolioBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CollateralPortfolioBuilder prune()`
- `CollateralPortfolioBuilder toBuilder()`
- `boolean hasData()`

