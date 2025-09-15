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

- `FallbackRateParametersBuilder setEffectiveDate(Date arg0)`
- `FallbackRateParametersBuilder setFloatingRateIndex(FloatingRateIndexEnum arg0)`
- `FallbackRateParametersBuilder setCalculationParameters(FloatingRateCalculationParameters arg0)`
- `FallbackRateParametersBuilder setSpreadAdjustment(BigDecimal arg0)`

#### Getter Methods

- `FloatingRateCalculationParametersBuilder getCalculationParameters()`
- `FloatingRateIndexEnum getFloatingRateIndex()`
- `Date getEffectiveDate()`
- `BigDecimal getSpreadAdjustment()`
- `FloatingRateCalculationParametersBuilder getOrCreateCalculationParameters()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FallbackRateParametersBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FallbackRateParametersBuilder toBuilder()`
- `FallbackRateParametersBuilder prune()`

