# SettlementPayoutBuilderImpl

**Full Name:** `cdm.product.template.SettlementPayout$SettlementPayoutBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.SettlementPayout$SettlementPayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| underlier | `UnderlierBuilder` |  |
| deliveryTerm | `String` |  |
| delivery | `AssetDeliveryInformationBuilder` |  |
| schedule | `CalculationScheduleBuilder` |  |

### Methods

#### Builder Methods

- `SettlementPayout build()`

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
- `String getDeliveryTerm()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SettlementPayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `SettlementPayoutBuilder prune()`
- `SettlementPayoutBuilder toBuilder()`
- `boolean hasData()`

