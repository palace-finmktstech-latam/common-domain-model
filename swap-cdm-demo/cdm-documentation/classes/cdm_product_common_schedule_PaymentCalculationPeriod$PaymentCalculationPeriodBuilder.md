# PaymentCalculationPeriodBuilder

**Full Name:** `cdm.product.common.schedule.PaymentCalculationPeriod$PaymentCalculationPeriodBuilder`

**Package:** `cdm.product.common.schedule`

## Type: Interface

### Implemented Interfaces

- `cdm.product.common.schedule.PaymentCalculationPeriod`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`
- `com.rosetta.model.lib.GlobalKey$GlobalKeyBuilder`

### Methods

#### Setter Methods

- `PaymentCalculationPeriodBuilder setMeta(MetaFields arg0)`
- `PaymentCalculationPeriodBuilder setAdjustedPaymentDate(Date arg0)`
- `PaymentCalculationPeriodBuilder setUnadjustedPaymentDate(Date arg0)`
- `PaymentCalculationPeriodBuilder setForecastPaymentAmount(Money arg0)`
- `PaymentCalculationPeriodBuilder setPresentValueAmount(Money arg0)`
- `PaymentCalculationPeriodBuilder setDiscountFactor(BigDecimal arg0)`
- `PaymentCalculationPeriodBuilder setFixedPaymentAmount(Money arg0)`
- `PaymentCalculationPeriodBuilder setCalculationPeriod(List arg0)`

#### Getter Methods

- `MetaFieldsBuilder getOrCreateMeta()`
- `MetaFieldsBuilder getMeta()`
- `MoneyBuilder getForecastPaymentAmount()`
- `MoneyBuilder getPresentValueAmount()`
- `MoneyBuilder getFixedPaymentAmount()`
- `MoneyBuilder getOrCreateForecastPaymentAmount()`
- `MoneyBuilder getOrCreatePresentValueAmount()`
- `MoneyBuilder getOrCreateFixedPaymentAmount()`
- `List getCalculationPeriod()`
- `CalculationPeriodBuilder getOrCreateCalculationPeriod(int arg0)`

#### Adder Methods

- `PaymentCalculationPeriodBuilder addCalculationPeriod(List arg0)`
- `PaymentCalculationPeriodBuilder addCalculationPeriod(CalculationPeriod arg0, int arg1)`
- `PaymentCalculationPeriodBuilder addCalculationPeriod(CalculationPeriod arg0)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PaymentCalculationPeriodBuilder prune()`

