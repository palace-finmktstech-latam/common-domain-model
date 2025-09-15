# CashflowBuilderImpl

**Full Name:** `cdm.product.common.settlement.Cashflow$CashflowBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.AssetFlowBase$AssetFlowBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.common.settlement.Cashflow$CashflowBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| payerReceiver | `PayerReceiverBuilder` |  |
| cashflowType | `CashflowTypeBuilder` |  |
| paymentDiscounting | `PaymentDiscountingBuilder` |  |

### Methods

#### Builder Methods

- `Cashflow build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CashflowBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CashflowBuilder toBuilder()`
- `CashflowBuilder prune()`

