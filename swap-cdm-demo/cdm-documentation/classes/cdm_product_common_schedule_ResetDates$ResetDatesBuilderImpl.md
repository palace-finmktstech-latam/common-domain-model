# ResetDatesBuilderImpl

**Full Name:** `cdm.product.common.schedule.ResetDates$ResetDatesBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.ResetDates$ResetDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationPeriodDatesReference | `ReferenceWithMetaCalculationPeriodDatesBuilder` |  |
| resetRelativeTo | `ResetRelativeToEnum` |  |
| initialFixingDate | `InitialFixingDateBuilder` |  |
| fixingDates | `RelativeDateOffsetBuilder` |  |
| finalFixingDate | `AdjustableDateBuilder` |  |
| rateCutOffDaysOffset | `OffsetBuilder` |  |
| resetFrequency | `ResetFrequencyBuilder` |  |
| resetDatesAdjustments | `BusinessDayAdjustmentsBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `ResetDates build()`

#### Setter Methods

- `ResetDatesBuilder setMeta(MetaFields arg0)`
- `ResetDatesBuilder setResetDatesAdjustments(BusinessDayAdjustments arg0)`
- `ResetDatesBuilder setInitialFixingDate(InitialFixingDate arg0)`
- `ResetDatesBuilder setFinalFixingDate(AdjustableDate arg0)`
- `ResetDatesBuilder setResetRelativeTo(ResetRelativeToEnum arg0)`
- `ResetDatesBuilder setRateCutOffDaysOffset(Offset arg0)`
- `ResetDatesBuilder setFixingDates(RelativeDateOffset arg0)`
- `ResetDatesBuilder setResetFrequency(ResetFrequency arg0)`
- `ResetDatesBuilder setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)`
- `ResetDatesBuilder setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `RelativeDateOffsetBuilder getFixingDates()`
- `InitialFixingDateBuilder getInitialFixingDate()`
- `ResetRelativeToEnum getResetRelativeTo()`
- `AdjustableDateBuilder getFinalFixingDate()`
- `OffsetBuilder getRateCutOffDaysOffset()`
- `ResetFrequencyBuilder getResetFrequency()`
- `BusinessDayAdjustmentsBuilder getResetDatesAdjustments()`
- `AdjustableDateBuilder getOrCreateFinalFixingDate()`
- `RelativeDateOffsetBuilder getOrCreateFixingDates()`
- `ResetFrequencyBuilder getOrCreateResetFrequency()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder getOrCreateCalculationPeriodDatesReference()`
- `InitialFixingDateBuilder getOrCreateInitialFixingDate()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder getCalculationPeriodDatesReference()`
- `BusinessDayAdjustmentsBuilder getOrCreateResetDatesAdjustments()`
- `OffsetBuilder getOrCreateRateCutOffDaysOffset()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ResetDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ResetDatesBuilder prune()`
- `ResetDatesBuilder toBuilder()`
- `boolean hasData()`

