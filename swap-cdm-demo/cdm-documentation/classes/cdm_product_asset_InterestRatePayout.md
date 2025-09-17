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

- `void process(RosettaPath arg0, Processor arg1)`
- `InterestRatePayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

