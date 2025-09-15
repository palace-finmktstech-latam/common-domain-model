# CalculationPeriodBuilder

**Full Name:** `cdm.product.common.schedule.CalculationPeriod$CalculationPeriodBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriod`
- `cdm.product.common.schedule.CalculationPeriodBase$CalculationPeriodBaseBuilder`

### Methods

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

- `MoneyBuilder getOrCreateForecastAmount()`
- `MoneyBuilder getForecastAmount()`
- `FxLinkedNotionalAmountBuilder getFxLinkedNotionalAmount()`
- `FloatingRateDefinitionBuilder getFloatingRateDefinition()`
- `FloatingRateDefinitionBuilder getOrCreateFloatingRateDefinition()`
- `FxLinkedNotionalAmountBuilder getOrCreateFxLinkedNotionalAmount()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `CalculationPeriodBuilder prune()`

