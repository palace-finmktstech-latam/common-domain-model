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
- `FallbackRateParameters getFallbackRate()`
- `FloatingRateCalculationParameters getCalculationParameters()`
- `RateTreatmentEnum getRateTreatment()`
- `RateSchedule getFloatingRateMultiplierSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingRateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

