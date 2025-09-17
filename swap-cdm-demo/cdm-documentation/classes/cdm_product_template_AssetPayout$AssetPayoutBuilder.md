# AssetPayoutBuilder

**Full Name:** `cdm.product.template.AssetPayout$AssetPayoutBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.AssetPayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

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
- `MoneyBuilder getMinimumFee()`

#### Adder Methods

- `AssetPayoutBuilder addAssetLeg(AssetLeg arg0)`
- `AssetPayoutBuilder addAssetLeg(AssetLeg arg0, int arg1)`
- `AssetPayoutBuilder addAssetLeg(List arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `AssetPayoutBuilder prune()`

