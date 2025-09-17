# ObservationBuilderImpl

**Full Name:** `cdm.observable.event.Observation$ObservationBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.Observation$ObservationBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| observedValue | `PriceBuilder` |  |
| observationIdentifier | `ObservationIdentifierBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `Observation build()`

#### Setter Methods

- `ObservationBuilder setMeta(MetaFields arg0)`
- `ObservationBuilder setObservationIdentifier(ObservationIdentifier arg0)`
- `ObservationBuilder setObservedValue(Price arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `ObservationIdentifierBuilder getObservationIdentifier()`
- `PriceBuilder getObservedValue()`
- `MetaFieldsBuilder getMeta()`
- `PriceBuilder getOrCreateObservedValue()`
- `ObservationIdentifierBuilder getOrCreateObservationIdentifier()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ObservationBuilder prune()`
- `ObservationBuilder toBuilder()`
- `boolean hasData()`

