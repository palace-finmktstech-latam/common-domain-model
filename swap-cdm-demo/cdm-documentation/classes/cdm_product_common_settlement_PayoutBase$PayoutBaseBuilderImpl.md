# PayoutBaseBuilderImpl

**Full Name:** `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| payerReceiver | `PayerReceiverBuilder` |  |
| priceQuantity | `ResolvablePriceQuantityBuilder` |  |
| principalPayment | `PrincipalPaymentsBuilder` |  |
| settlementTerms | `SettlementTermsBuilder` |  |

### Methods

#### Builder Methods

- `PayoutBase build()`

#### Setter Methods

- `PayoutBaseBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `PayoutBaseBuilder setPayerReceiver(PayerReceiver arg0)`
- `PayoutBaseBuilder setSettlementTerms(SettlementTerms arg0)`
- `PayoutBaseBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`

#### Getter Methods

- `ResolvablePriceQuantityBuilder getPriceQuantity()`
- `SettlementTermsBuilder getOrCreateSettlementTerms()`
- `PrincipalPaymentsBuilder getPrincipalPayment()`
- `PayerReceiverBuilder getPayerReceiver()`
- `PayerReceiverBuilder getOrCreatePayerReceiver()`
- `PrincipalPaymentsBuilder getOrCreatePrincipalPayment()`
- `ResolvablePriceQuantityBuilder getOrCreatePriceQuantity()`
- `SettlementTermsBuilder getSettlementTerms()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PayoutBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PayoutBaseBuilder toBuilder()`
- `PayoutBaseBuilder prune()`

