# Transfer

**Full Name:** `cdm.event.common.Transfer`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.AssetFlowBase`

### Methods

#### Builder Methods

- `Transfer build()`

#### Getter Methods

- `Class getType()`
- `ReferenceWithMetaPayout getSettlementOrigin()`
- `PartyReferencePayerReceiver getPayerReceiver()`
- `TransferExpression getTransferExpression()`
- `Reset getResetOrigin()`
- `List getIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `TransferBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

