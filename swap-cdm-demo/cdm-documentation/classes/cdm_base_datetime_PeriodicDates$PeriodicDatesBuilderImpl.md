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

- `PeriodicDatesBuilder setPeriodDatesAdjustments(BusinessDayAdjustments arg0)`
- `PeriodicDatesBuilder setPeriodFrequency(CalculationPeriodFrequency arg0)`
- `PeriodicDatesBuilder setDayType(DayTypeEnum arg0)`
- `PeriodicDatesBuilder setEndDate(AdjustableOrRelativeDate arg0)`
- `PeriodicDatesBuilder setStartDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `CalculationPeriodFrequencyBuilder getPeriodFrequency()`
- `BusinessDayAdjustmentsBuilder getPeriodDatesAdjustments()`
- `AdjustableOrRelativeDateBuilder getOrCreateEndDate()`
- `CalculationPeriodFrequencyBuilder getOrCreatePeriodFrequency()`
- `AdjustableOrRelativeDateBuilder getOrCreateStartDate()`
- `BusinessDayAdjustmentsBuilder getOrCreatePeriodDatesAdjustments()`
- `DayTypeEnum getDayType()`
- `AdjustableOrRelativeDateBuilder getEndDate()`
- `AdjustableOrRelativeDateBuilder getStartDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PeriodicDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PeriodicDatesBuilder prune()`
- `PeriodicDatesBuilder toBuilder()`
- `boolean hasData()`

