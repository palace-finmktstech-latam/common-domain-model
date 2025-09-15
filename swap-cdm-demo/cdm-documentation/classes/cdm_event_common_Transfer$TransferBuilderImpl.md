# TransferBuilderImpl

**Full Name:** `cdm.event.common.Transfer$TransferBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.AssetFlowBase$AssetFlowBaseBuilderImpl`

### Implemented Interfaces

- `cdm.event.common.Transfer$TransferBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| identifier | `java.util.List<cdm.base.staticdata.identifier.metafields.FieldWithMetaIdentifier$FieldWithMetaIdentifierBuilder>` |  |
| payerReceiver | `PartyReferencePayerReceiverBuilder` |  |
| settlementOrigin | `ReferenceWithMetaPayoutBuilder` |  |
| resetOrigin | `ResetBuilder` |  |
| transferExpression | `TransferExpressionBuilder` |  |

### Methods

#### Builder Methods

- `Transfer build()`

#### Setter Methods

- `TransferBuilder setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)`
- `TransferBuilder setIdentifier(List arg0)`
- `TransferBuilder setQuantity(NonNegativeQuantity arg0)`
- `TransferBuilder setIdentifierValue(List arg0)`
- `TransferBuilder setPayerReceiver(PartyReferencePayerReceiver arg0)`
- `TransferBuilder setSettlementOrigin(ReferenceWithMetaPayout arg0)`
- `TransferBuilder setSettlementOriginValue(Payout arg0)`
- `TransferBuilder setResetOrigin(Reset arg0)`
- `TransferBuilder setTransferExpression(TransferExpression arg0)`
- `TransferBuilder setAsset(Asset arg0)`

#### Getter Methods

- `ResetBuilder getResetOrigin()`
- `PartyReferencePayerReceiverBuilder getPayerReceiver()`
- `ReferenceWithMetaPayoutBuilder getSettlementOrigin()`
- `TransferExpressionBuilder getTransferExpression()`
- `FieldWithMetaIdentifierBuilder getOrCreateIdentifier(int arg0)`
- `PartyReferencePayerReceiverBuilder getOrCreatePayerReceiver()`
- `ResetBuilder getOrCreateResetOrigin()`
- `TransferExpressionBuilder getOrCreateTransferExpression()`
- `ReferenceWithMetaPayoutBuilder getOrCreateSettlementOrigin()`
- `List getIdentifier()`

#### Adder Methods

- `TransferBuilder addIdentifierValue(Identifier arg0, int arg1)`
- `TransferBuilder addIdentifierValue(List arg0)`
- `TransferBuilder addIdentifierValue(Identifier arg0)`
- `TransferBuilder addIdentifier(FieldWithMetaIdentifier arg0, int arg1)`
- `TransferBuilder addIdentifier(FieldWithMetaIdentifier arg0)`
- `TransferBuilder addIdentifier(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TransferBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `TransferBuilder toBuilder()`
- `TransferBuilder prune()`

