# FloatingRateBaseBuilderImpl

**Full Name:** `cdm.product.asset.FloatingRateBase$FloatingRateBaseBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.FloatingRateBase$FloatingRateBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| rateOption | `ReferenceWithMetaInterestRateIndexBuilder` |  |
| spreadSchedule | `SpreadScheduleBuilder` |  |
| capRateSchedule | `StrikeScheduleBuilder` |  |
| floorRateSchedule | `StrikeScheduleBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `FloatingRateBase build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingRateBaseBuilder prune()`
- `FloatingRateBaseBuilder toBuilder()`
- `boolean hasData()`

