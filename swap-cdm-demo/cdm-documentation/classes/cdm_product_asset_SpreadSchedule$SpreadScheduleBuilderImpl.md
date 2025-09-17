# SpreadScheduleBuilderImpl

**Full Name:** `cdm.product.asset.SpreadSchedule$SpreadScheduleBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.schedule.RateSchedule$RateScheduleBuilderImpl`

### Implemented Interfaces

- `cdm.product.asset.SpreadSchedule$SpreadScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| spreadScheduleType | `FieldWithMetaSpreadScheduleTypeEnumBuilder` |  |

### Methods

#### Builder Methods

- `SpreadSchedule build()`

#### Setter Methods

- `SpreadScheduleBuilder setPriceValue(PriceSchedule arg0)`
- `SpreadScheduleBuilder setSpreadScheduleType(FieldWithMetaSpreadScheduleTypeEnum arg0)`
- `SpreadScheduleBuilder setSpreadScheduleTypeValue(SpreadScheduleTypeEnum arg0)`
- `SpreadScheduleBuilder setPrice(ReferenceWithMetaPriceSchedule arg0)`

#### Getter Methods

- `FieldWithMetaSpreadScheduleTypeEnumBuilder getSpreadScheduleType()`
- `FieldWithMetaSpreadScheduleTypeEnumBuilder getOrCreateSpreadScheduleType()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `SpreadScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `SpreadScheduleBuilder prune()`
- `SpreadScheduleBuilder toBuilder()`
- `boolean hasData()`

