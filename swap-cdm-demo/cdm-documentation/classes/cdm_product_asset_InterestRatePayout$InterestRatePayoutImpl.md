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

- `String getFloatingAmount()`
- `Boolean getPaymentDelay()`
- `ResetDates getResetDates()`
- `DiscountingMethod getDiscountingMethod()`
- `CompoundingMethodEnum getCompoundingMethod()`
- `CashflowRepresentation getCashflowRepresentation()`
- `StubPeriod getStubPeriod()`
- `BondReference getBondReference()`
- `String getFixedAmount()`
- `SpreadCalculationMethodEnum getSpreadCalculationMethod()`
- `RateSpecification getRateSpecification()`
- `AdjustableDate getPaymentDate()`
- `FieldWithMetaDayCountFractionEnum getDayCountFraction()`
- `PaymentDates getPaymentDates()`
- `CalculationPeriodDates getCalculationPeriodDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `InterestRatePayoutBuilder toBuilder()`

