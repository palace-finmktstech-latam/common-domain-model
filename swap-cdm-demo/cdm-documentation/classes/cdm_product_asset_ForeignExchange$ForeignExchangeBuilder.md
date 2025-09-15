# ForeignExchangeBuilder

**Full Name:** `cdm.product.asset.ForeignExchange$ForeignExchangeBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ForeignExchange`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ForeignExchangeBuilder setTenorPeriod(Period arg0)`
- `ForeignExchangeBuilder setExchangedCurrency2(Cashflow arg0)`
- `ForeignExchangeBuilder setExchangedCurrency1(Cashflow arg0)`

#### Getter Methods

- `CashflowBuilder getOrCreateExchangedCurrency2()`
- `CashflowBuilder getOrCreateExchangedCurrency1()`
- `CashflowBuilder getExchangedCurrency2()`
- `CashflowBuilder getExchangedCurrency1()`
- `PeriodBuilder getTenorPeriod()`
- `PeriodBuilder getOrCreateTenorPeriod()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ForeignExchangeBuilder prune()`

