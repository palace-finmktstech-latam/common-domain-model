# FloatingRateSpecificationBuilder

**Full Name:** `cdm.product.asset.FloatingRateSpecification$FloatingRateSpecificationBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingRateSpecification`
- `cdm.product.asset.FloatingRate$FloatingRateBuilder`

### Methods

#### Setter Methods

- `FloatingRateSpecificationBuilder setAveragingMethod(AveragingWeightingMethodEnum arg0)`
- `FloatingRateSpecificationBuilder setSpreadSchedule(SpreadSchedule arg0)`
- `FloatingRateSpecificationBuilder setRateTreatment(RateTreatmentEnum arg0)`
- `FloatingRateSpecificationBuilder setFloorRateSchedule(StrikeSchedule arg0)`
- `FloatingRateSpecificationBuilder setCapRateSchedule(StrikeSchedule arg0)`
- `FloatingRateSpecificationBuilder setFallbackRate(FallbackRateParameters arg0)`
- `FloatingRateSpecificationBuilder setRateOptionValue(InterestRateIndex arg0)`
- `FloatingRateSpecificationBuilder setInitialRate(Price arg0)`
- `FloatingRateSpecificationBuilder setRateOption(ReferenceWithMetaInterestRateIndex arg0)`
- `FloatingRateSpecificationBuilder setCalculationParameters(FloatingRateCalculationParameters arg0)`
- `FloatingRateSpecificationBuilder setFinalRateRounding(Rounding arg0)`
- `FloatingRateSpecificationBuilder setFloatingRateMultiplierSchedule(RateSchedule arg0)`
- `FloatingRateSpecificationBuilder setNegativeInterestRateTreatment(NegativeInterestRateTreatmentEnum arg0)`
- `FloatingRateSpecificationBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `RoundingBuilder getFinalRateRounding()`
- `PriceBuilder getInitialRate()`
- `PriceBuilder getOrCreateInitialRate()`
- `RoundingBuilder getOrCreateFinalRateRounding()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateSpecificationBuilder prune()`

