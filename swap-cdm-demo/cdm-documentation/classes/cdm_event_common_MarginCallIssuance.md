# MarginCallIssuance

**Full Name:** `cdm.event.common.MarginCallIssuance`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.MarginCallBase`

### Methods

#### Builder Methods

- `MarginCallIssuance build()`

#### Getter Methods

- `Class getType()`
- `Money getCallAmountInBaseCurrency()`
- `List getRecallNonCashCollateralDescription()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `MarginCallIssuanceBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

