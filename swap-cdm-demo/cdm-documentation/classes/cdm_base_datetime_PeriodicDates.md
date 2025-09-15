# PeriodicDates

**Full Name:** `cdm.base.datetime.PeriodicDates`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `PeriodicDates build()`

#### Getter Methods

- `Class getType()`
- `AdjustableOrRelativeDate getStartDate()`
- `AdjustableOrRelativeDate getEndDate()`
- `DayTypeEnum getDayType()`
- `BusinessDayAdjustments getPeriodDatesAdjustments()`
- `CalculationPeriodFrequency getPeriodFrequency()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PeriodicDatesBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

