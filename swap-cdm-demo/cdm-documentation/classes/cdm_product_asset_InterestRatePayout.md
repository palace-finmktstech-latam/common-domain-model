# InterestRatePayout

**Full Name:** `cdm.product.asset.InterestRatePayout`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PayoutBase`

### Methods

#### Builder Methods

- `InterestRatePayout build()`

#### Getter Methods

- `Class getType()`
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

- `void process(RosettaPath arg0, Processor arg1)`
- `InterestRatePayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

