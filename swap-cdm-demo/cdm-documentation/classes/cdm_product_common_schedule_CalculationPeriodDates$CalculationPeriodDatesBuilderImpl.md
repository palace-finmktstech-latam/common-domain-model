# CalculationPeriodDatesBuilderImpl

**Full Name:** `cdm.product.common.schedule.CalculationPeriodDates$CalculationPeriodDatesBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriodDates$CalculationPeriodDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| effectiveDate | `AdjustableOrRelativeDateBuilder` |  |
| terminationDate | `AdjustableOrRelativeDateBuilder` |  |
| calculationPeriodDatesAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| firstPeriodStartDate | `AdjustableOrRelativeDateBuilder` |  |
| firstRegularPeriodStartDate | `Date` |  |
| firstCompoundingPeriodEndDate | `Date` |  |
| lastRegularPeriodEndDate | `Date` |  |
| stubPeriodType | `StubPeriodTypeEnum` |  |
| calculationPeriodFrequency | `CalculationPeriodFrequencyBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `CalculationPeriodDates build()`

#### Setter Methods

- `CalculationPeriodDatesBuilder setEffectiveDate(AdjustableOrRelativeDate arg0)`
- `CalculationPeriodDatesBuilder setTerminationDate(AdjustableOrRelativeDate arg0)`
- `CalculationPeriodDatesBuilder setStubPeriodType(StubPeriodTypeEnum arg0)`
- `CalculationPeriodDatesBuilder setFirstPeriodStartDate(AdjustableOrRelativeDate arg0)`
- `CalculationPeriodDatesBuilder setFirstRegularPeriodStartDate(Date arg0)`
- `CalculationPeriodDatesBuilder setFirstCompoundingPeriodEndDate(Date arg0)`
- `CalculationPeriodDatesBuilder setCalculationPeriodDatesAdjustments(BusinessDayAdjustments arg0)`
- `CalculationPeriodDatesBuilder setLastRegularPeriodEndDate(Date arg0)`
- `CalculationPeriodDatesBuilder setCalculationPeriodFrequency(CalculationPeriodFrequency arg0)`
- `CalculationPeriodDatesBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `AdjustableOrRelativeDateBuilder getFirstPeriodStartDate()`
- `StubPeriodTypeEnum getStubPeriodType()`
- `AdjustableOrRelativeDateBuilder getOrCreateTerminationDate()`
- `AdjustableOrRelativeDateBuilder getOrCreateEffectiveDate()`
- `AdjustableOrRelativeDateBuilder getEffectiveDate()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableOrRelativeDateBuilder getTerminationDate()`
- `Date getFirstRegularPeriodStartDate()`
- `Date getFirstCompoundingPeriodEndDate()`
- `BusinessDayAdjustmentsBuilder getCalculationPeriodDatesAdjustments()`
- `CalculationPeriodFrequencyBuilder getCalculationPeriodFrequency()`
- `Date getLastRegularPeriodEndDate()`
- `CalculationPeriodFrequencyBuilder getOrCreateCalculationPeriodFrequency()`
- `AdjustableOrRelativeDateBuilder getOrCreateFirstPeriodStartDate()`
- `BusinessDayAdjustmentsBuilder getOrCreateCalculationPeriodDatesAdjustments()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CalculationPeriodDatesBuilder toBuilder()`
- `CalculationPeriodDatesBuilder prune()`

