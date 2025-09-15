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

- `FixedRateSpecificationBuilder setRateSchedule(RateSchedule arg0)`
- `FixedRateSpecificationBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `RateScheduleBuilder getRateSchedule()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `RateScheduleBuilder getOrCreateRateSchedule()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FixedRateSpecificationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FixedRateSpecificationBuilder toBuilder()`
- `FixedRateSpecificationBuilder prune()`

