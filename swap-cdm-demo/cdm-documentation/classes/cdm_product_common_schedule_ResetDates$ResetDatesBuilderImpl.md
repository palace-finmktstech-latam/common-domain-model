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

- `ResetDatesBuilder setInitialFixingDate(InitialFixingDate arg0)`
- `ResetDatesBuilder setFinalFixingDate(AdjustableDate arg0)`
- `ResetDatesBuilder setRateCutOffDaysOffset(Offset arg0)`
- `ResetDatesBuilder setResetRelativeTo(ResetRelativeToEnum arg0)`
- `ResetDatesBuilder setFixingDates(RelativeDateOffset arg0)`
- `ResetDatesBuilder setResetDatesAdjustments(BusinessDayAdjustments arg0)`
- `ResetDatesBuilder setResetFrequency(ResetFrequency arg0)`
- `ResetDatesBuilder setCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates arg0)`
- `ResetDatesBuilder setCalculationPeriodDatesReferenceValue(CalculationPeriodDates arg0)`
- `ResetDatesBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `ResetFrequencyBuilder getResetFrequency()`
- `AdjustableDateBuilder getFinalFixingDate()`
- `OffsetBuilder getRateCutOffDaysOffset()`
- `RelativeDateOffsetBuilder getFixingDates()`
- `BusinessDayAdjustmentsBuilder getResetDatesAdjustments()`
- `InitialFixingDateBuilder getInitialFixingDate()`
- `ResetRelativeToEnum getResetRelativeTo()`
- `RelativeDateOffsetBuilder getOrCreateFixingDates()`
- `ResetFrequencyBuilder getOrCreateResetFrequency()`
- `AdjustableDateBuilder getOrCreateFinalFixingDate()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder getCalculationPeriodDatesReference()`
- `InitialFixingDateBuilder getOrCreateInitialFixingDate()`
- `ReferenceWithMetaCalculationPeriodDatesBuilder getOrCreateCalculationPeriodDatesReference()`
- `OffsetBuilder getOrCreateRateCutOffDaysOffset()`
- `BusinessDayAdjustmentsBuilder getOrCreateResetDatesAdjustments()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ResetDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ResetDatesBuilder toBuilder()`
- `ResetDatesBuilder prune()`

