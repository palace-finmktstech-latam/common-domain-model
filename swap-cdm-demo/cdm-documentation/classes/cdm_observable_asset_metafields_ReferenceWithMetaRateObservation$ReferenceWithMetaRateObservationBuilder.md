# ReferenceWithMetaRateObservationBuilder

**Full Name:** `cdm.observable.asset.metafields.ReferenceWithMetaRateObservation$ReferenceWithMetaRateObservationBuilder`

**Package:** `cdm.observable.asset.metafields`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.metafields.ReferenceWithMetaRateObservation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.meta.ReferenceWithMeta$ReferenceWithMetaBuilder`

### Methods

#### Setter Methods

- `ReferenceWithMetaRateObservationBuilder setValue(RateObservation arg0)`
- `ReferenceWithMetaRateObservationBuilder setReference(Reference arg0)`
- `ReferenceWithMetaRateObservationBuilder setGlobalReference(String arg0)`
- `ReferenceWithMetaRateObservationBuilder setExternalReference(String arg0)`

#### Getter Methods

- `ReferenceBuilder getReference()`
- `RateObservationBuilder getValue()`
- `RateObservationBuilder getOrCreateValue()`
- `ReferenceBuilder getOrCreateReference()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ReferenceWithMetaRateObservationBuilder prune()`

