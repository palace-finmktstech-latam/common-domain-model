# FxFixingDate

**Full Name:** `cdm.product.common.settlement.FxFixingDate`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.Offset`

### Methods

#### Builder Methods

- `FxFixingDate build()`

#### Getter Methods

- `Class getType()`
- `BusinessDayConventionEnum getBusinessDayConvention()`
- `BusinessCenters getBusinessCenters()`
- `AdjustableOrRelativeDate getFxFixingDate()`
- `DateRelativeToValuationDates getDateRelativeToValuationDates()`
- `DateRelativeToPaymentDates getDateRelativeToPaymentDates()`
- `DateRelativeToCalculationPeriodDates getDateRelativeToCalculationPeriodDates()`
- `ReferenceWithMetaBusinessCenters getBusinessCentersReference()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FxFixingDateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

