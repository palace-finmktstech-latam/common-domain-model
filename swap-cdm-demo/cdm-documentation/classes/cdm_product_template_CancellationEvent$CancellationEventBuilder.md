# CancellationEventBuilder

**Full Name:** `cdm.product.template.CancellationEvent$CancellationEventBuilder`

**Package:** `cdm.product.template`

## Type: Interface

### Implemented Interfaces

- `cdm.product.template.CancellationEvent`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `CancellationEventBuilder setAdjustedEarlyTerminationDate(Date arg0)`
- `CancellationEventBuilder setAdjustedExerciseDate(Date arg0)`
- `CancellationEventBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CancellationEventBuilder prune()`

