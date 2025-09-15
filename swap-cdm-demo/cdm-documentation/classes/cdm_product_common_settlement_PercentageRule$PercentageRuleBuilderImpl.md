# PercentageRuleBuilderImpl

**Full Name:** `cdm.product.common.settlement.PercentageRule$PercentageRuleBuilderImpl`

**Package:** `cdm.product.common.settlement`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.settlement.PercentageRule$PercentageRuleBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| paymentPercent | `BigDecimal` |  |
| notionalAmountReference | `ReferenceWithMetaMoneyBuilder` |  |

### Methods

#### Builder Methods

- `PercentageRule build()`

#### Setter Methods

- `PercentageRuleBuilder setNotionalAmountReferenceValue(Money arg0)`
- `PercentageRuleBuilder setPaymentPercent(BigDecimal arg0)`
- `PercentageRuleBuilder setNotionalAmountReference(ReferenceWithMetaMoney arg0)`

#### Getter Methods

- `ReferenceWithMetaMoneyBuilder getOrCreateNotionalAmountReference()`
- `BigDecimal getPaymentPercent()`
- `ReferenceWithMetaMoneyBuilder getNotionalAmountReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PercentageRuleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PercentageRuleBuilder toBuilder()`
- `PercentageRuleBuilder prune()`

