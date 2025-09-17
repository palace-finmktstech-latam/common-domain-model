# LimitApplicableBuilder

**Full Name:** `cdm.event.workflow.LimitApplicable$LimitApplicableBuilder`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `cdm.event.workflow.LimitApplicable`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `LimitApplicableBuilder setCurrency(FieldWithMetaString arg0)`
- `LimitApplicableBuilder setCurrencyValue(String arg0)`
- `LimitApplicableBuilder setClipSize(Integer arg0)`
- `LimitApplicableBuilder setUtilization(CreditLimitUtilisation arg0)`
- `LimitApplicableBuilder setLimitTypeValue(CreditLimitTypeEnum arg0)`
- `LimitApplicableBuilder setVelocity(Velocity arg0)`
- `LimitApplicableBuilder setAmountUtilized(BigDecimal arg0)`
- `LimitApplicableBuilder setLimitType(FieldWithMetaCreditLimitTypeEnum arg0)`
- `LimitApplicableBuilder setAmountRemaining(BigDecimal arg0)`

#### Getter Methods

- `FieldWithMetaStringBuilder getCurrency()`
- `FieldWithMetaCreditLimitTypeEnumBuilder getLimitType()`
- `CreditLimitUtilisationBuilder getUtilization()`
- `VelocityBuilder getVelocity()`
- `CreditLimitUtilisationBuilder getOrCreateUtilization()`
- `VelocityBuilder getOrCreateVelocity()`
- `FieldWithMetaCreditLimitTypeEnumBuilder getOrCreateLimitType()`
- `FieldWithMetaStringBuilder getOrCreateCurrency()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `LimitApplicableBuilder prune()`

