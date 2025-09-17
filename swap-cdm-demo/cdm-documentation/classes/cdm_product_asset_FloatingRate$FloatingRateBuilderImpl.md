# FloatingRateBuilderImpl

**Full Name:** `cdm.product.asset.FloatingRate$FloatingRateBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.asset.FloatingRateBase$FloatingRateBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.FloatingRate$FloatingRateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRateMultiplierSchedule | `RateScheduleBuilder` |  |
| rateTreatment | `RateTreatmentEnum` |  |
| calculationParameters | `FloatingRateCalculationParametersBuilder` |  |
| fallbackRate | `FallbackRateParametersBuilder` |  |

### Methods

#### Builder Methods

- `FloatingRate build()`

#### Setter Methods

- `FloatingRateBuilder setMeta(MetaFields arg0)`
- `FloatingRateBuilder setCapRateSchedule(StrikeSchedule arg0)`
- `FloatingRateBuilder setRateTreatment(RateTreatmentEnum arg0)`
- `FloatingRateBuilder setFloorRateSchedule(StrikeSchedule arg0)`
- `FloatingRateBuilder setSpreadSchedule(SpreadSchedule arg0)`
- `FloatingRateBuilder setFallbackRate(FallbackRateParameters arg0)`
- `FloatingRateBuilder setRateOptionValue(InterestRateIndex arg0)`
- `FloatingRateBuilder setCalculationParameters(FloatingRateCalculationParameters arg0)`
- `FloatingRateBuilder setRateOption(ReferenceWithMetaInterestRateIndex arg0)`
- `FloatingRateBuilder setFloatingRateMultiplierSchedule(RateSchedule arg0)`

#### Getter Methods

- `FallbackRateParametersBuilder getOrCreateFallbackRate()`
- `RateScheduleBuilder getOrCreateFloatingRateMultiplierSchedule()`
- `FloatingRateCalculationParametersBuilder getOrCreateCalculationParameters()`
- `RateScheduleBuilder getFloatingRateMultiplierSchedule()`
- `FloatingRateCalculationParametersBuilder getCalculationParameters()`
- `FallbackRateParametersBuilder getFallbackRate()`
- `RateTreatmentEnum getRateTreatment()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingRateBuilder prune()`
- `FloatingRateBuilder toBuilder()`
- `boolean hasData()`

