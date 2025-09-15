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

- `CalculationPeriodDataBuilder setStartDate(Date arg0)`
- `CalculationPeriodDataBuilder setDaysInLeapYearPeriod(Integer arg0)`
- `CalculationPeriodDataBuilder setDaysInPeriod(Integer arg0)`
- `CalculationPeriodDataBuilder setIsLastPeriod(Boolean arg0)`
- `CalculationPeriodDataBuilder setIsFirstPeriod(Boolean arg0)`
- `CalculationPeriodDataBuilder setEndDate(Date arg0)`

#### Getter Methods

- `Date getStartDate()`
- `Integer getDaysInPeriod()`
- `Integer getDaysInLeapYearPeriod()`
- `Boolean getIsFirstPeriod()`
- `Boolean getIsLastPeriod()`
- `Date getEndDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodDataBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CalculationPeriodDataBuilder toBuilder()`
- `CalculationPeriodDataBuilder prune()`

