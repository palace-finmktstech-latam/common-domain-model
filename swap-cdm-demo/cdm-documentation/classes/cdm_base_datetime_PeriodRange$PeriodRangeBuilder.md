# PeriodRangeBuilder

**Full Name:** `cdm.base.datetime.PeriodRange$PeriodRangeBuilder`

**Package:** `cdm.base.datetime`

## Type: Interface

### Implemented Interfaces

- `cdm.base.datetime.PeriodRange`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `PeriodRangeBuilder setLowerBound(PeriodBound arg0)`
- `PeriodRangeBuilder setUpperBound(PeriodBound arg0)`

#### Getter Methods

- `PeriodBoundBuilder getOrCreateUpperBound()`
- `PeriodBoundBuilder getOrCreateLowerBound()`
- `PeriodBoundBuilder getLowerBound()`
- `PeriodBoundBuilder getUpperBound()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PeriodRangeBuilder prune()`

