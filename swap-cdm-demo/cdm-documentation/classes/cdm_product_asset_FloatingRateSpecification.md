# FloatingRateSpecification

**Full Name:** `cdm.product.asset.FloatingRateSpecification`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingRate`

### Methods

#### Builder Methods

- `FloatingRateSpecification build()`

#### Getter Methods

- `Class getType()`
- `Rounding getFinalRateRounding()`
- `Price getInitialRate()`
- `NegativeInterestRateTreatmentEnum getNegativeInterestRateTreatment()`
- `AveragingWeightingMethodEnum getAveragingMethod()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingRateSpecificationBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

