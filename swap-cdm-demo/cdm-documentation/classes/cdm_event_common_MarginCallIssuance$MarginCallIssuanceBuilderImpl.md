# MarginCallIssuanceBuilderImpl

**Full Name:** `cdm.event.common.MarginCallIssuance$MarginCallIssuanceBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.common.MarginCallBase$MarginCallBaseBuilderImpl`

### Implemented Interfaces

- `cdm.event.common.MarginCallIssuance$MarginCallIssuanceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| callAmountInBaseCurrency | `MoneyBuilder` |  |
| recallNonCashCollateralDescription | `java.util.List<cdm.product.collateral.EligibleCollateralCriteria$EligibleCollateralCriteriaBuilder>` |  |

### Methods

#### Builder Methods

- `MarginCallIssuance build()`

#### Setter Methods

- `MarginCallIssuanceBuilder setRecallNonCashCollateralDescription(List arg0)`
- `MarginCallIssuanceBuilder setCallAmountInBaseCurrency(Money arg0)`
- `MarginCallIssuanceBuilder setAgreementRounding(Money arg0)`
- `MarginCallIssuanceBuilder setInstructionType(MarginCallInstructionType arg0)`
- `MarginCallIssuanceBuilder setClearingBroker(Party arg0)`
- `MarginCallIssuanceBuilder setRegMarginType(RegMarginTypeEnum arg0)`
- `MarginCallIssuanceBuilder setCallAgreementType(AgreementName arg0)`
- `MarginCallIssuanceBuilder setRegIMRole(RegIMRoleEnum arg0)`
- `MarginCallIssuanceBuilder setBaseCurrencyExposure(MarginCallExposure arg0)`
- `MarginCallIssuanceBuilder setCollateralPortfolio(ReferenceWithMetaCollateralPortfolio arg0)`
- `MarginCallIssuanceBuilder setCallIdentifier(Identifier arg0)`
- `MarginCallIssuanceBuilder setAgreementThreshold(Money arg0)`
- `MarginCallIssuanceBuilder setParty(List arg0)`
- `MarginCallIssuanceBuilder setIndependentAmountBalance(CollateralBalance arg0)`
- `MarginCallIssuanceBuilder setCollateralPortfolioValue(CollateralPortfolio arg0)`
- `MarginCallIssuanceBuilder setAgreementMinimumTransferAmount(Money arg0)`
- `MarginCallIssuanceBuilder setPartyRole(List arg0)`

#### Getter Methods

- `MoneyBuilder getCallAmountInBaseCurrency()`
- `MoneyBuilder getOrCreateCallAmountInBaseCurrency()`
- `List getRecallNonCashCollateralDescription()`
- `EligibleCollateralCriteriaBuilder getOrCreateRecallNonCashCollateralDescription(int arg0)`

#### Adder Methods

- `MarginCallIssuanceBuilder addPartyRole(List arg0)`
- `MarginCallIssuanceBuilder addPartyRole(PartyRole arg0)`
- `MarginCallIssuanceBuilder addPartyRole(PartyRole arg0, int arg1)`
- `MarginCallIssuanceBuilder addParty(Party arg0)`
- `MarginCallIssuanceBuilder addParty(List arg0)`
- `MarginCallIssuanceBuilder addParty(Party arg0, int arg1)`
- `MarginCallIssuanceBuilder addRecallNonCashCollateralDescription(EligibleCollateralCriteria arg0)`
- `MarginCallIssuanceBuilder addRecallNonCashCollateralDescription(EligibleCollateralCriteria arg0, int arg1)`
- `MarginCallIssuanceBuilder addRecallNonCashCollateralDescription(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MarginCallIssuanceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `MarginCallIssuanceBuilder prune()`
- `MarginCallIssuanceBuilder toBuilder()`
- `boolean hasData()`

