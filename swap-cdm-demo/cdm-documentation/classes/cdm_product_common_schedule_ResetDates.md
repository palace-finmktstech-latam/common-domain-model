# ResetDates

**Full Name:** `cdm.product.common.schedule.ResetDates`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `ResetDates build()`

#### Getter Methods

- `Class getType()`
- `MetaFields getMeta()`
- `RelativeDateOffset getFixingDates()`
- `InitialFixingDate getInitialFixingDate()`
- `ResetRelativeToEnum getResetRelativeTo()`
- `AdjustableDate getFinalFixingDate()`
- `Offset getRateCutOffDaysOffset()`
- `ResetFrequency getResetFrequency()`
- `BusinessDayAdjustments getResetDatesAdjustments()`
- `ReferenceWithMetaCalculationPeriodDates getCalculationPeriodDatesReference()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ResetDatesBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

