# MarginCallBaseBuilder

**Full Name:** `cdm.event.common.MarginCallBase$MarginCallBaseBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.MarginCallBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `MarginCallBaseBuilder setAgreementRounding(Money arg0)`
- `MarginCallBaseBuilder setInstructionType(MarginCallInstructionType arg0)`
- `MarginCallBaseBuilder setClearingBroker(Party arg0)`
- `MarginCallBaseBuilder setRegMarginType(RegMarginTypeEnum arg0)`
- `MarginCallBaseBuilder setCallAgreementType(AgreementName arg0)`
- `MarginCallBaseBuilder setRegIMRole(RegIMRoleEnum arg0)`
- `MarginCallBaseBuilder setBaseCurrencyExposure(MarginCallExposure arg0)`
- `MarginCallBaseBuilder setCollateralPortfolio(ReferenceWithMetaCollateralPortfolio arg0)`
- `MarginCallBaseBuilder setCallIdentifier(Identifier arg0)`
- `MarginCallBaseBuilder setAgreementThreshold(Money arg0)`
- `MarginCallBaseBuilder setParty(List arg0)`
- `MarginCallBaseBuilder setIndependentAmountBalance(CollateralBalance arg0)`
- `MarginCallBaseBuilder setCollateralPortfolioValue(CollateralPortfolio arg0)`
- `MarginCallBaseBuilder setAgreementMinimumTransferAmount(Money arg0)`
- `MarginCallBaseBuilder setPartyRole(List arg0)`

#### Getter Methods

- `List getPartyRole()`
- `CollateralBalanceBuilder getIndependentAmountBalance()`
- `MoneyBuilder getAgreementMinimumTransferAmount()`
- `List getParty()`
- `PartyBuilder getOrCreateClearingBroker()`
- `IdentifierBuilder getOrCreateCallIdentifier()`
- `MarginCallInstructionTypeBuilder getOrCreateInstructionType()`
- `PartyBuilder getOrCreateParty(int arg0)`
- `MoneyBuilder getOrCreateAgreementMinimumTransferAmount()`
- `CollateralBalanceBuilder getOrCreateIndependentAmountBalance()`
- `MarginCallExposureBuilder getOrCreateBaseCurrencyExposure()`
- `ReferenceWithMetaCollateralPortfolioBuilder getOrCreateCollateralPortfolio()`
- `AgreementNameBuilder getOrCreateCallAgreementType()`
- `MoneyBuilder getOrCreateAgreementThreshold()`
- `MoneyBuilder getOrCreateAgreementRounding()`
- `PartyBuilder getClearingBroker()`
- `IdentifierBuilder getCallIdentifier()`
- `MoneyBuilder getAgreementRounding()`
- `MarginCallInstructionTypeBuilder getInstructionType()`
- `MoneyBuilder getAgreementThreshold()`
- `MarginCallExposureBuilder getBaseCurrencyExposure()`
- `ReferenceWithMetaCollateralPortfolioBuilder getCollateralPortfolio()`
- `AgreementNameBuilder getCallAgreementType()`
- `PartyRoleBuilder getOrCreatePartyRole(int arg0)`

#### Adder Methods

- `MarginCallBaseBuilder addPartyRole(List arg0)`
- `MarginCallBaseBuilder addPartyRole(PartyRole arg0, int arg1)`
- `MarginCallBaseBuilder addPartyRole(PartyRole arg0)`
- `MarginCallBaseBuilder addParty(Party arg0)`
- `MarginCallBaseBuilder addParty(Party arg0, int arg1)`
- `MarginCallBaseBuilder addParty(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MarginCallBaseBuilder prune()`

