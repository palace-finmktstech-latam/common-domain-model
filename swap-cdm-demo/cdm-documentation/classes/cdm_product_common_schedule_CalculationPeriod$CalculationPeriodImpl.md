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

- `BigDecimal getNotionalAmount()`
- `BigDecimal getFixedRate()`
- `BigDecimal getDayCountYearFraction()`
- `Money getForecastAmount()`
- `FxLinkedNotionalAmount getFxLinkedNotionalAmount()`
- `FloatingRateDefinition getFloatingRateDefinition()`
- `Date getUnadjustedStartDate()`
- `Date getUnadjustedEndDate()`
- `BigDecimal getForecastRate()`
- `Integer getCalculationPeriodNumberOfDays()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `CalculationPeriodBuilder toBuilder()`

