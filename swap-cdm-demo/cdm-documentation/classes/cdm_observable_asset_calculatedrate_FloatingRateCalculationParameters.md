# FloatingRateCalculationParameters

**Full Name:** `cdm.observable.asset.calculatedrate.FloatingRateCalculationParameters`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Interface

### Implemented Interfaces

- `com.rosetta.model.lib.RosettaModelObject`

### Methods

#### Builder Methods

- `FloatingRateCalculationParameters build()`

#### Getter Methods

- `Class getType()`
- `CalculationMethodEnum getCalculationMethod()`
- `OffsetCalculation getLookbackCalculation()`
- `ObservationParameters getObservationParameters()`
- `OffsetCalculation getLockoutCalculation()`
- `BusinessCenters getApplicableBusinessDays()`
- `ObservationShiftCalculation getObservationShiftCalculation()`

#### Other Methods

- `void process(RosettaPath arg0, Processor arg1)`
- `FloatingRateCalculationParametersBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

