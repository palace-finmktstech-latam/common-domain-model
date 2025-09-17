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
- `CalculationPeriodFrequency getPeriodFrequency()`
- `BusinessDayAdjustments getPeriodDatesAdjustments()`
- `DayTypeEnum getDayType()`
- `AdjustableOrRelativeDate getEndDate()`
- `AdjustableOrRelativeDate getStartDate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PeriodicDatesBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

