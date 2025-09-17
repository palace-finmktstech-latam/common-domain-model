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
- `String getFixedAmount()`
- `CompoundingMethodEnum getCompoundingMethod()`
- `String getFloatingAmount()`
- `Boolean getPaymentDelay()`
- `CashflowRepresentationBuilder getCashflowRepresentation()`
- `SpreadCalculationMethodEnum getSpreadCalculationMethod()`
- `AdjustableDateBuilder getPaymentDate()`
- `AdjustableDateBuilder getOrCreatePaymentDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InterestRatePayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `InterestRatePayoutBuilder prune()`
- `InterestRatePayoutBuilder toBuilder()`
- `boolean hasData()`

