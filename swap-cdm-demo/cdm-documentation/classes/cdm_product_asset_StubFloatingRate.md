# StubFloatingRate

**Full Name:** `cdm.product.asset.StubFloatingRate`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `StubFloatingRate build()`

#### Getter Methods

- `Class getType()`
- `Schedule getFloatingRateMultiplierSchedule()`
- `List getSpreadSchedule()`
- `List getFloorRateSchedule()`
- `List getCapRateSchedule()`
- `RateTreatmentEnum getRateTreatment()`
- `Period getIndexTenor()`
- `FloatingRateIndexEnum getFloatingRateIndex()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `StubFloatingRateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

