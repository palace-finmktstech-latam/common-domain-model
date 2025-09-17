# PrincipalPaymentBuilderImpl

**Full Name:** `cdm.product.common.settlement.PrincipalPayment$PrincipalPaymentBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PrincipalPayment$PrincipalPaymentBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| principalPaymentDate | `AdjustableDateBuilder` |  |
| payerReceiver | `PayerReceiverBuilder` |  |
| principalAmount | `MoneyBuilder` |  |
| discountFactor | `BigDecimal` |  |
| presentValuePrincipalAmount | `MoneyBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PrincipalPayment build()`

#### Setter Methods

- `PrincipalPaymentBuilder setPayerReceiver(PayerReceiver arg0)`
- `PrincipalPaymentBuilder setMeta(MetaFields arg0)`
- `PrincipalPaymentBuilder setDiscountFactor(BigDecimal arg0)`
- `PrincipalPaymentBuilder setPrincipalAmount(Money arg0)`
- `PrincipalPaymentBuilder setPrincipalPaymentDate(AdjustableDate arg0)`
- `PrincipalPaymentBuilder setPresentValuePrincipalAmount(Money arg0)`

#### Getter Methods

- `PayerReceiverBuilder getOrCreatePayerReceiver()`
- `PayerReceiverBuilder getPayerReceiver()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `BigDecimal getDiscountFactor()`
- `AdjustableDateBuilder getPrincipalPaymentDate()`
- `MoneyBuilder getPrincipalAmount()`
- `MoneyBuilder getOrCreatePrincipalAmount()`
- `MoneyBuilder getPresentValuePrincipalAmount()`
- `AdjustableDateBuilder getOrCreatePrincipalPaymentDate()`
- `MoneyBuilder getOrCreatePresentValuePrincipalAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PrincipalPaymentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PrincipalPaymentBuilder prune()`
- `PrincipalPaymentBuilder toBuilder()`
- `boolean hasData()`

