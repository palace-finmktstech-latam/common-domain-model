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
- `FieldWithMetaCreditLimitTypeEnum getLimitType()`
- `Integer getClipSize()`
- `CreditLimitUtilisation getUtilization()`
- `BigDecimal getAmountRemaining()`
- `BigDecimal getAmountUtilized()`
- `Velocity getVelocity()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `LimitApplicableBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

