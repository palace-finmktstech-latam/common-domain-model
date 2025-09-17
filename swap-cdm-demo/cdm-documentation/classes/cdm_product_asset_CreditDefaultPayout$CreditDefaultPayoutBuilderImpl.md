# CreditDefaultPayoutBuilderImpl

**Full Name:** `cdm.product.asset.CreditDefaultPayout$CreditDefaultPayoutBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.CreditDefaultPayout$CreditDefaultPayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| generalTerms | `GeneralTermsBuilder` |  |
| protectionTerms | `java.util.List<cdm.product.asset.ProtectionTerms$ProtectionTermsBuilder>` |  |
| transactedPrice | `TransactedPriceBuilder` |  |

### Methods

#### Builder Methods

- `CreditDefaultPayout build()`

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
- `CreditDefaultPayoutBuilder addProtectionTerms(ProtectionTerms arg0, int arg1)`
- `CreditDefaultPayoutBuilder addProtectionTerms(ProtectionTerms arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CreditDefaultPayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CreditDefaultPayoutBuilder prune()`
- `CreditDefaultPayoutBuilder toBuilder()`
- `boolean hasData()`

