# SpreadScheduleBuilder

**Full Name:** `cdm.product.asset.SpreadSchedule$SpreadScheduleBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.SpreadSchedule`
- `cdm.product.common.schedule.RateSchedule$RateScheduleBuilder`

### Methods

#### Setter Methods

- `SpreadScheduleBuilder setPriceValue(PriceSchedule arg0)`
- `SpreadScheduleBuilder setSpreadScheduleType(FieldWithMetaSpreadScheduleTypeEnum arg0)`
- `SpreadScheduleBuilder setSpreadScheduleTypeValue(SpreadScheduleTypeEnum arg0)`
- `SpreadScheduleBuilder setPrice(ReferenceWithMetaPriceSchedule arg0)`

#### Getter Methods

- `FieldWithMetaSpreadScheduleTypeEnumBuilder getSpreadScheduleType()`
- `FieldWithMetaSpreadScheduleTypeEnumBuilder getOrCreateSpreadScheduleType()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `SpreadScheduleBuilder prune()`

