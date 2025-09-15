# FeaturePaymentBuilderImpl

**Full Name:** `cdm.observable.event.FeaturePayment$FeaturePaymentBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.FeaturePayment$FeaturePaymentBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| payerReceiver | `PartyReferencePayerReceiverBuilder` |  |
| levelPercentage | `BigDecimal` |  |
| amount | `BigDecimal` |  |
| time | `TimeTypeEnum` |  |
| currency | `FieldWithMetaStringBuilder` |  |
| paymentDate | `AdjustableOrRelativeDateBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `FeaturePayment build()`

#### Setter Methods

- `FeaturePaymentBuilder setCurrency(FieldWithMetaString arg0)`
- `FeaturePaymentBuilder setTime(TimeTypeEnum arg0)`
- `FeaturePaymentBuilder setLevelPercentage(BigDecimal arg0)`
- `FeaturePaymentBuilder setPayerReceiver(PartyReferencePayerReceiver arg0)`
- `FeaturePaymentBuilder setPaymentDate(AdjustableOrRelativeDate arg0)`
- `FeaturePaymentBuilder setCurrencyValue(String arg0)`
- `FeaturePaymentBuilder setAmount(BigDecimal arg0)`
- `FeaturePaymentBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `TimeTypeEnum getTime()`
- `BigDecimal getLevelPercentage()`
- `PartyReferencePayerReceiverBuilder getPayerReceiver()`
- `PartyReferencePayerReceiverBuilder getOrCreatePayerReceiver()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`
- `AdjustableOrRelativeDateBuilder getPaymentDate()`
- `AdjustableOrRelativeDateBuilder getOrCreatePaymentDate()`
- `MetaFieldsBuilder getMeta()`
- `BigDecimal getAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FeaturePaymentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FeaturePaymentBuilder toBuilder()`
- `FeaturePaymentBuilder prune()`

