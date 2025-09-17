# FloatingRateProcessingDetailsBuilderImpl

**Full Name:** `cdm.product.asset.floatingrate.FloatingRateProcessingDetails$FloatingRateProcessingDetailsBuilderImpl`

**Package:** `cdm.product.asset.floatingrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingRateProcessingDetails$FloatingRateProcessingDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| rawRate | `BigDecimal` |  |
| processingParameters | `FloatingRateProcessingParametersBuilder` |  |
| processedRate | `BigDecimal` |  |
| spreadExclusiveRate | `BigDecimal` |  |

### Methods

#### Builder Methods

- `FloatingRateProcessingDetails build()`

#### Setter Methods

- `FloatingRateProcessingDetailsBuilder setRawRate(BigDecimal arg0)`
- `FloatingRateProcessingDetailsBuilder setProcessingParameters(FloatingRateProcessingParameters arg0)`
- `FloatingRateProcessingDetailsBuilder setProcessedRate(BigDecimal arg0)`
- `FloatingRateProcessingDetailsBuilder setSpreadExclusiveRate(BigDecimal arg0)`

#### Getter Methods

- `FloatingRateProcessingParametersBuilder getOrCreateProcessingParameters()`
- `BigDecimal getRawRate()`
- `FloatingRateProcessingParametersBuilder getProcessingParameters()`
- `BigDecimal getSpreadExclusiveRate()`
- `BigDecimal getProcessedRate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateProcessingDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingRateProcessingDetailsBuilder prune()`
- `FloatingRateProcessingDetailsBuilder toBuilder()`
- `boolean hasData()`

