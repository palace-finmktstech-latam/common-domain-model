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
- `StubPeriodTypeEnum getStubPeriodType()`
- `AdjustableOrRelativeDateBuilder getFirstPeriodStartDate()`
- `Date getFirstRegularPeriodStartDate()`
- `Date getFirstCompoundingPeriodEndDate()`
- `Date getLastRegularPeriodEndDate()`
- `BusinessDayAdjustmentsBuilder getCalculationPeriodDatesAdjustments()`
- `CalculationPeriodFrequencyBuilder getCalculationPeriodFrequency()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `CalculationPeriodDatesBuilder prune()`
- `CalculationPeriodDatesBuilder toBuilder()`
- `boolean hasData()`

