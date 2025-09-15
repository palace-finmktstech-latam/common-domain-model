# ForeignExchangeBuilderImpl

**Full Name:** `cdm.product.asset.ForeignExchange$ForeignExchangeBuilderImpl`

**Package:** `cdm.product.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.asset.ForeignExchange$ForeignExchangeBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| exchangedCurrency1 | `CashflowBuilder` |  |
| exchangedCurrency2 | `CashflowBuilder` |  |
| tenorPeriod | `PeriodBuilder` |  |

### Methods

#### Builder Methods

- `ForeignExchange build()`

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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ForeignExchangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ForeignExchangeBuilder toBuilder()`
- `ForeignExchangeBuilder prune()`

