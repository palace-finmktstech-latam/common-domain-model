# PaymentDetailBuilderImpl

**Full Name:** `cdm.product.common.settlement.PaymentDetail$PaymentDetailBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PaymentDetail$PaymentDetailBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| paymentDate | `AdjustableOrRelativeDateBuilder` |  |
| paymentRule | `PaymentRuleBuilder` |  |
| paymentAmount | `MoneyBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PaymentDetail build()`

#### Setter Methods

- `PaymentDetailBuilder setPaymentAmount(Money arg0)`
- `PaymentDetailBuilder setPaymentDate(AdjustableOrRelativeDate arg0)`
- `PaymentDetailBuilder setPaymentRule(PaymentRule arg0)`
- `PaymentDetailBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableOrRelativeDateBuilder getPaymentDate()`
- `PaymentRuleBuilder getOrCreatePaymentRule()`
- `MoneyBuilder getOrCreatePaymentAmount()`
- `PaymentRuleBuilder getPaymentRule()`
- `AdjustableOrRelativeDateBuilder getOrCreatePaymentDate()`
- `MoneyBuilder getPaymentAmount()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PaymentDetailBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PaymentDetailBuilder toBuilder()`
- `PaymentDetailBuilder prune()`

