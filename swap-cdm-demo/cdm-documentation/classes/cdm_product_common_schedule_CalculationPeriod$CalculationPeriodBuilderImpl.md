# CalculationPeriodBuilderImpl

**Full Name:** `cdm.product.common.schedule.CalculationPeriod$CalculationPeriodBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.schedule.CalculationPeriodBase$CalculationPeriodBaseBuilderImpl`

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriod$CalculationPeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| unadjustedStartDate | `Date` |  |
| unadjustedEndDate | `Date` |  |
| calculationPeriodNumberOfDays | `Integer` |  |
| notionalAmount | `BigDecimal` |  |
| fxLinkedNotionalAmount | `FxLinkedNotionalAmountBuilder` |  |
| floatingRateDefinition | `FloatingRateDefinitionBuilder` |  |
| fixedRate | `BigDecimal` |  |
| dayCountYearFraction | `BigDecimal` |  |
| forecastAmount | `MoneyBuilder` |  |
| forecastRate | `BigDecimal` |  |

### Methods

#### Builder Methods

- `CalculationPeriod build()`

#### Setter Methods

- `CalculationPeriodBuilder setFixedRate(BigDecimal arg0)`
- `CalculationPeriodBuilder setAdjustedEndDate(Date arg0)`
- `CalculationPeriodBuilder setAdjustedStartDate(Date arg0)`
- `CalculationPeriodBuilder setUnadjustedStartDate(Date arg0)`
- `CalculationPeriodBuilder setNotionalAmount(BigDecimal arg0)`
- `CalculationPeriodBuilder setUnadjustedEndDate(Date arg0)`
- `CalculationPeriodBuilder setFloatingRateDefinition(FloatingRateDefinition arg0)`
- `CalculationPeriodBuilder setForecastAmount(Money arg0)`
- `CalculationPeriodBuilder setFxLinkedNotionalAmount(FxLinkedNotionalAmount arg0)`
- `CalculationPeriodBuilder setForecastRate(BigDecimal arg0)`
- `CalculationPeriodBuilder setDayCountYearFraction(BigDecimal arg0)`
- `CalculationPeriodBuilder setCalculationPeriodNumberOfDays(Integer arg0)`
- `CalculationPeriodBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `BigDecimal getNotionalAmount()`
- `BigDecimal getFixedRate()`
- `BigDecimal getDayCountYearFraction()`
- `MoneyBuilder getOrCreateForecastAmount()`
- `MoneyBuilder getForecastAmount()`
- `FxLinkedNotionalAmountBuilder getFxLinkedNotionalAmount()`
- `FloatingRateDefinitionBuilder getFloatingRateDefinition()`
- `Date getUnadjustedStartDate()`
- `Date getUnadjustedEndDate()`
- `BigDecimal getForecastRate()`
- `FloatingRateDefinitionBuilder getOrCreateFloatingRateDefinition()`
- `Integer getCalculationPeriodNumberOfDays()`
- `FxLinkedNotionalAmountBuilder getOrCreateFxLinkedNotionalAmount()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `CalculationPeriodBuilder toBuilder()`
- `CalculationPeriodBuilder prune()`

