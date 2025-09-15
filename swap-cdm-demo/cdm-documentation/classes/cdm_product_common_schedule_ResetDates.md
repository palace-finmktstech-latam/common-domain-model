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
- `ResetFrequency getResetFrequency()`
- `AdjustableDate getFinalFixingDate()`
- `Offset getRateCutOffDaysOffset()`
- `RelativeDateOffset getFixingDates()`
- `BusinessDayAdjustments getResetDatesAdjustments()`
- `InitialFixingDate getInitialFixingDate()`
- `ResetRelativeToEnum getResetRelativeTo()`
- `ReferenceWithMetaCalculationPeriodDates getCalculationPeriodDatesReference()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ResetDatesBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

