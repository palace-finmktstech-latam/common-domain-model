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

- `PerformanceValuationDatesBuilder getInitialValuationDate()`
- `PerformanceValuationDatesBuilder getFinalValuationDate()`
- `PerformanceValuationDatesBuilder getInterimValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateInterimValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateFinalValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateInitialValuationDate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ValuationDatesBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ValuationDatesBuilder toBuilder()`
- `ValuationDatesBuilder prune()`

