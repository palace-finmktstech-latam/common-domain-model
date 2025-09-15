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

- `CalculationPeriodBaseBuilder setAdjustedEndDate(Date arg0)`
- `CalculationPeriodBaseBuilder setAdjustedStartDate(Date arg0)`
- `CalculationPeriodBaseBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `Date getAdjustedStartDate()`
- `Date getAdjustedEndDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodBaseBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CalculationPeriodBaseBuilder toBuilder()`
- `CalculationPeriodBaseBuilder prune()`

