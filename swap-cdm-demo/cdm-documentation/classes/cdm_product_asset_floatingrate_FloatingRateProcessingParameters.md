# FloatingRateProcessingParameters

**Full Name:** `cdm.product.asset.floatingrate.FloatingRateProcessingParameters`

**Package:** `cdm.product.asset.floatingrate`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `FloatingRateProcessingParameters build()`

#### Getter Methods

- `Class getType()`
- `BigDecimal getMultiplier()`
- `RateTreatmentEnum getTreatment()`
- `BigDecimal getFloorRate()`
- `Rounding getRounding()`
- `NegativeInterestRateTreatmentEnum getNegativeTreatment()`
- `Price getInitialRate()`
- `BigDecimal getCapRate()`
- `BigDecimal getSpread()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingRateProcessingParametersBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

