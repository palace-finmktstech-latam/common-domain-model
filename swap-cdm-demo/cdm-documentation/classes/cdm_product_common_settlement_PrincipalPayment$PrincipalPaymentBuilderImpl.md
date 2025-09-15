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
- `PrincipalPaymentBuilder setPresentValuePrincipalAmount(Money arg0)`
- `PrincipalPaymentBuilder setDiscountFactor(BigDecimal arg0)`
- `PrincipalPaymentBuilder setMeta(MetaFields arg0)`
- `PrincipalPaymentBuilder setPrincipalPaymentDate(AdjustableDate arg0)`
- `PrincipalPaymentBuilder setPrincipalAmount(Money arg0)`

#### Getter Methods

- `PayerReceiverBuilder getPayerReceiver()`
- `PayerReceiverBuilder getOrCreatePayerReceiver()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `MoneyBuilder getPresentValuePrincipalAmount()`
- `AdjustableDateBuilder getOrCreatePrincipalPaymentDate()`
- `MoneyBuilder getOrCreatePresentValuePrincipalAmount()`
- `BigDecimal getDiscountFactor()`
- `MetaFieldsBuilder getMeta()`
- `AdjustableDateBuilder getPrincipalPaymentDate()`
- `MoneyBuilder getOrCreatePrincipalAmount()`
- `MoneyBuilder getPrincipalAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PrincipalPaymentBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PrincipalPaymentBuilder toBuilder()`
- `PrincipalPaymentBuilder prune()`

