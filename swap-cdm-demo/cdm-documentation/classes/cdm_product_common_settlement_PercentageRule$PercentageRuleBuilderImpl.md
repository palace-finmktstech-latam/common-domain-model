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

- `PercentageRuleBuilder setNotionalAmountReference(ReferenceWithMetaMoney arg0)`
- `PercentageRuleBuilder setPaymentPercent(BigDecimal arg0)`
- `PercentageRuleBuilder setNotionalAmountReferenceValue(Money arg0)`

#### Getter Methods

- `BigDecimal getPaymentPercent()`
- `ReferenceWithMetaMoneyBuilder getNotionalAmountReference()`
- `ReferenceWithMetaMoneyBuilder getOrCreateNotionalAmountReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PercentageRuleBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `PercentageRuleBuilder prune()`
- `PercentageRuleBuilder toBuilder()`
- `boolean hasData()`

