# ReferenceWithMetaObservationBuilderImpl

**Full Name:** `cdm.observable.event.metafields.ReferenceWithMetaObservation$ReferenceWithMetaObservationBuilderImpl`

**Package:** `cdm.observable.event.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.metafields.ReferenceWithMetaObservation$ReferenceWithMetaObservationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `ObservationBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaObservation build()`

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
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaObservationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaObservationBuilder prune()`
- `ReferenceWithMetaObservationBuilder toBuilder()`
- `boolean hasData()`

