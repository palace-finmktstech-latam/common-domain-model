# FixedAmountCalculationDetailsBuilder

**Full Name:** `cdm.product.asset.FixedAmountCalculationDetails$FixedAmountCalculationDetailsBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.FixedAmountCalculationDetails`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `FixedAmountCalculationDetailsBuilder setCalculatedAmount(BigDecimal arg0)`
- `FixedAmountCalculationDetailsBuilder setCalculationPeriod(CalculationPeriodBase arg0)`
- `FixedAmountCalculationDetailsBuilder setYearFraction(BigDecimal arg0)`
- `FixedAmountCalculationDetailsBuilder setFixedRate(BigDecimal arg0)`
- `FixedAmountCalculationDetailsBuilder setCalculationPeriodNotionalAmount(Money arg0)`

#### Getter Methods

- `CalculationPeriodBaseBuilder getCalculationPeriod()`
- `CalculationPeriodBaseBuilder getOrCreateCalculationPeriod()`
- `MoneyBuilder getCalculationPeriodNotionalAmount()`
- `MoneyBuilder getOrCreateCalculationPeriodNotionalAmount()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `FixedAmountCalculationDetailsBuilder prune()`

