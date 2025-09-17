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

- `CashflowBuilder setPayerReceiver(PayerReceiver arg0)`
- `CashflowBuilder setSettlementDate(AdjustableOrAdjustedOrRelativeDate arg0)`
- `CashflowBuilder setQuantity(NonNegativeQuantity arg0)`
- `CashflowBuilder setAsset(Asset arg0)`
- `CashflowBuilder setPaymentDiscounting(PaymentDiscounting arg0)`
- `CashflowBuilder setCashflowType(CashflowType arg0)`

#### Getter Methods

- `PayerReceiverBuilder getOrCreatePayerReceiver()`
- `PayerReceiverBuilder getPayerReceiver()`
- `CashflowTypeBuilder getOrCreateCashflowType()`
- `CashflowTypeBuilder getCashflowType()`
- `PaymentDiscountingBuilder getPaymentDiscounting()`
- `PaymentDiscountingBuilder getOrCreatePaymentDiscounting()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CashflowBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CashflowBuilder prune()`
- `CashflowBuilder toBuilder()`
- `boolean hasData()`

