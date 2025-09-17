# MarginCallResponse

**Full Name:** `cdm.event.common.MarginCallResponse`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.MarginCallBase`

### Methods

#### Builder Methods

- `MarginCallResponse build()`

#### Getter Methods

- `Class getType()`
- `MarginCallResponseTypeEnum getMarginResponseType()`
- `Money getAgreedAmountBaseCurrency()`
- `List getMarginCallResponseAction()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `MarginCallResponseBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

