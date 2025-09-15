# ReturnTermsBuilderImpl

**Full Name:** `cdm.product.template.ReturnTerms$ReturnTermsBuilderImpl`

**Package:** `cdm.product.template`

## Type: Concrete Class

### Implemented Interfaces

- `cdm.product.template.ReturnTerms$ReturnTermsBuilder`

### Fields

| Name | Type | Description |
|------|------|-------------|
| priceReturnTerms | `PriceReturnTermsBuilder` |  |
| dividendReturnTerms | `DividendReturnTermsBuilder` |  |
| varianceReturnTerms | `VarianceReturnTermsBuilder` |  |
| volatilityReturnTerms | `VolatilityReturnTermsBuilder` |  |
| correlationReturnTerms | `CorrelationReturnTermsBuilder` |  |

### Methods

#### Builder Methods

- `ReturnTerms build()`

#### Setter Methods

- `ReturnTermsBuilder setVarianceReturnTerms(VarianceReturnTerms arg0)`
- `ReturnTermsBuilder setVolatilityReturnTerms(VolatilityReturnTerms arg0)`
- `ReturnTermsBuilder setDividendReturnTerms(DividendReturnTerms arg0)`
- `ReturnTermsBuilder setPriceReturnTerms(PriceReturnTerms arg0)`
- `ReturnTermsBuilder setCorrelationReturnTerms(CorrelationReturnTerms arg0)`

#### Getter Methods

- `CorrelationReturnTermsBuilder getCorrelationReturnTerms()`
- `VarianceReturnTermsBuilder getVarianceReturnTerms()`
- `VolatilityReturnTermsBuilder getVolatilityReturnTerms()`
- `DividendReturnTermsBuilder getDividendReturnTerms()`
- `PriceReturnTermsBuilder getPriceReturnTerms()`
- `DividendReturnTermsBuilder getOrCreateDividendReturnTerms()`
- `VarianceReturnTermsBuilder getOrCreateVarianceReturnTerms()`
- `VolatilityReturnTermsBuilder getOrCreateVolatilityReturnTerms()`
- `CorrelationReturnTermsBuilder getOrCreateCorrelationReturnTerms()`
- `PriceReturnTermsBuilder getOrCreatePriceReturnTerms()`

#### Other Methods

- `boolean equals(Object arg0)`
- `String toString()`
- `int hashCode()`
- `ReturnTermsBuilder merge(RosettaModelObjectBuilder arg0, BuilderMerger arg1)`
- `boolean hasData()`
- `ReturnTermsBuilder toBuilder()`
- `ReturnTermsBuilder prune()`

