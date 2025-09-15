# PaymentCalculationPeriodBuilderImpl

**Full Name:** `cdm.product.common.schedule.PaymentCalculationPeriod$PaymentCalculationPeriodBuilderImpl`

**Package:** `cdm.product.common.schedule`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.common.schedule.PaymentCalculationPeriod$PaymentCalculationPeriodBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| unadjustedPaymentDate | `Date` |  |
| adjustedPaymentDate | `Date` |  |
| calculationPeriod | `java.util.List<cdm.product.common.schedule.CalculationPeriod$CalculationPeriodBuilder>` |  |
| fixedPaymentAmount | `MoneyBuilder` |  |
| discountFactor | `BigDecimal` |  |
| forecastPaymentAmount | `MoneyBuilder` |  |
| presentValueAmount | `MoneyBuilder` |  |
| meta | `MetaFieldsBuilder` |  |

### Methods

#### Builder Methods

- `PaymentCalculationPeriod build()`

#### Setter Methods

- `PaymentCalculationPeriodBuilder setCalculationPeriod(List arg0)`
- `PaymentCalculationPeriodBuilder setAdjustedPaymentDate(Date arg0)`
- `PaymentCalculationPeriodBuilder setPresentValueAmount(Money arg0)`
- `PaymentCalculationPeriodBuilder setFixedPaymentAmount(Money arg0)`
- `PaymentCalculationPeriodBuilder setForecastPaymentAmount(Money arg0)`
- `PaymentCalculationPeriodBuilder setUnadjustedPaymentDate(Date arg0)`
- `PaymentCalculationPeriodBuilder setDiscountFactor(BigDecimal arg0)`
- `PaymentCalculationPeriodBuilder setMeta(MetaFields arg0)`

#### Getter Methods

- `List getCalculationPeriod()`
- `MetaFieldsBuilder getOrCreateMeta()`
- `Date getAdjustedPaymentDate()`
- `MoneyBuilder getFixedPaymentAmount()`
- `MoneyBuilder getPresentValueAmount()`
- `MoneyBuilder getForecastPaymentAmount()`
- `Date getUnadjustedPaymentDate()`
- `BigDecimal getDiscountFactor()`
- `CalculationPeriodBuilder getOrCreateCalculationPeriod(int arg0)`
- `MoneyBuilder getOrCreateFixedPaymentAmount()`
- `MoneyBuilder getOrCreatePresentValueAmount()`
- `MoneyBuilder getOrCreateForecastPaymentAmount()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `PaymentCalculationPeriodBuilder addCalculationPeriod(List arg0)`
- `PaymentCalculationPeriodBuilder addCalculationPeriod(CalculationPeriod arg0)`
- `PaymentCalculationPeriodBuilder addCalculationPeriod(CalculationPeriod arg0, int arg1)`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `PaymentCalculationPeriodBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `PaymentCalculationPeriodBuilder toBuilder()`
- `PaymentCalculationPeriodBuilder prune()`

