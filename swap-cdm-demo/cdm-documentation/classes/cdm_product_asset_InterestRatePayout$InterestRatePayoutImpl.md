# InterestRatePayoutImpl

**Full Name:** `cdm.product.asset.InterestRatePayout$InterestRatePayoutImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseImpl`

### Implemented Interfaces

- `cdm.product.asset.InterestRatePayout`

### Methods

#### Builder Methods

- `InterestRatePayout build()`

#### Setter Methods

- `void setBuilderFields(InterestRatePayoutBuilder arg0)`

#### Getter Methods

- `FieldWithMetaDayCountFractionEnum getDayCountFraction()`
- `PaymentDates getPaymentDates()`
- `RateSpecification getRateSpecification()`
- `CalculationPeriodDates getCalculationPeriodDates()`
- `StubPeriod getStubPeriod()`
- `ResetDates getResetDates()`
- `DiscountingMethod getDiscountingMethod()`
- `BondReference getBondReference()`
- `String getFixedAmount()`
- `CompoundingMethodEnum getCompoundingMethod()`
- `String getFloatingAmount()`
- `Boolean getPaymentDelay()`
- `CashflowRepresentation getCashflowRepresentation()`
- `SpreadCalculationMethodEnum getSpreadCalculationMethod()`
- `AdjustableDate getPaymentDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InterestRatePayoutBuilder toBuilder()`

