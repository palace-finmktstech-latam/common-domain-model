# MarginCallBaseImpl

**Full Name:** `cdm.event.common.MarginCallBase$MarginCallBaseImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.MarginCallBase`

### Methods

#### Builder Methods

- `MarginCallBase build()`

#### Setter Methods

- `void setBuilderFields(MarginCallBaseBuilder arg0)`

#### Getter Methods

- `ReferenceWithMetaCollateralPortfolio getCollateralPortfolio()`
- `RegIMRoleEnum getRegIMRole()`
- `MarginCallExposure getBaseCurrencyExposure()`
- `Party getClearingBroker()`
- `AgreementName getCallAgreementType()`
- `Money getAgreementThreshold()`
- `Money getAgreementRounding()`
- `RegMarginTypeEnum getRegMarginType()`
- `Identifier getCallIdentifier()`
- `MarginCallInstructionType getInstructionType()`
- `List getPartyRole()`
- `List getParty()`
- `Money getAgreementMinimumTransferAmount()`
- `CollateralBalance getIndependentAmountBalance()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MarginCallBaseBuilder toBuilder()`

