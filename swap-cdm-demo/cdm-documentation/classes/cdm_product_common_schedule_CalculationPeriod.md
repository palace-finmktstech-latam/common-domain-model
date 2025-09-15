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

- `void process(RosettaPath arg0, Processor arg1)`
- `CalculationPeriodBuilder toBuilder()`
- `RosettaMetaData metaData()`

### Annotations

- **RuneDataType**
- **RosettaDataType**

