# FxRateBuilderImpl

**Full Name:** `cdm.observable.asset.FxRate$FxRateBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.FxRate$FxRateBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| quotedCurrencyPair | `QuotedCurrencyPairBuilder` |  |
| rate | `BigDecimal` |  |

### Methods

#### Builder Methods

- `FxRate build()`

#### Setter Methods

- `FxRateBuilder setQuotedCurrencyPair(QuotedCurrencyPair arg0)`
- `FxRateBuilder setRate(BigDecimal arg0)`

#### Getter Methods

- `QuotedCurrencyPairBuilder getQuotedCurrencyPair()`
- `QuotedCurrencyPairBuilder getOrCreateQuotedCurrencyPair()`
- `BigDecimal getRate()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `FxRateBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `FxRateBuilder prune()`
- `FxRateBuilder toBuilder()`
- `boolean hasData()`

