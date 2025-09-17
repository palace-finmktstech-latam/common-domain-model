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
- `BusinessCenters getBusinessCenters()`
- `BusinessDayConventionEnum getBusinessDayConvention()`
- `AdjustableOrRelativeDate getFxFixingDate()`
- `ReferenceWithMetaBusinessCenters getBusinessCentersReference()`
- `DateRelativeToPaymentDates getDateRelativeToPaymentDates()`
- `DateRelativeToValuationDates getDateRelativeToValuationDates()`
- `DateRelativeToCalculationPeriodDates getDateRelativeToCalculationPeriodDates()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FxFixingDateBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

