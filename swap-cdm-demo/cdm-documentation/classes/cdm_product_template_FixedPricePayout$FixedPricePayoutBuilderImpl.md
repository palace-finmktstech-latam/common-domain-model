# FixedPricePayoutBuilderImpl

**Full Name:** `cdm.product.template.FixedPricePayout$FixedPricePayoutBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.FixedPricePayout$FixedPricePayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| paymentDates | `PaymentDatesBuilder` |  |
| fixedPrice | `FixedPriceBuilder` |  |
| schedule | `CalculationScheduleBuilder` |  |

### Methods

#### Builder Methods

- `FixedPricePayout build()`

#### Setter Methods

- `FixedPricePayoutBuilder setSchedule(CalculationSchedule arg0)`
- `FixedPricePayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `FixedPricePayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `FixedPricePayoutBuilder setFixedPrice(FixedPrice arg0)`
- `FixedPricePayoutBuilder setPaymentDates(PaymentDates arg0)`
- `FixedPricePayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `FixedPricePayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`

#### Getter Methods

- `CalculationScheduleBuilder getSchedule()`
- `CalculationScheduleBuilder getOrCreateSchedule()`
- `FixedPriceBuilder getFixedPrice()`
- `FixedPriceBuilder getOrCreateFixedPrice()`
- `PaymentDatesBuilder getPaymentDates()`
- `PaymentDatesBuilder getOrCreatePaymentDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FixedPricePayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FixedPricePayoutBuilder toBuilder()`
- `FixedPricePayoutBuilder prune()`

