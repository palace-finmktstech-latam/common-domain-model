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
- `RelativeDateOffset getFeePaymentDate()`
- `ReferenceWithMetaMoney getNotionalReference()`
- `BigDecimal getFeeAmount()`
- `BigDecimal getFeeRate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `ExerciseFeeBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

