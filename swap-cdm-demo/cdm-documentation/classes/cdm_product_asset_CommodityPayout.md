# CommodityPayout

**Full Name:** `cdm.product.asset.CommodityPayout`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PayoutBase`

### Methods

#### Builder Methods

- `CommodityPayout build()`

#### Getter Methods

- `Class getType()`
- `PricingDates getPricingDates()`
- `Underlier getUnderlier()`
- `CalculationSchedule getSchedule()`
- `AssetDeliveryInformation getDelivery()`
- `AveragingCalculation getAveragingFeature()`
- `FxFeature getFxFeature()`
- `CommodityPriceReturnTerms getCommodityPriceReturnTerms()`
- `PaymentDates getPaymentDates()`
- `CalculationPeriodDates getCalculationPeriodDates()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CommodityPayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

