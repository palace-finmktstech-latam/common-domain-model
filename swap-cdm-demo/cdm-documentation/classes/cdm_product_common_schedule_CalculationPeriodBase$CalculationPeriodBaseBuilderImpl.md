# CalculationPeriodBaseBuilderImpl

**Full Name:** `cdm.product.common.schedule.CalculationPeriodBase$CalculationPeriodBaseBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriodBase$CalculationPeriodBaseBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| adjustedStartDate | `Date` |  |
| adjustedEndDate | `Date` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `CalculationPeriodBase build()`

#### Setter Methods

- `CalculationPeriodBaseBuilder setMeta(MetaFields arg0)`
- `CalculationPeriodBaseBuilder setAdjustedStartDate(Date arg0)`
- `CalculationPeriodBaseBuilder setAdjustedEndDate(Date arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `Date getAdjustedEndDate()`
- `Date getAdjustedStartDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CalculationPeriodBaseBuilder prune()`
- `CalculationPeriodBaseBuilder toBuilder()`
- `boolean hasData()`

