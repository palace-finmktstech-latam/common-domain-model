# InterestRatePayoutBuilder

**Full Name:** `cdm.product.asset.InterestRatePayout$InterestRatePayoutBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.InterestRatePayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

#### Setter Methods

- `InterestRatePayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `InterestRatePayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `InterestRatePayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `InterestRatePayoutBuilder setPaymentDates(PaymentDates arg0)`
- `InterestRatePayoutBuilder setRateSpecification(RateSpecification arg0)`
- `InterestRatePayoutBuilder setDayCountFraction(FieldWithMetaDayCountFractionEnum arg0)`
- `InterestRatePayoutBuilder setPaymentDelay(Boolean arg0)`
- `InterestRatePayoutBuilder setDayCountFractionValue(DayCountFractionEnum arg0)`
- `InterestRatePayoutBuilder setCompoundingMethod(CompoundingMethodEnum arg0)`
- `InterestRatePayoutBuilder setResetDates(ResetDates arg0)`
- `InterestRatePayoutBuilder setStubPeriod(StubPeriod arg0)`
- `InterestRatePayoutBuilder setCashflowRepresentation(CashflowRepresentation arg0)`
- `InterestRatePayoutBuilder setCalculationPeriodDates(CalculationPeriodDates arg0)`
- `InterestRatePayoutBuilder setBondReference(BondReference arg0)`
- `InterestRatePayoutBuilder setDiscountingMethod(DiscountingMethod arg0)`
- `InterestRatePayoutBuilder setFloatingAmount(String arg0)`
- `InterestRatePayoutBuilder setSpreadCalculationMethod(SpreadCalculationMethodEnum arg0)`
- `InterestRatePayoutBuilder setFixedAmount(String arg0)`
- `InterestRatePayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `InterestRatePayoutBuilder setPaymentDate(AdjustableDate arg0)`

#### Getter Methods

- `FieldWithMetaDayCountFractionEnumBuilder getDayCountFraction()`
- `PaymentDatesBuilder getPaymentDates()`
- `PaymentDatesBuilder getOrCreatePaymentDates()`
- `ResetDatesBuilder getOrCreateResetDates()`
- `StubPeriodBuilder getOrCreateStubPeriod()`
- `BondReferenceBuilder getOrCreateBondReference()`
- `RateSpecificationBuilder getOrCreateRateSpecification()`
- `CashflowRepresentationBuilder getOrCreateCashflowRepresentation()`
- `DiscountingMethodBuilder getOrCreateDiscountingMethod()`
- `CalculationPeriodDatesBuilder getOrCreateCalculationPeriodDates()`
- `FieldWithMetaDayCountFractionEnumBuilder getOrCreateDayCountFraction()`
- `RateSpecificationBuilder getRateSpecification()`
- `CalculationPeriodDatesBuilder getCalculationPeriodDates()`
- `StubPeriodBuilder getStubPeriod()`
- `ResetDatesBuilder getResetDates()`
- `DiscountingMethodBuilder getDiscountingMethod()`
- `BondReferenceBuilder getBondReference()`
- `CashflowRepresentationBuilder getCashflowRepresentation()`
- `AdjustableDateBuilder getPaymentDate()`
- `AdjustableDateBuilder getOrCreatePaymentDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `InterestRatePayoutBuilder prune()`

