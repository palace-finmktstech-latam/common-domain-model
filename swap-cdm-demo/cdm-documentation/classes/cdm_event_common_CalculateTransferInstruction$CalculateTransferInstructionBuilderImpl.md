# CalculateTransferInstructionBuilderImpl

**Full Name:** `cdm.event.common.CalculateTransferInstruction$CalculateTransferInstructionBuilderImpl`

**Package:** `cdm.event.common`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.common.CalculateTransferInstruction$CalculateTransferInstructionBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| tradeState | `TradeStateBuilder` |  |
| payout | `ReferenceWithMetaPayoutBuilder` |  |
| resets | `java.util.List<cdm.event.common.Reset$ResetBuilder>` |  |
| payerReceiver | `PayerReceiverBuilder` |  |
| quantity | `QuantityBuilder` |  |
| date | `Date` |  |

### Methods

#### Builder Methods

- `CalculateTransferInstruction build()`

#### Setter Methods

- `CalculateTransferInstructionBuilder setDate(Date arg0)`
- `CalculateTransferInstructionBuilder setPayout(ReferenceWithMetaPayout arg0)`
- `CalculateTransferInstructionBuilder setPayoutValue(Payout arg0)`
- `CalculateTransferInstructionBuilder setQuantity(Quantity arg0)`
- `CalculateTransferInstructionBuilder setPayerReceiver(PayerReceiver arg0)`
- `CalculateTransferInstructionBuilder setResets(List arg0)`
- `CalculateTransferInstructionBuilder setTradeState(TradeState arg0)`

#### Getter Methods

- `Date getDate()`
- `ReferenceWithMetaPayoutBuilder getOrCreatePayout()`
- `PayerReceiverBuilder getPayerReceiver()`
- `QuantityBuilder getQuantity()`
- `QuantityBuilder getOrCreateQuantity()`
- `PayerReceiverBuilder getOrCreatePayerReceiver()`
- `TradeStateBuilder getTradeState()`
- `List getResets()`
- `ReferenceWithMetaPayoutBuilder getPayout()`
- `ResetBuilder getOrCreateResets(int arg0)`
- `TradeStateBuilder getOrCreateTradeState()`

#### Adder Methods

- `CalculateTransferInstructionBuilder addResets(Reset arg0)`
- `CalculateTransferInstructionBuilder addResets(Reset arg0, int arg1)`
- `CalculateTransferInstructionBuilder addResets(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculateTransferInstructionBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CalculateTransferInstructionBuilder toBuilder()`
- `CalculateTransferInstructionBuilder prune()`

