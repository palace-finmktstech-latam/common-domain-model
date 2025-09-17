# CommodityPayoutBuilder

**Full Name:** `cdm.product.asset.CommodityPayout$CommodityPayoutBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.CommodityPayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

#### Setter Methods

- `CommodityPayoutBuilder setUnderlier(Underlier arg0)`
- `CommodityPayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `CommodityPayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `CommodityPayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `CommodityPayoutBuilder setPaymentDates(PaymentDates arg0)`
- `CommodityPayoutBuilder setCalculationPeriodDates(CalculationPeriodDates arg0)`
- `CommodityPayoutBuilder setFxFeature(FxFeature arg0)`
- `CommodityPayoutBuilder setDelivery(AssetDeliveryInformation arg0)`
- `CommodityPayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `CommodityPayoutBuilder setSchedule(CalculationSchedule arg0)`
- `CommodityPayoutBuilder setPricingDates(PricingDates arg0)`
- `CommodityPayoutBuilder setAveragingFeature(AveragingCalculation arg0)`
- `CommodityPayoutBuilder setCommodityPriceReturnTerms(CommodityPriceReturnTerms arg0)`

#### Getter Methods

- `UnderlierBuilder getOrCreateUnderlier()`
- `UnderlierBuilder getUnderlier()`
- `CommodityPriceReturnTermsBuilder getCommodityPriceReturnTerms()`
- `AveragingCalculationBuilder getOrCreateAveragingFeature()`
- `PaymentDatesBuilder getPaymentDates()`
- `PaymentDatesBuilder getOrCreatePaymentDates()`
- `FxFeatureBuilder getOrCreateFxFeature()`
- `CalculationPeriodDatesBuilder getOrCreateCalculationPeriodDates()`
- `AssetDeliveryInformationBuilder getDelivery()`
- `AssetDeliveryInformationBuilder getOrCreateDelivery()`
- `CalculationScheduleBuilder getSchedule()`
- `CalculationScheduleBuilder getOrCreateSchedule()`
- `FxFeatureBuilder getFxFeature()`
- `AveragingCalculationBuilder getAveragingFeature()`
- `PricingDatesBuilder getOrCreatePricingDates()`
- `CalculationPeriodDatesBuilder getCalculationPeriodDates()`
- `CommodityPriceReturnTermsBuilder getOrCreateCommodityPriceReturnTerms()`
- `PricingDatesBuilder getPricingDates()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CommodityPayoutBuilder prune()`

