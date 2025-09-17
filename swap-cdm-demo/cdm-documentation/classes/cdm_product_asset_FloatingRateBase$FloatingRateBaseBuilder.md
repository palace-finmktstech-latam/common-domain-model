# FloatingRateBaseBuilder

**Full Name:** `cdm.product.asset.FloatingRateBase$FloatingRateBaseBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FloatingRateBase`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `FloatingRateBaseBuilder setMeta(MetaFields arg0)`
- `FloatingRateBaseBuilder setCapRateSchedule(StrikeSchedule arg0)`
- `FloatingRateBaseBuilder setFloorRateSchedule(StrikeSchedule arg0)`
- `FloatingRateBaseBuilder setSpreadSchedule(SpreadSchedule arg0)`
- `FloatingRateBaseBuilder setRateOptionValue(InterestRateIndex arg0)`
- `FloatingRateBaseBuilder setRateOption(ReferenceWithMetaInterestRateIndex arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `ReferenceWithMetaInterestRateIndexBuilder getRateOption()`
- `MetaFieldsBuilder getMeta()`
- `StrikeScheduleBuilder getOrCreateCapRateSchedule()`
- `SpreadScheduleBuilder getOrCreateSpreadSchedule()`
- `ReferenceWithMetaInterestRateIndexBuilder getOrCreateRateOption()`
- `StrikeScheduleBuilder getOrCreateFloorRateSchedule()`
- `SpreadScheduleBuilder getSpreadSchedule()`
- `StrikeScheduleBuilder getFloorRateSchedule()`
- `StrikeScheduleBuilder getCapRateSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateBaseBuilder prune()`

