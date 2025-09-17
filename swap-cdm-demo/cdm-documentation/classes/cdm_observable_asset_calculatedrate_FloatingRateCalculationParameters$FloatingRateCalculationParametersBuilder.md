# FloatingRateCalculationParametersBuilder

**Full Name:** `cdm.observable.asset.calculatedrate.FloatingRateCalculationParameters$FloatingRateCalculationParametersBuilder`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.FloatingRateCalculationParameters`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingRateCalculationParametersBuilder setApplicableBusinessDays(BusinessCenters arg0)`
- `FloatingRateCalculationParametersBuilder setCalculationMethod(CalculationMethodEnum arg0)`
- `FloatingRateCalculationParametersBuilder setLookbackCalculation(OffsetCalculation arg0)`
- `FloatingRateCalculationParametersBuilder setObservationParameters(ObservationParameters arg0)`
- `FloatingRateCalculationParametersBuilder setLockoutCalculation(OffsetCalculation arg0)`
- `FloatingRateCalculationParametersBuilder setObservationShiftCalculation(ObservationShiftCalculation arg0)`

#### Getter Methods

- `OffsetCalculationBuilder getLookbackCalculation()`
- `BusinessCentersBuilder getApplicableBusinessDays()`
- `OffsetCalculationBuilder getLockoutCalculation()`
- `ObservationParametersBuilder getObservationParameters()`
- `ObservationShiftCalculationBuilder getObservationShiftCalculation()`
- `ObservationParametersBuilder getOrCreateObservationParameters()`
- `BusinessCentersBuilder getOrCreateApplicableBusinessDays()`
- `ObservationShiftCalculationBuilder getOrCreateObservationShiftCalculation()`
- `OffsetCalculationBuilder getOrCreateLockoutCalculation()`
- `OffsetCalculationBuilder getOrCreateLookbackCalculation()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateCalculationParametersBuilder prune()`

