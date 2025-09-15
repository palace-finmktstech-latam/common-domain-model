# FinalCalculationPeriodDateAdjustmentBuilder

**Full Name:** `cdm.product.common.schedule.FinalCalculationPeriodDateAdjustment$FinalCalculationPeriodDateAdjustmentBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.FinalCalculationPeriodDateAdjustment`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FinalCalculationPeriodDateAdjustmentBuilder setBusinessDayConvention(BusinessDayConventionEnum arg0)`
- `FinalCalculationPeriodDateAdjustmentBuilder setSwapStreamReference(ReferenceWithMetaInterestRatePayout arg0)`
- `FinalCalculationPeriodDateAdjustmentBuilder setSwapStreamReferenceValue(InterestRatePayout arg0)`
- `FinalCalculationPeriodDateAdjustmentBuilder setRelevantUnderlyingDateReferenceValue(AdjustableOrRelativeDates arg0)`
- `FinalCalculationPeriodDateAdjustmentBuilder setRelevantUnderlyingDateReference(ReferenceWithMetaAdjustableOrRelativeDates arg0)`

#### Getter Methods

- `ReferenceWithMetaInterestRatePayoutBuilder getSwapStreamReference()`
- `ReferenceWithMetaInterestRatePayoutBuilder getOrCreateSwapStreamReference()`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder getRelevantUnderlyingDateReference()`
- `ReferenceWithMetaAdjustableOrRelativeDatesBuilder getOrCreateRelevantUnderlyingDateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FinalCalculationPeriodDateAdjustmentBuilder prune()`

