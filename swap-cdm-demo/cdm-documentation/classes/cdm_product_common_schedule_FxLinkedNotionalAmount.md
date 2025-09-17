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
- `Date getResetDate()`
- `BigDecimal getObservedFxSpotRate()`
- `Date getAdjustedFxSpotFixingDate()`
- `BigDecimal getNotionalAmount()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FxLinkedNotionalAmountBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

