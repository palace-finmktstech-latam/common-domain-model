# RateScheduleBuilderImpl

**Full Name:** `cdm.product.common.schedule.RateSchedule$RateScheduleBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.RateSchedule$RateScheduleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| price | `ReferenceWithMetaPriceScheduleBuilder` |  |

### Methods

#### Builder Methods

- `RateSchedule build()`

#### Setter Methods

- `RateScheduleBuilder setPriceValue(PriceSchedule arg0)`
- `RateScheduleBuilder setPrice(ReferenceWithMetaPriceSchedule arg0)`

#### Getter Methods

- `ReferenceWithMetaPriceScheduleBuilder getOrCreatePrice()`
- `ReferenceWithMetaPriceScheduleBuilder getPrice()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RateScheduleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `RateScheduleBuilder toBuilder()`
- `RateScheduleBuilder prune()`

