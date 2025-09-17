# CalculationPeriodDatesBuilder

**Full Name:** `cdm.product.common.schedule.CalculationPeriodDates$CalculationPeriodDatesBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriodDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `CalculationPeriodDatesBuilder setTerminationDate(AdjustableOrRelativeDate arg0)`
- `CalculationPeriodDatesBuilder setMeta(MetaFields arg0)`
- `CalculationPeriodDatesBuilder setFirstPeriodStartDate(AdjustableOrRelativeDate arg0)`
- `CalculationPeriodDatesBuilder setStubPeriodType(StubPeriodTypeEnum arg0)`
- `CalculationPeriodDatesBuilder setLastRegularPeriodEndDate(Date arg0)`
- `CalculationPeriodDatesBuilder setCalculationPeriodFrequency(CalculationPeriodFrequency arg0)`
- `CalculationPeriodDatesBuilder setFirstCompoundingPeriodEndDate(Date arg0)`
- `CalculationPeriodDatesBuilder setCalculationPeriodDatesAdjustments(BusinessDayAdjustments arg0)`
- `CalculationPeriodDatesBuilder setFirstRegularPeriodStartDate(Date arg0)`
- `CalculationPeriodDatesBuilder setEffectiveDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableOrRelativeDateBuilder getEffectiveDate()`
- `AdjustableOrRelativeDateBuilder getTerminationDate()`
- `MetaFieldsBuilder getMeta()`
- `BusinessDayAdjustmentsBuilder getOrCreateCalculationPeriodDatesAdjustments()`
- `CalculationPeriodFrequencyBuilder getOrCreateCalculationPeriodFrequency()`
- `AdjustableOrRelativeDateBuilder getOrCreateFirstPeriodStartDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateTerminationDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateEffectiveDate()`
- `AdjustableOrRelativeDateBuilder getFirstPeriodStartDate()`
- `BusinessDayAdjustmentsBuilder getCalculationPeriodDatesAdjustments()`
- `CalculationPeriodFrequencyBuilder getCalculationPeriodFrequency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculationPeriodDatesBuilder prune()`

