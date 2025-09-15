# PayoutBaseBuilder

**Full Name:** `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PayoutBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PayoutBaseBuilder prune()`

