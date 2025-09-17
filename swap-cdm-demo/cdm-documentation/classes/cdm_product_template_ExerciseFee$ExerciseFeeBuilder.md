# ExerciseFeeBuilder

**Full Name:** `cdm.product.template.ExerciseFee$ExerciseFeeBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.ExerciseFee`
- `cdm.base.staticdata.party.PayerReceiver$PayerReceiverBuilder`

### Methods

#### Setter Methods

- `ExerciseFeeBuilder setFeeRate(BigDecimal arg0)`
- `ExerciseFeeBuilder setNotionalReferenceValue(Money arg0)`
- `ExerciseFeeBuilder setNotionalReference(ReferenceWithMetaMoney arg0)`
- `ExerciseFeeBuilder setFeePaymentDate(RelativeDateOffset arg0)`
- `ExerciseFeeBuilder setReceiver(CounterpartyRoleEnum arg0)`
- `ExerciseFeeBuilder setPayer(CounterpartyRoleEnum arg0)`
- `ExerciseFeeBuilder setFeeAmount(BigDecimal arg0)`

#### Getter Methods

- `RelativeDateOffsetBuilder getFeePaymentDate()`
- `RelativeDateOffsetBuilder getOrCreateFeePaymentDate()`
- `ReferenceWithMetaMoneyBuilder getNotionalReference()`
- `ReferenceWithMetaMoneyBuilder getOrCreateNotionalReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ExerciseFeeBuilder prune()`

