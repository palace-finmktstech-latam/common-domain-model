# EarlyTerminationEventBuilder

**Full Name:** `cdm.product.template.EarlyTerminationEvent$EarlyTerminationEventBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.EarlyTerminationEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `EarlyTerminationEventBuilder setAdjustedEarlyTerminationDate(Date arg0)`
- `EarlyTerminationEventBuilder setAdjustedCashSettlementValuationDate(Date arg0)`
- `EarlyTerminationEventBuilder setAdjustedExerciseFeePaymentDate(Date arg0)`
- `EarlyTerminationEventBuilder setAdjustedCashSettlementPaymentDate(Date arg0)`
- `EarlyTerminationEventBuilder setAdjustedExerciseDate(Date arg0)`
- `EarlyTerminationEventBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `EarlyTerminationEventBuilder prune()`

