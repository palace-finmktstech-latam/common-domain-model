# CreditDefaultPayoutBuilder

**Full Name:** `cdm.product.asset.CreditDefaultPayout$CreditDefaultPayoutBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.CreditDefaultPayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

#### Setter Methods

- `CreditDefaultPayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `CreditDefaultPayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `CreditDefaultPayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `CreditDefaultPayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `CreditDefaultPayoutBuilder setGeneralTerms(GeneralTerms arg0)`
- `CreditDefaultPayoutBuilder setProtectionTerms(List arg0)`
- `CreditDefaultPayoutBuilder setTransactedPrice(TransactedPrice arg0)`

#### Getter Methods

- `GeneralTermsBuilder getGeneralTerms()`
- `List getProtectionTerms()`
- `TransactedPriceBuilder getOrCreateTransactedPrice()`
- `ProtectionTermsBuilder getOrCreateProtectionTerms(int arg0)`
- `GeneralTermsBuilder getOrCreateGeneralTerms()`
- `TransactedPriceBuilder getTransactedPrice()`

#### Adder Methods

- `CreditDefaultPayoutBuilder addProtectionTerms(List arg0)`
- `CreditDefaultPayoutBuilder addProtectionTerms(ProtectionTerms arg0)`
- `CreditDefaultPayoutBuilder addProtectionTerms(ProtectionTerms arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CreditDefaultPayoutBuilder prune()`

