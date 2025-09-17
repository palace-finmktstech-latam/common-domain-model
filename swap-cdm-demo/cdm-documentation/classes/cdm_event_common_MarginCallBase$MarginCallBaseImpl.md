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

- `List getPartyRole()`
- `CollateralBalance getIndependentAmountBalance()`
- `Money getAgreementMinimumTransferAmount()`
- `List getParty()`
- `RegMarginTypeEnum getRegMarginType()`
- `Party getClearingBroker()`
- `Identifier getCallIdentifier()`
- `RegIMRoleEnum getRegIMRole()`
- `Money getAgreementRounding()`
- `MarginCallInstructionType getInstructionType()`
- `Money getAgreementThreshold()`
- `MarginCallExposure getBaseCurrencyExposure()`
- `ReferenceWithMetaCollateralPortfolio getCollateralPortfolio()`
- `AgreementName getCallAgreementType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `MarginCallBaseBuilder toBuilder()`

