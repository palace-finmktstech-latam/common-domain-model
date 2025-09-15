# LimitApplicableExtendedBuilder

**Full Name:** `cdm.event.workflow.LimitApplicableExtended$LimitApplicableExtendedBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.LimitApplicableExtended`
- `cdm.event.workflow.LimitApplicable$LimitApplicableBuilder`

### Methods

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

- `FieldWithMetaLimitLevelEnumBuilder getLimitLevel()`
- `FieldWithMetaLimitLevelEnumBuilder getOrCreateLimitLevel()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LimitApplicableExtendedBuilder prune()`

