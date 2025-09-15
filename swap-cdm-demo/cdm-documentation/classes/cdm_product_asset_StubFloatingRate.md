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
- `List getFloorRateSchedule()`
- `List getSpreadSchedule()`
- `List getCapRateSchedule()`
- `RateTreatmentEnum getRateTreatment()`
- `FloatingRateIndexEnum getFloatingRateIndex()`
- `Period getIndexTenor()`
- `Schedule getFloatingRateMultiplierSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `StubFloatingRateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

