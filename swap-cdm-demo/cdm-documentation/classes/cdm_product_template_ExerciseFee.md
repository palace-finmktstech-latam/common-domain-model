# ExerciseFee

**Full Name:** `cdm.product.template.ExerciseFee`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.base.staticdata.party.PayerReceiver`

### Methods

#### Builder Methods

- `ExerciseFee build()`

#### Getter Methods

- `Class getType()`
- `BigDecimal getFeeRate()`
- `ReferenceWithMetaMoney getNotionalReference()`
- `RelativeDateOffset getFeePaymentDate()`
- `BigDecimal getFeeAmount()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExerciseFeeBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

