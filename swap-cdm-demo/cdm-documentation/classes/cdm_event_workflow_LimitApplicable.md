# LimitApplicable

**Full Name:** `cdm.event.workflow.LimitApplicable`

**Package:** `cdm.event.workflow`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `LimitApplicable build()`

#### Getter Methods

- `Class getType()`
- `FieldWithMetaString getCurrency()`
- `Integer getClipSize()`
- `BigDecimal getAmountUtilized()`
- `FieldWithMetaCreditLimitTypeEnum getLimitType()`
- `CreditLimitUtilisation getUtilization()`
- `BigDecimal getAmountRemaining()`
- `Velocity getVelocity()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `LimitApplicableBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

