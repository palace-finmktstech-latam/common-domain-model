# RollFeatureBuilderImpl

**Full Name:** `cdm.product.common.settlement.RollFeature$RollFeatureBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.RollFeature$RollFeatureBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| rollSourceCalendar | `RollSourceCalendarEnum` |  |
| deliveryDateRollConvention | `OffsetBuilder` |  |

### Methods

#### Builder Methods

- `RollFeature build()`

#### Setter Methods

- `RollFeatureBuilder setRollSourceCalendar(RollSourceCalendarEnum arg0)`
- `RollFeatureBuilder setDeliveryDateRollConvention(Offset arg0)`

#### Getter Methods

- `RollSourceCalendarEnum getRollSourceCalendar()`
- `OffsetBuilder getOrCreateDeliveryDateRollConvention()`
- `OffsetBuilder getDeliveryDateRollConvention()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `RollFeatureBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `RollFeatureBuilder toBuilder()`
- `RollFeatureBuilder prune()`

