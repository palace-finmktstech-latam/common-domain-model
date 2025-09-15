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
- `MoneyBuilder getFixedPaymentAmount()`
- `MoneyBuilder getPresentValueAmount()`
- `MoneyBuilder getForecastPaymentAmount()`
- `CalculationPeriodBuilder getOrCreateCalculationPeriod(int arg0)`
- `MoneyBuilder getOrCreateFixedPaymentAmount()`
- `MoneyBuilder getOrCreatePresentValueAmount()`
- `MoneyBuilder getOrCreateForecastPaymentAmount()`
- `MetaFieldsBuilder getMeta()`

#### Adder Methods

- `PaymentCalculationPeriodBuilder addCalculationPeriod(CalculationPeriod arg0)`
- `PaymentCalculationPeriodBuilder addCalculationPeriod(List arg0)`
- `PaymentCalculationPeriodBuilder addCalculationPeriod(CalculationPeriod arg0, int arg1)`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `PaymentCalculationPeriodBuilder prune()`

