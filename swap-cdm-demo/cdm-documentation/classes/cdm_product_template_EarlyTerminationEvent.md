# EarlyTerminationEvent

**Full Name:** `cdm.product.template.EarlyTerminationEvent`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`
- `com.rosetta.model.lib.GlobalKey`

### Methods

#### Builder Methods

- `EarlyTerminationEvent build()`

#### Getter Methods

- `Class getType()`
- `Date getAdjustedEarlyTerminationDate()`
- `Date getAdjustedCashSettlementPaymentDate()`
- `Date getAdjustedExerciseFeePaymentDate()`
- `Date getAdjustedCashSettlementValuationDate()`
- `Date getAdjustedExerciseDate()`
- `MetaFields getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `EarlyTerminationEventBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

