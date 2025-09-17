# MarginCallResponseBuilder

**Full Name:** `cdm.event.common.MarginCallResponse$MarginCallResponseBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.MarginCallResponse`
- `cdm.event.common.MarginCallBase$MarginCallBaseBuilder`

### Methods

#### Setter Methods

- `MarginCallResponseBuilder setMarginResponseType(MarginCallResponseTypeEnum arg0)`
- `MarginCallResponseBuilder setMarginCallResponseAction(List arg0)`
- `MarginCallResponseBuilder setAgreedAmountBaseCurrency(Money arg0)`
- `MarginCallResponseBuilder setAgreementRounding(Money arg0)`
- `MarginCallResponseBuilder setInstructionType(MarginCallInstructionType arg0)`
- `MarginCallResponseBuilder setClearingBroker(Party arg0)`
- `MarginCallResponseBuilder setRegMarginType(RegMarginTypeEnum arg0)`
- `MarginCallResponseBuilder setCallAgreementType(AgreementName arg0)`
- `MarginCallResponseBuilder setRegIMRole(RegIMRoleEnum arg0)`
- `MarginCallResponseBuilder setBaseCurrencyExposure(MarginCallExposure arg0)`
- `MarginCallResponseBuilder setCollateralPortfolio(ReferenceWithMetaCollateralPortfolio arg0)`
- `MarginCallResponseBuilder setCallIdentifier(Identifier arg0)`
- `MarginCallResponseBuilder setAgreementThreshold(Money arg0)`
- `MarginCallResponseBuilder setParty(List arg0)`
- `MarginCallResponseBuilder setIndependentAmountBalance(CollateralBalance arg0)`
- `MarginCallResponseBuilder setCollateralPortfolioValue(CollateralPortfolio arg0)`
- `MarginCallResponseBuilder setAgreementMinimumTransferAmount(Money arg0)`
- `MarginCallResponseBuilder setPartyRole(List arg0)`

#### Getter Methods

- `MoneyBuilder getAgreedAmountBaseCurrency()`
- `MarginCallResponseActionBuilder getOrCreateMarginCallResponseAction(int arg0)`
- `List getMarginCallResponseAction()`
- `MoneyBuilder getOrCreateAgreedAmountBaseCurrency()`

#### Adder Methods

- `MarginCallResponseBuilder addPartyRole(List arg0)`
- `MarginCallResponseBuilder addPartyRole(PartyRole arg0, int arg1)`
- `MarginCallResponseBuilder addPartyRole(PartyRole arg0)`
- `MarginCallResponseBuilder addParty(List arg0)`
- `MarginCallResponseBuilder addParty(Party arg0, int arg1)`
- `MarginCallResponseBuilder addParty(Party arg0)`
- `MarginCallResponseBuilder addMarginCallResponseAction(MarginCallResponseAction arg0, int arg1)`
- `MarginCallResponseBuilder addMarginCallResponseAction(List arg0)`
- `MarginCallResponseBuilder addMarginCallResponseAction(MarginCallResponseAction arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `MarginCallResponseBuilder prune()`

