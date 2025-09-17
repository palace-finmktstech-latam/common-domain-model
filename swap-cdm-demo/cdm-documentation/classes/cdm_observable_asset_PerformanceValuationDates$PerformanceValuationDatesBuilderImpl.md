# PerformanceValuationDatesBuilderImpl

**Full Name:** `cdm.observable.asset.PerformanceValuationDates$PerformanceValuationDatesBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.PerformanceValuationDates$PerformanceValuationDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| determinationMethod | `DeterminationMethodEnum` |  |
| valuationDates | `AdjustableRelativeOrPeriodicDatesBuilder` |  |
| valuationDate | `AdjustableOrRelativeDateBuilder` |  |
| valuationTime | `BusinessCenterTimeBuilder` |  |
| valuationTimeType | `TimeTypeEnum` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PerformanceValuationDates build()`

#### Setter Methods

- `PerformanceValuationDatesBuilder setValuationDates(AdjustableRelativeOrPeriodicDates arg0)`
- `PerformanceValuationDatesBuilder setDeterminationMethod(DeterminationMethodEnum arg0)`
- `PerformanceValuationDatesBuilder setMeta(MetaFields arg0)`
- `PerformanceValuationDatesBuilder setValuationTime(BusinessCenterTime arg0)`
- `PerformanceValuationDatesBuilder setValuationTimeType(TimeTypeEnum arg0)`
- `PerformanceValuationDatesBuilder setValuationDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableRelativeOrPeriodicDatesBuilder getValuationDates()`
- `BusinessCenterTimeBuilder getValuationTime()`
- `TimeTypeEnum getValuationTimeType()`
- `AdjustableOrRelativeDateBuilder getValuationDate()`
- `DeterminationMethodEnum getDeterminationMethod()`
- `MetaFieldsBuilder getMeta()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateValuationDates()`
- `BusinessCenterTimeBuilder getOrCreateValuationTime()`
- `AdjustableOrRelativeDateBuilder getOrCreateValuationDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PerformanceValuationDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PerformanceValuationDatesBuilder prune()`
- `PerformanceValuationDatesBuilder toBuilder()`
- `boolean hasData()`

