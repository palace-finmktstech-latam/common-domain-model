# OptionPayoutBuilderImpl

**Full Name:** `cdm.product.template.OptionPayout$OptionPayoutBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.settlement.PayoutBase$PayoutBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.OptionPayout$OptionPayoutBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| buyerSeller | `BuyerSellerBuilder` |  |
| feature | `OptionFeatureBuilder` |  |
| observationTerms | `ObservationTermsBuilder` |  |
| schedule | `CalculationScheduleBuilder` |  |
| delivery | `AssetDeliveryInformationBuilder` |  |
| underlier | `UnderlierBuilder` |  |
| optionType | `OptionTypeEnum` |  |
| exerciseTerms | `ExerciseTermsBuilder` |  |
| strike | `OptionStrikeBuilder` |  |

### Methods

#### Builder Methods

- `OptionPayout build()`

#### Setter Methods

- `OptionPayoutBuilder setUnderlier(Underlier arg0)`
- `OptionPayoutBuilder setPayerReceiver(PayerReceiver arg0)`
- `OptionPayoutBuilder setFeature(OptionFeature arg0)`
- `OptionPayoutBuilder setPriceQuantity(ResolvablePriceQuantity arg0)`
- `OptionPayoutBuilder setSettlementTerms(SettlementTerms arg0)`
- `OptionPayoutBuilder setStrike(OptionStrike arg0)`
- `OptionPayoutBuilder setExerciseTerms(ExerciseTerms arg0)`
- `OptionPayoutBuilder setDelivery(AssetDeliveryInformation arg0)`
- `OptionPayoutBuilder setBuyerSeller(BuyerSeller arg0)`
- `OptionPayoutBuilder setObservationTerms(ObservationTerms arg0)`
- `OptionPayoutBuilder setPrincipalPayment(PrincipalPayments arg0)`
- `OptionPayoutBuilder setOptionType(OptionTypeEnum arg0)`
- `OptionPayoutBuilder setSchedule(CalculationSchedule arg0)`

#### Getter Methods

- `UnderlierBuilder getOrCreateUnderlier()`
- `UnderlierBuilder getUnderlier()`
- `OptionFeatureBuilder getFeature()`
- `ObservationTermsBuilder getObservationTerms()`
- `OptionStrikeBuilder getStrike()`
- `ExerciseTermsBuilder getExerciseTerms()`
- `AssetDeliveryInformationBuilder getDelivery()`
- `BuyerSellerBuilder getOrCreateBuyerSeller()`
- `OptionFeatureBuilder getOrCreateFeature()`
- `BuyerSellerBuilder getBuyerSeller()`
- `OptionStrikeBuilder getOrCreateStrike()`
- `AssetDeliveryInformationBuilder getOrCreateDelivery()`
- `CalculationScheduleBuilder getSchedule()`
- `ExerciseTermsBuilder getOrCreateExerciseTerms()`
- `CalculationScheduleBuilder getOrCreateSchedule()`
- `ObservationTermsBuilder getOrCreateObservationTerms()`
- `OptionTypeEnum getOptionType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `OptionPayoutBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `OptionPayoutBuilder prune()`
- `OptionPayoutBuilder toBuilder()`
- `boolean hasData()`

