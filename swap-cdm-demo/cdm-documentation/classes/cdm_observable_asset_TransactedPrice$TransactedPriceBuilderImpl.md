# TransactedPriceBuilderImpl

**Full Name:** `cdm.observable.asset.TransactedPrice$TransactedPriceBuilderImpl`

**Package:** `cdm.observable.asset`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.observable.asset.TransactedPrice$TransactedPriceBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| marketFixedRate | `BigDecimal` |  |
| initialPoints | `BigDecimal` |  |
| marketPrice | `BigDecimal` |  |
| quotationStyle | `QuotationStyleEnum` |  |

### Methods

#### Builder Methods

- `TransactedPrice build()`

#### Setter Methods

- `TransactedPriceBuilder setQuotationStyle(QuotationStyleEnum arg0)`
- `TransactedPriceBuilder setMarketFixedRate(BigDecimal arg0)`
- `TransactedPriceBuilder setMarketPrice(BigDecimal arg0)`
- `TransactedPriceBuilder setInitialPoints(BigDecimal arg0)`

#### Getter Methods

- `BigDecimal getInitialPoints()`
- `QuotationStyleEnum getQuotationStyle()`
- `BigDecimal getMarketFixedRate()`
- `BigDecimal getMarketPrice()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `TransactedPriceBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `TransactedPriceBuilder prune()`
- `TransactedPriceBuilder toBuilder()`
- `boolean hasData()`

