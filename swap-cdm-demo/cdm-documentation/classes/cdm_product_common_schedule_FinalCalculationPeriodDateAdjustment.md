# FinalCalculationPeriodDateAdjustment

**Full Name:** `cdm.product.common.schedule.FinalCalculationPeriodDateAdjustment`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `FinalCalculationPeriodDateAdjustment build()`

#### Getter Methods

- `Class getType()`
- `BusinessDayConventionEnum getBusinessDayConvention()`
- `ReferenceWithMetaInterestRatePayout getSwapStreamReference()`
- `ReferenceWithMetaAdjustableOrRelativeDates getRelevantUnderlyingDateReference()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FinalCalculationPeriodDateAdjustmentBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

