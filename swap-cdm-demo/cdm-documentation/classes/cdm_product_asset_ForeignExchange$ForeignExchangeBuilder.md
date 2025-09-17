# ForeignExchangeBuilder

**Full Name:** `cdm.product.asset.ForeignExchange$ForeignExchangeBuilder`

**Package:** `cdm.product.asset`

## Type: Interface

### Implemented Interfaces

- `cdm.product.asset.ForeignExchange`
- `com.rosetta.model.lib.RosettaModelObjectBuilder`

### Methods

#### Setter Methods

- `ForeignExchangeBuilder setExchangedCurrency1(Cashflow arg0)`
- `ForeignExchangeBuilder setExchangedCurrency2(Cashflow arg0)`
- `ForeignExchangeBuilder setTenorPeriod(Period arg0)`

#### Getter Methods

- `PeriodBuilder getOrCreateTenorPeriod()`
- `CashflowBuilder getExchangedCurrency2()`
- `PeriodBuilder getTenorPeriod()`
- `CashflowBuilder getExchangedCurrency1()`
- `CashflowBuilder getOrCreateExchangedCurrency1()`
- `CashflowBuilder getOrCreateExchangedCurrency2()`

#### Other Methods

- `void process(RosettaPath arg0, BuilderProcessor arg1)`
- `ForeignExchangeBuilder prune()`

