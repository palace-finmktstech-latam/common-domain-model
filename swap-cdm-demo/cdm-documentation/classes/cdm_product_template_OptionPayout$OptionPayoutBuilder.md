# OptionPayoutBuilder

**Full Name:** `cdm.product.template.OptionPayout$OptionPayoutBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.OptionPayout`
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilder`

### Methods

#### Setter Methods

- `OptionPayoutBuilder setStrike(OptionStrike arg0)`
- `OptionPayoutBuilder setUnderlier(Underlier arg0)`
- `OptionPayoutBuilder setDelivery(AssetDeliveryInformation arg0)`
- `OptionPayoutBuilder setExerciseTerms(ExerciseTerms arg0)`
- `OptionPayoutBuilder setBuyerSeller(BuyerSeller arg0)`
- `OptionPayoutBuilder setObservationTerms(ObservationTerms arg0)`
- `OptionPayoutBuilder setSchedule(CalculationSchedule arg0)`
- `OptionPayoutBuilder setOptionType(OptionTypeEnum arg0)`
- `OptionPayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `OptionPayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `OptionPayoutBuilder setFeature(OptionFeature arg0)`
- `OptionPayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `OptionPayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`

#### Getter Methods

- `ObservationTermsBuilder getOrCreateObservationTerms()`
- `OptionStrikeBuilder getStrike()`
- `UnderlierBuilder getOrCreateUnderlier()`
- `UnderlierBuilder getUnderlier()`
- `BuyerSellerBuilder getOrCreateBuyerSeller()`
- `CalculationScheduleBuilder getSchedule()`
- `OptionStrikeBuilder getOrCreateStrike()`
- `OptionFeatureBuilder getOrCreateFeature()`
- `AssetDeliveryInformationBuilder getDelivery()`
- `ExerciseTermsBuilder getOrCreateExerciseTerms()`
- `BuyerSellerBuilder getBuyerSeller()`
- `CalculationScheduleBuilder getOrCreateSchedule()`
- `AssetDeliveryInformationBuilder getOrCreateDelivery()`
- `ExerciseTermsBuilder getExerciseTerms()`
- `OptionFeatureBuilder getFeature()`
- `ObservationTermsBuilder getObservationTerms()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `OptionPayoutBuilder prune()`

