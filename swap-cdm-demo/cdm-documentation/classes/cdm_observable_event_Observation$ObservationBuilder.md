# ObservationBuilder

**Full Name:** `cdm.observable.event.Observation$ObservationBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.Observation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationBuilder prune()`

