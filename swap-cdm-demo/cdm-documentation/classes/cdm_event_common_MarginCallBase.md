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

- `void process(RosettaPath arg0, Processor arg1)`
- `MarginCallBaseBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

