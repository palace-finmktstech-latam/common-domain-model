# PaymentDetailBuilder

**Full Name:** `cdm.product.common.settlement.PaymentDetail$PaymentDetailBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PaymentDetail`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PaymentDetailBuilder prune()`

