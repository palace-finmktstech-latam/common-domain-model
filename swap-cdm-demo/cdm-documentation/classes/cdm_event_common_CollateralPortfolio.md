# CollateralPortfolio

**Full Name:** `cdm.event.common.CollateralPortfolio`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `CollateralPortfolio build()`

#### Getter Methods

- `Class getType()`
- `ReferenceWithMetaLegalAgreement getLegalAgreement()`
- `Identifier getPortfolioIdentifier()`
- `List getCollateralBalance()`
- `List getCollateralPosition()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CollateralPortfolioBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

