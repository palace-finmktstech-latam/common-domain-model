# FloatingRateProcessingParametersBuilder

**Full Name:** `cdm.product.asset.floatingrate.FloatingRateProcessingParameters$FloatingRateProcessingParametersBuilder`

**Package:** `cdm.product.asset.floatingrate`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingRateProcessingParameters`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingRateProcessingParametersBuilder setMultiplier(BigDecimal arg0)`
- `FloatingRateProcessingParametersBuilder setTreatment(RateTreatmentEnum arg0)`
- `FloatingRateProcessingParametersBuilder setInitialRate(Price arg0)`
- `FloatingRateProcessingParametersBuilder setFloorRate(BigDecimal arg0)`
- `FloatingRateProcessingParametersBuilder setRounding(Rounding arg0)`
- `FloatingRateProcessingParametersBuilder setNegativeTreatment(NegativeInterestRateTreatmentEnum arg0)`
- `FloatingRateProcessingParametersBuilder setSpread(BigDecimal arg0)`
- `FloatingRateProcessingParametersBuilder setCapRate(BigDecimal arg0)`

#### Getter Methods

- `PriceBuilder getOrCreateInitialRate()`
- `RoundingBuilder getOrCreateRounding()`
- `RoundingBuilder getRounding()`
- `PriceBuilder getInitialRate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateProcessingParametersBuilder prune()`

