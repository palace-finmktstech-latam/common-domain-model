# FloatingRateSettingDetailsBuilder

**Full Name:** `cdm.product.asset.floatingrate.FloatingRateSettingDetails$FloatingRateSettingDetailsBuilder`

**Package:** `cdm.product.asset.floatingrate`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingRateSettingDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingRateSettingDetailsBuilder setCalculationDetails(CalculatedRateDetails arg0)`
- `FloatingRateSettingDetailsBuilder setFloatingRate(BigDecimal arg0)`
- `FloatingRateSettingDetailsBuilder setObservationDate(Date arg0)`
- `FloatingRateSettingDetailsBuilder setResetDate(Date arg0)`

#### Getter Methods

- `CalculatedRateDetailsBuilder getCalculationDetails()`
- `CalculatedRateDetailsBuilder getOrCreateCalculationDetails()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingRateSettingDetailsBuilder prune()`

