# LimitApplicableBuilderImpl

**Full Name:** `cdm.event.workflow.LimitApplicable$LimitApplicableBuilderImpl`

**Package:** `cdm.event.workflow`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.event.workflow.LimitApplicable$LimitApplicableBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| limitType | `FieldWithMetaCreditLimitTypeEnumBuilder` |  |
| clipSize | `Integer` |  |
| amountUtilized | `BigDecimal` |  |
| utilization | `CreditLimitUtilisationBuilder` |  |
| amountRemaining | `BigDecimal` |  |
| currency | `FieldWithMetaStringBuilder` |  |
| velocity | `VelocityBuilder` |  |

### Methods

#### Builder Methods

- `LimitApplicable build()`

#### Setter Methods

- `LimitApplicableBuilder setCurrency(FieldWithMetaString arg0)`
- `LimitApplicableBuilder setLimitTypeValue(CreditLimitTypeEnum arg0)`
- `LimitApplicableBuilder setClipSize(Integer arg0)`
- `LimitApplicableBuilder setUtilization(CreditLimitUtilisation arg0)`
- `LimitApplicableBuilder setAmountUtilized(BigDecimal arg0)`
- `LimitApplicableBuilder setAmountRemaining(BigDecimal arg0)`
- `LimitApplicableBuilder setVelocity(Velocity arg0)`
- `LimitApplicableBuilder setLimitType(FieldWithMetaCreditLimitTypeEnum arg0)`
- `LimitApplicableBuilder setCurrencyValue(String arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `Integer getClipSize()`
- `BigDecimal getAmountUtilized()`
- `FieldWithMetaCreditLimitTypeEnumBuilder getLimitType()`
- `CreditLimitUtilisationBuilder getUtilization()`
- `BigDecimal getAmountRemaining()`
- `FieldWithMetaCreditLimitTypeEnumBuilder getOrCreateLimitType()`
- `VelocityBuilder getVelocity()`
- `VelocityBuilder getOrCreateVelocity()`
- `CreditLimitUtilisationBuilder getOrCreateUtilization()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `LimitApplicableBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `LimitApplicableBuilder toBuilder()`
- `LimitApplicableBuilder prune()`

