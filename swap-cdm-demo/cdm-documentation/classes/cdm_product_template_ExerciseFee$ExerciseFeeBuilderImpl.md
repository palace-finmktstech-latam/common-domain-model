# ExerciseFeeBuilderImpl

**Full Name:** `cdm.product.template.ExerciseFee$ExerciseFeeBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.base.staticdata.party.PayerReceiver$PayerReceiverBuilderImpl`

### Implemented Interfaces

- `cdm.product.template.ExerciseFee$ExerciseFeeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| notionalReference | `ReferenceWithMetaMoneyBuilder` |  |
| feeAmount | `BigDecimal` |  |
| feeRate | `BigDecimal` |  |
| feePaymentDate | `RelativeDateOffsetBuilder` |  |

### Methods

#### Builder Methods

- `ExerciseFee build()`

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
- `BigDecimal getFeeAmount()`
- `ReferenceWithMetaMoneyBuilder getOrCreateNotionalReference()`
- `BigDecimal getFeeRate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ExerciseFeeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ExerciseFeeBuilder prune()`
- `ExerciseFeeBuilder toBuilder()`
- `boolean hasData()`

