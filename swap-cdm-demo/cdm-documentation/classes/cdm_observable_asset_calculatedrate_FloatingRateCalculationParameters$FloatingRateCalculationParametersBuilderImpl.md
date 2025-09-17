# FloatingRateCalculationParametersBuilderImpl

**Full Name:** `cdm.observable.asset.calculatedrate.FloatingRateCalculationParameters$FloatingRateCalculationParametersBuilderImpl`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.FloatingRateCalculationParameters$FloatingRateCalculationParametersBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationMethod | `CalculationMethodEnum` |  |
| observationShiftCalculation | `ObservationShiftCalculationBuilder` |  |
| lookbackCalculation | `OffsetCalculationBuilder` |  |
| lockoutCalculation | `OffsetCalculationBuilder` |  |
| applicableBusinessDays | `BusinessCentersBuilder` |  |
| observationParameters | `ObservationParametersBuilder` |  |

### Methods

#### Builder Methods

- `FloatingRateCalculationParameters build()`

#### Setter Methods

- `FloatingRateCalculationParametersBuilder setApplicableBusinessDays(BusinessCenters arg0)`
- `FloatingRateCalculationParametersBuilder setCalculationMethod(CalculationMethodEnum arg0)`
- `FloatingRateCalculationParametersBuilder setLookbackCalculation(OffsetCalculation arg0)`
- `FloatingRateCalculationParametersBuilder setObservationParameters(ObservationParameters arg0)`
- `FloatingRateCalculationParametersBuilder setLockoutCalculation(OffsetCalculation arg0)`
- `FloatingRateCalculationParametersBuilder setObservationShiftCalculation(ObservationShiftCalculation arg0)`

#### Getter Methods

- `CalculationMethodEnum getCalculationMethod()`
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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingRateCalculationParametersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingRateCalculationParametersBuilder prune()`
- `FloatingRateCalculationParametersBuilder toBuilder()`
- `boolean hasData()`

