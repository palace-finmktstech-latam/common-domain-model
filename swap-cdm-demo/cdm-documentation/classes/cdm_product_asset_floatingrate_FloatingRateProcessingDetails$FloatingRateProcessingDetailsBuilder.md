# FloatingRateProcessingDetailsBuilder

**Full Name:** `cdm.product.asset.floatingrate.FloatingRateProcessingDetails$FloatingRateProcessingDetailsBuilder`

**Package:** `cdm.product.asset.floatingrate`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingRateProcessingDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingRateProcessingDetailsBuilder setRawRate(BigDecimal arg0)`
- `FloatingRateProcessingDetailsBuilder setProcessingParameters(FloatingRateProcessingParameters arg0)`
- `FloatingRateProcessingDetailsBuilder setProcessedRate(BigDecimal arg0)`
- `FloatingRateProcessingDetailsBuilder setSpreadExclusiveRate(BigDecimal arg0)`

#### Getter Methods

- `FloatingRateProcessingParametersBuilder getOrCreateProcessingParameters()`
- `FloatingRateProcessingParametersBuilder getProcessingParameters()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateProcessingDetailsBuilder prune()`

