# ObservationParametersBuilderImpl

**Full Name:** `cdm.observable.asset.calculatedrate.ObservationParameters$ObservationParametersBuilderImpl`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.ObservationParameters$ObservationParametersBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| observationCapRate | `BigDecimal` |  |
| observationFloorRate | `BigDecimal` |  |

### Methods

#### Builder Methods

- `ObservationParameters build()`

#### Setter Methods

- `ObservationParametersBuilder setObservationFloorRate(BigDecimal arg0)`
- `ObservationParametersBuilder setObservationCapRate(BigDecimal arg0)`

#### Getter Methods

- `BigDecimal getObservationCapRate()`
- `BigDecimal getObservationFloorRate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ObservationParametersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ObservationParametersBuilder prune()`
- `ObservationParametersBuilder toBuilder()`
- `boolean hasData()`

