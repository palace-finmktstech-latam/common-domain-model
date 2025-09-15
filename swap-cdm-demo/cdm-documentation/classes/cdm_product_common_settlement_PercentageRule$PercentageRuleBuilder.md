# PercentageRuleBuilder

**Full Name:** `cdm.product.common.settlement.PercentageRule$PercentageRuleBuilder`

**Package:** `cdm.product.common.settlement`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.settlement.PercentageRule`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PercentageRuleBuilder setNotionalAmountReferenceValue(Money arg0)`
- `PercentageRuleBuilder setPaymentPercent(BigDecimal arg0)`
- `PercentageRuleBuilder setNotionalAmountReference(ReferenceWithMetaMoney arg0)`

#### Getter Methods

- `ReferenceWithMetaMoneyBuilder getOrCreateNotionalAmountReference()`
- `ReferenceWithMetaMoneyBuilder getNotionalAmountReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PercentageRuleBuilder prune()`

