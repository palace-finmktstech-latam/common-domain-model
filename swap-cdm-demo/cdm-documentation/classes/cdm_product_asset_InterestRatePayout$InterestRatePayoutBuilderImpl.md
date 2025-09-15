# InterestRatePayoutBuilderImpl

**Full Name:** `cdm.product.asset.InterestRatePayout$InterestRatePayoutBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.InterestRatePayout$InterestRatePayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| rateSpecification | `RateSpecificationBuilder` |  |
| dayCountFraction | `FieldWithMetaDayCountFractionEnumBuilder` |  |
| calculationPeriodDates | `CalculationPeriodDatesBuilder` |  |
| paymentDates | `PaymentDatesBuilder` |  |
| paymentDate | `AdjustableDateBuilder` |  |
| paymentDelay | `Boolean` |  |
| resetDates | `ResetDatesBuilder` |  |
| discountingMethod | `DiscountingMethodBuilder` |  |
| compoundingMethod | `CompoundingMethodEnum` |  |
| cashflowRepresentation | `CashflowRepresentationBuilder` |  |
| stubPeriod | `StubPeriodBuilder` |  |
| bondReference | `BondReferenceBuilder` |  |
| fixedAmount | `String` |  |
| floatingAmount | `String` |  |
| spreadCalculationMethod | `SpreadCalculationMethodEnum` |  |

### Methods

#### Builder Methods

- `InterestRatePayout build()`

#### Setter Methods

- `InterestRatePayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `InterestRatePayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `InterestRatePayoutBuilder setPaymentDate(AdjustableDate arg0)`
- `InterestRatePayoutBuilder setPaymentDates(PaymentDates arg0)`
- `InterestRatePayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `InterestRatePayoutBuilder setRateSpecification(RateSpecification arg0)`
- `InterestRatePayoutBuilder setDayCountFraction(FieldWithMetaDayCountFractionEnum arg0)`
- `InterestRatePayoutBuilder setDayCountFractionValue(DayCountFractionEnum arg0)`
- `InterestRatePayoutBuilder setCalculationPeriodDates(CalculationPeriodDates arg0)`
- `InterestRatePayoutBuilder setPaymentDelay(Boolean arg0)`
- `InterestRatePayoutBuilder setResetDates(ResetDates arg0)`
- `InterestRatePayoutBuilder setDiscountingMethod(DiscountingMethod arg0)`
- `InterestRatePayoutBuilder setCompoundingMethod(CompoundingMethodEnum arg0)`
- `InterestRatePayoutBuilder setCashflowRepresentation(CashflowRepresentation arg0)`
- `InterestRatePayoutBuilder setBondReference(BondReference arg0)`
- `InterestRatePayoutBuilder setSpreadCalculationMethod(SpreadCalculationMethodEnum arg0)`
- `InterestRatePayoutBuilder setFloatingAmount(String arg0)`
- `InterestRatePayoutBuilder setFixedAmount(String arg0)`
- `InterestRatePayoutBuilder setStubPeriod(StubPeriod arg0)`
- `InterestRatePayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`

#### Getter Methods

- `String getFloatingAmount()`
- `Boolean getPaymentDelay()`
- `ResetDatesBuilder getResetDates()`
- `DiscountingMethodBuilder getDiscountingMethod()`
- `CompoundingMethodEnum getCompoundingMethod()`
- `CashflowRepresentationBuilder getCashflowRepresentation()`
- `StubPeriodBuilder getStubPeriod()`
- `BondReferenceBuilder getBondReference()`
- `String getFixedAmount()`
- `SpreadCalculationMethodEnum getSpreadCalculationMethod()`
- `RateSpecificationBuilder getRateSpecification()`
- `AdjustableDateBuilder getPaymentDate()`
- `AdjustableDateBuilder getOrCreatePaymentDate()`
- `FieldWithMetaDayCountFractionEnumBuilder getDayCountFraction()`
- `PaymentDatesBuilder getPaymentDates()`
- `StubPeriodBuilder getOrCreateStubPeriod()`
- `BondReferenceBuilder getOrCreateBondReference()`
- `PaymentDatesBuilder getOrCreatePaymentDates()`
- `ResetDatesBuilder getOrCreateResetDates()`
- `CashflowRepresentationBuilder getOrCreateCashflowRepresentation()`
- `FieldWithMetaDayCountFractionEnumBuilder getOrCreateDayCountFraction()`
- `CalculationPeriodDatesBuilder getOrCreateCalculationPeriodDates()`
- `RateSpecificationBuilder getOrCreateRateSpecification()`
- `DiscountingMethodBuilder getOrCreateDiscountingMethod()`
- `CalculationPeriodDatesBuilder getCalculationPeriodDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InterestRatePayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `InterestRatePayoutBuilder toBuilder()`
- `InterestRatePayoutBuilder prune()`

