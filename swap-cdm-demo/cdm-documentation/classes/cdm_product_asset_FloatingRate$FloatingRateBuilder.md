# FloatingRateBuilder

**Full Name:** `cdm.product.asset.FloatingRate$FloatingRateBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingRate`
- `cdm.product.asset.FloatingRateBase$FloatingRateBaseBuilder`

### Methods

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

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateBuilder prune()`

