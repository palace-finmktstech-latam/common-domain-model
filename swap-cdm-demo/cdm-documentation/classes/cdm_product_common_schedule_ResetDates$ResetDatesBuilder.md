# ResetDatesBuilder

**Full Name:** `cdm.product.common.schedule.ResetDates$ResetDatesBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.ResetDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ResetDatesBuilder prune()`

