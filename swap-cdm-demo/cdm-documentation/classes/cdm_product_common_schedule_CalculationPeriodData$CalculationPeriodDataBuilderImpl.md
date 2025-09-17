# CalculationPeriodDataBuilderImpl

**Full Name:** `cdm.product.common.schedule.CalculationPeriodData$CalculationPeriodDataBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriodData$CalculationPeriodDataBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| startDate | `Date` |  |
| endDate | `Date` |  |
| daysInPeriod | `Integer` |  |
| daysInLeapYearPeriod | `Integer` |  |
| isFirstPeriod | `Boolean` |  |
| isLastPeriod | `Boolean` |  |

### Methods

#### Builder Methods

- `CalculationPeriodData build()`

#### Setter Methods

- `CalculationPeriodDataBuilder setEndDate(Date arg0)`
- `CalculationPeriodDataBuilder setDaysInPeriod(Integer arg0)`
- `CalculationPeriodDataBuilder setDaysInLeapYearPeriod(Integer arg0)`
- `CalculationPeriodDataBuilder setStartDate(Date arg0)`
- `CalculationPeriodDataBuilder setIsFirstPeriod(Boolean arg0)`
- `CalculationPeriodDataBuilder setIsLastPeriod(Boolean arg0)`

#### Getter Methods

- `Date getEndDate()`
- `Integer getDaysInLeapYearPeriod()`
- `Date getStartDate()`
- `Boolean getIsFirstPeriod()`
- `Integer getDaysInPeriod()`
- `Boolean getIsLastPeriod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodDataBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CalculationPeriodDataBuilder prune()`
- `CalculationPeriodDataBuilder toBuilder()`
- `boolean hasData()`

