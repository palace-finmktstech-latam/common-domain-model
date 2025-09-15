# CalculationPeriodDates

**Full Name:** `cdm.product.common.schedule.CalculationPeriodDates`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `CalculationPeriodDates build()`

#### Getter Methods

- `Class getType()`
- `AdjustableOrRelativeDate getFirstPeriodStartDate()`
- `StubPeriodTypeEnum getStubPeriodType()`
- `AdjustableOrRelativeDate getEffectiveDate()`
- `AdjustableOrRelativeDate getTerminationDate()`
- `Date getFirstRegularPeriodStartDate()`
- `Date getFirstCompoundingPeriodEndDate()`
- `BusinessDayAdjustments getCalculationPeriodDatesAdjustments()`
- `CalculationPeriodFrequency getCalculationPeriodFrequency()`
- `Date getLastRegularPeriodEndDate()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CalculationPeriodDatesBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

