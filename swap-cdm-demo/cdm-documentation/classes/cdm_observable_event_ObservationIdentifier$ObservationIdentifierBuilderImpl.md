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
- `Date getObservationDate()`
- `TimeZoneBuilder getOrCreateObservationTime()`
- `DeterminationMethodologyBuilder getDeterminationMethodology()`
- `InformationSourceBuilder getOrCreateInformationSource()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationIdentifierBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ObservationIdentifierBuilder prune()`
- `ObservationIdentifierBuilder toBuilder()`
- `boolean hasData()`

