# FixedAmountCalculationDetailsBuilderImpl

**Full Name:** `cdm.product.asset.FixedAmountCalculationDetails$FixedAmountCalculationDetailsBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.FixedAmountCalculationDetails$FixedAmountCalculationDetailsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| calculationPeriod | `CalculationPeriodBaseBuilder` |  |
| calculationPeriodNotionalAmount | `MoneyBuilder` |  |
| fixedRate | `BigDecimal` |  |
| yearFraction | `BigDecimal` |  |
| calculatedAmount | `BigDecimal` |  |

### Methods

#### Builder Methods

- `FixedAmountCalculationDetails build()`

#### Setter Methods

- `FixedAmountCalculationDetailsBuilder setFixedRate(BigDecimal arg0)`
- `FixedAmountCalculationDetailsBuilder setCalculationPeriod(CalculationPeriodBase arg0)`
- `FixedAmountCalculationDetailsBuilder setYearFraction(BigDecimal arg0)`
- `FixedAmountCalculationDetailsBuilder setCalculatedAmount(BigDecimal arg0)`
- `FixedAmountCalculationDetailsBuilder setCalculationPeriodNotionalAmount(Money arg0)`

#### Getter Methods

- `BigDecimal getYearFraction()`
- `BigDecimal getFixedRate()`
- `BigDecimal getCalculatedAmount()`
- `CalculationPeriodBaseBuilder getCalculationPeriod()`
- `MoneyBuilder getOrCreateCalculationPeriodNotionalAmount()`
- `MoneyBuilder getCalculationPeriodNotionalAmount()`
- `CalculationPeriodBaseBuilder getOrCreateCalculationPeriod()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FixedAmountCalculationDetailsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `FixedAmountCalculationDetailsBuilder toBuilder()`
- `FixedAmountCalculationDetailsBuilder prune()`

