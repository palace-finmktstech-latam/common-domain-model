# CommodityPayoutBuilderImpl

**Full Name:** `cdm.product.asset.CommodityPayout$CommodityPayoutBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.CommodityPayout$CommodityPayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| averagingFeature | `AveragingCalculationBuilder` |  |
| commodityPriceReturnTerms | `CommodityPriceReturnTermsBuilder` |  |
| pricingDates | `PricingDatesBuilder` |  |
| schedule | `CalculationScheduleBuilder` |  |
| calculationPeriodDates | `CalculationPeriodDatesBuilder` |  |
| paymentDates | `PaymentDatesBuilder` |  |
| underlier | `UnderlierBuilder` |  |
| fxFeature | `FxFeatureBuilder` |  |
| delivery | `AssetDeliveryInformationBuilder` |  |

### Methods

#### Builder Methods

- `CommodityPayout build()`

#### Setter Methods

- `CommodityPayoutBuilder setUnderlier(Underlier arg0)`
- `CommodityPayoutBuilder setDelivery(AssetDeliveryInformation arg0)`
- `CommodityPayoutBuilder setSchedule(CalculationSchedule arg0)`
- `CommodityPayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `CommodityPayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `CommodityPayoutBuilder setPricingDates(PricingDates arg0)`
- `CommodityPayoutBuilder setCommodityPriceReturnTerms(CommodityPriceReturnTerms arg0)`
- `CommodityPayoutBuilder setPaymentDates(PaymentDates arg0)`
- `CommodityPayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `CommodityPayoutBuilder setCalculationPeriodDates(CalculationPeriodDates arg0)`
- `CommodityPayoutBuilder setFxFeature(FxFeature arg0)`
- `CommodityPayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `CommodityPayoutBuilder setAveragingFeature(AveragingCalculation arg0)`

#### Getter Methods

- `PricingDatesBuilder getPricingDates()`
- `UnderlierBuilder getOrCreateUnderlier()`
- `UnderlierBuilder getUnderlier()`
- `CalculationScheduleBuilder getSchedule()`
- `AssetDeliveryInformationBuilder getDelivery()`
- `CalculationScheduleBuilder getOrCreateSchedule()`
- `AssetDeliveryInformationBuilder getOrCreateDelivery()`
- `AveragingCalculationBuilder getAveragingFeature()`
- `FxFeatureBuilder getFxFeature()`
- `PricingDatesBuilder getOrCreatePricingDates()`
- `AveragingCalculationBuilder getOrCreateAveragingFeature()`
- `CommodityPriceReturnTermsBuilder getCommodityPriceReturnTerms()`
- `CommodityPriceReturnTermsBuilder getOrCreateCommodityPriceReturnTerms()`
- `PaymentDatesBuilder getPaymentDates()`
- `PaymentDatesBuilder getOrCreatePaymentDates()`
- `FxFeatureBuilder getOrCreateFxFeature()`
- `CalculationPeriodDatesBuilder getOrCreateCalculationPeriodDates()`
- `CalculationPeriodDatesBuilder getCalculationPeriodDates()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CommodityPayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CommodityPayoutBuilder toBuilder()`
- `CommodityPayoutBuilder prune()`

