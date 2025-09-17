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
- `Underlier getUnderlier()`
- `CommodityPriceReturnTerms getCommodityPriceReturnTerms()`
- `PaymentDates getPaymentDates()`
- `AssetDeliveryInformation getDelivery()`
- `CalculationSchedule getSchedule()`
- `FxFeature getFxFeature()`
- `AveragingCalculation getAveragingFeature()`
- `CalculationPeriodDates getCalculationPeriodDates()`
- `PricingDates getPricingDates()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CommodityPayoutBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

