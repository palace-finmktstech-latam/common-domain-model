# CollateralBalance

**Full Name:** `cdm.event.common.CollateralBalance`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `CollateralBalance build()`

#### Getter Methods

- `Class getType()`
- `CollateralStatusEnum getCollateralBalanceStatus()`
- `Money getAmountBaseCurrency()`
- `HaircutIndicatorEnum getHaircutIndicator()`
- `PartyReferencePayerReceiver getPayerReceiver()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CollateralBalanceBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

