# MarginCallResponseBuilderImpl

**Full Name:** `cdm.event.common.MarginCallResponse$MarginCallResponseBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.common.MarginCallBase$MarginCallBaseBuilderImpl`

### Implemented Interfaces

- `cdm.event.common.MarginCallResponse$MarginCallResponseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| marginCallResponseAction | `java.util.List<cdm.event.common.MarginCallResponseAction$MarginCallResponseActionBuilder>` |  |
| marginResponseType | `MarginCallResponseTypeEnum` |  |
| agreedAmountBaseCurrency | `MoneyBuilder` |  |

### Methods

#### Builder Methods

- `MarginCallResponse build()`

#### Setter Methods

- `MarginCallResponseBuilder setPartyRole(List arg0)`
- `MarginCallResponseBuilder setAgreementMinimumTransferAmount(Money arg0)`
- `MarginCallResponseBuilder setIndependentAmountBalance(CollateralBalance arg0)`
- `MarginCallResponseBuilder setCollateralPortfolioValue(CollateralPortfolio arg0)`
- `MarginCallResponseBuilder setMarginCallResponseAction(List arg0)`
- `MarginCallResponseBuilder setAgreedAmountBaseCurrency(Money arg0)`
- `MarginCallResponseBuilder setCallIdentifier(Identifier arg0)`
- `MarginCallResponseBuilder setInstructionType(MarginCallInstructionType arg0)`
- `MarginCallResponseBuilder setClearingBroker(Party arg0)`
- `MarginCallResponseBuilder setCallAgreementType(AgreementName arg0)`
- `MarginCallResponseBuilder setAgreementRounding(Money arg0)`
- `MarginCallResponseBuilder setRegMarginType(RegMarginTypeEnum arg0)`
- `MarginCallResponseBuilder setAgreementThreshold(Money arg0)`
- `MarginCallResponseBuilder setRegIMRole(RegIMRoleEnum arg0)`
- `MarginCallResponseBuilder setCollateralPortfolio(ReferenceWithMetaCollateralPortfolio arg0)`
- `MarginCallResponseBuilder setBaseCurrencyExposure(MarginCallExposure arg0)`
- `MarginCallResponseBuilder setMarginResponseType(MarginCallResponseTypeEnum arg0)`
- `MarginCallResponseBuilder setParty(List arg0)`

#### Getter Methods

- `MarginCallResponseActionBuilder getOrCreateMarginCallResponseAction(int arg0)`
- `MoneyBuilder getAgreedAmountBaseCurrency()`
- `MoneyBuilder getOrCreateAgreedAmountBaseCurrency()`
- `List getMarginCallResponseAction()`
- `MarginCallResponseTypeEnum getMarginResponseType()`

#### Adder Methods

- `MarginCallResponseBuilder addParty(Party arg0, int arg1)`
- `MarginCallResponseBuilder addParty(Party arg0)`
- `MarginCallResponseBuilder addParty(List arg0)`
- `MarginCallResponseBuilder addPartyRole(PartyRole arg0)`
- `MarginCallResponseBuilder addPartyRole(PartyRole arg0, int arg1)`
- `MarginCallResponseBuilder addPartyRole(List arg0)`
- `MarginCallResponseBuilder addMarginCallResponseAction(MarginCallResponseAction arg0)`
- `MarginCallResponseBuilder addMarginCallResponseAction(MarginCallResponseAction arg0, int arg1)`
- `MarginCallResponseBuilder addMarginCallResponseAction(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MarginCallResponseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `MarginCallResponseBuilder toBuilder()`
- `MarginCallResponseBuilder prune()`

