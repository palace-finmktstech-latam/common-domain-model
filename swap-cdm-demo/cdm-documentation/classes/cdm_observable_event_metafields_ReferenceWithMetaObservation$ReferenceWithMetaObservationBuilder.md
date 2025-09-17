# ReferenceWithMetaObservationBuilder

**Full Name:** `cdm.observable.event.metafields.ReferenceWithMetaObservation$ReferenceWithMetaObservationBuilder`

**Package:** `cdm.observable.event.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.metafields.ReferenceWithMetaObservation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaObservationBuilder setValue(Observation arg0)`
- `ReferenceWithMetaObservationBuilder setReference(Reference arg0)`
- `ReferenceWithMetaObservationBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaObservationBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `ObservationBuilder getValue()`
- `ObservationBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaObservationBuilder prune()`

