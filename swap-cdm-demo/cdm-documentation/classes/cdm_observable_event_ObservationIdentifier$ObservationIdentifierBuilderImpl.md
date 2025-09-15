# ObservationIdentifierBuilderImpl

**Full Name:** `cdm.observable.event.ObservationIdentifier$ObservationIdentifierBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.ObservationIdentifier$ObservationIdentifierBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| observable | `ObservableBuilder` |  |
| observationDate | `Date` |  |
| observationTime | `TimeZoneBuilder` |  |
| informationSource | `InformationSourceBuilder` |  |
| determinationMethodology | `DeterminationMethodologyBuilder` |  |

### Methods

#### Builder Methods

- `ObservationIdentifier build()`

#### Setter Methods

- `ObservationIdentifierBuilder setObservationTime(TimeZone arg0)`
- `ObservationIdentifierBuilder setInformationSource(InformationSource arg0)`
- `ObservationIdentifierBuilder setObservable(Observable arg0)`
- `ObservationIdentifierBuilder setObservationDate(Date arg0)`
- `ObservationIdentifierBuilder setDeterminationMethodology(DeterminationMethodology arg0)`

#### Getter Methods

- `ObservableBuilder getOrCreateObservable()`
- `TimeZoneBuilder getOrCreateObservationTime()`
- `Date getObservationDate()`
- `ObservableBuilder getObservable()`
- `TimeZoneBuilder getObservationTime()`
- `InformationSourceBuilder getInformationSource()`
- `InformationSourceBuilder getOrCreateInformationSource()`
- `DeterminationMethodologyBuilder getDeterminationMethodology()`
- `DeterminationMethodologyBuilder getOrCreateDeterminationMethodology()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ObservationIdentifierBuilder toBuilder()`
- `ObservationIdentifierBuilder prune()`

