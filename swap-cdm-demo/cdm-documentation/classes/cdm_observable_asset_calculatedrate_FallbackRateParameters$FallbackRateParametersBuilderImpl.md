# FallbackRateParametersBuilderImpl

**Full Name:** `cdm.observable.asset.calculatedrate.FallbackRateParameters$FallbackRateParametersBuilderImpl`

**Package:** `cdm.observable.asset.calculatedrate`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.calculatedrate.FallbackRateParameters$FallbackRateParametersBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| floatingRateIndex | `FloatingRateIndexEnum` |  |
| effectiveDate | `Date` |  |
| calculationParameters | `FloatingRateCalculationParametersBuilder` |  |
| spreadAdjustment | `BigDecimal` |  |

### Methods

#### Builder Methods

- `FallbackRateParameters build()`

#### Setter Methods

- `FallbackRateParametersBuilder setCalculationParameters(FloatingRateCalculationParameters arg0)`
- `FallbackRateParametersBuilder setEffectiveDate(Date arg0)`
- `FallbackRateParametersBuilder setSpreadAdjustment(BigDecimal arg0)`
- `FallbackRateParametersBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`

#### Getter Methods

- `Date getEffectiveDate()`
- `BigDecimal getSpreadAdjustment()`
- `FloatingRateCalculationParametersBuilder getOrCreateCalculationParameters()`
- `FloatingRateCalculationParametersBuilder getCalculationParameters()`
- `FloatingRateIndexEnum getFloatingRateIndex()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FallbackRateParametersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FallbackRateParametersBuilder prune()`
- `FallbackRateParametersBuilder toBuilder()`
- `boolean hasData()`

