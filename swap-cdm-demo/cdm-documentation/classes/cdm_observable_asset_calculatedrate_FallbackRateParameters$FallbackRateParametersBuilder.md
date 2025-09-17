# FallbackRateParametersBuilder

**Full Name:** `cdm.observable.asset.calculatedrate.FallbackRateParameters$FallbackRateParametersBuilder`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Interface

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.FallbackRateParameters`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FallbackRateParametersBuilder setCalculationParameters(FloatingRateCalculationParameters arg0)`
- `FallbackRateParametersBuilder setEffectiveDate(Date arg0)`
- `FallbackRateParametersBuilder setSpreadAdjustment(BigDecimal arg0)`
- `FallbackRateParametersBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`

#### Getter Methods

- `FloatingRateCalculationParametersBuilder getOrCreateCalculationParameters()`
- `FloatingRateCalculationParametersBuilder getCalculationParameters()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FallbackRateParametersBuilder prune()`

