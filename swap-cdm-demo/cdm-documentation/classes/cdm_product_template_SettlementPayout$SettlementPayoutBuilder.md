# SettlementPayoutBuilder

**Full Name:** `cdm.product.template.SettlementPayout$SettlementPayoutBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.SettlementPayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

#### Setter Methods

- `SettlementPayoutBuilder setUnderlier(Underlier arg0)`
- `SettlementPayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `SettlementPayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `SettlementPayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `SettlementPayoutBuilder setDelivery(AssetDeliveryInformation arg0)`
- `SettlementPayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `SettlementPayoutBuilder setSchedule(CalculationSchedule arg0)`
- `SettlementPayoutBuilder setDeliveryTerm(String arg0)`

#### Getter Methods

- `UnderlierBuilder getOrCreateUnderlier()`
- `UnderlierBuilder getUnderlier()`
- `AssetDeliveryInformationBuilder getDelivery()`
- `AssetDeliveryInformationBuilder getOrCreateDelivery()`
- `CalculationScheduleBuilder getSchedule()`
- `CalculationScheduleBuilder getOrCreateSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SettlementPayoutBuilder prune()`

