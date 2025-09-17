# FloatingRate

**Full Name:** `cdm.product.asset.FloatingRate`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingRateBase`

### Methods

#### Builder Methods

- `FloatingRate build()`

#### Getter Methods

- `Class getType()`
- `RateSchedule getFloatingRateMultiplierSchedule()`
- `FloatingRateCalculationParameters getCalculationParameters()`
- `FallbackRateParameters getFallbackRate()`
- `RateTreatmentEnum getRateTreatment()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingRateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

