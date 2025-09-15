# PeriodicDatesBuilderImpl

**Full Name:** `cdm.base.datetime.PeriodicDates$PeriodicDatesBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.PeriodicDates$PeriodicDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| startDate | `AdjustableOrRelativeDateBuilder` |  |
| endDate | `AdjustableOrRelativeDateBuilder` |  |
| periodFrequency | `CalculationPeriodFrequencyBuilder` |  |
| periodDatesAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| dayType | `DayTypeEnum` |  |

### Methods

#### Builder Methods

- `PeriodicDates build()`

#### Setter Methods

- `PeriodicDatesBuilder setStartDate(AdjustableOrRelativeDate arg0)`
- `PeriodicDatesBuilder setEndDate(AdjustableOrRelativeDate arg0)`
- `PeriodicDatesBuilder setDayType(DayTypeEnum arg0)`
- `PeriodicDatesBuilder setPeriodDatesAdjustments(BusinessDayAdjustments arg0)`
- `PeriodicDatesBuilder setPeriodFrequency(CalculationPeriodFrequency arg0)`

#### Getter Methods

- `AdjustableOrRelativeDateBuilder getStartDate()`
- `AdjustableOrRelativeDateBuilder getEndDate()`
- `DayTypeEnum getDayType()`
- `BusinessDayAdjustmentsBuilder getPeriodDatesAdjustments()`
- `CalculationPeriodFrequencyBuilder getPeriodFrequency()`
- `CalculationPeriodFrequencyBuilder getOrCreatePeriodFrequency()`
- `AdjustableOrRelativeDateBuilder getOrCreateEndDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateStartDate()`
- `BusinessDayAdjustmentsBuilder getOrCreatePeriodDatesAdjustments()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PeriodicDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PeriodicDatesBuilder toBuilder()`
- `PeriodicDatesBuilder prune()`

