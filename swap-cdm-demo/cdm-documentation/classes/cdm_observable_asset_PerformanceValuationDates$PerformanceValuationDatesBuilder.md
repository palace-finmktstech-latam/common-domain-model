# PerformanceValuationDatesBuilder

**Full Name:** `cdm.observable.asset.PerformanceValuationDates$PerformanceValuationDatesBuilder`

**Package:** `cdm.observable.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.PerformanceValuationDates`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PerformanceValuationDatesBuilder setValuationDates(AdjustableRelativeOrPeriodicDates arg0)`
- `PerformanceValuationDatesBuilder setDeterminationMethod(DeterminationMethodEnum arg0)`
- `PerformanceValuationDatesBuilder setMeta(MetaFields arg0)`
- `PerformanceValuationDatesBuilder setValuationTime(BusinessCenterTime arg0)`
- `PerformanceValuationDatesBuilder setValuationTimeType(TimeTypeEnum arg0)`
- `PerformanceValuationDatesBuilder setValuationDate(AdjustableOrRelativeDate arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `AdjustableRelativeOrPeriodicDatesBuilder getValuationDates()`
- `BusinessCenterTimeBuilder getValuationTime()`
- `AdjustableOrRelativeDateBuilder getValuationDate()`
- `MetaFieldsBuilder getMeta()`
- `AdjustableRelativeOrPeriodicDatesBuilder getOrCreateValuationDates()`
- `BusinessCenterTimeBuilder getOrCreateValuationTime()`
- `AdjustableOrRelativeDateBuilder getOrCreateValuationDate()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PerformanceValuationDatesBuilder prune()`

