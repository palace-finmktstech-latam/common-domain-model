# FixedRateSpecificationBuilderImpl

**Full Name:** `cdm.product.asset.FixedRateSpecification$FixedRateSpecificationBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.FixedRateSpecification$FixedRateSpecificationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| rateSchedule | `RateScheduleBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `FixedRateSpecification build()`

#### Setter Methods

- `FixedRateSpecificationBuilder setMeta(MetaFields arg0)`
- `FixedRateSpecificationBuilder setRateSchedule(RateSchedule arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `RateScheduleBuilder getOrCreateRateSchedule()`
- `RateScheduleBuilder getRateSchedule()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FixedRateSpecificationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FixedRateSpecificationBuilder prune()`
- `FixedRateSpecificationBuilder toBuilder()`
- `boolean hasData()`

