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
- `Reset getResetOrigin()`
- `PartyReferencePayerReceiver getPayerReceiver()`
- `ReferenceWithMetaPayout getSettlementOrigin()`
- `TransferExpression getTransferExpression()`
- `List getIdentifier()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `TransferBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

