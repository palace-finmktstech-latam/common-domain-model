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

- `FloatingAmountCalculationDetailsBuilder setCalculatedAmount(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setCalculationPeriod(CalculationPeriodBase arg0)`
- `FloatingAmountCalculationDetailsBuilder setYearFraction(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setCalculationPeriodNotionalAmount(Money arg0)`
- `FloatingAmountCalculationDetailsBuilder setSpreadExclusiveCalculatedAMount(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setAppliedRate(BigDecimal arg0)`
- `FloatingAmountCalculationDetailsBuilder setProcessingDetails(FloatingRateProcessingDetails arg0)`
- `FloatingAmountCalculationDetailsBuilder setFloatingRate(FloatingRateSettingDetails arg0)`

#### Getter Methods

- `BigDecimal getYearFraction()`
- `CalculationPeriodBaseBuilder getCalculationPeriod()`
- `BigDecimal getCalculatedAmount()`
- `CalculationPeriodBaseBuilder getOrCreateCalculationPeriod()`
- `MoneyBuilder getCalculationPeriodNotionalAmount()`
- `MoneyBuilder getOrCreateCalculationPeriodNotionalAmount()`
- `FloatingRateProcessingDetailsBuilder getOrCreateProcessingDetails()`
- `BigDecimal getSpreadExclusiveCalculatedAMount()`
- `FloatingRateSettingDetailsBuilder getOrCreateFloatingRate()`
- `BigDecimal getAppliedRate()`
- `FloatingRateSettingDetailsBuilder getFloatingRate()`
- `FloatingRateProcessingDetailsBuilder getProcessingDetails()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FloatingAmountCalculationDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FloatingAmountCalculationDetailsBuilder prune()`
- `FloatingAmountCalculationDetailsBuilder toBuilder()`
- `boolean hasData()`

