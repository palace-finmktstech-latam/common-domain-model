# PeriodicDatesBuilder

**Full Name:** `cdm.base.datetime.PeriodicDates$PeriodicDatesBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.PeriodicDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PeriodicDatesBuilder setStartDate(AdjustableOrRelativeDate arg0)`
- `PeriodicDatesBuilder setEndDate(AdjustableOrRelativeDate arg0)`
- `PeriodicDatesBuilder setDayType(DayTypeEnum arg0)`
- `PeriodicDatesBuilder setPeriodDatesAdjustments(BusinessDayAdjustments arg0)`
- `PeriodicDatesBuilder setPeriodFrequency(CalculationPeriodFrequency arg0)`

#### Getter Methods

- `AdjustableOrRelativeDateBuilder getStartDate()`
- `AdjustableOrRelativeDateBuilder getEndDate()`
- `BusinessDayAdjustmentsBuilder getPeriodDatesAdjustments()`
- `CalculationPeriodFrequencyBuilder getPeriodFrequency()`
- `CalculationPeriodFrequencyBuilder getOrCreatePeriodFrequency()`
- `AdjustableOrRelativeDateBuilder getOrCreateEndDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateStartDate()`
- `BusinessDayAdjustmentsBuilder getOrCreatePeriodDatesAdjustments()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PeriodicDatesBuilder prune()`

