# PerformancePayoutBuilder

**Full Name:** `cdm.product.template.PerformancePayout$PerformancePayoutBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.PerformancePayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

#### Setter Methods

- `PerformancePayoutBuilder setUnderlier(Underlier arg0)`
- `PerformancePayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `PerformancePayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `PerformancePayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `PerformancePayoutBuilder setValuationDates(ValuationDates arg0)`
- `PerformancePayoutBuilder setPaymentDates(PaymentDates arg0)`
- `PerformancePayoutBuilder setReturnTerms(ReturnTerms arg0)`
- `PerformancePayoutBuilder setFxFeature(List arg0)`
- `PerformancePayoutBuilder setPortfolioReturnTerms(List arg0)`
- `PerformancePayoutBuilder setObservationTerms(ObservationTerms arg0)`
- `PerformancePayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `PerformancePayoutBuilder setInitialValuationPriceValue(List arg0)`
- `PerformancePayoutBuilder setInterimValuationPriceValue(List arg0)`
- `PerformancePayoutBuilder setFinalValuationPriceValue(List arg0)`
- `PerformancePayoutBuilder setInitialValuationPrice(List arg0)`
- `PerformancePayoutBuilder setFinalValuationPrice(List arg0)`
- `PerformancePayoutBuilder setInterimValuationPrice(List arg0)`

#### Getter Methods

- `UnderlierBuilder getOrCreateUnderlier()`
- `UnderlierBuilder getUnderlier()`
- `ValuationDatesBuilder getValuationDates()`
- `ReturnTermsBuilder getOrCreateReturnTerms()`
- `PaymentDatesBuilder getPaymentDates()`
- `ObservationTermsBuilder getObservationTerms()`
- `PaymentDatesBuilder getOrCreatePaymentDates()`
- `ValuationDatesBuilder getOrCreateValuationDates()`
- `FxFeatureBuilder getOrCreateFxFeature(int arg0)`
- `PortfolioReturnTermsBuilder getOrCreatePortfolioReturnTerms(int arg0)`
- `List getFxFeature()`
- `ObservationTermsBuilder getOrCreateObservationTerms()`
- `ReturnTermsBuilder getReturnTerms()`
- `List getInitialValuationPrice()`
- `List getPortfolioReturnTerms()`
- `List getFinalValuationPrice()`
- `List getInterimValuationPrice()`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateInitialValuationPrice(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateInterimValuationPrice(int arg0)`
- `ReferenceWithMetaPriceScheduleBuilder getOrCreateFinalValuationPrice(int arg0)`

#### Adder Methods

- `PerformancePayoutBuilder addFxFeature(List arg0)`
- `PerformancePayoutBuilder addFxFeature(FxFeature arg0)`
- `PerformancePayoutBuilder addFxFeature(FxFeature arg0, int arg1)`
- `PerformancePayoutBuilder addPortfolioReturnTerms(PortfolioReturnTerms arg0)`
- `PerformancePayoutBuilder addPortfolioReturnTerms(List arg0)`
- `PerformancePayoutBuilder addPortfolioReturnTerms(PortfolioReturnTerms arg0, int arg1)`
- `PerformancePayoutBuilder addInitialValuationPriceValue(PriceSchedule arg0)`
- `PerformancePayoutBuilder addInitialValuationPriceValue(List arg0)`
- `PerformancePayoutBuilder addInitialValuationPriceValue(PriceSchedule arg0, int arg1)`
- `PerformancePayoutBuilder addInterimValuationPriceValue(List arg0)`
- `PerformancePayoutBuilder addInterimValuationPriceValue(PriceSchedule arg0, int arg1)`
- `PerformancePayoutBuilder addInterimValuationPriceValue(PriceSchedule arg0)`
- `PerformancePayoutBuilder addFinalValuationPriceValue(PriceSchedule arg0)`
- `PerformancePayoutBuilder addFinalValuationPriceValue(List arg0)`
- `PerformancePayoutBuilder addFinalValuationPriceValue(PriceSchedule arg0, int arg1)`
- `PerformancePayoutBuilder addFinalValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `PerformancePayoutBuilder addFinalValuationPrice(List arg0)`
- `PerformancePayoutBuilder addFinalValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `PerformancePayoutBuilder addInitialValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `PerformancePayoutBuilder addInitialValuationPrice(List arg0)`
- `PerformancePayoutBuilder addInitialValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`
- `PerformancePayoutBuilder addInterimValuationPrice(List arg0)`
- `PerformancePayoutBuilder addInterimValuationPrice(ReferenceWithMetaPriceSchedule arg0)`
- `PerformancePayoutBuilder addInterimValuationPrice(ReferenceWithMetaPriceSchedule arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PerformancePayoutBuilder prune()`

