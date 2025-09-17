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
- `Underlier getUnderlier()`
- `ValuationDates getValuationDates()`
- `PaymentDates getPaymentDates()`
- `ObservationTerms getObservationTerms()`
- `List getFxFeature()`
- `ReturnTerms getReturnTerms()`
- `List getInitialValuationPrice()`
- `List getPortfolioReturnTerms()`
- `List getFinalValuationPrice()`
- `List getInterimValuationPrice()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PerformancePayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

