# ObservationShiftCalculationBuilder

**Full Name:** `cdm.observable.asset.calculatedrate.ObservationShiftCalculation$ObservationShiftCalculationBuilder`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.ObservationShiftCalculation`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ObservationShiftCalculationBuilder setOffsetDays(Integer arg0)`
- `ObservationShiftCalculationBuilder setCalculationBase(ObservationPeriodDatesEnum arg0)`
- `ObservationShiftCalculationBuilder setAdditionalBusinessDays(BusinessCenters arg0)`

#### Getter Methods

- `BusinessCentersBuilder getOrCreateAdditionalBusinessDays()`
- `BusinessCentersBuilder getAdditionalBusinessDays()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ObservationShiftCalculationBuilder prune()`

