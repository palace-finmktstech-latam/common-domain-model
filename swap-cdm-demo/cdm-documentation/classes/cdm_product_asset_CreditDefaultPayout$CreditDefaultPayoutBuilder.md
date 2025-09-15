# CreditDefaultPayoutBuilder

**Full Name:** `cdm.product.asset.CreditDefaultPayout$CreditDefaultPayoutBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.CreditDefaultPayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

#### Setter Methods

- `CreditDefaultPayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `CreditDefaultPayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `CreditDefaultPayoutBuilder setProtectionTerms(List arg0)`
- `CreditDefaultPayoutBuilder setTransactedPrice(TransactedPrice arg0)`
- `CreditDefaultPayoutBuilder setGeneralTerms(GeneralTerms arg0)`
- `CreditDefaultPayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `CreditDefaultPayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`

#### Getter Methods

- `TransactedPriceBuilder getTransactedPrice()`
- `GeneralTermsBuilder getGeneralTerms()`
- `GeneralTermsBuilder getOrCreateGeneralTerms()`
- `ProtectionTermsBuilder getOrCreateProtectionTerms(int arg0)`
- `TransactedPriceBuilder getOrCreateTransactedPrice()`
- `List getProtectionTerms()`

#### Adder Methods

- `CreditDefaultPayoutBuilder addProtectionTerms(List arg0)`
- `CreditDefaultPayoutBuilder addProtectionTerms(ProtectionTerms arg0, int arg1)`
- `CreditDefaultPayoutBuilder addProtectionTerms(ProtectionTerms arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditDefaultPayoutBuilder prune()`

