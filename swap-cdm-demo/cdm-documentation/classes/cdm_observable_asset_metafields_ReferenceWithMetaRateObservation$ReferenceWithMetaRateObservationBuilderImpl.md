# ReferenceWithMetaRateObservationBuilderImpl

**Full Name:** `cdm.observable.asset.metafields.ReferenceWithMetaRateObservation$ReferenceWithMetaRateObservationBuilderImpl`

**Package:** `cdm.observable.asset.metafields`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.metafields.ReferenceWithMetaRateObservation$ReferenceWithMetaRateObservationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| value | `RateObservationBuilder` |  |
| globalReference | `String` |  |
| externalReference | `String` |  |
| reference | `ReferenceBuilder` |  |

### Methods

#### Builder Methods

- `ReferenceWithMetaRateObservation build()`

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
- `String getExternalReference()`
- `String getGlobalReference()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReferenceWithMetaRateObservationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ReferenceWithMetaRateObservationBuilder prune()`
- `ReferenceWithMetaRateObservationBuilder toBuilder()`
- `boolean hasData()`

