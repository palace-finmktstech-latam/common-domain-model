# MarginCallBase

**Full Name:** `cdm.event.common.MarginCallBase`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `MarginCallBase build()`

#### Getter Methods

- `Class getType()`
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

- `void process(RosettaPath arg0, Processor arg1)`
- `MarginCallBaseBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

