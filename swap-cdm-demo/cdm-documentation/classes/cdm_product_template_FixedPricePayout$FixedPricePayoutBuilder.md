# FixedPricePayoutBuilder

**Full Name:** `cdm.product.template.FixedPricePayout$FixedPricePayoutBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.FixedPricePayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FixedPricePayoutBuilder prune()`

