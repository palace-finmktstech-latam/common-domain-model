# AssetPayoutBuilderImpl

**Full Name:** `cdm.product.template.AssetPayout$AssetPayoutBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.AssetPayout$AssetPayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| assetLeg | `java.util.List<cdm.product.template.AssetLeg$AssetLegBuilder>` |  |
| underlier | `AssetBuilder` |  |
| minimumFee | `MoneyBuilder` |  |
| dividendTerms | `DividendTermsBuilder` |  |
| tradeType | `AssetPayoutTradeTypeEnum` |  |

### Methods

#### Builder Methods

- `AssetPayout build()`

#### Setter Methods

- `AssetPayoutBuilder setUnderlier(Asset arg0)`
- `AssetPayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `AssetPayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `AssetPayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `AssetPayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `AssetPayoutBuilder setAssetLeg(List arg0)`
- `AssetPayoutBuilder setTradeType(AssetPayoutTradeTypeEnum arg0)`
- `AssetPayoutBuilder setDividendTerms(DividendTerms arg0)`
- `AssetPayoutBuilder setMinimumFee(Money arg0)`

#### Getter Methods

- `AssetBuilder getOrCreateUnderlier()`
- `AssetBuilder getUnderlier()`
- `AssetLegBuilder getOrCreateAssetLeg(int arg0)`
- `DividendTermsBuilder getOrCreateDividendTerms()`
- `MoneyBuilder getOrCreateMinimumFee()`
- `List getAssetLeg()`
- `DividendTermsBuilder getDividendTerms()`
- `AssetPayoutTradeTypeEnum getTradeType()`
- `MoneyBuilder getMinimumFee()`

#### Adder Methods

- `AssetPayoutBuilder addAssetLeg(AssetLeg arg0)`
- `AssetPayoutBuilder addAssetLeg(AssetLeg arg0, int arg1)`
- `AssetPayoutBuilder addAssetLeg(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `AssetPayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `AssetPayoutBuilder prune()`
- `AssetPayoutBuilder toBuilder()`
- `boolean hasData()`

