# ValuationDatesBuilderImpl

**Full Name:** `cdm.observable.asset.ValuationDates$ValuationDatesBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.ValuationDates$ValuationDatesBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| initialValuationDate | `PerformanceValuationDatesBuilder` |  |
| interimValuationDate | `PerformanceValuationDatesBuilder` |  |
| finalValuationDate | `PerformanceValuationDatesBuilder` |  |

### Methods

#### Builder Methods

- `ValuationDates build()`

#### Setter Methods

- `ValuationDatesBuilder setInitialValuationDate(PerformanceValuationDates arg0)`
- `ValuationDatesBuilder setFinalValuationDate(PerformanceValuationDates arg0)`
- `ValuationDatesBuilder setInterimValuationDate(PerformanceValuationDates arg0)`

#### Getter Methods

- `PerformanceValuationDatesBuilder getFinalValuationDate()`
- `PerformanceValuationDatesBuilder getInterimValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateFinalValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateInterimValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateInitialValuationDate()`
- `PerformanceValuationDatesBuilder getInitialValuationDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ValuationDatesBuilder prune()`
- `ValuationDatesBuilder toBuilder()`
- `boolean hasData()`

