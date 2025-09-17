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

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ForeignExchangeBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `ForeignExchangeBuilder prune()`
- `ForeignExchangeBuilder toBuilder()`
- `boolean hasData()`

