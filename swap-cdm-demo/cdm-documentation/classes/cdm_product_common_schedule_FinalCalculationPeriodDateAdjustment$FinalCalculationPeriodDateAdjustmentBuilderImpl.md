# FinalCalculationPeriodDateAdjustmentBuilderImpl

**Full Name:** `cdm.product.common.schedule.FinalCalculationPeriodDateAdjustment$FinalCalculationPeriodDateAdjustmentBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.FinalCalculationPeriodDateAdjustment$FinalCalculationPeriodDateAdjustmentBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| relevantUnderlyingDateReference | `ReferenceWithMetaAdjustableOrRelativeDatesBuilder` |  |
| swapStreamReference | `ReferenceWithMetaInterestRatePayoutBuilder` |  |
| businessDayConvention | `BusinessDayConventionEnum` |  |

### Methods

#### Builder Methods

- `FinalCalculationPeriodDateAdjustment build()`

#### Setter Methods

- `FinalCalculationPeriodDateAdjustmentBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `FinalCalculationPeriodDateAdjustmentBuilder setSwapStreamReference(ReferenceWithMetaInterestRatePayout arg0)`
- `FinalCalculationPeriodDateAdjustmentBuilder setSwapStreamReferenceValue(InterestRatePayout arg0)`
- `FinalCalculationPeriodDateAdjustmentBuilder setRelevantUnderlyingDateReferenceValue(AdjustableOrRelativeDates arg0)`
- `FinalCalculationPeriodDateAdjustmentBuilder setRelevantUnderlyingDateReference(ReferenceWithMetaAdjustableOrRelativeDates arg0)`

#### Getter Methods

- `BusinessDayConventionEnum getBusinessDayConvention()`
- `ReferenceWithMetaInterestRatePayoutBuilder getSwapStreamReference()`
- `ReferenceWithMetaInterestRatePayoutBuilder getOrCreateSwapStreamReference()`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder getRelevantUnderlyingDateReference()`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder getOrCreateRelevantUnderlyingDateReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FinalCalculationPeriodDateAdjustmentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FinalCalculationPeriodDateAdjustmentBuilder toBuilder()`
- `FinalCalculationPeriodDateAdjustmentBuilder prune()`

