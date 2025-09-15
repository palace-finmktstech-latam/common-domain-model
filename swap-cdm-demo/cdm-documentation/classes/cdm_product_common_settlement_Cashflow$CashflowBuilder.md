# CashflowBuilder

**Full Name:** `cdm.product.common.settlement.Cashflow$CashflowBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.Cashflow`
- `cdm.product.common.settlement.AssetFlowBase$AssetFlowBaseBuilder`

### Methods

#### Setter Methods

- `CashflowBuilder setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)`
- `CashflowBuilder setQuantity(NonNegativeQuantity arg0)`
- `CashflowBuilder setPayerReceiver(PayerReceiver arg0)`
- `CashflowBuilder setCashflowType(CashflowType arg0)`
- `CashflowBuilder setAsset(Asset arg0)`
- `CashflowBuilder setPaymentDiscounting(PaymentDiscounting arg0)`

#### Getter Methods

- `PayerReceiverBuilder getPayerReceiver()`
- `PayerReceiverBuilder getOrCreatePayerReceiver()`
- `PaymentDiscountingBuilder getOrCreatePaymentDiscounting()`
- `CashflowTypeBuilder getCashflowType()`
- `CashflowTypeBuilder getOrCreateCashflowType()`
- `PaymentDiscountingBuilder getPaymentDiscounting()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CashflowBuilder prune()`

