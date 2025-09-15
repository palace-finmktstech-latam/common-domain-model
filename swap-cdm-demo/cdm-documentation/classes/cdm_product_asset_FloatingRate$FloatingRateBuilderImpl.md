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

- `FloatingRateBuilder setSpreadSchedule(SpreadSchedule arg0)`
- `FloatingRateBuilder setRateTreatment(RateTreatmentEnum arg0)`
- `FloatingRateBuilder setFloorRateSchedule(StrikeSchedule arg0)`
- `FloatingRateBuilder setCapRateSchedule(StrikeSchedule arg0)`
- `FloatingRateBuilder setFallbackRate(FallbackRateParameters arg0)`
- `FloatingRateBuilder setRateOptionValue(InterestRateIndex arg0)`
- `FloatingRateBuilder setRateOption(ReferenceWithMetaInterestRateIndex arg0)`
- `FloatingRateBuilder setCalculationParameters(FloatingRateCalculationParameters arg0)`
- `FloatingRateBuilder setFloatingRateMultiplierSchedule(RateSchedule arg0)`
- `FloatingRateBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FallbackRateParametersBuilder getFallbackRate()`
- `FloatingRateCalculationParametersBuilder getCalculationParameters()`
- `RateTreatmentEnum getRateTreatment()`
- `FallbackRateParametersBuilder getOrCreateFallbackRate()`
- `RateScheduleBuilder getFloatingRateMultiplierSchedule()`
- `FloatingRateCalculationParametersBuilder getOrCreateCalculationParameters()`
- `RateScheduleBuilder getOrCreateFloatingRateMultiplierSchedule()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FloatingRateBuilder toBuilder()`
- `FloatingRateBuilder prune()`

