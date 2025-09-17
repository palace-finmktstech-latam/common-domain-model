# CalculationFrequency

**Full Name:** `cdm.base.datetime.CalculationFrequency`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `CalculationFrequency build()`

#### Getter Methods

- `Class getType()`
- `BigDecimal getDayOfMonth()`
- `DayOfWeekEnum getDayOfWeek()`
- `BigDecimal getWeekOfMonth()`
- `BigDecimal getMonthOfYear()`
- `BusinessCenterTime getDateLocation()`
- `List getBusinessCenter()`
- `Period getPeriod()`
- `BigDecimal getOffsetDays()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CalculationFrequencyBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

