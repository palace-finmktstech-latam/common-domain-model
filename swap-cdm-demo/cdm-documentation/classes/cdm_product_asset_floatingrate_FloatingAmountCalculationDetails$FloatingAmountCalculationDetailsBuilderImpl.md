# FloatingAmountCalculationDetailsBuilderImpl

**Full Name:** `cdm.product.asset.floatingrate.FloatingAmountCalculationDetails$FloatingAmountCalculationDetailsBuilderImpl`

**Package:** `cdm.product.asset.floatingrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.floatingrate.FloatingAmountCalculationDetails$FloatingAmountCalculationDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationPeriod | `CalculationPeriodBaseBuilder` |  |
| calculationPeriodNotionalAmount | `MoneyBuilder` |  |
| floatingRate | `FloatingRateSettingDetailsBuilder` |  |
| processingDetails | `FloatingRateProcessingDetailsBuilder` |  |
| appliedRate | `BigDecimal` |  |
| yearFraction | `BigDecimal` |  |
| calculatedAmount | `BigDecimal` |  |
| spreadExclusiveCalculatedAMount | `BigDecimal` |  |

### Methods

#### Builder Methods

- `FloatingAmountCalculationDetails build()`

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

- `BigDecimal getYearFraction()`
- `BigDecimal getCalculatedAmount()`
- `FloatingRateSettingDetailsBuilder getFloatingRate()`
- `CalculationPeriodBaseBuilder getCalculationPeriod()`
- `FloatingRateProcessingDetailsBuilder getProcessingDetails()`
- `FloatingRateSettingDetailsBuilder getOrCreateFloatingRate()`
- `BigDecimal getAppliedRate()`
- `MoneyBuilder getOrCreateCalculationPeriodNotionalAmount()`
- `FloatingRateProcessingDetailsBuilder getOrCreateProcessingDetails()`
- `BigDecimal getSpreadExclusiveCalculatedAMount()`
- `MoneyBuilder getCalculationPeriodNotionalAmount()`
- `CalculationPeriodBaseBuilder getOrCreateCalculationPeriod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingAmountCalculationDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FloatingAmountCalculationDetailsBuilder toBuilder()`
- `FloatingAmountCalculationDetailsBuilder prune()`

