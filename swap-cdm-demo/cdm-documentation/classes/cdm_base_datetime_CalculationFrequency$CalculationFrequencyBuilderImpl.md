# CalculationFrequencyBuilderImpl

**Full Name:** `cdm.base.datetime.CalculationFrequency$CalculationFrequencyBuilderImpl`

**Package:** `cdm.base.datetime`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.base.datetime.CalculationFrequency$CalculationFrequencyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| period | `PeriodBuilder` |  |
| monthOfYear | `BigDecimal` |  |
| dayOfMonth | `BigDecimal` |  |
| dayOfWeek | `DayOfWeekEnum` |  |
| weekOfMonth | `BigDecimal` |  |
| offsetDays | `BigDecimal` |  |
| dateLocation | `BusinessCenterTimeBuilder` |  |
| businessCenter | `java.util.List<cdm.base.datetime.BusinessCenterEnum>` |  |

### Methods

#### Builder Methods

- `CalculationFrequency build()`

#### Setter Methods

- `CalculationFrequencyBuilder setDayOfMonth(BigDecimal arg0)`
- `CalculationFrequencyBuilder setDayOfWeek(DayOfWeekEnum arg0)`
- `CalculationFrequencyBuilder setMonthOfYear(BigDecimal arg0)`
- `CalculationFrequencyBuilder setWeekOfMonth(BigDecimal arg0)`
- `CalculationFrequencyBuilder setDateLocation(BusinessCenterTime arg0)`
- `CalculationFrequencyBuilder setBusinessCenter(List arg0)`
- `CalculationFrequencyBuilder setPeriod(Period arg0)`
- `CalculationFrequencyBuilder setOffsetDays(BigDecimal arg0)`

#### Getter Methods

- `BigDecimal getDayOfMonth()`
- `DayOfWeekEnum getDayOfWeek()`
- `BigDecimal getWeekOfMonth()`
- `BigDecimal getMonthOfYear()`
- `BusinessCenterTimeBuilder getDateLocation()`
- `BusinessCenterTimeBuilder getOrCreateDateLocation()`
- `List getBusinessCenter()`
- `PeriodBuilder getPeriod()`
- `BigDecimal getOffsetDays()`
- `PeriodBuilder getOrCreatePeriod()`

#### Adder Methods

- `CalculationFrequencyBuilder addBusinessCenter(BusinessCenterEnum arg0, int arg1)`
- `CalculationFrequencyBuilder addBusinessCenter(BusinessCenterEnum arg0)`
- `CalculationFrequencyBuilder addBusinessCenter(List arg0)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationFrequencyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CalculationFrequencyBuilder prune()`
- `CalculationFrequencyBuilder toBuilder()`
- `boolean hasData()`

