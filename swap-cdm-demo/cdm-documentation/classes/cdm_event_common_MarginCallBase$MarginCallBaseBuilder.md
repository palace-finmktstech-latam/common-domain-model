# MarginCallBaseBuilder

**Full Name:** `cdm.event.common.MarginCallBase$MarginCallBaseBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.MarginCallBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `MarginCallExposureBuilder getBaseCurrencyExposure()`
- `PartyBuilder getClearingBroker()`
- `AgreementNameBuilder getCallAgreementType()`
- `MoneyBuilder getAgreementThreshold()`
- `MoneyBuilder getAgreementRounding()`
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

- `MarginCallBaseBuilder addParty(Party arg0, int arg1)`
- `MarginCallBaseBuilder addParty(List arg0)`
- `MarginCallBaseBuilder addParty(Party arg0)`
- `MarginCallBaseBuilder addPartyRole(PartyRole arg0)`
- `MarginCallBaseBuilder addPartyRole(PartyRole arg0, int arg1)`
- `MarginCallBaseBuilder addPartyRole(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MarginCallBaseBuilder prune()`

