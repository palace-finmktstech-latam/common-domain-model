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

- `PaymentDetailBuilder setMeta(MetaFields arg0)`
- `PaymentDetailBuilder setPaymentAmount(Money arg0)`
- `PaymentDetailBuilder setPaymentDate(AdjustableOrRelativeDate arg0)`
- `PaymentDetailBuilder setPaymentRule(PaymentRule arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `PaymentRuleBuilder getOrCreatePaymentRule()`
- `AdjustableOrRelativeDateBuilder getPaymentDate()`
- `PaymentRuleBuilder getPaymentRule()`
- `MoneyBuilder getPaymentAmount()`
- `AdjustableOrRelativeDateBuilder getOrCreatePaymentDate()`
- `MoneyBuilder getOrCreatePaymentAmount()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PaymentDetailBuilder prune()`

