# PaymentDates

**Full Name:** `cdm.product.common.schedule.PaymentDates`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `PaymentDates build()`

#### Getter Methods

- `Class getType()`
- `Frequency getPaymentFrequency()`
- `Date getFirstPaymentDate()`
- `PayRelativeToEnum getPayRelativeTo()`
- `PaymentDateSchedule getPaymentDateSchedule()`
- `BusinessDayAdjustments getPaymentDatesAdjustments()`
- `Date getLastRegularPaymentDate()`
- `Offset getPaymentDaysOffset()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `PaymentDatesBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

