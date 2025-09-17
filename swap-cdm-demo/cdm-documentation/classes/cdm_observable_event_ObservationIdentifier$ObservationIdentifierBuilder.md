# ObservationIdentifierBuilder

**Full Name:** `cdm.observable.event.ObservationIdentifier$ObservationIdentifierBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.ObservationIdentifier`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationIdentifierBuilder setObservationDate(Date arg0)`
- `ObservationIdentifierBuilder setObservable(Observable arg0)`
- `ObservationIdentifierBuilder setObservationTime(TimeZone arg0)`
- `ObservationIdentifierBuilder setInformationSource(InformationSource arg0)`
- `ObservationIdentifierBuilder setDeterminationMethodology(DeterminationMethodology arg0)`

#### Getter Methods

- `ObservableBuilder getObservable()`
- `ObservableBuilder getOrCreateObservable()`
- `DeterminationMethodologyBuilder getOrCreateDeterminationMethodology()`
- `InformationSourceBuilder getInformationSource()`
- `TimeZoneBuilder getObservationTime()`
- `TimeZoneBuilder getOrCreateObservationTime()`
- `DeterminationMethodologyBuilder getDeterminationMethodology()`
- `InformationSourceBuilder getOrCreateInformationSource()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationIdentifierBuilder prune()`

