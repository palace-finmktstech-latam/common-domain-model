# MarginCallBaseBuilderImpl

**Full Name:** `cdm.event.common.MarginCallBase$MarginCallBaseBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.MarginCallBase$MarginCallBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| instructionType | `MarginCallInstructionTypeBuilder` |  |
| party | `java.util.List<cdm.base.staticdata.party.Party$PartyBuilder>` |  |
| partyRole | `java.util.List<cdm.base.staticdata.party.PartyRole$PartyRoleBuilder>` |  |
| clearingBroker | `PartyBuilder` |  |
| callIdentifier | `IdentifierBuilder` |  |
| callAgreementType | `AgreementNameBuilder` |  |
| agreementMinimumTransferAmount | `MoneyBuilder` |  |
| agreementThreshold | `MoneyBuilder` |  |
| agreementRounding | `MoneyBuilder` |  |
| regMarginType | `RegMarginTypeEnum` |  |
| regIMRole | `RegIMRoleEnum` |  |
| baseCurrencyExposure | `MarginCallExposureBuilder` |  |
| collateralPortfolio | `ReferenceWithMetaCollateralPortfolioBuilder` |  |
| independentAmountBalance | `CollateralBalanceBuilder` |  |

### Methods

#### Builder Methods

- `MarginCallBase build()`

#### Setter Methods

- `MarginCallBaseBuilder setPartyRole(List arg0)`
- `MarginCallBaseBuilder setAgreementMinimumTransferAmount(Money arg0)`
- `MarginCallBaseBuilder setIndependentAmountBalance(CollateralBalance arg0)`
- `MarginCallBaseBuilder setCollateralPortfolioValue(CollateralPortfolio arg0)`
- `MarginCallBaseBuilder setCallIdentifier(Identifier arg0)`
- `MarginCallBaseBuilder setInstructionType(MarginCallInstructionType arg0)`
- `MarginCallBaseBuilder setClearingBroker(Party arg0)`
- `MarginCallBaseBuilder setCallAgreementType(AgreementName arg0)`
- `MarginCallBaseBuilder setAgreementRounding(Money arg0)`
- `MarginCallBaseBuilder setRegMarginType(RegMarginTypeEnum arg0)`
- `MarginCallBaseBuilder setAgreementThreshold(Money arg0)`
- `MarginCallBaseBuilder setRegIMRole(RegIMRoleEnum arg0)`
- `MarginCallBaseBuilder setCollateralPortfolio(ReferenceWithMetaCollateralPortfolio arg0)`
- `MarginCallBaseBuilder setBaseCurrencyExposure(MarginCallExposure arg0)`
- `MarginCallBaseBuilder setParty(List arg0)`

#### Getter Methods

- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`
- `ReferenceWithMetaCollateralPortfolioBuilder getCollateralPortfolio()`
- `RegIMRoleEnum getRegIMRole()`
- `MarginCallExposureBuilder getBaseCurrencyExposure()`
- `PartyBuilder getClearingBroker()`
- `AgreementNameBuilder getCallAgreementType()`
- `MoneyBuilder getAgreementThreshold()`
- `MoneyBuilder getAgreementRounding()`
- `RegMarginTypeEnum getRegMarginType()`
- `IdentifierBuilder getCallIdentifier()`
- `MarginCallInstructionTypeBuilder getInstructionType()`
- `List getPartyRole()`
- `List getParty()`
- `MoneyBuilder getAgreementMinimumTransferAmount()`
- `CollateralBalanceBuilder getIndependentAmountBalance()`
- `MoneyBuilder getOrCreateAgreementMinimumTransferAmount()`
- `MoneyBuilder getOrCreateAgreementThreshold()`
- `CollateralBalanceBuilder getOrCreateIndependentAmountBalance()`
- `ReferenceWithMetaCollateralPortfolioBuilder getOrCreateCollateralPortfolio()`
- `MoneyBuilder getOrCreateAgreementRounding()`
- `MarginCallExposureBuilder getOrCreateBaseCurrencyExposure()`
- `AgreementNameBuilder getOrCreateCallAgreementType()`
- `MarginCallInstructionTypeBuilder getOrCreateInstructionType()`
- `PartyBuilder getOrCreateParty(int arg0)`
- `PartyBuilder getOrCreateClearingBroker()`
- `IdentifierBuilder getOrCreateCallIdentifier()`

#### Adder Methods

- `MarginCallBaseBuilder addParty(Party arg0)`
- `MarginCallBaseBuilder addParty(List arg0)`
- `MarginCallBaseBuilder addParty(Party arg0, int arg1)`
- `MarginCallBaseBuilder addPartyRole(PartyRole arg0, int arg1)`
- `MarginCallBaseBuilder addPartyRole(PartyRole arg0)`
- `MarginCallBaseBuilder addPartyRole(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MarginCallBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `MarginCallBaseBuilder toBuilder()`
- `MarginCallBaseBuilder prune()`

