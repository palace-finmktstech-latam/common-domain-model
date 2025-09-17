# FixedPricePayoutBuilder

**Full Name:** `cdm.product.template.FixedPricePayout$FixedPricePayoutBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.FixedPricePayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

#### Setter Methods

- `FixedPricePayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `FixedPricePayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `FixedPricePayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `FixedPricePayoutBuilder setPaymentDates(PaymentDates arg0)`
- `FixedPricePayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `FixedPricePayoutBuilder setSchedule(CalculationSchedule arg0)`
- `FixedPricePayoutBuilder setFixedPrice(FixedPrice arg0)`

#### Getter Methods

- `PaymentDatesBuilder getPaymentDates()`
- `PaymentDatesBuilder getOrCreatePaymentDates()`
- `CalculationScheduleBuilder getSchedule()`
- `CalculationScheduleBuilder getOrCreateSchedule()`
- `FixedPriceBuilder getFixedPrice()`
- `FixedPriceBuilder getOrCreateFixedPrice()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FixedPricePayoutBuilder prune()`

