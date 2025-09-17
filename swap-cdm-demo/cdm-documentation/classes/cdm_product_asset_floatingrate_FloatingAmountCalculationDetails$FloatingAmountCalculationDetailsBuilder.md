# FloatingAmountCalculationDetailsBuilder

**Full Name:** `cdm.product.asset.floatingrate.FloatingAmountCalculationDetails$FloatingAmountCalculationDetailsBuilder`

**Package:** `cdm.product.asset.floatingrate`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingAmountCalculationDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FloatingAmountCalculationDetailsBuilder setCalculatedAmount(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setCalculationPeriod(CalculationPeriodBase arg0)`
- `FloatingAmountCalculationDetailsBuilder setYearFraction(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setCalculationPeriodNotionalAmount(Money arg0)`
- `FloatingAmountCalculationDetailsBuilder setSpreadExclusiveCalculatedAMount(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setAppliedRate(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setProcessingDetails(FloatingRateProcessingDetails arg0)`
- `FloatingAmountCalculationDetailsBuilder setFloatingRate(FloatingRateSettingDetails arg0)`

#### Getter Methods

- `CalculationPeriodBaseBuilder getCalculationPeriod()`
- `CalculationPeriodBaseBuilder getOrCreateCalculationPeriod()`
- `MoneyBuilder getCalculationPeriodNotionalAmount()`
- `MoneyBuilder getOrCreateCalculationPeriodNotionalAmount()`
- `FloatingRateProcessingDetailsBuilder getOrCreateProcessingDetails()`
- `FloatingRateSettingDetailsBuilder getOrCreateFloatingRate()`
- `FloatingRateSettingDetailsBuilder getFloatingRate()`
- `FloatingRateProcessingDetailsBuilder getProcessingDetails()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FloatingAmountCalculationDetailsBuilder prune()`

