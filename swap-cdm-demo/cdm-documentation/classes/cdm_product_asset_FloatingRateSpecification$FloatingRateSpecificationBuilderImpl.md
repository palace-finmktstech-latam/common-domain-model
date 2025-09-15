# FloatingRateSpecificationBuilderImpl

**Full Name:** `cdm.product.asset.FloatingRateSpecification$FloatingRateSpecificationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.asset.FloatingRate$FloatingRateBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.FloatingRateSpecification$FloatingRateSpecificationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| initialRate | `PriceBuilder` |  |
| finalRateRounding | `RoundingBuilder` |  |
| averagingMethod | `AveragingWeightingMethodEnum` |  |
| negativeInterestRateTreatment | `NegativeInterestRateTreatmentEnum` |  |

### Methods

#### Builder Methods

- `FloatingRateSpecification build()`

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
- `NegativeInterestRateTreatmentEnum getNegativeInterestRateTreatment()`
- `RoundingBuilder getOrCreateFinalRateRounding()`
- `AveragingWeightingMethodEnum getAveragingMethod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateSpecificationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FloatingRateSpecificationBuilder toBuilder()`
- `FloatingRateSpecificationBuilder prune()`

