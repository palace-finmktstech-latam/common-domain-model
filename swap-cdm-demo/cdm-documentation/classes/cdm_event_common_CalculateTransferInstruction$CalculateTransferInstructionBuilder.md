# CalculateTransferInstructionBuilder

**Full Name:** `cdm.event.common.CalculateTransferInstruction$CalculateTransferInstructionBuilder`

**Package:** `cdm.event.common`

## Type: Interface

### Implemented Interfaces

- `cdm.event.common.CalculateTransferInstruction`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `CalculateTransferInstructionBuilder setDate(Date arg0)`
- `CalculateTransferInstructionBuilder setPayout(ReferenceWithMetaPayout arg0)`
- `CalculateTransferInstructionBuilder setPayoutValue(Payout arg0)`
- `CalculateTransferInstructionBuilder setQuantity(Quantity arg0)`
- `CalculateTransferInstructionBuilder setPayerReceiver(PayerReceiver arg0)`
- `CalculateTransferInstructionBuilder setResets(List arg0)`
- `CalculateTransferInstructionBuilder setTradeState(TradeState arg0)`

#### Getter Methods

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
- `CalculateTransferInstructionBuilder addResets(List arg0)`
- `CalculateTransferInstructionBuilder addResets(Reset arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculateTransferInstructionBuilder prune()`

