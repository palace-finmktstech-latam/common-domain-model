# CalculationFrequencyBuilder

**Full Name:** `cdm.base.datetime.CalculationFrequency$CalculationFrequencyBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.CalculationFrequency`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `BusinessCenterTimeBuilder getDateLocation()`
- `BusinessCenterTimeBuilder getOrCreateDateLocation()`
- `PeriodBuilder getPeriod()`
- `PeriodBuilder getOrCreatePeriod()`

#### Adder Methods

- `CalculationFrequencyBuilder addBusinessCenter(List arg0)`
- `CalculationFrequencyBuilder addBusinessCenter(BusinessCenterEnum arg0, int arg1)`
- `CalculationFrequencyBuilder addBusinessCenter(BusinessCenterEnum arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculationFrequencyBuilder prune()`

