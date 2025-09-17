# PeriodicDatesBuilder

**Full Name:** `cdm.base.datetime.PeriodicDates$PeriodicDatesBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.PeriodicDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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
- `AdjustableOrRelativeDateBuilder getEndDate()`
- `AdjustableOrRelativeDateBuilder getStartDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PeriodicDatesBuilder prune()`

