# CalculationPeriodImpl

**Full Name:** `cdm.product.common.schedule.CalculationPeriod$CalculationPeriodImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Inheritance

**Extends:**
- `cdm.product.common.schedule.CalculationPeriodBase$CalculationPeriodBaseImpl`

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriod`

### Methods

#### Builder Methods

- `CalculationPeriod build()`

#### Setter Methods

- `void setBuilderFields(CalculationPeriodBuilder arg0)`

#### Getter Methods

- `BigDecimal getForecastRate()`
- `Date getUnadjustedEndDate()`
- `FloatingRateDefinition getFloatingRateDefinition()`
- `BigDecimal getDayCountYearFraction()`
- `Date getUnadjustedStartDate()`
- `Money getForecastAmount()`
- `FxLinkedNotionalAmount getFxLinkedNotionalAmount()`
- `Integer getCalculationPeriodNumberOfDays()`
- `BigDecimal getNotionalAmount()`
- `BigDecimal getFixedRate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodBuilder toBuilder()`

