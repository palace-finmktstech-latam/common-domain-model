# FloatingRateCalculationParametersBuilder

**Full Name:** `cdm.observable.asset.calculatedrate.FloatingRateCalculationParameters$FloatingRateCalculationParametersBuilder`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.FloatingRateCalculationParameters`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingRateCalculationParametersBuilder setCalculationMethod(CalculationMethodEnum arg0)`
- `FloatingRateCalculationParametersBuilder setObservationShiftCalculation(ObservationShiftCalculation arg0)`
- `FloatingRateCalculationParametersBuilder setApplicableBusinessDays(BusinessCenters arg0)`
- `FloatingRateCalculationParametersBuilder setLockoutCalculation(OffsetCalculation arg0)`
- `FloatingRateCalculationParametersBuilder setObservationParameters(ObservationParameters arg0)`
- `FloatingRateCalculationParametersBuilder setLookbackCalculation(OffsetCalculation arg0)`

#### Getter Methods

- `OffsetCalculationBuilder getLookbackCalculation()`
- `ObservationParametersBuilder getObservationParameters()`
- `OffsetCalculationBuilder getLockoutCalculation()`
- `BusinessCentersBuilder getApplicableBusinessDays()`
- `ObservationShiftCalculationBuilder getObservationShiftCalculation()`
- `OffsetCalculationBuilder getOrCreateLockoutCalculation()`
- `BusinessCentersBuilder getOrCreateApplicableBusinessDays()`
- `OffsetCalculationBuilder getOrCreateLookbackCalculation()`
- `ObservationParametersBuilder getOrCreateObservationParameters()`
- `ObservationShiftCalculationBuilder getOrCreateObservationShiftCalculation()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateCalculationParametersBuilder prune()`

