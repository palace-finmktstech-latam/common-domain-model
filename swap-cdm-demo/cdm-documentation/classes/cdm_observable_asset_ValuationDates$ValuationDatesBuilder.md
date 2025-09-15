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

- `PerformanceValuationDatesBuilder getInitialValuationDate()`
- `PerformanceValuationDatesBuilder getFinalValuationDate()`
- `PerformanceValuationDatesBuilder getInterimValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateInterimValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateFinalValuationDate()`
- `PerformanceValuationDatesBuilder getOrCreateInitialValuationDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ValuationDatesBuilder prune()`

