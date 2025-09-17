# ValuationDatesBuilder

**Full Name:** `cdm.observable.asset.ValuationDates$ValuationDatesBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.ValuationDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

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

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationDatesBuilder prune()`

