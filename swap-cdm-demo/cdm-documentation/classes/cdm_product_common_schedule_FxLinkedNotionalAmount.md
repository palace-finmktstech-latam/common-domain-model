# FxLinkedNotionalAmount

**Full Name:** `cdm.product.common.schedule.FxLinkedNotionalAmount`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `FxLinkedNotionalAmount build()`

#### Getter Methods

- `Class getType()`
- `BigDecimal getNotionalAmount()`
- `Date getResetDate()`
- `BigDecimal getObservedFxSpotRate()`
- `Date getAdjustedFxSpotFixingDate()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FxLinkedNotionalAmountBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

