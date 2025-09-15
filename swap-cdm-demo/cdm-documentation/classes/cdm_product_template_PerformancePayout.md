# PerformancePayout

**Full Name:** `cdm.product.template.PerformancePayout`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PayoutBase`

### Methods

#### Builder Methods

- `PerformancePayout build()`

#### Getter Methods

- `Class getType()`
- `List getInterimValuationPrice()`
- `List getPortfolioReturnTerms()`
- `List getFinalValuationPrice()`
- `List getInitialValuationPrice()`
- `Underlier getUnderlier()`
- `List getFxFeature()`
- `ReturnTerms getReturnTerms()`
- `ObservationTerms getObservationTerms()`
- `PaymentDates getPaymentDates()`
- `ValuationDates getValuationDates()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PerformancePayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

