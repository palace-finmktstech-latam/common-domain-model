# PrincipalPaymentBuilder

**Full Name:** `cdm.product.common.settlement.PrincipalPayment$PrincipalPaymentBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PrincipalPayment`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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
- `AdjustableDateBuilder getPrincipalPaymentDate()`
- `MoneyBuilder getPrincipalAmount()`
- `MoneyBuilder getOrCreatePrincipalAmount()`
- `MoneyBuilder getPresentValuePrincipalAmount()`
- `AdjustableDateBuilder getOrCreatePrincipalPaymentDate()`
- `MoneyBuilder getOrCreatePresentValuePrincipalAmount()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PrincipalPaymentBuilder prune()`

