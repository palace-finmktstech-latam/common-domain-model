# FloatingRateProcessingParametersBuilderImpl

**Full Name:** `cdm.product.asset.floatingrate.FloatingRateProcessingParameters$FloatingRateProcessingParametersBuilderImpl`

**Package:** `cdm.product.asset.floatingrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingRateProcessingParameters$FloatingRateProcessingParametersBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| initialRate | `PriceBuilder` |  |
| multiplier | `BigDecimal` |  |
| spread | `BigDecimal` |  |
| treatment | `RateTreatmentEnum` |  |
| capRate | `BigDecimal` |  |
| floorRate | `BigDecimal` |  |
| rounding | `RoundingBuilder` |  |
| negativeTreatment | `NegativeInterestRateTreatmentEnum` |  |

### Methods

#### Builder Methods

- `FloatingRateProcessingParameters build()`

#### Setter Methods

- `FloatingRateProcessingParametersBuilder setMultiplier(BigDecimal arg0)`
- `FloatingRateProcessingParametersBuilder setRounding(Rounding arg0)`
- `FloatingRateProcessingParametersBuilder setFloorRate(BigDecimal arg0)`
- `FloatingRateProcessingParametersBuilder setInitialRate(Price arg0)`
- `FloatingRateProcessingParametersBuilder setSpread(BigDecimal arg0)`
- `FloatingRateProcessingParametersBuilder setCapRate(BigDecimal arg0)`
- `FloatingRateProcessingParametersBuilder setTreatment(RateTreatmentEnum arg0)`
- `FloatingRateProcessingParametersBuilder setNegativeTreatment(NegativeInterestRateTreatmentEnum arg0)`

#### Getter Methods

- `BigDecimal getMultiplier()`
- `PriceBuilder getInitialRate()`
- `RoundingBuilder getOrCreateRounding()`
- `RoundingBuilder getRounding()`
- `BigDecimal getFloorRate()`
- `PriceBuilder getOrCreateInitialRate()`
- `BigDecimal getSpread()`
- `BigDecimal getCapRate()`
- `RateTreatmentEnum getTreatment()`
- `NegativeInterestRateTreatmentEnum getNegativeTreatment()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateProcessingParametersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FloatingRateProcessingParametersBuilder toBuilder()`
- `FloatingRateProcessingParametersBuilder prune()`

