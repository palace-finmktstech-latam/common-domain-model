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
- `AdjustableOrRelativeDate getEffectiveDate()`
- `AdjustableOrRelativeDate getTerminationDate()`
- `MetaFields getMeta()`
- `StubPeriodTypeEnum getStubPeriodType()`
- `AdjustableOrRelativeDate getFirstPeriodStartDate()`
- `Date getFirstRegularPeriodStartDate()`
- `Date getFirstCompoundingPeriodEndDate()`
- `Date getLastRegularPeriodEndDate()`
- `BusinessDayAdjustments getCalculationPeriodDatesAdjustments()`
- `CalculationPeriodFrequency getCalculationPeriodFrequency()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `CalculationPeriodDatesBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

