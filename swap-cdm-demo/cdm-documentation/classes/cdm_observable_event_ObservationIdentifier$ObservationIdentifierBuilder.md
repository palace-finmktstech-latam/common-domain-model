# ObservationIdentifierBuilder

**Full Name:** `cdm.observable.event.ObservationIdentifier$ObservationIdentifierBuilder`

**Package:** `cdm.observable.event`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.event.ObservationIdentifier`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationIdentifierBuilder setObservationTime(TimeZone arg0)`
- `ObservationIdentifierBuilder setInformationSource(InformationSource arg0)`
- `ObservationIdentifierBuilder setObservable(Observable arg0)`
- `ObservationIdentifierBuilder setObservationDate(Date arg0)`
- `ObservationIdentifierBuilder setDeterminationMethodology(DeterminationMethodology arg0)`

#### Getter Methods

- `ObservableBuilder getOrCreateObservable()`
- `TimeZoneBuilder getOrCreateObservationTime()`
- `ObservableBuilder getObservable()`
- `TimeZoneBuilder getObservationTime()`
- `InformationSourceBuilder getInformationSource()`
- `InformationSourceBuilder getOrCreateInformationSource()`
- `DeterminationMethodologyBuilder getDeterminationMethodology()`
- `DeterminationMethodologyBuilder getOrCreateDeterminationMethodology()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationIdentifierBuilder prune()`

