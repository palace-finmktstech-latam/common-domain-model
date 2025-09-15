# ExerciseFeeSchedule

**Full Name:** `cdm.product.template.ExerciseFeeSchedule`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.PayerReceiver`

### Methods

#### Builder Methods

- `ExerciseFeeSchedule build()`

#### Getter Methods

- `Class getType()`
- `ReferenceWithMetaMoney getNotionalReference()`
- `AmountSchedule getFeeAmountSchedule()`
- `RelativeDateOffset getFeePaymentDate()`
- `Schedule getFeeRateSchedule()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExerciseFeeScheduleBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

