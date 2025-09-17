# CalculationPeriod

**Full Name:** `cdm.product.common.schedule.CalculationPeriod`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.CalculationPeriodBase`

### Methods

#### Builder Methods

- `CalculationPeriod build()`

#### Getter Methods

- `Class getType()`
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

- `void process(RosettaPath arg0, Processor arg1)`
- `CalculationPeriodBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

