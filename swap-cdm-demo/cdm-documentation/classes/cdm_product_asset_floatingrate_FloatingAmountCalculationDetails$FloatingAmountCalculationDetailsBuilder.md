# FloatingAmountCalculationDetailsBuilder

**Full Name:** `cdm.product.asset.floatingrate.FloatingAmountCalculationDetails$FloatingAmountCalculationDetailsBuilder`

**Package:** `cdm.product.asset.floatingrate`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingAmountCalculationDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingAmountCalculationDetailsBuilder setCalculationPeriod(CalculationPeriodBase arg0)`
- `FloatingAmountCalculationDetailsBuilder setYearFraction(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setCalculatedAmount(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setProcessingDetails(FloatingRateProcessingDetails arg0)`
- `FloatingAmountCalculationDetailsBuilder setFloatingRate(FloatingRateSettingDetails arg0)`
- `FloatingAmountCalculationDetailsBuilder setAppliedRate(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setSpreadExclusiveCalculatedAMount(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setCalculationPeriodNotionalAmount(Money arg0)`

#### Getter Methods

- `FloatingRateSettingDetailsBuilder getFloatingRate()`
- `CalculationPeriodBaseBuilder getCalculationPeriod()`
- `FloatingRateProcessingDetailsBuilder getProcessingDetails()`
- `FloatingRateSettingDetailsBuilder getOrCreateFloatingRate()`
- `MoneyBuilder getOrCreateCalculationPeriodNotionalAmount()`
- `FloatingRateProcessingDetailsBuilder getOrCreateProcessingDetails()`
- `MoneyBuilder getCalculationPeriodNotionalAmount()`
- `CalculationPeriodBaseBuilder getOrCreateCalculationPeriod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingAmountCalculationDetailsBuilder prune()`

