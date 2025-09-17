# DeterminationMethodologyBuilderImpl

**Full Name:** `cdm.observable.event.DeterminationMethodology$DeterminationMethodologyBuilderImpl`

**Package:** `cdm.observable.event`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.event.DeterminationMethodology$DeterminationMethodologyBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| determinationMethod | `DeterminationMethodEnum` |  |
| averagingMethod | `AveragingCalculationMethodEnum` |  |

### Methods

#### Builder Methods

- `DeterminationMethodology build()`

#### Setter Methods

- `DeterminationMethodologyBuilder setDeterminationMethod(DeterminationMethodEnum arg0)`
- `DeterminationMethodologyBuilder setAveragingMethod(AveragingCalculationMethodEnum arg0)`

#### Getter Methods

- `AveragingCalculationMethodEnum getAveragingMethod()`
- `DeterminationMethodEnum getDeterminationMethod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `DeterminationMethodologyBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `DeterminationMethodologyBuilder prune()`
- `DeterminationMethodologyBuilder toBuilder()`
- `boolean hasData()`

