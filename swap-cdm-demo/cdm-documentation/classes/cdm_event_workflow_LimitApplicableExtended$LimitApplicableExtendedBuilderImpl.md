# LimitApplicableExtendedBuilderImpl

**Full Name:** `cdm.event.workflow.LimitApplicableExtended$LimitApplicableExtendedBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.event.workflow.LimitApplicable$LimitApplicableBuilderImpl`

### Implemented Interfaces

- `cdm.event.workflow.LimitApplicableExtended$LimitApplicableExtendedBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| limitLevel | `FieldWithMetaLimitLevelEnumBuilder` |  |
| limitAmount | `BigDecimal` |  |
| limitImpactDueToTrade | `BigDecimal` |  |

### Methods

#### Builder Methods

- `LimitApplicableExtended build()`

#### Setter Methods

- `LimitApplicableExtendedBuilder setCurrency(FieldWithMetaString arg0)`
- `LimitApplicableExtendedBuilder setLimitTypeValue(CreditLimitTypeEnum arg0)`
- `LimitApplicableExtendedBuilder setClipSize(Integer arg0)`
- `LimitApplicableExtendedBuilder setUtilization(CreditLimitUtilisation arg0)`
- `LimitApplicableExtendedBuilder setAmountUtilized(BigDecimal arg0)`
- `LimitApplicableExtendedBuilder setAmountRemaining(BigDecimal arg0)`
- `LimitApplicableExtendedBuilder setVelocity(Velocity arg0)`
- `LimitApplicableExtendedBuilder setLimitLevel(FieldWithMetaLimitLevelEnum arg0)`
- `LimitApplicableExtendedBuilder setLimitImpactDueToTrade(BigDecimal arg0)`
- `LimitApplicableExtendedBuilder setLimitType(FieldWithMetaCreditLimitTypeEnum arg0)`
- `LimitApplicableExtendedBuilder setLimitAmount(BigDecimal arg0)`
- `LimitApplicableExtendedBuilder setLimitLevelValue(LimitLevelEnum arg0)`
- `LimitApplicableExtendedBuilder setCurrencyValue(String arg0)`

#### Getter Methods

- `BigDecimal getLimitImpactDueToTrade()`
- `BigDecimal getLimitAmount()`
- `FieldWithMetaLimitLevelEnumBuilder getLimitLevel()`
- `FieldWithMetaLimitLevelEnumBuilder getOrCreateLimitLevel()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LimitApplicableExtendedBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `LimitApplicableExtendedBuilder toBuilder()`
- `LimitApplicableExtendedBuilder prune()`

