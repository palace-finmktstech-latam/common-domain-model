# FloatingRateBase

**Full Name:** `cdm.product.asset.FloatingRateBase`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `FloatingRateBase build()`

#### Getter Methods

- `Class getType()`
- `ReferenceWithMetaInterestRateIndex getRateOption()`
- `MetaFields getMeta()`
- `SpreadSchedule getSpreadSchedule()`
- `StrikeSchedule getFloorRateSchedule()`
- `StrikeSchedule getCapRateSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingRateBaseBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

